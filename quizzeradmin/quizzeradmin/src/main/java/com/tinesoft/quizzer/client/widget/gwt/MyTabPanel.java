package com.tinesoft.quizzer.client.widget.gwt;

import com.google.gwt.user.client.ui.DecoratedTabPanel;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.widget.interfaces.ITabPanel;

public class MyTabPanel extends DecoratedTabPanel implements ITabPanel {

	@Override
	public Widget getMyWidget() {
		return this;
	}
}
