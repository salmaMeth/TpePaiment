package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ProviderDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getAdresse(ecr.web.app.shared.dto.ProviderDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProviderDTO::adresse;
  }-*/;
  
  private static native void setAdresse(ecr.web.app.shared.dto.ProviderDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProviderDTO::adresse = value;
  }-*/;
  
  private static native java.lang.String getCodepos(ecr.web.app.shared.dto.ProviderDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProviderDTO::codepos;
  }-*/;
  
  private static native void setCodepos(ecr.web.app.shared.dto.ProviderDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProviderDTO::codepos = value;
  }-*/;
  
  private static native java.lang.Long getId(ecr.web.app.shared.dto.ProviderDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProviderDTO::id;
  }-*/;
  
  private static native void setId(ecr.web.app.shared.dto.ProviderDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProviderDTO::id = value;
  }-*/;
  
  private static native java.lang.String getMail(ecr.web.app.shared.dto.ProviderDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProviderDTO::mail;
  }-*/;
  
  private static native void setMail(ecr.web.app.shared.dto.ProviderDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProviderDTO::mail = value;
  }-*/;
  
  private static native java.lang.String getName(ecr.web.app.shared.dto.ProviderDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProviderDTO::name;
  }-*/;
  
  private static native void setName(ecr.web.app.shared.dto.ProviderDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProviderDTO::name = value;
  }-*/;
  
  private static native java.lang.String getName2(ecr.web.app.shared.dto.ProviderDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProviderDTO::name2;
  }-*/;
  
  private static native void setName2(ecr.web.app.shared.dto.ProviderDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProviderDTO::name2 = value;
  }-*/;
  
  private static native java.lang.String getProperty(ecr.web.app.shared.dto.ProviderDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProviderDTO::property;
  }-*/;
  
  private static native void setProperty(ecr.web.app.shared.dto.ProviderDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProviderDTO::property = value;
  }-*/;
  
  private static native java.lang.String getTel1(ecr.web.app.shared.dto.ProviderDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProviderDTO::tel1;
  }-*/;
  
  private static native void setTel1(ecr.web.app.shared.dto.ProviderDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProviderDTO::tel1 = value;
  }-*/;
  
  private static native java.lang.String getTel2(ecr.web.app.shared.dto.ProviderDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProviderDTO::tel2;
  }-*/;
  
  private static native void setTel2(ecr.web.app.shared.dto.ProviderDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProviderDTO::tel2 = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.ProviderDTO instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setAdresse(instance, streamReader.readString());
    setCodepos(instance, streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setMail(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    setName2(instance, streamReader.readString());
    setProperty(instance, streamReader.readString());
    setTel1(instance, streamReader.readString());
    setTel2(instance, streamReader.readString());
    
  }
  
  public static ecr.web.app.shared.dto.ProviderDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.dto.ProviderDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.ProviderDTO instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getAdresse(instance));
    streamWriter.writeString(getCodepos(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getMail(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getName2(instance));
    streamWriter.writeString(getProperty(instance));
    streamWriter.writeString(getTel1(instance));
    streamWriter.writeString(getTel2(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.ProviderDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.ProviderDTO_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.ProviderDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.ProviderDTO_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.ProviderDTO)object);
  }
  
}
