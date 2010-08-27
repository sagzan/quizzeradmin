package com.tinesoft.quizzer.client.view;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.presenter.RootPresenter.IRootView;
import com.tinesoft.quizzer.client.widget.gwt.MyTabPanel;
import com.tinesoft.quizzer.client.widget.gwt.MyTable;
import com.tinesoft.quizzer.client.widget.interfaces.ITabPanel;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;

public class RootView extends Composite implements IRootView {

	private MyTabPanel tabPanel;
	private MyTable welcomeTabWidget;
	private MyTable playersTabWidget;
	private MyTable categoriesTabWidget;
	private MyTable questionsTabWidget;

	@Override
	public void createView() {
		tabPanel = new MyTabPanel();
		tabPanel.setAnimationEnabled(true);

		welcomeTabWidget = new MyTable();
		playersTabWidget = new MyTable();
		categoriesTabWidget = new MyTable();
		questionsTabWidget = new MyTable();

		categoriesTabWidget.getFlexCellFormatter().setColSpan(1, 0, 2);
		questionsTabWidget.getFlexCellFormatter().setColSpan(1, 0, 2);
		
		
		tabPanel.add(welcomeTabWidget, "Welcome");
		tabPanel.add(playersTabWidget, "Players");
		tabPanel.add(categoriesTabWidget, "Categories");
		tabPanel.add(questionsTabWidget, "Questions");

		initWidget(tabPanel.getMyWidget());
	}

	public IWidget getViewWidget() {
		return this;
	}

	@Override
	public void setWelcomeTabWidget(IWidget widget) {
		welcomeTabWidget.setWidget(0, 0, widget);

	}

	@Override
	public void setPlayersTabWidgetTop(IWidget widget) {

		playersTabWidget.setWidget(0, 0, widget);

	}

	@Override
	public void setPlayersTabWidgetBottom(IWidget widget) {

		playersTabWidget.setWidget(1, 0, widget);

	}

	@Override
	public void setCategoriesTabWidgetTopLeft(IWidget widget) {
		categoriesTabWidget.setWidget(0, 0, widget);
	}

	@Override
	public void setCategoriesTabWidgetTopRight(IWidget widget) {
		categoriesTabWidget.setWidget(0, 1, widget);
	}

	@Override
	public void setCategoriesTabWidgetBottom(IWidget widget) {
		categoriesTabWidget.setWidget(1, 0, widget);
	}

	@Override
	public void setQuestionsTabWidgetTopLeft(IWidget widget) {
		questionsTabWidget.setWidget(0, 0, widget);
	}

	@Override
	public void setQuestionsTabWidgetTopRight(IWidget widget) {
		questionsTabWidget.setWidget(0, 1, widget);
	}

	@Override
	public void setQuestionsTabWidgetBottom(IWidget widget) {
		questionsTabWidget.setWidget(1, 0, widget);
	}

	@Override
	public ITabPanel getTabPanel() {
		return tabPanel;
	}

	@Override
	public Widget getMyWidget() {
		return this;
	}


}
