package com.tinesoft.quizzer.model.domain;

@SuppressWarnings("deprecation")
public class CategoryVote_FieldSerializer {
  private static native com.tinesoft.quizzer.model.domain.Category getCategory(com.tinesoft.quizzer.model.domain.CategoryVote instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.CategoryVote::category;
  }-*/;
  
  private static native void  setCategory(com.tinesoft.quizzer.model.domain.CategoryVote instance, com.tinesoft.quizzer.model.domain.Category value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.CategoryVote::category = value;
  }-*/;
  
  private static native boolean getCon(com.tinesoft.quizzer.model.domain.CategoryVote instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.CategoryVote::con;
  }-*/;
  
  private static native void  setCon(com.tinesoft.quizzer.model.domain.CategoryVote instance, boolean value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.CategoryVote::con = value;
  }-*/;
  
  private static native int getId(com.tinesoft.quizzer.model.domain.CategoryVote instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.CategoryVote::id;
  }-*/;
  
  private static native void  setId(com.tinesoft.quizzer.model.domain.CategoryVote instance, int value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.CategoryVote::id = value;
  }-*/;
  
  private static native com.tinesoft.quizzer.model.domain.Player getPlayer(com.tinesoft.quizzer.model.domain.CategoryVote instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.CategoryVote::player;
  }-*/;
  
  private static native void  setPlayer(com.tinesoft.quizzer.model.domain.CategoryVote instance, com.tinesoft.quizzer.model.domain.Player value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.CategoryVote::player = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.tinesoft.quizzer.model.domain.CategoryVote instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setCategory(instance, (com.tinesoft.quizzer.model.domain.Category) streamReader.readObject());
    setCon(instance, streamReader.readBoolean());
    setId(instance, streamReader.readInt());
    setPlayer(instance, (com.tinesoft.quizzer.model.domain.Player) streamReader.readObject());
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.tinesoft.quizzer.model.domain.CategoryVote instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.tinesoft.quizzer.model.domain.CategoryVote::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.tinesoft.quizzer.model.domain.CategoryVote instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getCategory(instance));
    streamWriter.writeBoolean(getCon(instance));
    streamWriter.writeInt(getId(instance));
    streamWriter.writeObject(getPlayer(instance));
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
