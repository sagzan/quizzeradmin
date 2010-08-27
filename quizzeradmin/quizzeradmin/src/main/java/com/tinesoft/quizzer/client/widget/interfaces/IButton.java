package com.tinesoft.quizzer.client.widget.interfaces;

import com.google.gwt.event.dom.client.HasClickHandlers;

public interface IButton extends IWidget,HasClickHandlers {

	public boolean isEnabled();
	
	public boolean isVisible();	
	
	public void setEnabled( boolean enabled );

	public void setVisible( boolean isVisible );
	
	public String getText();

	public void setText( String text );
}
