package com.tinesoft.quizzer.client.service;

import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface LoginServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.LoginService
     */
    void login( java.lang.String login, java.lang.String password, AsyncCallback<java.lang.Boolean> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static LoginServiceAsync instance;

        public static final LoginServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (LoginServiceAsync) GWT.create( LoginService.class );
                ServiceDefTarget target = (ServiceDefTarget) instance;
                target.setServiceEntryPoint( GWT.getModuleBaseURL() + "loginService" );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
