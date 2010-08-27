package com.tinesoft.quizzer.client.presenter;

import java.util.ArrayList;

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
import com.tinesoft.quizzer.client.service.QuestionServiceAsync;
import com.tinesoft.quizzer.client.view.QuestionProfileView;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.IListBox;
import com.tinesoft.quizzer.client.widget.interfaces.ITextBox;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;
import com.tinesoft.quizzer.model.domain.Category;
import com.tinesoft.quizzer.model.domain.Question;

@Presenter(view = QuestionProfileView.class)
public class QuestionProfilePresenter
		extends
		BasePresenter<QuestionProfilePresenter.IQuestionProfileView, MyEventBus> {

	public interface IQuestionProfileView extends IWidget {

		IListBox getCategories();
		
		ITextBox getQuestion();
		
		ITextBox getAnswer();

		IButton getUpdateButton();

		IButton getCancelButton();

		void showAddMode();

		void showUpdateMode();
	}

	private boolean toUpdate = true;
	private Question question = null;
	private Question questionCopy = new Question();
	private ArrayList<Category> categories = new ArrayList<Category>();
	
	private QuestionServiceAsync questionService = null;
	private CategoryServiceAsync categoryService = null;

	private boolean firstLoading = true;

	@InjectService
	public void setQuestionService(QuestionServiceAsync service) {
		this.questionService = service;
	}
	
	@InjectService
	public void setCategoryService(CategoryServiceAsync service) {
		this.categoryService = service;
	}

	@Override
	public void bind() {

		view.getUpdateButton().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {

				fillBean();
				if (toUpdate) {
					updateQuestion();
				} else {
					createQuestion();
				}
			}

		});

		view.getCancelButton().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				eventBus.unselectQuestion();
			}

		});

		KeyUpHandler handler = new KeyUpHandler() {

			public void onKeyUp(KeyUpEvent event) {
				enableUpdateButton();
			}

		};

		view.getQuestion().addKeyUpHandler(handler);
		view.getAnswer().addKeyUpHandler(handler);

		init();
	}

	public void onTabSelected(int tabIndex)
	{
		if( tabIndex == RootPresenter.QUESTIONS_TAB && firstLoading)
		{
			getCategories();
			firstLoading = false;
		}
	}
	
	public void onSetFocus()
	{
		view.getQuestion().setFocus(true);
	}

	public void onSelectQuestion(Question question) {
		this.question = question;
		copy(this.question, this.questionCopy);

		toUpdate = true;
		fillForm();
		view.showUpdateMode();
		view.getUpdateButton().setEnabled(true);
		view.getCancelButton().setEnabled(true);

	}

	public void onUnselectQuestion() {
		question = null;
		init();
	}

	public void onCreateNewQuestion(Question question) {
		this.question = question;
		init();

		view.showAddMode();
		view.getUpdateButton().setEnabled(false);
		view.getCancelButton().setEnabled(true);
		toUpdate = false;

	}

	void setCategories(ArrayList<Category> categories) {
		this.categories = categories;
		
		for (Category category: this.categories) {
			view.getCategories().addItem(category.getTitle());
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
				eventBus.changeQuestionsTabWidgetBottom(view);
			}

		});

	}

	private void init() {
		view.getQuestion().setValue("");
		view.getAnswer().setValue("");
		view.getUpdateButton().setEnabled(false);
		view.getCancelButton().setEnabled(false);
		view.showUpdateMode();

	}

	void copy(Question initial, Question copy) {
		copy.setCategory(initial.getCategory());
		copy.setText(initial.getText());
		copy.setAnswer(initial.getAnswer());

	}

	private void fillForm() {
		
		String category = question.getCategory().getTitle();
		view.getCategories().setSelectedValue(category);
		view.getQuestion().setValue(question.getText());
		view.getAnswer().setValue(question.getAnswer());
	}

	private void fillBean() {
		int index = view.getCategories().getSelectedIndex();
		question.setCategory(categories.get(index));
		question.setText(view.getQuestion().getValue());
		question.setAnswer(view.getAnswer().getValue());
	}

	private void createQuestion() {
		questionService.createQuestion(question, new AsyncCallback<Question>() {

			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub

			}

			public void onSuccess(Question result) {
				if (result == null)
					return;

				question = result;
				init();
				eventBus.questionCreated(question);
			}

		});
	}

	private void updateQuestion() {
		questionService.updateQuestion(question, new AsyncCallback<Boolean>() {

			public void onFailure(Throwable caught) {
				copy(questionCopy, question);
			}

			public void onSuccess(Boolean result) {
				if (result == false)
					return;
				init();
				eventBus.questionUpdated(question);
			}

		});
	}

	private void enableUpdateButton() {

		String question = view.getQuestion().getValue();
		String answer = view.getAnswer().getValue();
		

		boolean enabled = !("".equals(question) || "".equals(answer));

		view.getUpdateButton().setEnabled(enabled);
	}

}
