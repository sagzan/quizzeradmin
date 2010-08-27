package com.tinesoft.quizzer.client.widget.gwt;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;

public class MyButton extends Button implements IButton {

	public MyButton() {
		//nothing to do
	}

	public MyButton( String text ) {
		super( text );
	}

	@Override
	public Widget getMyWidget() {
		return this;
	}

}
