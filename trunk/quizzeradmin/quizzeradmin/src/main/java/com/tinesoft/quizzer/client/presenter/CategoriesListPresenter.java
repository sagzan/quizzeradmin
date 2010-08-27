package com.tinesoft.quizzer.client.presenter;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mvp4g.client.annotation.InjectService;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.tinesoft.quizzer.client.MyEventBus;
import com.tinesoft.quizzer.client.service.CategoryServiceAsync;
import com.tinesoft.quizzer.client.view.CategoriesListView;
import com.tinesoft.quizzer.client.widget.gwt.MyCheckBox;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.ILabel;
import com.tinesoft.quizzer.client.widget.interfaces.ITable;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;
import com.tinesoft.quizzer.model.domain.Category;

@Presenter(view = CategoriesListView.class)
public class CategoriesListPresenter extends
		BasePresenter<CategoriesListPresenter.ICategoriesListView, MyEventBus> {

	public interface ICategoriesListView extends IWidget {
		ITable getTable();

		IButton getDeleteButton();

		IButton getNewButton();

		IButton getYesButton();

		IButton getNoButton();

		ILabel getConfirmDeletionText();

		IButton getRefreshButton();

	}

	private int indexSelected = -1;
	private ArrayList<Category> categories = null;
	private ArrayList<Category> categoriesSelected = null;
	private ArrayList<Integer> indexesSelected = null;
	private CategoryServiceAsync categoryService = null;

	private boolean firstLoading = true;
	
	@InjectService
	public void setCategoryService(CategoryServiceAsync service) {
		this.categoryService = service;
	}

	@Override
	public void bind() {

		view.getTable().addClickHandler(new TableClickHandler());
		view.getDeleteButton().addClickHandler(new DeleteClickHandler());
		view.getNewButton().addClickHandler(new NewClickHandler());
		view.getRefreshButton().addClickHandler(new RefreshClickHandler());
		view.getYesButton().addClickHandler(new YesClickHandler());
		view.getNoButton().addClickHandler(new NoClickHandler());
		
	}

	public void onTabSelected(int tabIndex)
	{
		if( tabIndex == RootPresenter.CATEGORIES_TAB && firstLoading)
		{
			getCategories();
			firstLoading = false;
		}
	}

	public void onRefreshCategoriesList()
	{
		getCategories();
	}
	
	public void onCategoryUpdated(Category category) {
		displayCategory(category, categories.indexOf(category) + 1);
	}

	public void onCategoryCreated(Category category) {
		categories.add(category);
		displayCategory(category, categories.size());
	}

	public void onUnselectCategory() {
		view.getTable().unSelectRow(indexSelected);
		indexSelected = 0;
	}

	void setCategories(ArrayList<Category> categories) {
		this.categories = categories;
		int nbCategorys = categories.size();
		for (int i = 0; i < nbCategorys; i++) {
			displayCategory(categories.get(i), i + 1);
		}
	}

	void getCategories()
	{
		categoryService.getCategories(new AsyncCallback<ArrayList<Category>>() {

			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub

			}

			public void onSuccess(ArrayList<Category> result) {
				if (result == null)
					return;
				setCategories(result);
				eventBus.changeCategoriesTabWidgetTopRight(view);
			}

		});
		view.getDeleteButton().setEnabled(false);
		setVisibleConfirmDeletion(false);
	}
	
	void selectCategory(int row) {
		ITable table = view.getTable();

		if (row > 0) {

			if (indexSelected > 0) {
				table.unSelectRow(indexSelected);
			}

			indexSelected = row;
			table.selectRow(indexSelected);
			eventBus.selectCategory(categories.get(row - 1));
			view.getDeleteButton().setEnabled(true);
		}
	}

	void deleteSelectedCategories() {

		categoryService.deleteCategories(categoriesSelected,
				new AsyncCallback<Boolean>() {

					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub

					}

					public void onSuccess(Boolean result) {
						categories.removeAll(categoriesSelected);

						ITable table = view.getTable();
						int n = indexesSelected.size();

						for (int i = 0; i < n; i++) {
							int index = indexesSelected.get(i) - i;
							table.removeRow(index);
						}

						view.getDeleteButton().setEnabled(false);
						setVisibleConfirmDeletion(false);
						eventBus.unselectCategory();

					}

				});
	}

	void displayCategory(Category category, int row) {
		ITable table = view.getTable();
		table.setWidget(row, 0, new MyCheckBox());
		table.setText(row, 1, "" + category.getId());
		table.setText(row, 2, category.getTitle());
	}

	void getSelection() {
		ITable table = view.getTable();
		categoriesSelected = new ArrayList<Category>();
		indexesSelected = new ArrayList<Integer>();
		for (int i = 1; i < table.getRowCount(); i++) {
			MyCheckBox checkbox = (MyCheckBox) table.getWidget(i, 0);

			if (checkbox.getValue()) {
				categoriesSelected.add(categories.get(i - 1));
				indexesSelected.add(i);
			}

		}

	}

	void setVisibleConfirmDeletion(boolean visible) {
		view.getConfirmDeletionText().setVisible(visible);
		view.getYesButton().setVisible(visible);
		view.getNoButton().setVisible(visible);
	}

	class YesClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			deleteSelectedCategories();
		}

	}

	class NoClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			setVisibleConfirmDeletion(false);
		}

	}

	class NewClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			eventBus.createNewCategory(new Category());
			eventBus.setFocus();
		}

	}
	
	class RefreshClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			eventBus.refreshCategoriesList();
		}

	}
	
	class DeleteClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			getSelection();
			if (!categoriesSelected.isEmpty())
				setVisibleConfirmDeletion(true);
		}

	}

	class TableClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			ITable table = view.getTable();
			selectCategory(table.getRowForEvent(event));
		}

	}

}
