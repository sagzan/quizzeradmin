package com.tinesoft.quizzer.model.domain;

@SuppressWarnings("deprecation")
public class CategoryUpdate_FieldSerializer {
  private static native int getId(com.tinesoft.quizzer.model.domain.CategoryUpdate instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.CategoryUpdate::id;
  }-*/;
  
  private static native void  setId(com.tinesoft.quizzer.model.domain.CategoryUpdate instance, int value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.CategoryUpdate::id = value;
  }-*/;
  
  private static native com.tinesoft.quizzer.model.domain.Category getOriginalCategory(com.tinesoft.quizzer.model.domain.CategoryUpdate instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.CategoryUpdate::originalCategory;
  }-*/;
  
  private static native void  setOriginalCategory(com.tinesoft.quizzer.model.domain.CategoryUpdate instance, com.tinesoft.quizzer.model.domain.Category value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.CategoryUpdate::originalCategory = value;
  }-*/;
  
  private static native java.lang.String getTitle(com.tinesoft.quizzer.model.domain.CategoryUpdate instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.CategoryUpdate::title;
  }-*/;
  
  private static native void  setTitle(com.tinesoft.quizzer.model.domain.CategoryUpdate instance, java.lang.String value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.CategoryUpdate::title = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.tinesoft.quizzer.model.domain.CategoryUpdate instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setId(instance, streamReader.readInt());
    setOriginalCategory(instance, (com.tinesoft.quizzer.model.domain.Category) streamReader.readObject());
    setTitle(instance, streamReader.readString());
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.tinesoft.quizzer.model.domain.CategoryUpdate instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.tinesoft.quizzer.model.domain.CategoryUpdate::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.tinesoft.quizzer.model.domain.CategoryUpdate instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeInt(getId(instance));
    streamWriter.writeObject(getOriginalCategory(instance));
    streamWriter.writeString(getTitle(instance));
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
