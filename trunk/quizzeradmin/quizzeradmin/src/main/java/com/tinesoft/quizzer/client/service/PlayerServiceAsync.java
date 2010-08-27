package com.tinesoft.quizzer.client.service;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.tinesoft.quizzer.model.domain.Player;

public interface PlayerServiceAsync {

	void createPlayer(Player player, String birthDate, String dateFormat,
			AsyncCallback<Player> callback);

	void deletePlayer(Player player, AsyncCallback<Boolean> callback);

	void getPlayers(AsyncCallback<ArrayList<Player>> callback);

	void updatePlayer(Player player, AsyncCallback<Boolean> callback);

	void deletePlayers(ArrayList<Player> players, AsyncCallback<Boolean> callback);

}
