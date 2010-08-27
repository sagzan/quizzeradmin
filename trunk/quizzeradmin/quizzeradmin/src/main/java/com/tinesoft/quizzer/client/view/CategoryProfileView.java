package com.tinesoft.quizzer.client.view;

import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.presenter.CategoryProfilePresenter.ICategoryProfileView;
import com.tinesoft.quizzer.client.widget.gwt.MyButton;
import com.tinesoft.quizzer.client.widget.gwt.MyTable;
import com.tinesoft.quizzer.client.widget.gwt.MyTextBox;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.ITextBox;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;

public class CategoryProfileView extends Composite implements
		ICategoryProfileView {

	private MyTextBox title = new MyTextBox();

	private MyButton update = new MyButton();
	private MyButton cancel = new MyButton("Cancel");

	public CategoryProfileView() {
		CaptionPanel cpPanel = new CaptionPanel("Category Profile");
		cpPanel.setStyleName("gwt-CaptionPanel");
		
		MyTable table = new MyTable();

		table.setText(0, 0, "Title*");
		table.setWidget(0, 1, title.getMyWidget());

		table.setWidget(1, 0, update.getMyWidget());
		table.setWidget(1, 1, cancel.getMyWidget());

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
		update.setText("Add Category");
	}

	@Override
	public void showUpdateMode() {
		update.setText("Update");
	}

	@Override
	public ITextBox getTitleTextBox() {
		return title;
	}

	@Override
	public Widget getMyWidget() {
		return this;
	}

}
