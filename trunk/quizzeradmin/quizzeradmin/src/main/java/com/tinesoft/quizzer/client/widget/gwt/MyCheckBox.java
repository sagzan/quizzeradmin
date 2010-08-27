package com.tinesoft.quizzer.client.widget.gwt;

import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.widget.interfaces.ICheckBox;

public class MyCheckBox extends CheckBox implements ICheckBox {

	public MyCheckBox() {
		//nothing to do
	}

	public MyCheckBox( String text ) {
		super( text );
	}
	
	@Override
	public Widget getMyWidget() {
		return this;
	}
}
