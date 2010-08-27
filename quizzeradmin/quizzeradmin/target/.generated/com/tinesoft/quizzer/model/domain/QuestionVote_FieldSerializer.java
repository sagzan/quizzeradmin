package com.tinesoft.quizzer.model.domain;

@SuppressWarnings("deprecation")
public class QuestionVote_FieldSerializer {
  private static native boolean getCon(com.tinesoft.quizzer.model.domain.QuestionVote instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.QuestionVote::con;
  }-*/;
  
  private static native void  setCon(com.tinesoft.quizzer.model.domain.QuestionVote instance, boolean value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.QuestionVote::con = value;
  }-*/;
  
  private static native int getId(com.tinesoft.quizzer.model.domain.QuestionVote instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.QuestionVote::id;
  }-*/;
  
  private static native void  setId(com.tinesoft.quizzer.model.domain.QuestionVote instance, int value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.QuestionVote::id = value;
  }-*/;
  
  private static native com.tinesoft.quizzer.model.domain.Player getPlayer(com.tinesoft.quizzer.model.domain.QuestionVote instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.QuestionVote::player;
  }-*/;
  
  private static native void  setPlayer(com.tinesoft.quizzer.model.domain.QuestionVote instance, com.tinesoft.quizzer.model.domain.Player value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.QuestionVote::player = value;
  }-*/;
  
  private static native com.tinesoft.quizzer.model.domain.Question getQuestion(com.tinesoft.quizzer.model.domain.QuestionVote instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.QuestionVote::question;
  }-*/;
  
  private static native void  setQuestion(com.tinesoft.quizzer.model.domain.QuestionVote instance, com.tinesoft.quizzer.model.domain.Question value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.QuestionVote::question = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.tinesoft.quizzer.model.domain.QuestionVote instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setCon(instance, streamReader.readBoolean());
    setId(instance, streamReader.readInt());
    setPlayer(instance, (com.tinesoft.quizzer.model.domain.Player) streamReader.readObject());
    setQuestion(instance, (com.tinesoft.quizzer.model.domain.Question) streamReader.readObject());
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.tinesoft.quizzer.model.domain.QuestionVote instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.tinesoft.quizzer.model.domain.QuestionVote::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.tinesoft.quizzer.model.domain.QuestionVote instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeBoolean(getCon(instance));
    streamWriter.writeInt(getId(instance));
    streamWriter.writeObject(getPlayer(instance));
    streamWriter.writeObject(getQuestion(instance));
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
