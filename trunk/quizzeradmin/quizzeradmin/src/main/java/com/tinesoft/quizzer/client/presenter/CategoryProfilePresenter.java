package com.tinesoft.quizzer.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mvp4g.client.annotation.InjectService;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.tinesoft.quizzer.client.MyEventBus;
import com.tinesoft.quizzer.client.service.CategoryServiceAsync;
import com.tinesoft.quizzer.client.view.CategoryProfileView;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.ITextBox;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;
import com.tinesoft.quizzer.model.domain.Category;

@Presenter(view = CategoryProfileView.class)
public class CategoryProfilePresenter
		extends
		BasePresenter<CategoryProfilePresenter.ICategoryProfileView, MyEventBus> {

	public interface ICategoryProfileView extends IWidget {

		ITextBox getTitleTextBox();

		IButton getUpdateButton();

		IButton getCancelButton();

		void showAddMode();

		void showUpdateMode();
	}

	private boolean toUpdate = true;
	private Category category = null;
	private Category categoryCopy = new Category();
	private CategoryServiceAsync service = null;
	
	private boolean firstLoading = true;

	@InjectService
	public void setCategoryService(CategoryServiceAsync service) {
		this.service = service;
	}

	@Override
	public void bind() {

		view.getUpdateButton().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {

				fillBean();
				if (toUpdate) {
					updateCategory();
				} else {
					createCategory();
				}
			}

		});

		view.getCancelButton().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				eventBus.unselectCategory();
			}

		});

		view.getTitleTextBox().addKeyUpHandler(new KeyUpHandler() {

			public void onKeyUp(KeyUpEvent event) {
				enableUpdateButton();
			}

		});

		init();
	}


	public void onTabSelected(int tabIndex)
	{
		if( tabIndex == RootPresenter.CATEGORIES_TAB && firstLoading)
		{
			eventBus.changeCategoriesTabWidgetBottom(view);
			firstLoading = false;
		}
	}
	
	public void onSetFocus()
	{
		view.getTitleTextBox().setFocus(true);
	}

	public void onSelectCategory(Category category) {
		this.category = category;
		copy(this.category, this.categoryCopy);

		toUpdate = true;
		fillForm();
		view.showUpdateMode();
		view.getUpdateButton().setEnabled(true);
		view.getCancelButton().setEnabled(true);

	}

	public void onUnselectCategory() {
		category = null;
		init();
	}

	public void onCreateNewCategory(Category category) {
		this.category = category;
		init();

		view.showAddMode();
		view.getUpdateButton().setEnabled(false);
		view.getCancelButton().setEnabled(true);
		toUpdate = false;

	}

	private void init() {
		view.getTitleTextBox().setValue("");
		view.getUpdateButton().setEnabled(false);
		view.getCancelButton().setEnabled(false);
		view.showUpdateMode();

	}

	void copy(Category initial, Category copy) {
		copy.setTitle(initial.getTitle());

	}

	private void fillForm() {
		view.getTitleTextBox().setValue(category.getTitle());
	}

	private void fillBean() {
		category.setTitle(view.getTitleTextBox().getValue());
	}

	private void createCategory() {
		service.createCategory(category, new AsyncCallback<Category>() {

			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub

			}

			public void onSuccess(Category result) {
				if (result == null)
					return;

				category = result;
				init();
				eventBus.categoryCreated(category);
			}

		});
	}

	private void updateCategory() {
		service.updateCategory(category, new AsyncCallback<Boolean>() {

			public void onFailure(Throwable caught) {
				copy(categoryCopy, category);
			}

			public void onSuccess(Boolean result) {
				if (result == false)
					return;
				init();
				eventBus.categoryUpdated(category);
			}

		});
	}

	private void enableUpdateButton() {

		String title = view.getTitleTextBox().getValue();

		boolean enabled = !("".equals(title));

		view.getUpdateButton().setEnabled(enabled);
	}

}
