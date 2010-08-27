package com.tinesoft.quizzer.client.widget.gwt;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.widget.interfaces.ILabel;


public class MyLabel extends Label implements ILabel {

	public MyLabel( String text ) {
		super( text );
	}
	
	@Override
	public Widget getMyWidget() {
		return this;
	}

}
