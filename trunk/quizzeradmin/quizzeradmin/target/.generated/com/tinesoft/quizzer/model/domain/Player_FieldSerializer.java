package com.tinesoft.quizzer.model.domain;

@SuppressWarnings("deprecation")
public class Player_FieldSerializer {
  private static native boolean getAdmin(com.tinesoft.quizzer.model.domain.Player instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Player::admin;
  }-*/;
  
  private static native void  setAdmin(com.tinesoft.quizzer.model.domain.Player instance, boolean value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Player::admin = value;
  }-*/;
  
  private static native java.util.Date getBirthDate(com.tinesoft.quizzer.model.domain.Player instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Player::birthDate;
  }-*/;
  
  private static native void  setBirthDate(com.tinesoft.quizzer.model.domain.Player instance, java.util.Date value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Player::birthDate = value;
  }-*/;
  
  private static native java.util.Set getCategoryVotes(com.tinesoft.quizzer.model.domain.Player instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Player::categoryVotes;
  }-*/;
  
  private static native void  setCategoryVotes(com.tinesoft.quizzer.model.domain.Player instance, java.util.Set value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Player::categoryVotes = value;
  }-*/;
  
  private static native java.lang.String getEmail(com.tinesoft.quizzer.model.domain.Player instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Player::email;
  }-*/;
  
  private static native void  setEmail(com.tinesoft.quizzer.model.domain.Player instance, java.lang.String value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Player::email = value;
  }-*/;
  
  private static native java.lang.String getFirstName(com.tinesoft.quizzer.model.domain.Player instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Player::firstName;
  }-*/;
  
  private static native void  setFirstName(com.tinesoft.quizzer.model.domain.Player instance, java.lang.String value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Player::firstName = value;
  }-*/;
  
  private static native int getId(com.tinesoft.quizzer.model.domain.Player instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Player::id;
  }-*/;
  
  private static native void  setId(com.tinesoft.quizzer.model.domain.Player instance, int value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Player::id = value;
  }-*/;
  
  private static native java.sql.Timestamp getLastConnectionDate(com.tinesoft.quizzer.model.domain.Player instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Player::lastConnectionDate;
  }-*/;
  
  private static native void  setLastConnectionDate(com.tinesoft.quizzer.model.domain.Player instance, java.sql.Timestamp value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Player::lastConnectionDate = value;
  }-*/;
  
  private static native java.lang.String getLastName(com.tinesoft.quizzer.model.domain.Player instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Player::lastName;
  }-*/;
  
  private static native void  setLastName(com.tinesoft.quizzer.model.domain.Player instance, java.lang.String value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Player::lastName = value;
  }-*/;
  
  private static native java.lang.String getLogin(com.tinesoft.quizzer.model.domain.Player instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Player::login;
  }-*/;
  
  private static native void  setLogin(com.tinesoft.quizzer.model.domain.Player instance, java.lang.String value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Player::login = value;
  }-*/;
  
  private static native java.lang.String getPassword(com.tinesoft.quizzer.model.domain.Player instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Player::password;
  }-*/;
  
  private static native void  setPassword(com.tinesoft.quizzer.model.domain.Player instance, java.lang.String value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Player::password = value;
  }-*/;
  
  private static native java.util.Set getQuestionVotes(com.tinesoft.quizzer.model.domain.Player instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Player::questionVotes;
  }-*/;
  
  private static native void  setQuestionVotes(com.tinesoft.quizzer.model.domain.Player instance, java.util.Set value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Player::questionVotes = value;
  }-*/;
  
  private static native java.util.Date getRegistrationDate(com.tinesoft.quizzer.model.domain.Player instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Player::registrationDate;
  }-*/;
  
  private static native void  setRegistrationDate(com.tinesoft.quizzer.model.domain.Player instance, java.util.Date value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Player::registrationDate = value;
  }-*/;
  
  private static native java.util.Set getResults(com.tinesoft.quizzer.model.domain.Player instance) /*-{
    return instance.@com.tinesoft.quizzer.model.domain.Player::results;
  }-*/;
  
  private static native void  setResults(com.tinesoft.quizzer.model.domain.Player instance, java.util.Set value) /*-{
    instance.@com.tinesoft.quizzer.model.domain.Player::results = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.tinesoft.quizzer.model.domain.Player instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setAdmin(instance, streamReader.readBoolean());
    setBirthDate(instance, (java.util.Date) streamReader.readObject());
    setCategoryVotes(instance, (java.util.Set) streamReader.readObject());
    setEmail(instance, streamReader.readString());
    setFirstName(instance, streamReader.readString());
    setId(instance, streamReader.readInt());
    setLastConnectionDate(instance, (java.sql.Timestamp) streamReader.readObject());
    setLastName(instance, streamReader.readString());
    setLogin(instance, streamReader.readString());
    setPassword(instance, streamReader.readString());
    setQuestionVotes(instance, (java.util.Set) streamReader.readObject());
    setRegistrationDate(instance, (java.util.Date) streamReader.readObject());
    setResults(instance, (java.util.Set) streamReader.readObject());
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.tinesoft.quizzer.model.domain.Player instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.tinesoft.quizzer.model.domain.Player::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.tinesoft.quizzer.model.domain.Player instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeBoolean(getAdmin(instance));
    streamWriter.writeObject(getBirthDate(instance));
    streamWriter.writeObject(getCategoryVotes(instance));
    streamWriter.writeString(getEmail(instance));
    streamWriter.writeString(getFirstName(instance));
    streamWriter.writeInt(getId(instance));
    streamWriter.writeObject(getLastConnectionDate(instance));
    streamWriter.writeString(getLastName(instance));
    streamWriter.writeString(getLogin(instance));
    streamWriter.writeString(getPassword(instance));
    streamWriter.writeObject(getQuestionVotes(instance));
    streamWriter.writeObject(getRegistrationDate(instance));
    streamWriter.writeObject(getResults(instance));
    
    com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
