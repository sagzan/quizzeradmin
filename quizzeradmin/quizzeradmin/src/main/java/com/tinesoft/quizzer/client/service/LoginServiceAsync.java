package com.tinesoft.quizzer.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync
{

	void login(String login, String password, AsyncCallback<Boolean> callback);

}
