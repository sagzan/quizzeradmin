package com.tinesoft.quizzer.client.widget.interfaces;

import com.google.gwt.event.logical.shared.HasBeforeSelectionHandlers;
import com.google.gwt.user.client.ui.HasAnimation;
import com.google.gwt.user.client.ui.Widget;



public interface ITabPanel extends IWidget,HasAnimation, HasBeforeSelectionHandlers<Integer>{

	public void selectTab(int index);
	public void add(Widget widget,String tabText);
	public boolean remove(Widget widget);
}
