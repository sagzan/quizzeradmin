package com.tinesoft.quizzer.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.DeferredCommand;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mvp4g.client.annotation.InjectService;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.tinesoft.quizzer.client.MyEventBus;
import com.tinesoft.quizzer.client.service.LoginServiceAsync;
import com.tinesoft.quizzer.client.view.LoginView;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.ITextBox;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;

@Presenter(view = LoginView.class)
public class LoginPresenter extends
		BasePresenter<LoginPresenter.ILoginView, MyEventBus> {
	public interface ILoginView extends IWidget {
		ITextBox getLoginTextBox();

		ITextBox getPasswordTextBox();

		IButton getOkButton();

		IButton getResetButton();

		void showLoginMode();

		void showLogoutMode();

		void showMessage(String message, String type);
		
		void hideMessage();

	}

	/**
	 * the rpc service for managing the admin login. Will be injected by mvp4g
	 */
	private LoginServiceAsync loginService = null;

	/**
	 * indicates if we are in login mode (not connected yet) or not
	 */
	private boolean loginMode = true;

	@InjectService
	public void setLoginService(LoginServiceAsync service) {
		this.loginService = service;
	}

	@Override
	public void bind() {

		view.getOkButton().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				if (loginMode)
					performLogin();
				else
					performLogout();

			}
		});

		view.getResetButton().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				init();
			}
		});

		KeyUpHandler keyUpHandler = new KeyUpHandler() {

			@Override
			public void onKeyUp(KeyUpEvent event) {
				enableOkButton();

			}
		};

		KeyDownHandler keyDownHandler = new KeyDownHandler() {

			@Override
			public void onKeyDown(KeyDownEvent event) {
				boolean okEnabled = view.getOkButton().isEnabled();
				if (okEnabled && event.getNativeKeyCode() == KeyCodes.KEY_ENTER)
					performLogin();

			}

		};

		view.getLoginTextBox().addKeyUpHandler(keyUpHandler);
		view.getPasswordTextBox().addKeyUpHandler(keyUpHandler);
		view.getPasswordTextBox().addKeyDownHandler(keyDownHandler);
	}

	public void onStart() {
		
		eventBus.changeWelcomeTabWidget(view);
		
		// we use DeferredCommand to set default focus to login TextBox
		DeferredCommand.addCommand(new Command() {
			@Override
			public void execute() {
				init();
			}
		});

	}

	private void init() {
		view.getLoginTextBox().setFocus(true);
		view.getLoginTextBox().setValue("");
		view.getPasswordTextBox().setValue("");
		view.hideMessage();
		enableOkButton();
	}

	private void performLogin() {
		
		final String login = view.getLoginTextBox().getValue();
		final String password = view.getPasswordTextBox().getValue();
		
		view.getOkButton().setEnabled(false);
		loginService.login(login, password, new AsyncCallback<Boolean>() {

			@Override
			public void onSuccess(Boolean result) {
				if (result) {
					loginMode = false;
					view.hideMessage();
					view.showLogoutMode();
					eventBus.loginSucceeded();
				} else {
					view.showMessage(
							"Login failed. Bad username and/or password",
							"error");
					view.getLoginTextBox().setFocus(true);
				}
				view.getOkButton().setEnabled(true);
			}

			@Override
			public void onFailure(Throwable caught) {
				view.showMessage(
						"An error occured while trying to Log you in. Please, Try again.",
						"error");
				view.getLoginTextBox().setFocus(true);
				view.getOkButton().setEnabled(true);
			}
		});
	}

	private void performLogout() {
		loginMode = true;
		view.showLoginMode();
		eventBus.logout();
		init();
	}

	private void enableOkButton() {
		String login = view.getLoginTextBox().getValue();
		String password = view.getPasswordTextBox().getValue();
		boolean enabled = !("".equals(login) || "".equals(password));

		view.getOkButton().setEnabled(enabled);
	}

}
