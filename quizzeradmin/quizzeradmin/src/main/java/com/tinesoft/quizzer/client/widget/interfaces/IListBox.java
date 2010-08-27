package com.tinesoft.quizzer.client.widget.interfaces;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasKeyUpHandlers;

public interface IListBox extends IWidget,HasClickHandlers, HasKeyUpHandlers {

	public void setSelectedIndex( int index );

	public int getSelectedIndex();

	public String getSelectedValue();

	public void setSelectedValue( String value );

	public void addItem( String item );

	public void removeItem( String item );

	public void clear();


}
