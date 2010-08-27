package com.mvp4g.client;

import com.mvp4g.client.Mvp4gEventPasser;
import com.mvp4g.client.Mvp4gModule;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.RootPanel;
import java.util.List;
import com.google.gwt.user.client.History;
import com.mvp4g.client.event.EventHandlerInterface;
import com.google.gwt.core.client.GWT;
import com.mvp4g.client.event.BaseEventBus;
import com.mvp4g.client.Mvp4gException;
import com.mvp4g.client.presenter.PresenterInterface;
import com.mvp4g.client.history.HistoryConverter;
import com.mvp4g.client.history.PlaceService;
import com.google.gwt.inject.client.GinModules;
import com.mvp4g.client.event.EventFilter;
import com.mvp4g.client.event.EventBus;
import com.google.gwt.inject.client.Ginjector;

public class Mvp4gModuleImpl implements Mvp4gModule {
    
    private abstract class AbstractEventBus extends com.mvp4g.client.event.BaseEventBus implements com.tinesoft.quizzer.client.MyEventBus{}
    @GinModules({com.mvp4g.client.DefaultMvp4gGinModule.class})
    public interface Mvp4gGinjector extends Ginjector {
      com.tinesoft.quizzer.client.presenter.PlayerProfilePresenter getcom_tinesoft_quizzer_client_presenter_PlayerProfilePresenter();
      com.tinesoft.quizzer.client.presenter.PlayersListPresenter getcom_tinesoft_quizzer_client_presenter_PlayersListPresenter();
      com.tinesoft.quizzer.client.presenter.RootPresenter getcom_tinesoft_quizzer_client_presenter_RootPresenter();
      com.tinesoft.quizzer.client.presenter.CategoryUpdatesListPresenter getcom_tinesoft_quizzer_client_presenter_CategoryUpdatesListPresenter();
      com.tinesoft.quizzer.client.presenter.CategoryProfilePresenter getcom_tinesoft_quizzer_client_presenter_CategoryProfilePresenter();
      com.tinesoft.quizzer.client.presenter.QuestionUpdatesListPresenter getcom_tinesoft_quizzer_client_presenter_QuestionUpdatesListPresenter();
      com.tinesoft.quizzer.client.presenter.LoginPresenter getcom_tinesoft_quizzer_client_presenter_LoginPresenter();
      com.tinesoft.quizzer.client.presenter.QuestionProfilePresenter getcom_tinesoft_quizzer_client_presenter_QuestionProfilePresenter();
      com.tinesoft.quizzer.client.presenter.CategoriesListPresenter getcom_tinesoft_quizzer_client_presenter_CategoriesListPresenter();
      com.tinesoft.quizzer.client.presenter.QuestionsListPresenter getcom_tinesoft_quizzer_client_presenter_QuestionsListPresenter();
      com.tinesoft.quizzer.client.view.RootView getcom_tinesoft_quizzer_client_presenter_RootPresenterView();
      com.tinesoft.quizzer.client.view.QuestionProfileView getcom_tinesoft_quizzer_client_presenter_QuestionProfilePresenterView();
      com.tinesoft.quizzer.client.view.LoginView getcom_tinesoft_quizzer_client_presenter_LoginPresenterView();
      com.tinesoft.quizzer.client.view.QuestionUpdatesListView getcom_tinesoft_quizzer_client_presenter_QuestionUpdatesListPresenterView();
      com.tinesoft.quizzer.client.view.QuestionsListView getcom_tinesoft_quizzer_client_presenter_QuestionsListPresenterView();
      com.tinesoft.quizzer.client.view.PlayersListView getcom_tinesoft_quizzer_client_presenter_PlayersListPresenterView();
      com.tinesoft.quizzer.client.view.CategoryProfileView getcom_tinesoft_quizzer_client_presenter_CategoryProfilePresenterView();
      com.tinesoft.quizzer.client.view.PlayerProfileView getcom_tinesoft_quizzer_client_presenter_PlayerProfilePresenterView();
      com.tinesoft.quizzer.client.view.CategoriesListView getcom_tinesoft_quizzer_client_presenter_CategoriesListPresenterView();
      com.tinesoft.quizzer.client.view.CategoryUpdatesListView getcom_tinesoft_quizzer_client_presenter_CategoryUpdatesListPresenterView();
    }
    private Object startView = null;
    private PresenterInterface startPresenter = null;
    protected AbstractEventBus eventBus = null;
    protected com.mvp4g.client.Mvp4gModule itself = this;
    private PlaceService placeService = null;
    public void setParentModule(com.mvp4g.client.Mvp4gModule module){}
    public void addConverter(String eventType, String historyName, HistoryConverter<?> hc){
      placeService.addConverter(eventType, historyName, hc);
    }
    public void clearHistory(){
      placeService.clearHistory();
    }
    public void place(String token, String form){
      placeService.place( token, form );
    }
    public void dispatchHistoryEvent(String eventType, final Mvp4gEventPasser passer){
      int index = eventType.indexOf(PlaceService.MODULE_SEPARATOR);
      if(index > -1){
        String moduleHistoryName = eventType.substring(0, index);
        String nextToken = eventType.substring(index + 1);
        Mvp4gEventPasser nextPasser = new Mvp4gEventPasser(nextToken) {
          public void pass(Mvp4gModule module) {
            module.dispatchHistoryEvent((String) eventObjects[0], passer);
          }
        };
        passer.setEventObject(false);
        passer.pass(this);
      }else{
        passer.pass(this);
      }
    }
    
