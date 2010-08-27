package com.tinesoft.quizzer.client.widget.gwt;

import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.widget.interfaces.ITextBox;


public class MyTextBox extends TextBox implements ITextBox {


	@Override
	public Widget getMyWidget() {
		return this;
	}
}
