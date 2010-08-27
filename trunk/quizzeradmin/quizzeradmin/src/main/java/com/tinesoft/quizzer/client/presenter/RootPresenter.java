package com.tinesoft.quizzer.client.presenter;

import com.google.gwt.event.logical.shared.BeforeSelectionEvent;
import com.google.gwt.event.logical.shared.BeforeSelectionHandler;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.LazyPresenter;
import com.mvp4g.client.view.LazyView;
import com.tinesoft.quizzer.client.MyEventBus;
import com.tinesoft.quizzer.client.view.RootView;
import com.tinesoft.quizzer.client.widget.interfaces.ITabPanel;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;

@Presenter(view = RootView.class)
public class RootPresenter extends
		LazyPresenter<RootPresenter.IRootView, MyEventBus> {

	public interface IRootView extends LazyView, IWidget {
		void setWelcomeTabWidget(IWidget widget);

		void setPlayersTabWidgetTop(IWidget widget);

		void setPlayersTabWidgetBottom(IWidget widget);

		void setCategoriesTabWidgetTopLeft(IWidget widget);

		void setCategoriesTabWidgetTopRight(IWidget widget);

		void setCategoriesTabWidgetBottom(IWidget widget);

		void setQuestionsTabWidgetTopLeft(IWidget widget);

		void setQuestionsTabWidgetTopRight(IWidget widget);

		void setQuestionsTabWidgetBottom(IWidget widget);

		ITabPanel getTabPanel();

	}

	public final static int WELCOME_TAB = 0;
	public final static int PLAYERS_TAB = 1;
	public final static int CATEGORIES_TAB = 2;
	public final static int QUESTIONS_TAB = 3;

	private boolean loginRequired;

	@Override
	public void createPresenter() {
		loginRequired = true;
	}

	@Override
	public void bindView() { // must be logged in to access the others tabs(
								// players, categories,..)
		view.getTabPanel().addBeforeSelectionHandler(
				new BeforeSelectionHandler<Integer>() {

					@Override
					public void onBeforeSelection(
							BeforeSelectionEvent<Integer> event) {
						if (loginRequired && event.getItem() != WELCOME_TAB)
							event.cancel();

						eventBus.tabSelected(event.getItem());
					}
				});
	}

	public void onStart() {

		view.getTabPanel().selectTab(WELCOME_TAB);
	}

	public void onLogout() {
		loginRequired = true;
		view.getTabPanel().selectTab(WELCOME_TAB);
	}

	public void onLoginSucceeded() {
		loginRequired = false;
		view.getTabPanel().selectTab(PLAYERS_TAB);
	}

	public void onChangeWelcomeTabWidget(IWidget widget) {
		view.setWelcomeTabWidget(widget);
	}

	public void onChangePlayersTabWidgetTop(IWidget widget) {
		view.setPlayersTabWidgetTop(widget);
	}

	public void onChangePlayersTabWidgetBottom(IWidget widget) {
		view.setPlayersTabWidgetBottom(widget);
	}

	public void onChangeCategoriesTabWidgetTopLeft(IWidget widget) {
		view.setCategoriesTabWidgetTopLeft(widget);
	}

	public void onChangeCategoriesTabWidgetTopRight(IWidget widget) {
		view.setCategoriesTabWidgetTopRight(widget);
	}

	public void onChangeCategoriesTabWidgetBottom(IWidget widget) {
		view.setCategoriesTabWidgetBottom(widget);
	}

	public void onChangeQuestionsTabWidgetTopLeft(IWidget widget) {
		view.setQuestionsTabWidgetTopLeft(widget);
	}

	public void onChangeQuestionsTabWidgetTopRight(IWidget widget) {
		view.setQuestionsTabWidgetTopRight(widget);
	}

	public void onChangeQuestionsTabWidgetBottom(IWidget widget) {
		view.setQuestionsTabWidgetBottom(widget);
	}

}
