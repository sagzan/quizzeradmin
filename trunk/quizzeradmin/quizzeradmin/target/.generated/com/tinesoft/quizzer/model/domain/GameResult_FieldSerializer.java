package com.tinesoft.quizzer.model.domain;

@SuppressWarnings("deprecation")
public class GameResult_FieldSerializer {
  private static native com.tinesoft.quizzer.model.domain.Category getCategory(com.tinesoft.quizzer.model.domain.GameResult instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.GameResult::category;
  }-*/;
  
  private static native void  setCategory(com.tinesoft.quizzer.model.domain.GameResult instance, com.tinesoft.quizzer.model.domain.Category value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.GameResult::category = value;
  }-*/;
  
  private static native int getId(com.tinesoft.quizzer.model.domain.GameResult instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.GameResult::id;
  }-*/;
  
  private static native void  setId(com.tinesoft.quizzer.model.domain.GameResult instance, int value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.GameResult::id = value;
  }-*/;
  
  private static native java.sql.Timestamp getPlayedDate(com.tinesoft.quizzer.model.domain.GameResult instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.GameResult::playedDate;
  }-*/;
  
  private static native void  setPlayedDate(com.tinesoft.quizzer.model.domain.GameResult instance, java.sql.Timestamp value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.GameResult::playedDate = value;
  }-*/;
  
  private static native com.tinesoft.quizzer.model.domain.Player getPlayer(com.tinesoft.quizzer.model.domain.GameResult instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.GameResult::player;
  }-*/;
  
  private static native void  setPlayer(com.tinesoft.quizzer.model.domain.GameResult instance, com.tinesoft.quizzer.model.domain.Player value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.GameResult::player = value;
  }-*/;
  
  private static native int getScore(com.tinesoft.quizzer.model.domain.GameResult instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.GameResult::score;
  }-*/;
  
  private static native void  setScore(com.tinesoft.quizzer.model.domain.GameResult instance, int value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.GameResult::score = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.tinesoft.quizzer.model.domain.GameResult instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setCategory(instance, (com.tinesoft.quizzer.model.domain.Category) streamReader.readObject());
    setId(instance, streamReader.readInt());
    setPlayedDate(instance, (java.sql.Timestamp) streamReader.readObject());
    setPlayer(instance, (com.tinesoft.quizzer.model.domain.Player) streamReader.readObject());
    setScore(instance, streamReader.readInt());
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.tinesoft.quizzer.model.domain.GameResult instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.tinesoft.quizzer.model.domain.GameResult::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.tinesoft.quizzer.model.domain.GameResult instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getCategory(instance));
    streamWriter.writeInt(getId(instance));
    streamWriter.writeObject(getPlayedDate(instance));
    streamWriter.writeObject(getPlayer(instance));
    streamWriter.writeInt(getScore(instance));
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
