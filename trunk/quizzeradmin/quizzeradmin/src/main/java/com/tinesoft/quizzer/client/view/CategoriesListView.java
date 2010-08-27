package com.tinesoft.quizzer.client.view;

import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.presenter.CategoriesListPresenter.ICategoriesListView;

import com.tinesoft.quizzer.client.widget.gwt.MyButton;
import com.tinesoft.quizzer.client.widget.gwt.MyLabel;
import com.tinesoft.quizzer.client.widget.gwt.MyTable;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.ILabel;
import com.tinesoft.quizzer.client.widget.interfaces.ITable;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;

public class CategoriesListView extends Composite implements ICategoriesListView {

	private MyButton deleteButton = new MyButton("Delete");
	private MyButton newButton = new MyButton("New");
	private MyButton yesButton = new MyButton("Yes");
	private MyButton noButton = new MyButton("No");
	private MyButton refreshButton = new MyButton("Refresh");
	private MyLabel confirmDeletionText = new MyLabel("Are you Sure?");

	private MyTable categoriesList = new MyTable();

	public CategoriesListView() {

		CaptionPanel cpPanel = new CaptionPanel("Validated Categories");
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
		mainPanel.add(categoriesList.getMyWidget());
		mainPanel.add(buttons);
		mainPanel.setStyleName("categories");

		categoriesList.setStyleName("categoriesList");
		categoriesList.setCellPadding(5);
		categoriesList.setCellSpacing(5);
		categoriesList.getRowFormatter().setStyleName(0, "header");

		categoriesList.setText(0, 0, "Selection");
		categoriesList.setText(0, 1, "ID");
		categoriesList.setText(0, 2, "Title");

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
		return categoriesList;
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


	@Override
	public Widget getMyWidget() {
		return this;
	}
}
