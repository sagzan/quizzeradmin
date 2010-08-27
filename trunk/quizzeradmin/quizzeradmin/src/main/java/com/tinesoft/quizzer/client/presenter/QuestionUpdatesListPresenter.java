package com.tinesoft.quizzer.client.presenter;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mvp4g.client.annotation.InjectService;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.tinesoft.quizzer.client.MyEventBus;
import com.tinesoft.quizzer.client.service.QuestionServiceAsync;
import com.tinesoft.quizzer.client.view.QuestionUpdatesListView;
import com.tinesoft.quizzer.client.widget.gwt.MyCheckBox;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.ILabel;
import com.tinesoft.quizzer.client.widget.interfaces.ITable;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;
import com.tinesoft.quizzer.model.domain.QuestionUpdate;

@Presenter(view = QuestionUpdatesListView.class)
public class QuestionUpdatesListPresenter
		extends
		BasePresenter<QuestionUpdatesListPresenter.IQuestionUpdatesListView, MyEventBus> {

	public interface IQuestionUpdatesListView extends IWidget {
		ITable getTable();

		IButton getDeleteButton();
		
		IButton getValidateButton();

		IButton getYesButton();

		IButton getNoButton();

		ILabel getConfirmDeletionText();

		IButton getRefreshButton();

	}

	private int indexSelected = -1;
	private ArrayList<QuestionUpdate> categories = null;
	private ArrayList<QuestionUpdate> categoriesSelected = null;
	private ArrayList<Integer> indexesSelected = null;
	private QuestionServiceAsync questionService = null;

	private boolean firstLoading = true;
	
	@InjectService
	public void setQuestionService(QuestionServiceAsync service) {
		this.questionService = service;
	}

	@Override
	public void bind() {

		view.getTable().addClickHandler(new TableClickHandler());
		view.getDeleteButton().addClickHandler(new DeleteClickHandler());
		view.getValidateButton().addClickHandler(new ValidateClickHandler());
		view.getRefreshButton().addClickHandler(new RefreshClickHandler());
		view.getYesButton().addClickHandler(new YesClickHandler());
		view.getNoButton().addClickHandler(new NoClickHandler());

	}

	public void onTabSelected(int tabIndex)
	{
		if( tabIndex == RootPresenter.QUESTIONS_TAB && firstLoading)
		{
			getCategories();
			firstLoading = false;
		}
	}

	public void onRefreshQuestionUpdatesList() {
		getCategories();
	}


	public void onUnselectQuestion() {
		view.getTable().unSelectRow(indexSelected);
		indexSelected = 0;
	}

	void setCategories(ArrayList<QuestionUpdate> categories) {
		this.categories = categories;
		int nbQuestions = categories.size();
		for (int i = 0; i < nbQuestions; i++) {
			displayQuestion(categories.get(i), i + 1);
		}
	}

	void getCategories() {
		questionService
				.getQuestionUpdates(new AsyncCallback<ArrayList<QuestionUpdate>>() {

					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub

					}

					public void onSuccess(ArrayList<QuestionUpdate> result) {
						if (result == null)
							return;
						setCategories(result);
						eventBus.changeQuestionsTabWidgetTopLeft(view);
					}

				});
		view.getDeleteButton().setEnabled(false);
		setVisibleConfirmDeletion(false);
	}

	void selectQuestion(int row) {
		ITable table = view.getTable();

		if (row > 0) {

			if (indexSelected > 0) {
				table.unSelectRow(indexSelected);
			}

			indexSelected = row;
			table.selectRow(indexSelected);
			//TODO eventBus.selectQuestion(categories.get(row - 1));
			view.getDeleteButton().setEnabled(true);
		}
	}

	void deleteSelectedCategories() {

		questionService.deleteQuestionUpdates(categoriesSelected,
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
						eventBus.unselectQuestion();

					}

				});
	}

	void validateSelectedCategories() {

		questionService.validateQuestionUpdates(categoriesSelected,
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

						eventBus.unselectQuestion();
						eventBus.refreshCategoriesList();
					}

				});
	}
	
	void displayQuestion(QuestionUpdate update, int row) {
		ITable table = view.getTable();
		table.setWidget(row, 0, new MyCheckBox());
		table.setText(row, 1, "" + update.getId());
		table.setText(row, 2, update.getText());
		table.setText(row, 3, update.getAnswer());

		if (update.getOriginalQuestion() == null)
			table.setText(row, 4, "-- None --");
		else
			table.setText(row, 4, update.getOriginalQuestion().getText());
	}

	void getSelection() {
		ITable table = view.getTable();
		categoriesSelected = new ArrayList<QuestionUpdate>();
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


	class RefreshClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			eventBus.refreshQuestionUpdatesList();
		}

	}
	
	class ValidateClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			getSelection();
			if (!categoriesSelected.isEmpty())
				validateSelectedCategories();

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
			selectQuestion(table.getRowForEvent(event));
		}

	}

}
