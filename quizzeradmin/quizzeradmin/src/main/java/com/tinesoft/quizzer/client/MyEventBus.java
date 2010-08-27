package com.tinesoft.quizzer.client;

import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.annotation.Start;
import com.mvp4g.client.event.EventBus;
import com.tinesoft.quizzer.client.presenter.CategoriesListPresenter;
import com.tinesoft.quizzer.client.presenter.CategoryProfilePresenter;
import com.tinesoft.quizzer.client.presenter.CategoryUpdatesListPresenter;
import com.tinesoft.quizzer.client.presenter.LoginPresenter;
import com.tinesoft.quizzer.client.presenter.PlayersListPresenter;
import com.tinesoft.quizzer.client.presenter.PlayerProfilePresenter;
import com.tinesoft.quizzer.client.presenter.QuestionProfilePresenter;
import com.tinesoft.quizzer.client.presenter.QuestionUpdatesListPresenter;
import com.tinesoft.quizzer.client.presenter.QuestionsListPresenter;
import com.tinesoft.quizzer.client.presenter.RootPresenter;

import com.tinesoft.quizzer.client.view.RootView;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;
import com.tinesoft.quizzer.model.domain.Category;
import com.tinesoft.quizzer.model.domain.Player;
import com.tinesoft.quizzer.model.domain.Question;

@Events(startView = RootView.class)
public interface MyEventBus extends EventBus {
	@Start
	@Event(handlers = { RootPresenter.class, LoginPresenter.class })
	public void start();

	@Event(handlers = RootPresenter.class)
	public void logout();

	@Event(handlers = RootPresenter.class)
	public void loginSucceeded();

	@Event(handlers = { CategoriesListPresenter.class,
			QuestionsListPresenter.class, CategoryProfilePresenter.class,
			QuestionProfilePresenter.class, CategoryUpdatesListPresenter.class,
			QuestionUpdatesListPresenter.class, PlayersListPresenter.class,
			PlayerProfilePresenter.class })
	public void tabSelected(int tabIndex);

	//
	// ROOT EVENTS
	//
	@Event(handlers = RootPresenter.class)
	public void changeWelcomeTabWidget(IWidget widget);

	@Event(handlers = RootPresenter.class)
	public void changePlayersTabWidgetTop(IWidget widget);

	@Event(handlers = RootPresenter.class)
	public void changePlayersTabWidgetBottom(IWidget widget);

	@Event(handlers = RootPresenter.class)
	public void changeCategoriesTabWidgetTopLeft(IWidget view);

	@Event(handlers = RootPresenter.class)
	public void changeCategoriesTabWidgetTopRight(IWidget view);

	@Event(handlers = RootPresenter.class)
	public void changeCategoriesTabWidgetBottom(IWidget view);

	@Event(handlers = RootPresenter.class)
	public void changeQuestionsTabWidgetTopLeft(IWidget view);

	@Event(handlers = RootPresenter.class)
	public void changeQuestionsTabWidgetTopRight(IWidget view);

	@Event(handlers = RootPresenter.class)
	public void changeQuestionsTabWidgetBottom(IWidget view);

	@Event(handlers = { PlayerProfilePresenter.class,
			CategoryProfilePresenter.class })
	public void setFocus();

	//
	// PLAYERS TAB EVENTS
	//

	@Event(handlers = PlayersListPresenter.class)
	public void refreshPlayersList();

	@Event(handlers = PlayerProfilePresenter.class)
	public void createNewPlayer(Player player);

	@Event(handlers = PlayerProfilePresenter.class)
	public void selectPlayer(Player player);

	@Event(handlers = { PlayerProfilePresenter.class,
			PlayersListPresenter.class })
	public void unselectPlayer();

	@Event(handlers = PlayersListPresenter.class)
	public void playerUpdated(Player player);

	@Event(handlers = PlayersListPresenter.class)
	public void playerCreated(Player player);

	//
	// CATEGORIES TAB EVENTS
	//

	@Event(handlers = CategoriesListPresenter.class)
	public void refreshCategoriesList();

	@Event(handlers = CategoryUpdatesListPresenter.class)
	public void refreshCategoryUpdatesList();

	@Event(handlers = CategoryProfilePresenter.class)
	public void createNewCategory(Category category);

	@Event(handlers = CategoryProfilePresenter.class)
	public void selectCategory(Category category);

	@Event(handlers = { CategoryProfilePresenter.class,
			CategoriesListPresenter.class })
	public void unselectCategory();

	@Event(handlers = CategoriesListPresenter.class)
	public void categoryUpdated(Category category);

	@Event(handlers = CategoriesListPresenter.class)
	public void categoryCreated(Category category);

	//
	// QUESTIONS TAB EVENTS
	//

	@Event(handlers = QuestionsListPresenter.class)
	public void refreshQuestionsList();

	@Event(handlers = QuestionUpdatesListPresenter.class)
	public void refreshQuestionUpdatesList();

	@Event(handlers = QuestionProfilePresenter.class)
	public void createNewQuestion(Question question);

	@Event(handlers = QuestionProfilePresenter.class)
	public void selectQuestion(Question question);

	@Event(handlers = { QuestionProfilePresenter.class,
			QuestionsListPresenter.class })
	public void unselectQuestion();

	@Event(handlers = QuestionsListPresenter.class)
	public void questionUpdated(Question question);

	@Event(handlers = QuestionsListPresenter.class)
	public void questionCreated(Question question);

}
