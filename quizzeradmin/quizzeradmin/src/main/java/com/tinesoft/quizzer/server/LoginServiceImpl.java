package com.tinesoft.quizzer.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tinesoft.quizzer.client.service.LoginService;
import com.tinesoft.quizzer.model.dao.PlayerDAO;
import com.tinesoft.quizzer.model.dao.hibernate.PlayerDAOHib;
import com.tinesoft.quizzer.model.domain.Player;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PlayerDAO playerDAO = new PlayerDAOHib();
	@Override
	public boolean login(String login, String password)
	{
		Player player = null;
		try {
			player = playerDAO.get(login, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean result = (player != null) && player.isAdmin();
		
		return result;
	}

}
