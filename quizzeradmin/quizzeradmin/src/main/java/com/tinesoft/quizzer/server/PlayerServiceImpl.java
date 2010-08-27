package com.tinesoft.quizzer.server;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


import com.tinesoft.quizzer.client.service.PlayerService;
import com.tinesoft.quizzer.model.dao.PlayerDAO;
import com.tinesoft.quizzer.model.dao.hibernate.PlayerDAOHib;
import com.tinesoft.quizzer.model.domain.Player;

public class PlayerServiceImpl extends GileadRemoteServiceServlet implements
		PlayerService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PlayerDAO playerDAO = new PlayerDAOHib();

	@Override
	public ArrayList<Player> getPlayers() {

		try {
			return new ArrayList<Player>(playerDAO.loadAll());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Player createPlayer(Player player, String birthDate,
			String dateFormat) {

		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);

		Date date = null;
		try {
			date = formatter.parse(birthDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		player.setBirthDate(date);

		try {
			playerDAO.save(player);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return player;
	}

	@Override
	public boolean deletePlayer(Player player) {

		try {
			playerDAO.delete(player);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deletePlayers(ArrayList<Player> players) {

		boolean result = true;
		for (Player player : players)
			try {
				playerDAO.delete(player);
			} catch (Exception e) {
				result = false;
				e.printStackTrace();
			}
		return result;
	}

	@Override
	public boolean updatePlayer(Player player) {

		try {
			playerDAO.saveOrUpdate(player);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
