package com.tinesoft.quizzer.model.domain;

@SuppressWarnings("deprecation")
public class QuestionUpdate_FieldSerializer {
  private static native java.lang.String getAnswer(com.tinesoft.quizzer.model.domain.QuestionUpdate instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.QuestionUpdate::answer;
  }-*/;
  
  private static native void  setAnswer(com.tinesoft.quizzer.model.domain.QuestionUpdate instance, java.lang.String value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.QuestionUpdate::answer = value;
  }-*/;
  
  private static native com.tinesoft.quizzer.model.domain.Category getCategory(com.tinesoft.quizzer.model.domain.QuestionUpdate instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.QuestionUpdate::category;
  }-*/;
  
  private static native void  setCategory(com.tinesoft.quizzer.model.domain.QuestionUpdate instance, com.tinesoft.quizzer.model.domain.Category value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.QuestionUpdate::category = value;
  }-*/;
  
  private static native int getId(com.tinesoft.quizzer.model.domain.QuestionUpdate instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.QuestionUpdate::id;
  }-*/;
  
  private static native void  setId(com.tinesoft.quizzer.model.domain.QuestionUpdate instance, int value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.QuestionUpdate::id = value;
  }-*/;
  
  private static native com.tinesoft.quizzer.model.domain.Question getOriginalQuestion(com.tinesoft.quizzer.model.domain.QuestionUpdate instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.QuestionUpdate::originalQuestion;
  }-*/;
  
  private static native void  setOriginalQuestion(com.tinesoft.quizzer.model.domain.QuestionUpdate instance, com.tinesoft.quizzer.model.domain.Question value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.QuestionUpdate::originalQuestion = value;
  }-*/;
  
  private static native java.lang.String getText(com.tinesoft.quizzer.model.domain.QuestionUpdate instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.QuestionUpdate::text;
  }-*/;
  
  private static native void  setText(com.tinesoft.quizzer.model.domain.QuestionUpdate instance, java.lang.String value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.QuestionUpdate::text = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.tinesoft.quizzer.model.domain.QuestionUpdate instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setAnswer(instance, streamReader.readString());
    setCategory(instance, (com.tinesoft.quizzer.model.domain.Category) streamReader.readObject());
    setId(instance, streamReader.readInt());
    setOriginalQuestion(instance, (com.tinesoft.quizzer.model.domain.Question) streamReader.readObject());
    setText(instance, streamReader.readString());
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.tinesoft.quizzer.model.domain.QuestionUpdate instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.tinesoft.quizzer.model.domain.QuestionUpdate::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.tinesoft.quizzer.model.domain.QuestionUpdate instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeString(getAnswer(instance));
    streamWriter.writeObject(getCategory(instance));
    streamWriter.writeInt(getId(instance));
    streamWriter.writeObject(getOriginalQuestion(instance));
    streamWriter.writeString(getText(instance));
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
