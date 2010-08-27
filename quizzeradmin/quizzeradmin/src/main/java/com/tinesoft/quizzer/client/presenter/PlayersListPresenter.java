package com.tinesoft.quizzer.client.presenter;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DeferredCommand;
import com.google.gwt.user.client.IncrementalCommand;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mvp4g.client.annotation.InjectService;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.tinesoft.quizzer.client.MyEventBus;
import com.tinesoft.quizzer.client.service.PlayerServiceAsync;
import com.tinesoft.quizzer.client.view.PlayersListView;
import com.tinesoft.quizzer.client.widget.gwt.MyCheckBox;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.ILabel;
import com.tinesoft.quizzer.client.widget.interfaces.ITable;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;
import com.tinesoft.quizzer.model.domain.Player;

@Presenter(view = PlayersListView.class)
public class PlayersListPresenter extends
		BasePresenter<PlayersListPresenter.IPlayersListView, MyEventBus> {

	public interface IPlayersListView extends IWidget {
		ITable getTable();

		IButton getDeleteButton();

		IButton getNewButton();

		IButton getYesButton();

		IButton getNoButton();

		ILabel getConfirmDeletionText();

		IButton getRefreshButton();

	}

	private int indexSelected = -1;
	private ArrayList<Player> players = null;
	private ArrayList<Player> playersSelected = null;
	private ArrayList<Integer> indexesSelected = null;
	private PlayerServiceAsync playerService = null;

	private boolean firstLoading = true;
	
	@InjectService
	public void setPlayerService(PlayerServiceAsync service) {
		this.playerService = service;
	}

	@Override
	public void bind() {


		view.getTable().addClickHandler(new TableClickHandler());
		view.getDeleteButton().addClickHandler(new DeleteClickHandler());
		view.getNewButton().addClickHandler(new NewClickHandler());
		view.getRefreshButton().addClickHandler(new RefreshClickHandler());
		view.getYesButton().addClickHandler(new YesClickHandler());
		view.getNoButton().addClickHandler(new NoClickHandler());
		
	}

	public void onTabSelected(int tabIndex)
	{
		if( tabIndex == RootPresenter.PLAYERS_TAB && firstLoading)
		{
			getPlayers();
			firstLoading = false;
		}
	}

	public void onRefreshPlayersList()
	{
		getPlayers();
	}
	
	public void onPlayerUpdated(Player player) {
		displayPlayer(player, players.indexOf(player) + 1);
	}

	public void onPlayerCreated(Player player) {
		players.add(player);
		displayPlayer(player, players.size());
	}

	public void onUnselectPlayer() {
		view.getTable().unSelectRow(indexSelected);
		indexSelected = 0;
	}

	void setPlayers(ArrayList<Player> players) {
		this.players = players;
		
		final int  nbPlayers = players.size();
		final ArrayList<Player> finalPlayers = players;
		
		for (int i = 0; i < nbPlayers; i++) {
			
			final int current = i;
			DeferredCommand.addCommand(new IncrementalCommand() {
				public boolean execute() {
					displayPlayer(finalPlayers.get(current), current + 1);
					return current != nbPlayers;
				}

			});
		}
	}

	void getPlayers()
	{
		eventBus.changePlayersTabWidgetTop(view);
		playerService.getPlayers(new AsyncCallback<ArrayList<Player>>() {

			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub

			}

			public void onSuccess(ArrayList<Player> result) {
				if (result == null)
					return;
				setPlayers(result);
				eventBus.changePlayersTabWidgetTop(view);
			}

		});
		view.getDeleteButton().setEnabled(false);
		setVisibleConfirmDeletion(false);
	}
	
	void selectPlayer(int row) {
		ITable table = view.getTable();

		if (row > 0) {

			if (indexSelected > 0) {
				table.unSelectRow(indexSelected);
			}

			indexSelected = row;
			table.selectRow(indexSelected);
			eventBus.selectPlayer(players.get(row - 1));
			view.getDeleteButton().setEnabled(true);
		}
	}

	void deleteSelectedPlayers() {

		playerService.deletePlayers(playersSelected,
				new AsyncCallback<Boolean>() {

					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub

					}

					public void onSuccess(Boolean result) {
						players.removeAll(playersSelected);

						ITable table = view.getTable();
						int n = indexesSelected.size();

						for (int i = 0; i < n; i++) {
							int index = indexesSelected.get(i) - i;
							table.removeRow(index);
						}

						view.getDeleteButton().setEnabled(false);
						setVisibleConfirmDeletion(false);
						eventBus.unselectPlayer();

					}

				});
	}

	void displayPlayer(Player player, int row) {
		ITable table = view.getTable();
		table.setWidget(row, 0, new MyCheckBox());
		table.setText(row, 1, "" + player.getId());
		table.setText(row, 2, player.getFirstName());
		table.setText(row, 3, player.getLastName());
		table.setText(row, 4, player.getRegistrationDate().toString());
		table.setText(row, 5, player.getLastConnectionDate().toString());
	}

	void getSelection() {
		ITable table = view.getTable();
		playersSelected = new ArrayList<Player>();
		indexesSelected = new ArrayList<Integer>();
		for (int i = 1; i < table.getRowCount(); i++) {
			MyCheckBox checkbox = (MyCheckBox) table.getWidget(i, 0);

			if (checkbox.getValue()) {
				playersSelected.add(players.get(i - 1));
				indexesSelected.add(i);
			}

		}

	}

	void setVisibleConfirmDeletion(boolean visible) {
		view.getConfirmDeletionText().setVisible(visible);
		view.getYesButton().setVisible(visible);
		view.getNoButton().setVisible(visible);
	}

	class YesClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			deleteSelectedPlayers();
		}

	}

	class NoClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			setVisibleConfirmDeletion(false);
		}

	}

	class NewClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			eventBus.createNewPlayer(new Player());
			eventBus.setFocus();
		}

	}
	
	class RefreshClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			eventBus.refreshPlayersList();
		}

	}
	
	class DeleteClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			getSelection();
			if (!playersSelected.isEmpty())
				setVisibleConfirmDeletion(true);
		}

	}

	class TableClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			ITable table = view.getTable();
			selectPlayer(table.getRowForEvent(event));
		}

	}

}
