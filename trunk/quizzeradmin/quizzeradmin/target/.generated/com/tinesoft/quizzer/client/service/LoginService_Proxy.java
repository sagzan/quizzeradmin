package com.tinesoft.quizzer.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;

public class LoginService_Proxy extends RemoteServiceProxy implements com.tinesoft.quizzer.client.service.LoginServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.tinesoft.quizzer.client.service.LoginService";
  private static final String SERIALIZATION_POLICY ="10188D4FA94EE0B12588EDA2C03E72B7";
  private static final com.tinesoft.quizzer.client.service.LoginService_TypeSerializer SERIALIZER = new com.tinesoft.quizzer.client.service.LoginService_TypeSerializer();
  
  public LoginService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "loginService", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void login(java.lang.String login, java.lang.String password, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("LoginService_Proxy.login", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("login");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(login);
      streamWriter.writeString(password);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("LoginService_Proxy.login", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "LoginService_Proxy.login", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
