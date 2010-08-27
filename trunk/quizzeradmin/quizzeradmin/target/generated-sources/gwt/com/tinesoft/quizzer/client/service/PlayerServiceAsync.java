package com.tinesoft.quizzer.client.service;

import java.util.ArrayList;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.tinesoft.quizzer.model.domain.Player;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface PlayerServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.PlayerService
     */
    void getPlayers( AsyncCallback<java.util.ArrayList<Player>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.PlayerService
     */
    void createPlayer( Player player, java.lang.String birthDate, java.lang.String dateFormat, AsyncCallback<Player> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.PlayerService
     */
    void deletePlayer( Player player, AsyncCallback<java.lang.Boolean> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.PlayerService
     */
    void deletePlayers( java.util.ArrayList<Player> players, AsyncCallback<java.lang.Boolean> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.PlayerService
     */
    void updatePlayer( Player player, AsyncCallback<java.lang.Boolean> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static PlayerServiceAsync instance;

        public static final PlayerServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (PlayerServiceAsync) GWT.create( PlayerService.class );
                ServiceDefTarget target = (ServiceDefTarget) instance;
                target.setServiceEntryPoint( GWT.getModuleBaseURL() + "playerService" );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
