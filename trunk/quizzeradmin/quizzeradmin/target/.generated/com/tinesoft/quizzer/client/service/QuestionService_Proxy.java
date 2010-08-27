package com.tinesoft.quizzer.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;

public class QuestionService_Proxy extends RemoteServiceProxy implements com.tinesoft.quizzer.client.service.QuestionServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.tinesoft.quizzer.client.service.QuestionService";
  private static final String SERIALIZATION_POLICY ="CDEA1436E1849D1B5009C59331D6CAD4";
  private static final com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer SERIALIZER = new com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer();
  
  public QuestionService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "questionService", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void createQuestion(com.tinesoft.quizzer.model.domain.Question question, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.createQuestion", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("createQuestion");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.tinesoft.quizzer.model.domain.Question/3235256773");
      streamWriter.writeObject(question);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.createQuestion", requestId, "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "QuestionService_Proxy.createQuestion", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void deleteCategories(java.util.ArrayList categories, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.deleteCategories", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deleteCategories");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.ArrayList/3821976829");
      streamWriter.writeObject(categories);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.deleteCategories", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "QuestionService_Proxy.deleteCategories", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void deleteQuestion(com.tinesoft.quizzer.model.domain.Question question, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.deleteQuestion", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deleteQuestion");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.tinesoft.quizzer.model.domain.Question/3235256773");
      streamWriter.writeObject(question);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.deleteQuestion", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "QuestionService_Proxy.deleteQuestion", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void deleteQuestionUpdate(com.tinesoft.quizzer.model.domain.QuestionUpdate update, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.deleteQuestionUpdate", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deleteQuestionUpdate");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.tinesoft.quizzer.model.domain.QuestionUpdate/3470058749");
      streamWriter.writeObject(update);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.deleteQuestionUpdate", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "QuestionService_Proxy.deleteQuestionUpdate", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void deleteQuestionUpdates(java.util.ArrayList updates, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.deleteQuestionUpdates", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deleteQuestionUpdates");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.ArrayList/3821976829");
      streamWriter.writeObject(updates);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.deleteQuestionUpdates", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "QuestionService_Proxy.deleteQuestionUpdates", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getCategories(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.getCategories", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getCategories");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.getCategories", requestId, "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "QuestionService_Proxy.getCategories", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getQuestionUpdates(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.getQuestionUpdates", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getQuestionUpdates");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.getQuestionUpdates", requestId, "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "QuestionService_Proxy.getQuestionUpdates", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void updateQuestion(com.tinesoft.quizzer.model.domain.Question catgeory, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.updateQuestion", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("updateQuestion");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.tinesoft.quizzer.model.domain.Question/3235256773");
      streamWriter.writeObject(catgeory);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.updateQuestion", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "QuestionService_Proxy.updateQuestion", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void validateQuestionUpdate(com.tinesoft.quizzer.model.domain.QuestionUpdate update, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.validateQuestionUpdate", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("validateQuestionUpdate");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.tinesoft.quizzer.model.domain.QuestionUpdate/3470058749");
      streamWriter.writeObject(update);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.validateQuestionUpdate", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "QuestionService_Proxy.validateQuestionUpdate", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void validateQuestionUpdates(java.util.ArrayList updates, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.validateQuestionUpdates", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("validateQuestionUpdates");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.ArrayList/3821976829");
      streamWriter.writeObject(updates);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("QuestionService_Proxy.validateQuestionUpdates", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "QuestionService_Proxy.validateQuestionUpdates", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
