package com.tinesoft.quizzer.client.widget.interfaces;

import com.google.gwt.event.dom.client.HasKeyDownHandlers;
import com.google.gwt.event.dom.client.HasKeyUpHandlers;
import com.google.gwt.user.client.ui.Focusable;
import com.google.gwt.user.client.ui.HasValue;

public interface ITextBox extends IWidget, HasValue<String>, Focusable,
		HasKeyUpHandlers, HasKeyDownHandlers {
	
	public boolean isEnabled();
	
	public boolean isVisible();	
	
	public void setEnabled( boolean enabled );

	public void setVisible( boolean isVisible );
}
