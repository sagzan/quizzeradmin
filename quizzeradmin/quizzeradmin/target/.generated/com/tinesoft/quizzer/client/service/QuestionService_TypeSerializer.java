package com.tinesoft.quizzer.client.service;

import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.impl.Serializer;

public class QuestionService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final MethodMap methodMap = JavaScriptObject.createObject().cast();
  private static final JsArrayString signatureMap = JavaScriptObject.createArray().cast();
  protected MethodMap getMethodMap() { return methodMap; }
  protected JsArrayString getSignatureMap() { return signatureMap; }
  
  static {
    registerMethods();
    registerSignatures();
  }
  private static native java.util.ArrayList create_com_google_gwt_user_client_rpc_core_java_util_ArrayList_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.ArrayList::new()();
  }-*/;
  
  private static native java.util.HashMap create_com_google_gwt_user_client_rpc_core_java_util_HashMap_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.HashMap::new()();
  }-*/;
  
  private static native java.util.HashSet create_com_google_gwt_user_client_rpc_core_java_util_HashSet_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.HashSet::new()();
  }-*/;
  
  private static native java.util.IdentityHashMap create_com_google_gwt_user_client_rpc_core_java_util_IdentityHashMap_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.IdentityHashMap::new()();
  }-*/;
  
  private static native java.util.LinkedList create_com_google_gwt_user_client_rpc_core_java_util_LinkedList_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.LinkedList::new()();
  }-*/;
  
  private static native java.util.Vector create_com_google_gwt_user_client_rpc_core_java_util_Vector_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.Vector::new()();
  }-*/;
  
  private static native void registerSignatures() /*-{
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.google.gwt.i18n.client.impl.DateRecord::class,
      "com.google.gwt.i18n.client.impl.DateRecord/112389920");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class,
      "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.BaseDomain::class,
      "com.tinesoft.quizzer.model.domain.BaseDomain/2440129543");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.BaseDomain[]::class,
      "[Lcom.tinesoft.quizzer.model.domain.BaseDomain;/2205654125");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.Category::class,
      "com.tinesoft.quizzer.model.domain.Category/2674288636");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.CategoryUpdate::class,
      "com.tinesoft.quizzer.model.domain.CategoryUpdate/713193225");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.CategoryUpdate[]::class,
      "[Lcom.tinesoft.quizzer.model.domain.CategoryUpdate;/1967751100");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.CategoryVote::class,
      "com.tinesoft.quizzer.model.domain.CategoryVote/1789531891");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.CategoryVote[]::class,
      "[Lcom.tinesoft.quizzer.model.domain.CategoryVote;/2563146225");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.Category[]::class,
      "[Lcom.tinesoft.quizzer.model.domain.Category;/812120681");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.GameResult::class,
      "com.tinesoft.quizzer.model.domain.GameResult/441641000");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.GameResult[]::class,
      "[Lcom.tinesoft.quizzer.model.domain.GameResult;/4101520151");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.Player::class,
      "com.tinesoft.quizzer.model.domain.Player/2834311387");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.Player[]::class,
      "[Lcom.tinesoft.quizzer.model.domain.Player;/235196386");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.Question::class,
      "com.tinesoft.quizzer.model.domain.Question/3235256773");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.QuestionUpdate::class,
      "com.tinesoft.quizzer.model.domain.QuestionUpdate/3470058749");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.QuestionUpdate[]::class,
      "[Lcom.tinesoft.quizzer.model.domain.QuestionUpdate;/3640969136");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.QuestionVote::class,
      "com.tinesoft.quizzer.model.domain.QuestionVote/3832007720");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @com.tinesoft.quizzer.model.domain.QuestionVote[]::class,
      "[Lcom.tinesoft.quizzer.model.domain.QuestionVote;/2022095734");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.lang.Boolean::class,
      "java.lang.Boolean/476441737");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.lang.Byte::class,
      "java.lang.Byte/1571082439");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.lang.Character::class,
      "java.lang.Character/2663399736");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.lang.Double::class,
      "java.lang.Double/858496421");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.lang.Float::class,
      "java.lang.Float/1718559123");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.lang.Integer::class,
      "java.lang.Integer/3438268394");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.lang.Long::class,
      "java.lang.Long/4227064769");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.lang.Short::class,
      "java.lang.Short/551743396");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.lang.String::class,
      "java.lang.String/2004016611");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.sql.Date::class,
      "java.sql.Date/3996530531");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.sql.Time::class,
      "java.sql.Time/831929183");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.sql.Timestamp::class,
      "java.sql.Timestamp/1769758459");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.util.ArrayList::class,
      "java.util.ArrayList/3821976829");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.util.Arrays$ArrayList::class,
      "java.util.Arrays$ArrayList/1243019747");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.util.Date::class,
      "java.util.Date/1659716317");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.util.HashMap::class,
      "java.util.HashMap/962170901");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.util.HashSet::class,
      "java.util.HashSet/1594477813");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.util.IdentityHashMap::class,
      "java.util.IdentityHashMap/3881143367");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.util.LinkedHashMap::class,
      "java.util.LinkedHashMap/1551059846");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.util.LinkedHashSet::class,
      "java.util.LinkedHashSet/3628722029");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.util.LinkedList::class,
      "java.util.LinkedList/1060625595");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.util.Stack::class,
      "java.util.Stack/1031431137");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.util.TreeMap::class,
      "java.util.TreeMap/1575826026");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.util.TreeSet::class,
      "java.util.TreeSet/1002270346");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @java.util.Vector::class,
      "java.util.Vector/3125574444");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.base.ILightEntity[]::class,
      "[Lnet.sf.gilead.pojo.base.ILightEntity;/3861184979");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.GwtSerializableId::class,
      "net.sf.gilead.pojo.gwt.GwtSerializableId/4079459173");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.GwtSerializableId[]::class,
      "[Lnet.sf.gilead.pojo.gwt.GwtSerializableId;/3533025312");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.IGwtSerializableParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.IGwtSerializableParameter;/2071697777");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.LightEntity[]::class,
      "[Lnet.sf.gilead.pojo.gwt.LightEntity;/3449970074");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.SerializedParameter::class,
      "net.sf.gilead.pojo.gwt.SerializedParameter/132341980");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.SerializedParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.SerializedParameter;/2694220992");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.BooleanParameter::class,
      "net.sf.gilead.pojo.gwt.basic.BooleanParameter/2694046737");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.BooleanParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.basic.BooleanParameter;/659978017");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.ByteParameter::class,
      "net.sf.gilead.pojo.gwt.basic.ByteParameter/2737926916");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.ByteParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.basic.ByteParameter;/2840751033");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.CharacterParameter::class,
      "net.sf.gilead.pojo.gwt.basic.CharacterParameter/3361494208");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.CharacterParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.basic.CharacterParameter;/537814816");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.DateParameter::class,
      "net.sf.gilead.pojo.gwt.basic.DateParameter/3691507541");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.DateParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.basic.DateParameter;/2753979251");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.DoubleParameter::class,
      "net.sf.gilead.pojo.gwt.basic.DoubleParameter/367474200");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.DoubleParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.basic.DoubleParameter;/2828072013");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.FloatParameter::class,
      "net.sf.gilead.pojo.gwt.basic.FloatParameter/2266458363");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.FloatParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.basic.FloatParameter;/1883925208");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.IntegerParameter::class,
      "net.sf.gilead.pojo.gwt.basic.IntegerParameter/3421404974");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.IntegerParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.basic.IntegerParameter;/408650838");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.LongParameter::class,
      "net.sf.gilead.pojo.gwt.basic.LongParameter/1349029528");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.LongParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.basic.LongParameter;/3419125299");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.ShortParameter::class,
      "net.sf.gilead.pojo.gwt.basic.ShortParameter/3591328655");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.ShortParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.basic.ShortParameter;/1337822491");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.StringParameter::class,
      "net.sf.gilead.pojo.gwt.basic.StringParameter/2783524083");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.basic.StringParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.basic.StringParameter;/2215125269");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.collection.ListParameter::class,
      "net.sf.gilead.pojo.gwt.collection.ListParameter/3890945144");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.collection.ListParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.collection.ListParameter;/2269834606");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.collection.MapParameter::class,
      "net.sf.gilead.pojo.gwt.collection.MapParameter/1940144086");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.collection.MapParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.collection.MapParameter;/1810339670");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.collection.SetParameter::class,
      "net.sf.gilead.pojo.gwt.collection.SetParameter/3311896573");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::signatureMap,
      @net.sf.gilead.pojo.gwt.collection.SetParameter[]::class,
      "[Lnet.sf.gilead.pojo.gwt.collection.SetParameter;/3930796824");
    
  }-*/;
  
  private static native void registerMethods() /*-{
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "com.google.gwt.i18n.client.impl.DateRecord/112389920" , [
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/impl/DateRecord;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/client/impl/DateRecord;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533" , [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "com.tinesoft.quizzer.model.domain.BaseDomain/2440129543" , [
        @com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/tinesoft/quizzer/model/domain/BaseDomain;),
        @com.tinesoft.quizzer.model.domain.BaseDomain_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/tinesoft/quizzer/model/domain/BaseDomain;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lcom.tinesoft.quizzer.model.domain.BaseDomain;/2205654125" , [
        @com.tinesoft.quizzer.model.domain.BaseDomain_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.BaseDomain_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/tinesoft/quizzer/model/domain/BaseDomain;),
        @com.tinesoft.quizzer.model.domain.BaseDomain_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/tinesoft/quizzer/model/domain/BaseDomain;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "com.tinesoft.quizzer.model.domain.Category/2674288636" , [
        @com.tinesoft.quizzer.model.domain.Category_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.Category_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/tinesoft/quizzer/model/domain/Category;),
        @com.tinesoft.quizzer.model.domain.Category_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/tinesoft/quizzer/model/domain/Category;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "com.tinesoft.quizzer.model.domain.CategoryUpdate/713193225" , [
        @com.tinesoft.quizzer.model.domain.CategoryUpdate_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.CategoryUpdate_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/tinesoft/quizzer/model/domain/CategoryUpdate;),
        @com.tinesoft.quizzer.model.domain.CategoryUpdate_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/tinesoft/quizzer/model/domain/CategoryUpdate;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lcom.tinesoft.quizzer.model.domain.CategoryUpdate;/1967751100" , [
        @com.tinesoft.quizzer.model.domain.CategoryUpdate_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.CategoryUpdate_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/tinesoft/quizzer/model/domain/CategoryUpdate;),
        @com.tinesoft.quizzer.model.domain.CategoryUpdate_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/tinesoft/quizzer/model/domain/CategoryUpdate;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "com.tinesoft.quizzer.model.domain.CategoryVote/1789531891" , [
        @com.tinesoft.quizzer.model.domain.CategoryVote_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.CategoryVote_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/tinesoft/quizzer/model/domain/CategoryVote;),
        @com.tinesoft.quizzer.model.domain.CategoryVote_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/tinesoft/quizzer/model/domain/CategoryVote;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lcom.tinesoft.quizzer.model.domain.CategoryVote;/2563146225" , [
        @com.tinesoft.quizzer.model.domain.CategoryVote_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.CategoryVote_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/tinesoft/quizzer/model/domain/CategoryVote;),
        @com.tinesoft.quizzer.model.domain.CategoryVote_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/tinesoft/quizzer/model/domain/CategoryVote;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lcom.tinesoft.quizzer.model.domain.Category;/812120681" , [
        @com.tinesoft.quizzer.model.domain.Category_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.Category_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/tinesoft/quizzer/model/domain/Category;),
        @com.tinesoft.quizzer.model.domain.Category_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/tinesoft/quizzer/model/domain/Category;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "com.tinesoft.quizzer.model.domain.GameResult/441641000" , [
        @com.tinesoft.quizzer.model.domain.GameResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.GameResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/tinesoft/quizzer/model/domain/GameResult;),
        @com.tinesoft.quizzer.model.domain.GameResult_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/tinesoft/quizzer/model/domain/GameResult;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lcom.tinesoft.quizzer.model.domain.GameResult;/4101520151" , [
        @com.tinesoft.quizzer.model.domain.GameResult_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.GameResult_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/tinesoft/quizzer/model/domain/GameResult;),
        @com.tinesoft.quizzer.model.domain.GameResult_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/tinesoft/quizzer/model/domain/GameResult;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "com.tinesoft.quizzer.model.domain.Player/2834311387" , [
        @com.tinesoft.quizzer.model.domain.Player_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.Player_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/tinesoft/quizzer/model/domain/Player;),
        @com.tinesoft.quizzer.model.domain.Player_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/tinesoft/quizzer/model/domain/Player;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lcom.tinesoft.quizzer.model.domain.Player;/235196386" , [
        @com.tinesoft.quizzer.model.domain.Player_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.Player_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/tinesoft/quizzer/model/domain/Player;),
        @com.tinesoft.quizzer.model.domain.Player_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/tinesoft/quizzer/model/domain/Player;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "com.tinesoft.quizzer.model.domain.Question/3235256773" , [
        @com.tinesoft.quizzer.model.domain.Question_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.Question_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/tinesoft/quizzer/model/domain/Question;),
        @com.tinesoft.quizzer.model.domain.Question_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/tinesoft/quizzer/model/domain/Question;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "com.tinesoft.quizzer.model.domain.QuestionUpdate/3470058749" , [
        @com.tinesoft.quizzer.model.domain.QuestionUpdate_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.QuestionUpdate_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/tinesoft/quizzer/model/domain/QuestionUpdate;),
        @com.tinesoft.quizzer.model.domain.QuestionUpdate_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/tinesoft/quizzer/model/domain/QuestionUpdate;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lcom.tinesoft.quizzer.model.domain.QuestionUpdate;/3640969136" , [
        @com.tinesoft.quizzer.model.domain.QuestionUpdate_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.QuestionUpdate_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/tinesoft/quizzer/model/domain/QuestionUpdate;),
        @com.tinesoft.quizzer.model.domain.QuestionUpdate_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/tinesoft/quizzer/model/domain/QuestionUpdate;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "com.tinesoft.quizzer.model.domain.QuestionVote/3832007720" , [
        @com.tinesoft.quizzer.model.domain.QuestionVote_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.QuestionVote_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/tinesoft/quizzer/model/domain/QuestionVote;),
        @com.tinesoft.quizzer.model.domain.QuestionVote_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/tinesoft/quizzer/model/domain/QuestionVote;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lcom.tinesoft.quizzer.model.domain.QuestionVote;/2022095734" , [
        @com.tinesoft.quizzer.model.domain.QuestionVote_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.tinesoft.quizzer.model.domain.QuestionVote_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/tinesoft/quizzer/model/domain/QuestionVote;),
        @com.tinesoft.quizzer.model.domain.QuestionVote_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/tinesoft/quizzer/model/domain/QuestionVote;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.lang.Boolean/476441737" , [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.lang.Byte/1571082439" , [
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Byte;),
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Byte;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.lang.Character/2663399736" , [
        @com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Character;),
        @com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Character;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.lang.Double/858496421" , [
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Double;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Double;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.lang.Float/1718559123" , [
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Float;),
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Float;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.lang.Integer/3438268394" , [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Integer;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.lang.Long/4227064769" , [
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Long;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Long;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.lang.Short/551743396" , [
        @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Short;),
        @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Short;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.lang.String/2004016611" , [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.sql.Date/3996530531" , [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Date;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.sql.Time/831929183" , [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Time;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.sql.Timestamp/1769758459" , [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Timestamp;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.util.ArrayList/3821976829" , [
        @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_ArrayList_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.util.Arrays$ArrayList/1243019747" , [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.util.Date/1659716317" , [
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Date;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Date;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.util.HashMap/962170901" , [
        @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_HashMap_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashMap;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.util.HashSet/1594477813" , [
        @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_HashSet_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashSet;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashSet;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.util.IdentityHashMap/3881143367" , [
        @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_IdentityHashMap_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/IdentityHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/IdentityHashMap;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.util.LinkedHashMap/1551059846" , [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashMap;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.util.LinkedHashSet/3628722029" , [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashSet;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashSet;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.util.LinkedList/1060625595" , [
        @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_LinkedList_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedList;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.util.Stack/1031431137" , [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Stack;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.util.TreeMap/1575826026" , [
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.util.TreeSet/1002270346" , [
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeSet;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeSet;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "java.util.Vector/3125574444" , [
        @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_Vector_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Vector;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.base.ILightEntity;/3861184979" , [
        @net.sf.gilead.pojo.base.ILightEntity_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.base.ILightEntity_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/base/ILightEntity;),
        @net.sf.gilead.pojo.base.ILightEntity_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/base/ILightEntity;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.GwtSerializableId/4079459173" , [
        @net.sf.gilead.pojo.gwt.GwtSerializableId_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.GwtSerializableId_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/GwtSerializableId;),
        @net.sf.gilead.pojo.gwt.GwtSerializableId_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/GwtSerializableId;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.GwtSerializableId;/3533025312" , [
        @net.sf.gilead.pojo.gwt.GwtSerializableId_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.GwtSerializableId_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/GwtSerializableId;),
        @net.sf.gilead.pojo.gwt.GwtSerializableId_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/GwtSerializableId;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.IGwtSerializableParameter;/2071697777" , [
        @net.sf.gilead.pojo.gwt.IGwtSerializableParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.IGwtSerializableParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/IGwtSerializableParameter;),
        @net.sf.gilead.pojo.gwt.IGwtSerializableParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/IGwtSerializableParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.LightEntity;/3449970074" , [
        @net.sf.gilead.pojo.gwt.LightEntity_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.LightEntity_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/LightEntity;),
        @net.sf.gilead.pojo.gwt.LightEntity_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/LightEntity;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.SerializedParameter/132341980" , [
        @net.sf.gilead.pojo.gwt.SerializedParameter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.SerializedParameter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/SerializedParameter;),
        @net.sf.gilead.pojo.gwt.SerializedParameter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/SerializedParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.SerializedParameter;/2694220992" , [
        @net.sf.gilead.pojo.gwt.SerializedParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.SerializedParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/SerializedParameter;),
        @net.sf.gilead.pojo.gwt.SerializedParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/SerializedParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.basic.BooleanParameter/2694046737" , [
        @net.sf.gilead.pojo.gwt.basic.BooleanParameter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.BooleanParameter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/basic/BooleanParameter;),
        @net.sf.gilead.pojo.gwt.basic.BooleanParameter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/basic/BooleanParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.basic.BooleanParameter;/659978017" , [
        @net.sf.gilead.pojo.gwt.basic.BooleanParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.BooleanParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/basic/BooleanParameter;),
        @net.sf.gilead.pojo.gwt.basic.BooleanParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/basic/BooleanParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.basic.ByteParameter/2737926916" , [
        @net.sf.gilead.pojo.gwt.basic.ByteParameter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.ByteParameter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/basic/ByteParameter;),
        @net.sf.gilead.pojo.gwt.basic.ByteParameter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/basic/ByteParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.basic.ByteParameter;/2840751033" , [
        @net.sf.gilead.pojo.gwt.basic.ByteParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.ByteParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/basic/ByteParameter;),
        @net.sf.gilead.pojo.gwt.basic.ByteParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/basic/ByteParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.basic.CharacterParameter/3361494208" , [
        @net.sf.gilead.pojo.gwt.basic.CharacterParameter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.CharacterParameter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/basic/CharacterParameter;),
        @net.sf.gilead.pojo.gwt.basic.CharacterParameter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/basic/CharacterParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.basic.CharacterParameter;/537814816" , [
        @net.sf.gilead.pojo.gwt.basic.CharacterParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.CharacterParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/basic/CharacterParameter;),
        @net.sf.gilead.pojo.gwt.basic.CharacterParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/basic/CharacterParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.basic.DateParameter/3691507541" , [
        @net.sf.gilead.pojo.gwt.basic.DateParameter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.DateParameter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/basic/DateParameter;),
        @net.sf.gilead.pojo.gwt.basic.DateParameter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/basic/DateParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.basic.DateParameter;/2753979251" , [
        @net.sf.gilead.pojo.gwt.basic.DateParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.DateParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/basic/DateParameter;),
        @net.sf.gilead.pojo.gwt.basic.DateParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/basic/DateParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.basic.DoubleParameter/367474200" , [
        @net.sf.gilead.pojo.gwt.basic.DoubleParameter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.DoubleParameter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/basic/DoubleParameter;),
        @net.sf.gilead.pojo.gwt.basic.DoubleParameter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/basic/DoubleParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.basic.DoubleParameter;/2828072013" , [
        @net.sf.gilead.pojo.gwt.basic.DoubleParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.DoubleParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/basic/DoubleParameter;),
        @net.sf.gilead.pojo.gwt.basic.DoubleParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/basic/DoubleParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.basic.FloatParameter/2266458363" , [
        @net.sf.gilead.pojo.gwt.basic.FloatParameter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.FloatParameter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/basic/FloatParameter;),
        @net.sf.gilead.pojo.gwt.basic.FloatParameter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/basic/FloatParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.basic.FloatParameter;/1883925208" , [
        @net.sf.gilead.pojo.gwt.basic.FloatParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.FloatParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/basic/FloatParameter;),
        @net.sf.gilead.pojo.gwt.basic.FloatParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/basic/FloatParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.basic.IntegerParameter/3421404974" , [
        @net.sf.gilead.pojo.gwt.basic.IntegerParameter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.IntegerParameter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/basic/IntegerParameter;),
        @net.sf.gilead.pojo.gwt.basic.IntegerParameter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/basic/IntegerParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.basic.IntegerParameter;/408650838" , [
        @net.sf.gilead.pojo.gwt.basic.IntegerParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.IntegerParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/basic/IntegerParameter;),
        @net.sf.gilead.pojo.gwt.basic.IntegerParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/basic/IntegerParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.basic.LongParameter/1349029528" , [
        @net.sf.gilead.pojo.gwt.basic.LongParameter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.LongParameter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/basic/LongParameter;),
        @net.sf.gilead.pojo.gwt.basic.LongParameter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/basic/LongParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.basic.LongParameter;/3419125299" , [
        @net.sf.gilead.pojo.gwt.basic.LongParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.LongParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/basic/LongParameter;),
        @net.sf.gilead.pojo.gwt.basic.LongParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/basic/LongParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.basic.ShortParameter/3591328655" , [
        @net.sf.gilead.pojo.gwt.basic.ShortParameter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.ShortParameter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/basic/ShortParameter;),
        @net.sf.gilead.pojo.gwt.basic.ShortParameter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/basic/ShortParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.basic.ShortParameter;/1337822491" , [
        @net.sf.gilead.pojo.gwt.basic.ShortParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.ShortParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/basic/ShortParameter;),
        @net.sf.gilead.pojo.gwt.basic.ShortParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/basic/ShortParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.basic.StringParameter/2783524083" , [
        @net.sf.gilead.pojo.gwt.basic.StringParameter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.StringParameter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/basic/StringParameter;),
        @net.sf.gilead.pojo.gwt.basic.StringParameter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/basic/StringParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.basic.StringParameter;/2215125269" , [
        @net.sf.gilead.pojo.gwt.basic.StringParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.basic.StringParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/basic/StringParameter;),
        @net.sf.gilead.pojo.gwt.basic.StringParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/basic/StringParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.collection.ListParameter/3890945144" , [
        @net.sf.gilead.pojo.gwt.collection.ListParameter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.collection.ListParameter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/collection/ListParameter;),
        @net.sf.gilead.pojo.gwt.collection.ListParameter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/collection/ListParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.collection.ListParameter;/2269834606" , [
        @net.sf.gilead.pojo.gwt.collection.ListParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.collection.ListParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/collection/ListParameter;),
        @net.sf.gilead.pojo.gwt.collection.ListParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/collection/ListParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.collection.MapParameter/1940144086" , [
        @net.sf.gilead.pojo.gwt.collection.MapParameter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.collection.MapParameter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/collection/MapParameter;),
        @net.sf.gilead.pojo.gwt.collection.MapParameter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/collection/MapParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.collection.MapParameter;/1810339670" , [
        @net.sf.gilead.pojo.gwt.collection.MapParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.collection.MapParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/collection/MapParameter;),
        @net.sf.gilead.pojo.gwt.collection.MapParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/collection/MapParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "net.sf.gilead.pojo.gwt.collection.SetParameter/3311896573" , [
        @net.sf.gilead.pojo.gwt.collection.SetParameter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.collection.SetParameter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/sf/gilead/pojo/gwt/collection/SetParameter;),
        @net.sf.gilead.pojo.gwt.collection.SetParameter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lnet/sf/gilead/pojo/gwt/collection/SetParameter;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.tinesoft.quizzer.client.service.QuestionService_TypeSerializer::methodMap,
      "[Lnet.sf.gilead.pojo.gwt.collection.SetParameter;/3930796824" , [
        @net.sf.gilead.pojo.gwt.collection.SetParameter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.sf.gilead.pojo.gwt.collection.SetParameter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/sf/gilead/pojo/gwt/collection/SetParameter;),
        @net.sf.gilead.pojo.gwt.collection.SetParameter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lnet/sf/gilead/pojo/gwt/collection/SetParameter;)
      ]);
    
  }-*/;
  
  private static void raiseSerializationException(String msg) throws SerializationException {
    throw new SerializationException(msg);
  }
  
}
