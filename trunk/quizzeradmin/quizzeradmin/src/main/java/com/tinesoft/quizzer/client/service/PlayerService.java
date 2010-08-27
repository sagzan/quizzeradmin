package com.tinesoft.quizzer.client.service;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.tinesoft.quizzer.model.domain.Player;

@RemoteServiceRelativePath("playerService")
public interface PlayerService extends RemoteService {

	public ArrayList<Player> getPlayers();

	public Player createPlayer(Player player, String birthDate,String dateFormat);			

	public boolean deletePlayer(Player player) ;

	public boolean deletePlayers(ArrayList<Player> players) ;

	public boolean updatePlayer(Player player) ;

}
