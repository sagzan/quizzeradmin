package com.tinesoft.quizzer.client.widget.gwt;

import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.widget.interfaces.ITextBox;


public class MyPasswordTextBox extends PasswordTextBox implements ITextBox {

	
	@Override
	public Widget getMyWidget() {
		return this;
	}
}
