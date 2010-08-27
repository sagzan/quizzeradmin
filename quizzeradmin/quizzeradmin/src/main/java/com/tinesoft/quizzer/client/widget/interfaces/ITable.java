package com.tinesoft.quizzer.client.widget.interfaces;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Widget;

public interface ITable extends IWidget,HasClickHandlers {

	public int getRowForEvent( ClickEvent event );

	public void selectRow( int row );

	public void unSelectRow( int row );

	public void removeRow( int row );
	
	public int getRowCount();

	public void setText( int row, int column, String text );

	public void setWidget(int row, int col, IWidget widget);
	
	public Widget getWidget(int row, int col);

}
