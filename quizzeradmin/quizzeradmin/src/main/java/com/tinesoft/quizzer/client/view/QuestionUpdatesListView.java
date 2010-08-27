package com.tinesoft.quizzer.client.view;

import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.presenter.QuestionUpdatesListPresenter.IQuestionUpdatesListView;

import com.tinesoft.quizzer.client.widget.gwt.MyButton;
import com.tinesoft.quizzer.client.widget.gwt.MyLabel;
import com.tinesoft.quizzer.client.widget.gwt.MyTable;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.ILabel;
import com.tinesoft.quizzer.client.widget.interfaces.ITable;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;

public class QuestionUpdatesListView extends Composite implements IQuestionUpdatesListView {

	private MyButton deleteButton = new MyButton("Delete");
	private MyButton yesButton = new MyButton("Yes");
	private MyButton noButton = new MyButton("No");
	private MyButton refreshButton = new MyButton("Refresh");
	private MyButton validateButton = new MyButton("Validate");
	private MyLabel confirmDeletionText = new MyLabel("Are you Sure?");

	private MyTable questionsList = new MyTable();

	public QuestionUpdatesListView() {

		CaptionPanel cpPanel = new CaptionPanel("Non Validated Questions");
		cpPanel.setStyleName("gwt-CaptionPanel");
		confirmDeletionText.setStyleName("warn");
		
		HorizontalPanel buttons = new HorizontalPanel();
		buttons.setSpacing(4);
		buttons.add(deleteButton);
		buttons.add(confirmDeletionText);
		buttons.add(yesButton);
		buttons.add(noButton);		
		buttons.add(validateButton);
		buttons.add(refreshButton);

		VerticalPanel mainPanel = new VerticalPanel();
		mainPanel.add(questionsList.getMyWidget());
		mainPanel.add(buttons);
		mainPanel.setStyleName("questions");

		questionsList.setStyleName("questionsList");
		questionsList.setCellPadding(5);
		questionsList.setCellSpacing(5);
		questionsList.getRowFormatter().setStyleName(0, "header");

		questionsList.setText(0, 0, "Selection");
		questionsList.setText(0, 1, "ID");
		questionsList.setText(0, 2, "Question");
		questionsList.setText(0, 3, "Answer");
		questionsList.setText(0, 4, "Original Question");

		cpPanel.add(mainPanel);

		initWidget(cpPanel);
	}


	public IWidget getViewWidget() {
		return this;
	}

	@Override
	public IButton getDeleteButton() {
		return deleteButton;
	}

	@Override
	public ITable getTable() {
		return questionsList;
	}

	@Override
	public IButton getValidateButton() {
		return validateButton;
	}

	@Override
	public ILabel getConfirmDeletionText() {
		return confirmDeletionText;
	}

	@Override
	public IButton getNoButton() {
		return noButton;
	}

	@Override
	public IButton getYesButton() {
		return yesButton;
	}

	@Override
	public IButton getRefreshButton() {
		return refreshButton;
	}


	@Override
	public Widget getMyWidget() {
		return this;
	}
}