    public void onForward(){
    }
    
    public void createAndStartModule(){
      final Mvp4gGinjector injector = GWT.create( Mvp4gGinjector.class );
      final com.tinesoft.quizzer.client.view.RootView com_tinesoft_quizzer_client_presenter_RootPresenterView = injector.getcom_tinesoft_quizzer_client_presenter_RootPresenterView();
      final com.tinesoft.quizzer.client.view.QuestionProfileView com_tinesoft_quizzer_client_presenter_QuestionProfilePresenterView = injector.getcom_tinesoft_quizzer_client_presenter_QuestionProfilePresenterView();
      final com.tinesoft.quizzer.client.view.LoginView com_tinesoft_quizzer_client_presenter_LoginPresenterView = injector.getcom_tinesoft_quizzer_client_presenter_LoginPresenterView();
      final com.tinesoft.quizzer.client.view.QuestionUpdatesListView com_tinesoft_quizzer_client_presenter_QuestionUpdatesListPresenterView = injector.getcom_tinesoft_quizzer_client_presenter_QuestionUpdatesListPresenterView();
      final com.tinesoft.quizzer.client.view.QuestionsListView com_tinesoft_quizzer_client_presenter_QuestionsListPresenterView = injector.getcom_tinesoft_quizzer_client_presenter_QuestionsListPresenterView();
      final com.tinesoft.quizzer.client.view.PlayersListView com_tinesoft_quizzer_client_presenter_PlayersListPresenterView = injector.getcom_tinesoft_quizzer_client_presenter_PlayersListPresenterView();
      final com.tinesoft.quizzer.client.view.CategoryProfileView com_tinesoft_quizzer_client_presenter_CategoryProfilePresenterView = injector.getcom_tinesoft_quizzer_client_presenter_CategoryProfilePresenterView();
      final com.tinesoft.quizzer.client.view.PlayerProfileView com_tinesoft_quizzer_client_presenter_PlayerProfilePresenterView = injector.getcom_tinesoft_quizzer_client_presenter_PlayerProfilePresenterView();
      final com.tinesoft.quizzer.client.view.CategoriesListView com_tinesoft_quizzer_client_presenter_CategoriesListPresenterView = injector.getcom_tinesoft_quizzer_client_presenter_CategoriesListPresenterView();
      final com.tinesoft.quizzer.client.view.CategoryUpdatesListView com_tinesoft_quizzer_client_presenter_CategoryUpdatesListPresenterView = injector.getcom_tinesoft_quizzer_client_presenter_CategoryUpdatesListPresenterView();
      
      
      final com.tinesoft.quizzer.client.service.CategoryServiceAsync com_tinesoft_quizzer_client_service_CategoryServiceAsync = GWT.create(com.tinesoft.quizzer.client.service.CategoryService.class);
      final com.tinesoft.quizzer.client.service.PlayerServiceAsync com_tinesoft_quizzer_client_service_PlayerServiceAsync = GWT.create(com.tinesoft.quizzer.client.service.PlayerService.class);
      final com.tinesoft.quizzer.client.service.LoginServiceAsync com_tinesoft_quizzer_client_service_LoginServiceAsync = GWT.create(com.tinesoft.quizzer.client.service.LoginService.class);
      final com.tinesoft.quizzer.client.service.QuestionServiceAsync com_tinesoft_quizzer_client_service_QuestionServiceAsync = GWT.create(com.tinesoft.quizzer.client.service.QuestionService.class);
      
      
      final com.tinesoft.quizzer.client.presenter.PlayerProfilePresenter com_tinesoft_quizzer_client_presenter_PlayerProfilePresenter = injector.getcom_tinesoft_quizzer_client_presenter_PlayerProfilePresenter();
      com_tinesoft_quizzer_client_presenter_PlayerProfilePresenter.setView(com_tinesoft_quizzer_client_presenter_PlayerProfilePresenterView);
      com_tinesoft_quizzer_client_presenter_PlayerProfilePresenter.setPlayerService(com_tinesoft_quizzer_client_service_PlayerServiceAsync);
      final com.tinesoft.quizzer.client.presenter.PlayersListPresenter com_tinesoft_quizzer_client_presenter_PlayersListPresenter = injector.getcom_tinesoft_quizzer_client_presenter_PlayersListPresenter();
      com_tinesoft_quizzer_client_presenter_PlayersListPresenter.setView(com_tinesoft_quizzer_client_presenter_PlayersListPresenterView);
      com_tinesoft_quizzer_client_presenter_PlayersListPresenter.setPlayerService(com_tinesoft_quizzer_client_service_PlayerServiceAsync);
      final com.tinesoft.quizzer.client.presenter.RootPresenter com_tinesoft_quizzer_client_presenter_RootPresenter = injector.getcom_tinesoft_quizzer_client_presenter_RootPresenter();
      com_tinesoft_quizzer_client_presenter_RootPresenter.setView(com_tinesoft_quizzer_client_presenter_RootPresenterView);
      final com.tinesoft.quizzer.client.presenter.CategoryUpdatesListPresenter com_tinesoft_quizzer_client_presenter_CategoryUpdatesListPresenter = injector.getcom_tinesoft_quizzer_client_presenter_CategoryUpdatesListPresenter();
      com_tinesoft_quizzer_client_presenter_CategoryUpdatesListPresenter.setView(com_tinesoft_quizzer_client_presenter_CategoryUpdatesListPresenterView);
      com_tinesoft_quizzer_client_presenter_CategoryUpdatesListPresenter.setCategoryService(com_tinesoft_quizzer_client_service_CategoryServiceAsync);
      final com.tinesoft.quizzer.client.presenter.CategoryProfilePresenter com_tinesoft_quizzer_client_presenter_CategoryProfilePresenter = injector.getcom_tinesoft_quizzer_client_presenter_CategoryProfilePresenter();
      com_tinesoft_quizzer_client_presenter_CategoryProfilePresenter.setView(com_tinesoft_quizzer_client_presenter_CategoryProfilePresenterView);
      com_tinesoft_quizzer_client_presenter_CategoryProfilePresenter.setCategoryService(com_tinesoft_quizzer_client_service_CategoryServiceAsync);
      final com.tinesoft.quizzer.client.presenter.QuestionUpdatesListPresenter com_tinesoft_quizzer_client_presenter_QuestionUpdatesListPresenter = injector.getcom_tinesoft_quizzer_client_presenter_QuestionUpdatesListPresenter();
      com_tinesoft_quizzer_client_presenter_QuestionUpdatesListPresenter.setView(com_tinesoft_quizzer_client_presenter_QuestionUpdatesListPresenterView);
      com_tinesoft_quizzer_client_presenter_QuestionUpdatesListPresenter.setQuestionService(com_tinesoft_quizzer_client_service_QuestionServiceAsync);
      final com.tinesoft.quizzer.client.presenter.LoginPresenter com_tinesoft_quizzer_client_presenter_LoginPresenter = injector.getcom_tinesoft_quizzer_client_presenter_LoginPresenter();
      com_tinesoft_quizzer_client_presenter_LoginPresenter.setView(com_tinesoft_quizzer_client_presenter_LoginPresenterView);
      com_tinesoft_quizzer_client_presenter_LoginPresenter.setLoginService(com_tinesoft_quizzer_client_service_LoginServiceAsync);
      final com.tinesoft.quizzer.client.presenter.QuestionProfilePresenter com_tinesoft_quizzer_client_presenter_QuestionProfilePresenter = injector.getcom_tinesoft_quizzer_client_presenter_QuestionProfilePresenter();
      com_tinesoft_quizzer_client_presenter_QuestionProfilePresenter.setView(com_tinesoft_quizzer_client_presenter_QuestionProfilePresenterView);
      com_tinesoft_quizzer_client_presenter_QuestionProfilePresenter.setCategoryService(com_tinesoft_quizzer_client_service_CategoryServiceAsync);
      com_tinesoft_quizzer_client_presenter_QuestionProfilePresenter.setQuestionService(com_tinesoft_quizzer_client_service_QuestionServiceAsync);
      final com.tinesoft.quizzer.client.presenter.CategoriesListPresenter com_tinesoft_quizzer_client_presenter_CategoriesListPresenter = injector.getcom_tinesoft_quizzer_client_presenter_CategoriesListPresenter();
      com_tinesoft_quizzer_client_presenter_CategoriesListPresenter.setView(com_tinesoft_quizzer_client_presenter_CategoriesListPresenterView);
      com_tinesoft_quizzer_client_presenter_CategoriesListPresenter.setCategoryService(com_tinesoft_quizzer_client_service_CategoryServiceAsync);
      final com.tinesoft.quizzer.client.presenter.QuestionsListPresenter com_tinesoft_quizzer_client_presenter_QuestionsListPresenter = injector.getcom_tinesoft_quizzer_client_presenter_QuestionsListPresenter();
      com_tinesoft_quizzer_client_presenter_QuestionsListPresenter.setView(com_tinesoft_quizzer_client_presenter_QuestionsListPresenterView);
      com_tinesoft_quizzer_client_presenter_QuestionsListPresenter.setQuestionService(com_tinesoft_quizzer_client_service_QuestionServiceAsync);
      
      
      eventBus = new AbstractEventBus(){
        protected <T extends EventHandlerInterface<?>> T createHandler( Class<T> handlerClass ){
        return null;
        }
        public void playerUpdated(com.tinesoft.quizzer.model.domain.Player attr0){
        if (com_tinesoft_quizzer_client_presenter_PlayersListPresenter.isActivated()){
          com_tinesoft_quizzer_client_presenter_PlayersListPresenter.onPlayerUpdated(attr0);
        }
      }
      public void refreshQuestionsList(){
      if (com_tinesoft_quizzer_client_presenter_QuestionsListPresenter.isActivated()){
        com_tinesoft_quizzer_client_presenter_QuestionsListPresenter.onRefreshQuestionsList();
      }
    }
    public void loginSucceeded(){
    if (com_tinesoft_quizzer_client_presenter_RootPresenter.isActivated()){
      com_tinesoft_quizzer_client_presenter_RootPresenter.onLoginSucceeded();
    }
  }
  public void refreshPlayersList(){
  if (com_tinesoft_quizzer_client_presenter_PlayersListPresenter.isActivated()){
    com_tinesoft_quizzer_client_presenter_PlayersListPresenter.onRefreshPlayersList();
  }
}
public void selectQuestion(com.tinesoft.quizzer.model.domain.Question attr0){
if (com_tinesoft_quizzer_client_presenter_QuestionProfilePresenter.isActivated()){
  com_tinesoft_quizzer_client_presenter_QuestionProfilePresenter.onSelectQuestion(attr0);
}
}
public void unselectQuestion(){
if (com_tinesoft_quizzer_client_presenter_QuestionProfilePresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_QuestionProfilePresenter.onUnselectQuestion();
}
if (com_tinesoft_quizzer_client_presenter_QuestionsListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_QuestionsListPresenter.onUnselectQuestion();
}
}
public void changeQuestionsTabWidgetBottom(com.tinesoft.quizzer.client.widget.interfaces.IWidget attr0){
if (com_tinesoft_quizzer_client_presenter_RootPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_RootPresenter.onChangeQuestionsTabWidgetBottom(attr0);
}
}
public void createNewPlayer(com.tinesoft.quizzer.model.domain.Player attr0){
if (com_tinesoft_quizzer_client_presenter_PlayerProfilePresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_PlayerProfilePresenter.onCreateNewPlayer(attr0);
}
}
public void changePlayersTabWidgetBottom(com.tinesoft.quizzer.client.widget.interfaces.IWidget attr0){
if (com_tinesoft_quizzer_client_presenter_RootPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_RootPresenter.onChangePlayersTabWidgetBottom(attr0);
}
}
public void questionUpdated(com.tinesoft.quizzer.model.domain.Question attr0){
if (com_tinesoft_quizzer_client_presenter_QuestionsListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_QuestionsListPresenter.onQuestionUpdated(attr0);
}
}
public void tabSelected(int attr0){
if (com_tinesoft_quizzer_client_presenter_CategoriesListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_CategoriesListPresenter.onTabSelected(attr0);
}
if (com_tinesoft_quizzer_client_presenter_QuestionsListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_QuestionsListPresenter.onTabSelected(attr0);
}
if (com_tinesoft_quizzer_client_presenter_CategoryProfilePresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_CategoryProfilePresenter.onTabSelected(attr0);
}
if (com_tinesoft_quizzer_client_presenter_QuestionProfilePresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_QuestionProfilePresenter.onTabSelected(attr0);
}
if (com_tinesoft_quizzer_client_presenter_CategoryUpdatesListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_CategoryUpdatesListPresenter.onTabSelected(attr0);
}
if (com_tinesoft_quizzer_client_presenter_QuestionUpdatesListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_QuestionUpdatesListPresenter.onTabSelected(attr0);
}
if (com_tinesoft_quizzer_client_presenter_PlayersListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_PlayersListPresenter.onTabSelected(attr0);
}
if (com_tinesoft_quizzer_client_presenter_PlayerProfilePresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_PlayerProfilePresenter.onTabSelected(attr0);
}
}
public void changeQuestionsTabWidgetTopLeft(com.tinesoft.quizzer.client.widget.interfaces.IWidget attr0){
if (com_tinesoft_quizzer_client_presenter_RootPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_RootPresenter.onChangeQuestionsTabWidgetTopLeft(attr0);
}
}
public void selectPlayer(com.tinesoft.quizzer.model.domain.Player attr0){
if (com_tinesoft_quizzer_client_presenter_PlayerProfilePresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_PlayerProfilePresenter.onSelectPlayer(attr0);
}
}
public void playerCreated(com.tinesoft.quizzer.model.domain.Player attr0){
if (com_tinesoft_quizzer_client_presenter_PlayersListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_PlayersListPresenter.onPlayerCreated(attr0);
}
}
public void changeQuestionsTabWidgetTopRight(com.tinesoft.quizzer.client.widget.interfaces.IWidget attr0){
if (com_tinesoft_quizzer_client_presenter_RootPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_RootPresenter.onChangeQuestionsTabWidgetTopRight(attr0);
}
}
public void unselectCategory(){
if (com_tinesoft_quizzer_client_presenter_CategoryProfilePresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_CategoryProfilePresenter.onUnselectCategory();
}
if (com_tinesoft_quizzer_client_presenter_CategoriesListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_CategoriesListPresenter.onUnselectCategory();
}
}
public void changeCategoriesTabWidgetBottom(com.tinesoft.quizzer.client.widget.interfaces.IWidget attr0){
if (com_tinesoft_quizzer_client_presenter_RootPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_RootPresenter.onChangeCategoriesTabWidgetBottom(attr0);
}
}
public void createNewQuestion(com.tinesoft.quizzer.model.domain.Question attr0){
if (com_tinesoft_quizzer_client_presenter_QuestionProfilePresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_QuestionProfilePresenter.onCreateNewQuestion(attr0);
}
}
public void setFocus(){
if (com_tinesoft_quizzer_client_presenter_PlayerProfilePresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_PlayerProfilePresenter.onSetFocus();
}
if (com_tinesoft_quizzer_client_presenter_CategoryProfilePresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_CategoryProfilePresenter.onSetFocus();
}
}
public void refreshQuestionUpdatesList(){
if (com_tinesoft_quizzer_client_presenter_QuestionUpdatesListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_QuestionUpdatesListPresenter.onRefreshQuestionUpdatesList();
}
}
public void categoryUpdated(com.tinesoft.quizzer.model.domain.Category attr0){
if (com_tinesoft_quizzer_client_presenter_CategoriesListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_CategoriesListPresenter.onCategoryUpdated(attr0);
}
}
public void changeWelcomeTabWidget(com.tinesoft.quizzer.client.widget.interfaces.IWidget attr0){
if (com_tinesoft_quizzer_client_presenter_RootPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_RootPresenter.onChangeWelcomeTabWidget(attr0);
}
}
public void selectCategory(com.tinesoft.quizzer.model.domain.Category attr0){
if (com_tinesoft_quizzer_client_presenter_CategoryProfilePresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_CategoryProfilePresenter.onSelectCategory(attr0);
}
}
public void createNewCategory(com.tinesoft.quizzer.model.domain.Category attr0){
if (com_tinesoft_quizzer_client_presenter_CategoryProfilePresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_CategoryProfilePresenter.onCreateNewCategory(attr0);
}
}
public void changeCategoriesTabWidgetTopRight(com.tinesoft.quizzer.client.widget.interfaces.IWidget attr0){
if (com_tinesoft_quizzer_client_presenter_RootPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_RootPresenter.onChangeCategoriesTabWidgetTopRight(attr0);
}
}
public void refreshCategoriesList(){
if (com_tinesoft_quizzer_client_presenter_CategoriesListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_CategoriesListPresenter.onRefreshCategoriesList();
}
}
public void logout(){
if (com_tinesoft_quizzer_client_presenter_RootPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_RootPresenter.onLogout();
}
}
public void categoryCreated(com.tinesoft.quizzer.model.domain.Category attr0){
if (com_tinesoft_quizzer_client_presenter_CategoriesListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_CategoriesListPresenter.onCategoryCreated(attr0);
}
}
public void start(){
if (com_tinesoft_quizzer_client_presenter_RootPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_RootPresenter.onStart();
}
if (com_tinesoft_quizzer_client_presenter_LoginPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_LoginPresenter.onStart();
}
}
public void changePlayersTabWidgetTop(com.tinesoft.quizzer.client.widget.interfaces.IWidget attr0){
if (com_tinesoft_quizzer_client_presenter_RootPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_RootPresenter.onChangePlayersTabWidgetTop(attr0);
}
}
public void questionCreated(com.tinesoft.quizzer.model.domain.Question attr0){
if (com_tinesoft_quizzer_client_presenter_QuestionsListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_QuestionsListPresenter.onQuestionCreated(attr0);
}
}
public void unselectPlayer(){
if (com_tinesoft_quizzer_client_presenter_PlayerProfilePresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_PlayerProfilePresenter.onUnselectPlayer();
}
if (com_tinesoft_quizzer_client_presenter_PlayersListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_PlayersListPresenter.onUnselectPlayer();
}
}
public void refreshCategoryUpdatesList(){
if (com_tinesoft_quizzer_client_presenter_CategoryUpdatesListPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_CategoryUpdatesListPresenter.onRefreshCategoryUpdatesList();
}
}
public void changeCategoriesTabWidgetTopLeft(com.tinesoft.quizzer.client.widget.interfaces.IWidget attr0){
if (com_tinesoft_quizzer_client_presenter_RootPresenter.isActivated()){
com_tinesoft_quizzer_client_presenter_RootPresenter.onChangeCategoriesTabWidgetTopLeft(attr0);
}
}
};

com_tinesoft_quizzer_client_presenter_PlayerProfilePresenter.setEventBus(eventBus);
com_tinesoft_quizzer_client_presenter_PlayersListPresenter.setEventBus(eventBus);
com_tinesoft_quizzer_client_presenter_RootPresenter.setEventBus(eventBus);
com_tinesoft_quizzer_client_presenter_CategoryUpdatesListPresenter.setEventBus(eventBus);
com_tinesoft_quizzer_client_presenter_CategoryProfilePresenter.setEventBus(eventBus);
com_tinesoft_quizzer_client_presenter_QuestionUpdatesListPresenter.setEventBus(eventBus);
com_tinesoft_quizzer_client_presenter_LoginPresenter.setEventBus(eventBus);
com_tinesoft_quizzer_client_presenter_QuestionProfilePresenter.setEventBus(eventBus);
com_tinesoft_quizzer_client_presenter_CategoriesListPresenter.setEventBus(eventBus);
com_tinesoft_quizzer_client_presenter_QuestionsListPresenter.setEventBus(eventBus);


this.startPresenter = com_tinesoft_quizzer_client_presenter_RootPresenter;
this.startView = com_tinesoft_quizzer_client_presenter_RootPresenterView;
eventBus.start();
}
public Object getStartView(){
if (startPresenter != null) {
startPresenter.setActivated(true);
startPresenter.isActivated();
}return startView;
}

public EventBus getEventBus(){
return eventBus;
}
}
