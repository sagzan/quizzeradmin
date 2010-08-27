package com.tinesoft.quizzer.client.widget.gwt;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.widget.interfaces.IGrid;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;

public class MyGrid extends Grid implements IGrid{

	@Override
	public void setWidget(int row, int col, IWidget widget) {

		super.setWidget(row, col, widget.getMyWidget());
	}

	@Override
	public Widget getMyWidget() {
		// TODO Auto-generated method stub
		return this;
	}

}
