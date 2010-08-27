package com.tinesoft.quizzer.model.domain;

@SuppressWarnings("deprecation")
public class Question_FieldSerializer {
  private static native java.lang.String getAnswer(com.tinesoft.quizzer.model.domain.Question instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Question::answer;
  }-*/;
  
  private static native void  setAnswer(com.tinesoft.quizzer.model.domain.Question instance, java.lang.String value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Question::answer = value;
  }-*/;
  
  private static native com.tinesoft.quizzer.model.domain.Category getCategory(com.tinesoft.quizzer.model.domain.Question instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Question::category;
  }-*/;
  
  private static native void  setCategory(com.tinesoft.quizzer.model.domain.Question instance, com.tinesoft.quizzer.model.domain.Category value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Question::category = value;
  }-*/;
  
  private static native int getId(com.tinesoft.quizzer.model.domain.Question instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Question::id;
  }-*/;
  
  private static native void  setId(com.tinesoft.quizzer.model.domain.Question instance, int value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Question::id = value;
  }-*/;
  
  private static native int getNumberOfCons(com.tinesoft.quizzer.model.domain.Question instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Question::numberOfCons;
  }-*/;
  
  private static native void  setNumberOfCons(com.tinesoft.quizzer.model.domain.Question instance, int value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Question::numberOfCons = value;
  }-*/;
  
  private static native int getNumberOfPros(com.tinesoft.quizzer.model.domain.Question instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Question::numberOfPros;
  }-*/;
  
  private static native void  setNumberOfPros(com.tinesoft.quizzer.model.domain.Question instance, int value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Question::numberOfPros = value;
  }-*/;
  
  private static native java.lang.String getText(com.tinesoft.quizzer.model.domain.Question instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Question::text;
  }-*/;
  
  private static native void  setText(com.tinesoft.quizzer.model.domain.Question instance, java.lang.String value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Question::text = value;
  }-*/;
  
  private static native java.util.Set getVotes(com.tinesoft.quizzer.model.domain.Question instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Question::votes;
  }-*/;
  
  private static native void  setVotes(com.tinesoft.quizzer.model.domain.Question instance, java.util.Set value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Question::votes = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.tinesoft.quizzer.model.domain.Question instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setAnswer(instance, streamReader.readString());
    setCategory(instance, (com.tinesoft.quizzer.model.domain.Category) streamReader.readObject());
    setId(instance, streamReader.readInt());
    setNumberOfCons(instance, streamReader.readInt());
    setNumberOfPros(instance, streamReader.readInt());
    setText(instance, streamReader.readString());
    setVotes(instance, (java.util.Set) streamReader.readObject());
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.tinesoft.quizzer.model.domain.Question instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.tinesoft.quizzer.model.domain.Question::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.tinesoft.quizzer.model.domain.Question instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeString(getAnswer(instance));
    streamWriter.writeObject(getCategory(instance));
    streamWriter.writeInt(getId(instance));
    streamWriter.writeInt(getNumberOfCons(instance));
    streamWriter.writeInt(getNumberOfPros(instance));
    streamWriter.writeString(getText(instance));
    streamWriter.writeObject(getVotes(instance));
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
