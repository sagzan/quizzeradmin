package com.tinesoft.quizzer.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;

public class CategoryService_Proxy extends RemoteServiceProxy implements com.tinesoft.quizzer.client.service.CategoryServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.tinesoft.quizzer.client.service.CategoryService";
  private static final String SERIALIZATION_POLICY ="6D47F49D29F6396B8B049147AC3953AF";
  private static final com.tinesoft.quizzer.client.service.CategoryService_TypeSerializer SERIALIZER = new com.tinesoft.quizzer.client.service.CategoryService_TypeSerializer();
  
  public CategoryService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "categoryService", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void createCategory(com.tinesoft.quizzer.model.domain.Category category, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.createCategory", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("createCategory");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.tinesoft.quizzer.model.domain.Category/2674288636");
      streamWriter.writeObject(category);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.createCategory", requestId, "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CategoryService_Proxy.createCategory", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void deleteCategories(java.util.ArrayList categories, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.deleteCategories", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deleteCategories");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.ArrayList/3821976829");
      streamWriter.writeObject(categories);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.deleteCategories", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "CategoryService_Proxy.deleteCategories", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void deleteCategory(com.tinesoft.quizzer.model.domain.Category category, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.deleteCategory", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deleteCategory");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.tinesoft.quizzer.model.domain.Category/2674288636");
      streamWriter.writeObject(category);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.deleteCategory", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "CategoryService_Proxy.deleteCategory", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void deleteCategoryUpdate(com.tinesoft.quizzer.model.domain.CategoryUpdate update, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.deleteCategoryUpdate", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deleteCategoryUpdate");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.tinesoft.quizzer.model.domain.CategoryUpdate/713193225");
      streamWriter.writeObject(update);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.deleteCategoryUpdate", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "CategoryService_Proxy.deleteCategoryUpdate", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void deleteCategoryUpdates(java.util.ArrayList updates, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.deleteCategoryUpdates", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deleteCategoryUpdates");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.ArrayList/3821976829");
      streamWriter.writeObject(updates);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.deleteCategoryUpdates", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "CategoryService_Proxy.deleteCategoryUpdates", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getCategories(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.getCategories", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getCategories");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.getCategories", requestId, "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CategoryService_Proxy.getCategories", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getCategoryUpdates(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.getCategoryUpdates", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getCategoryUpdates");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.getCategoryUpdates", requestId, "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CategoryService_Proxy.getCategoryUpdates", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void updateCategory(com.tinesoft.quizzer.model.domain.Category category, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.updateCategory", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("updateCategory");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.tinesoft.quizzer.model.domain.Category/2674288636");
      streamWriter.writeObject(category);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.updateCategory", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "CategoryService_Proxy.updateCategory", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void validateCategoryUpdate(com.tinesoft.quizzer.model.domain.CategoryUpdate update, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.validateCategoryUpdate", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("validateCategoryUpdate");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.tinesoft.quizzer.model.domain.CategoryUpdate/713193225");
      streamWriter.writeObject(update);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.validateCategoryUpdate", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "CategoryService_Proxy.validateCategoryUpdate", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void validateCategoryUpdates(java.util.ArrayList updates, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.validateCategoryUpdates", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("validateCategoryUpdates");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.ArrayList/3821976829");
      streamWriter.writeObject(updates);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("CategoryService_Proxy.validateCategoryUpdates", requestId, "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "CategoryService_Proxy.validateCategoryUpdates", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
