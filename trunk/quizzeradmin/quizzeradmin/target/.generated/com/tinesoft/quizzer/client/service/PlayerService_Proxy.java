package com.tinesoft.quizzer.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;

public class PlayerService_Proxy extends RemoteServiceProxy implements com.tinesoft.quizzer.client.service.PlayerServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.tinesoft.quizzer.client.service.PlayerService";
  private static final String SERIALIZATION_POLICY ="13B06C8A564CE03A254DA63FA4590C54";
  private static final com.tinesoft.quizzer.client.service.PlayerService_TypeSerializer SERIALIZER = new com.tinesoft.quizzer.client.service.PlayerService_TypeSerializer();
  
  public PlayerService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "playerService", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void createPlayer(com.tinesoft.quizzer.model.domain.Player player, java.lang.String birthDate, java.lang.String dateFormat, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("PlayerService_Proxy.createPlayer", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("createPlayer");
      streamWriter.writeInt(3);
      streamWriter.writeString("com.tinesoft.quizzer.model.domain.Player/2834311387");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(player);
      streamWriter.writeString(birthDate);
      streamWriter.writeString(dateFormat);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("PlayerService_Proxy.createPlayer", requestId, "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "PlayerService_Proxy.createPlayer", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void deletePlayer(com.tinesoft.quizzer.model.domain.Player player, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("PlayerService_Proxy.deletePlayer", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deletePlayer");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.tinesoft.quizzer.model.domain.Player/2834311387");
      streamWriter.writeObject(player);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("PlayerService_Proxy.deletePlayer", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "PlayerService_Proxy.deletePlayer", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void deletePlayers(java.util.ArrayList players, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("PlayerService_Proxy.deletePlayers", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deletePlayers");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.ArrayList/3821976829");
      streamWriter.writeObject(players);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("PlayerService_Proxy.deletePlayers", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "PlayerService_Proxy.deletePlayers", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getPlayers(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("PlayerService_Proxy.getPlayers", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getPlayers");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("PlayerService_Proxy.getPlayers", requestId, "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "PlayerService_Proxy.getPlayers", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void updatePlayer(com.tinesoft.quizzer.model.domain.Player player, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("PlayerService_Proxy.updatePlayer", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("updatePlayer");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.tinesoft.quizzer.model.domain.Player/2834311387");
      streamWriter.writeObject(player);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("PlayerService_Proxy.updatePlayer", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "PlayerService_Proxy.updatePlayer", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
