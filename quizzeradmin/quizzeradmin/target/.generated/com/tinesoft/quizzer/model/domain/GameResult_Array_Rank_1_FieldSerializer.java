package com.tinesoft.quizzer.model.domain;

@SuppressWarnings("deprecation")
public class GameResult_Array_Rank_1_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.tinesoft.quizzer.model.domain.GameResult[] instance) throws com.google.gwt.user.client.rpc.SerializationException{
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.tinesoft.quizzer.model.domain.GameResult[] instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException{
    int rank = streamReader.readInt();
    return new com.tinesoft.quizzer.model.domain.GameResult[rank];
  }
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.tinesoft.quizzer.model.domain.GameResult[] instance) throws com.google.gwt.user.client.rpc.SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
}
