package com.tinesoft.quizzer.client.widget.gwt;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.widget.interfaces.ITable;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;


public class MyTable extends FlexTable implements ITable {

	
	@Override
	public Widget getMyWidget() {
		return this;
	}
	
	public void selectRow( int row ) {
		getRowFormatter().addStyleName( row, "selected" );

	}

	public void unSelectRow( int row ) {
		getRowFormatter().removeStyleName( row, "selected" );
	}

	public int getRowForEvent( ClickEvent event ) {
		return getCellForEvent( event ).getRowIndex();
	}

	@Override
	public void setWidget(int row, int col, IWidget widget) {
		super.setWidget(row, col, widget.getMyWidget());
		
	}
	
	@Override
	public Widget getWidget(int row, int col) {
		return super.getWidget(row, col);
		
	}

}
