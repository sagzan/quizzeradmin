package com.tinesoft.quizzer.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mvp4g.client.annotation.InjectService;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.tinesoft.quizzer.client.MyEventBus;
import com.tinesoft.quizzer.client.service.PlayerServiceAsync;
import com.tinesoft.quizzer.client.view.PlayerProfileView;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.ICheckBox;
import com.tinesoft.quizzer.client.widget.interfaces.ITextBox;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;
import com.tinesoft.quizzer.model.domain.Player;

@Presenter(view = PlayerProfileView.class)
public class PlayerProfilePresenter extends
		BasePresenter<PlayerProfilePresenter.IPlayerProfileView, MyEventBus> {

	public interface IPlayerProfileView extends IWidget {

		ITextBox getFirstName();

		ITextBox getLastName();

		ITextBox getEmail();

		ITextBox getLogin();

		ITextBox getPassword();

		ITextBox getBirthDate();

		IButton getUpdateButton();

		IButton getCancelButton();

		ICheckBox getAdmin();
		
		void showAddMode();

		void showUpdateMode();

		void setDateFormat(String format);


	}

	private static final String DATE_PATTERN = "(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/((19|20)\\d\\d)";

	private static final String DATE_FORMAT = "MM/dd/yyyy";

	private boolean toUpdate = true;
	private String birthDate;
	private Player player = null;
	private Player playerCopy = new Player();

	private PlayerServiceAsync service = null;
	
	private boolean firstLoading = true;

	@InjectService
	public void setPlayerService(PlayerServiceAsync service) {
		this.service = service;
	}

	@Override
	public void bind() {

		view.getUpdateButton().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {

				fillBean();
				if (toUpdate) {
					updatePlayer();
				} else {
					createPlayer();
				}
			}

		});

		view.getCancelButton().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				eventBus.unselectPlayer();
			}

		});

		KeyUpHandler handler = new KeyUpHandler() {

			public void onKeyUp(KeyUpEvent event) {
				enableUpdateButton();
			}

		};

		view.getFirstName().addKeyUpHandler(handler);
		view.getLastName().addKeyUpHandler(handler);
		view.getLogin().addKeyUpHandler(handler);
		view.getPassword().addKeyUpHandler(handler);
		view.getEmail().addKeyUpHandler(handler);

		init();
	}

	public void onTabSelected(int tabIndex)
	{
		if( tabIndex == RootPresenter.PLAYERS_TAB && firstLoading)
		{
			view.setDateFormat(DATE_FORMAT);
			eventBus.changePlayersTabWidgetBottom(view);
			firstLoading = false;
		}
	}
	
	public void onSetFocus()
	{
		view.getFirstName().setFocus(true);
	}
	public void onSelectPlayer(Player player) {
		this.player = player;
		copy(this.player, this.playerCopy);

		toUpdate = true;
		fillForm();
		view.showUpdateMode();
		view.getUpdateButton().setEnabled(true);
		view.getCancelButton().setEnabled(true);

	}

	public void onUnselectPlayer() {
		player = null;
		init();
	}

	public void onCreateNewPlayer(Player player) {
		this.player = player;
		init();

		view.showAddMode();
		view.getUpdateButton().setEnabled(false);
		view.getCancelButton().setEnabled(true);
		toUpdate = false;

	}

	private void init() {
		view.getFirstName().setValue("");
		view.getLastName().setValue("");
		view.getBirthDate().setValue("");
		view.getEmail().setValue("");
		view.getLogin().setValue("");
		view.getPassword().setValue("");
		view.getAdmin().setChecked(false);
		view.getUpdateButton().setEnabled(false);
		view.getCancelButton().setEnabled(false);
		view.showUpdateMode();

	}

	void copy(Player initial, Player copy) {
		copy.setFirstName(initial.getFirstName());
		copy.setLastName(initial.getLastName());
		copy.setLogin(initial.getLogin());
		copy.setPassword(initial.getPassword());
		copy.setEmail(initial.getEmail());
		copy.setAdmin(initial.isAdmin());
		copy.setBirthDate(initial.getBirthDate());
	}

	private void fillForm() {
		view.getFirstName().setValue(player.getFirstName());
		view.getLastName().setValue(player.getLastName());

		DateTimeFormat format = DateTimeFormat.getFormat(DATE_FORMAT);
		String date = format.format(player.getBirthDate());

		view.getBirthDate().setValue(date);
		view.getEmail().setValue(player.getEmail());
		view.getLogin().setValue(player.getLogin());
		view.getPassword().setValue(player.getPassword());
		view.getAdmin().setChecked(player.isAdmin());
	}

	private void fillBean() {
		player.setFirstName(view.getFirstName().getValue());
		player.setLastName(view.getLastName().getValue());
		player.setEmail(view.getEmail().getValue());
		player.setLogin(view.getLogin().getValue());
		player.setPassword(view.getPassword().getValue());
		player.setAdmin(view.getAdmin().isChecked());
		birthDate = view.getBirthDate().getValue();
		// TODO
	}

	private void createPlayer() {
		service.createPlayer(player, birthDate, DATE_FORMAT,
				new AsyncCallback<Player>() {

					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub

					}

					public void onSuccess(Player result) {
						if (result == null)
							return;
						
						player = result;
						init();
						eventBus.playerCreated(player);
					}

				});
	}

	private void updatePlayer() {
		service.updatePlayer(player, new AsyncCallback<Boolean>() {

			public void onFailure(Throwable caught) {
				copy(playerCopy, player);
			}

			public void onSuccess(Boolean result) {
				if (result == false)
					return;
				init();
				eventBus.playerUpdated(player);
			}

		});
	}

	private void enableUpdateButton() {

		String firstName = view.getFirstName().getValue();
		String lastName = view.getLastName().getValue();
		String birthDate = view.getBirthDate().getValue();
		String login = view.getLogin().getValue();
		String email = view.getEmail().getValue();
		String password = view.getPassword().getValue();

		boolean enabled = !("".equals(login) || "".equals(password)
				|| "".equals(firstName) || "".equals(lastName)
				|| "".equals(email) || "".equals(birthDate))
				&& birthDate.matches(DATE_PATTERN);

		view.getUpdateButton().setEnabled(enabled);
	}

}
