package com.tinesoft.quizzer.client.widget.gwt;

import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.widget.interfaces.IListBox;


public class MyListBox extends ListBox implements IListBox {

	
	public MyListBox(boolean multipleSelection)
	{
		super(multipleSelection);
	}
	
	@Override
	public Widget getMyWidget() {
		return this;
	}
	
	public String getSelectedValue() {
		int selectedIndex = getSelectedIndex();

		return ( selectedIndex == -1 ) ? null : getValue( getSelectedIndex() );
	}

	public void setSelectedValue( String value ) {
		if ( value != null ) {
			int itemCount = getItemCount();
			for ( int i = 0; i < itemCount; i++ ) {
				if ( value.equals( getValue( i ) ) ) {
					setSelectedIndex( i );
					break;
				}
			}
		}
	}

	public void removeItem( String item ) {
		if ( item != null ) {
			int itemCount = getItemCount();
			for ( int i = 0; i < itemCount; i++ ) {
				if ( item.equals( getValue( i ) ) ) {
					removeItem( i );
					break;
				}
			}
		}
	}

}
