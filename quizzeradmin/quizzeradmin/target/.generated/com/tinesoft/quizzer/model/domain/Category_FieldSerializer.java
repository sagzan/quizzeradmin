package com.tinesoft.quizzer.model.domain;

@SuppressWarnings("deprecation")
public class Category_FieldSerializer {
  private static native int getId(com.tinesoft.quizzer.model.domain.Category instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Category::id;
  }-*/;
  
  private static native void  setId(com.tinesoft.quizzer.model.domain.Category instance, int value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Category::id = value;
  }-*/;
  
  private static native int getNumberOfCons(com.tinesoft.quizzer.model.domain.Category instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Category::numberOfCons;
  }-*/;
  
  private static native void  setNumberOfCons(com.tinesoft.quizzer.model.domain.Category instance, int value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Category::numberOfCons = value;
  }-*/;
  
  private static native int getNumberOfPros(com.tinesoft.quizzer.model.domain.Category instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Category::numberOfPros;
  }-*/;
  
  private static native void  setNumberOfPros(com.tinesoft.quizzer.model.domain.Category instance, int value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Category::numberOfPros = value;
  }-*/;
  
  private static native java.util.Set getQuestions(com.tinesoft.quizzer.model.domain.Category instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Category::questions;
  }-*/;
  
  private static native void  setQuestions(com.tinesoft.quizzer.model.domain.Category instance, java.util.Set value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Category::questions = value;
  }-*/;
  
  private static native java.lang.String getTitle(com.tinesoft.quizzer.model.domain.Category instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Category::title;
  }-*/;
  
  private static native void  setTitle(com.tinesoft.quizzer.model.domain.Category instance, java.lang.String value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Category::title = value;
  }-*/;
  
  private static native java.util.Set getVotes(com.tinesoft.quizzer.model.domain.Category instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Category::votes;
  }-*/;
  
  private static native void  setVotes(com.tinesoft.quizzer.model.domain.Category instance, java.util.Set value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Category::votes = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.tinesoft.quizzer.model.domain.Category instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setId(instance, streamReader.readInt());
    setNumberOfCons(instance, streamReader.readInt());
    setNumberOfPros(instance, streamReader.readInt());
    setQuestions(instance, (java.util.Set) streamReader.readObject());
    setTitle(instance, streamReader.readString());
    setVotes(instance, (java.util.Set) streamReader.readObject());
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.tinesoft.quizzer.model.domain.Category instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.tinesoft.quizzer.model.domain.Category::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.tinesoft.quizzer.model.domain.Category instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeInt(getId(instance));
    streamWriter.writeInt(getNumberOfCons(instance));
    streamWriter.writeInt(getNumberOfPros(instance));
    streamWriter.writeObject(getQuestions(instance));
    streamWriter.writeString(getTitle(instance));
    streamWriter.writeObject(getVotes(instance));
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
