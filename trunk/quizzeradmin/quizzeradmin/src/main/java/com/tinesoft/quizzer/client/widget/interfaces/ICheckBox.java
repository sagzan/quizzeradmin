package com.tinesoft.quizzer.client.widget.interfaces;

import com.google.gwt.event.dom.client.HasClickHandlers;

public interface ICheckBox extends IWidget, HasClickHandlers{

	public void setChecked(boolean isChecked);
	public boolean isChecked();
}
