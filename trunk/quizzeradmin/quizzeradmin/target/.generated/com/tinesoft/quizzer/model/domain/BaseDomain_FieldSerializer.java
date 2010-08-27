package com.tinesoft.quizzer.model.domain;

@SuppressWarnings("deprecation")
public class BaseDomain_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.tinesoft.quizzer.model.domain.BaseDomain instance) throws com.google.gwt.user.client.rpc.SerializationException{
    
    net.sf.gilead.pojo.gwt.LightEntity_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.tinesoft.quizzer.model.domain.BaseDomain instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.tinesoft.quizzer.model.domain.BaseDomain::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.tinesoft.quizzer.model.domain.BaseDomain instance) throws com.google.gwt.user.client.rpc.SerializationException {
    
    net.sf.gilead.pojo.gwt.LightEntity_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
