package com.tinesoft.quizzer.client.view;

import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.presenter.QuestionProfilePresenter.IQuestionProfileView;
import com.tinesoft.quizzer.client.widget.gwt.MyButton;
import com.tinesoft.quizzer.client.widget.gwt.MyListBox;
import com.tinesoft.quizzer.client.widget.gwt.MyTable;
import com.tinesoft.quizzer.client.widget.gwt.MyTextBox;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.IListBox;
import com.tinesoft.quizzer.client.widget.interfaces.ITextBox;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;

public class QuestionProfileView extends Composite implements
		IQuestionProfileView {

	private MyListBox categories = new MyListBox(false);
	private MyTextBox question = new MyTextBox();
	private MyTextBox answer = new MyTextBox();

	private MyButton update = new MyButton();
	private MyButton cancel = new MyButton("Cancel");

	public QuestionProfileView() {
		CaptionPanel cpPanel = new CaptionPanel("Question Profile");
		cpPanel.setStyleName("gwt-CaptionPanel");
		
		MyTable table = new MyTable();

		table.setText(0, 0, "Category");
		table.setWidget(0, 1, categories.getMyWidget());

		table.setText(1, 0, "Question");
		table.setWidget(1, 1, question.getMyWidget());
		
		table.setText(2, 0, "Answer");
		table.setWidget(2, 1, answer.getMyWidget());
		
		table.setWidget(3, 0, update.getMyWidget());
		table.setWidget(3, 1, cancel.getMyWidget());

		cpPanel.add(table);

		initWidget(cpPanel);
	}

	public IWidget getViewWidget() {
		return this;
	}

	@Override
	public IButton getCancelButton() {
		return cancel;
	}

	public IButton getUpdateButton() {
		return update;
	}


	@Override
	public void showAddMode() {
		update.setText("Add Question");
	}

	@Override
	public void showUpdateMode() {
		update.setText("Update");
	}

	@Override
	public IListBox getCategories() {
		return categories;
	}

	@Override
	public ITextBox getQuestion() {
		return question;
	}
	
	@Override
	public ITextBox getAnswer() {
		return answer;
	}
	
	@Override
	public Widget getMyWidget() {
		return this;
	}

}
