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
import com.tinesoft.quizzer.client.view.QuestionsListView;
import com.tinesoft.quizzer.client.widget.gwt.MyCheckBox;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.ILabel;
import com.tinesoft.quizzer.client.widget.interfaces.ITable;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;
import com.tinesoft.quizzer.model.domain.Question;

@Presenter(view = QuestionsListView.class)
public class QuestionsListPresenter extends
		BasePresenter<QuestionsListPresenter.IQuestionsListView, MyEventBus> {

	public interface IQuestionsListView extends IWidget {
		ITable getTable();

		IButton getDeleteButton();

		IButton getNewButton();

		IButton getYesButton();

		IButton getNoButton();

		ILabel getConfirmDeletionText();

		IButton getRefreshButton();

	}

	private int indexSelected = -1;
	private ArrayList<Question> questions = null;
	private ArrayList<Question> questionsSelected = null;
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
		view.getNewButton().addClickHandler(new NewClickHandler());
		view.getRefreshButton().addClickHandler(new RefreshClickHandler());
		view.getYesButton().addClickHandler(new YesClickHandler());
		view.getNoButton().addClickHandler(new NoClickHandler());
		
	}

	public void onTabSelected(int tabIndex)
	{
		if( tabIndex == RootPresenter.QUESTIONS_TAB && firstLoading)
		{
			getQuestions();
			firstLoading = false;
		}
	}
	
	public void onRefreshQuestionsList()
	{
		getQuestions();
	}
	
	public void onQuestionUpdated(Question question) {
		displayQuestion(question, questions.indexOf(question) + 1);
	}

	public void onQuestionCreated(Question question) {
		questions.add(question);
		displayQuestion(question, questions.size());
	}

	public void onUnselectQuestion() {
		view.getTable().unSelectRow(indexSelected);
		indexSelected = 0;
	}

	void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
		int nbQuestions = questions.size();
		for (int i = 0; i < nbQuestions; i++) {
			displayQuestion(questions.get(i), i + 1);
		}
	}

	void getQuestions()
	{
		questionService.getCategories(new AsyncCallback<ArrayList<Question>>() {

			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub

			}

			public void onSuccess(ArrayList<Question> result) {
				if (result == null)
					return;
				setQuestions(result);
				eventBus.changeQuestionsTabWidgetTopRight(view);
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
			eventBus.selectQuestion(questions.get(row - 1));
			view.getDeleteButton().setEnabled(true);
		}
	}

	void deleteSelectedCategories() {

		questionService.deleteCategories(questionsSelected,
				new AsyncCallback<Boolean>() {

					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub

					}

					public void onSuccess(Boolean result) {
						questions.removeAll(questionsSelected);

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

	void displayQuestion(Question question, int row) {
		ITable table = view.getTable();
		table.setWidget(row, 0, new MyCheckBox());
		table.setText(row, 1, "" + question.getId());
		table.setText(row, 2, question.getText());
		table.setText(row, 3, question.getAnswer());
	}

	void getSelection() {
		ITable table = view.getTable();
		questionsSelected = new ArrayList<Question>();
		indexesSelected = new ArrayList<Integer>();
		for (int i = 1; i < table.getRowCount(); i++) {
			MyCheckBox checkbox = (MyCheckBox) table.getWidget(i, 0);

			if (checkbox.getValue()) {
				questionsSelected.add(questions.get(i - 1));
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
			eventBus.createNewQuestion(new Question());
			eventBus.setFocus();
		}

	}
	
	class RefreshClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			eventBus.refreshQuestionsList();
		}

	}
	
	class DeleteClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			getSelection();
			if (!questionsSelected.isEmpty())
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
