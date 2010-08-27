package com.tinesoft.quizzer.client.view;

import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.presenter.PlayersListPresenter.IPlayersListView;
import com.tinesoft.quizzer.client.widget.gwt.MyButton;
import com.tinesoft.quizzer.client.widget.gwt.MyLabel;
import com.tinesoft.quizzer.client.widget.gwt.MyTable;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.ILabel;
import com.tinesoft.quizzer.client.widget.interfaces.ITable;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;

public class PlayersListView extends Composite implements IPlayersListView {

	private MyButton deleteButton = new MyButton("Delete");
	private MyButton newButton = new MyButton("New");
	private MyButton yesButton = new MyButton("Yes");
	private MyButton noButton = new MyButton("No");
	private MyButton refreshButton = new MyButton("Refresh");
	private MyLabel confirmDeletionText = new MyLabel("Are you Sure?");

	private MyTable playersList = new MyTable();

	public PlayersListView() {

		CaptionPanel cpPanel = new CaptionPanel("Players");
		cpPanel.setStyleName("gwt-CaptionPanel");
		
		confirmDeletionText.setStyleName("warn");
		
		HorizontalPanel buttons = new HorizontalPanel();
		buttons.setSpacing(4);
		buttons.add(deleteButton);
		buttons.add(confirmDeletionText);
		buttons.add(yesButton);
		buttons.add(noButton);
		buttons.add(newButton);
		buttons.add(refreshButton);

		VerticalPanel mainPanel = new VerticalPanel();
		mainPanel.add(playersList.getMyWidget());
		mainPanel.add(buttons);
		mainPanel.setStyleName("players");

		playersList.setStyleName("playersList");
		playersList.setCellPadding(5);
		playersList.setCellSpacing(5);
		playersList.getRowFormatter().setStyleName(0, "header");

		playersList.setText(0, 0, "Selection");
		playersList.setText(0, 1, "ID");
		playersList.setText(0, 2, "First Name");
		playersList.setText(0, 3, "Last Name");
		playersList.setText(0, 4, "Registration");
		playersList.setText(0, 5, "Last Connection");

		cpPanel.add(mainPanel);

		initWidget(cpPanel);
	}


	public IWidget getViewWidget() {
		return this;
	}
	
	@Override
	public Widget getMyWidget() {
		return this;
	}

	@Override
	public IButton getDeleteButton() {
		return deleteButton;
	}

	@Override
	public ITable getTable() {
		return playersList;
	}

	@Override
	public IButton getNewButton() {
		return newButton;
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
}
