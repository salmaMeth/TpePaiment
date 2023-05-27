package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class OptionDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getEntete(ecr.web.app.shared.dto.OptionDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.OptionDTO::entete;
  }-*/;
  
  private static native void setEntete(ecr.web.app.shared.dto.OptionDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.OptionDTO::entete = value;
  }-*/;
  
  private static native java.lang.Long getId(ecr.web.app.shared.dto.OptionDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.OptionDTO::id;
  }-*/;
  
  private static native void setId(ecr.web.app.shared.dto.OptionDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.OptionDTO::id = value;
  }-*/;
  
  private static native java.lang.String getImage(ecr.web.app.shared.dto.OptionDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.OptionDTO::image;
  }-*/;
  
  private static native void setImage(ecr.web.app.shared.dto.OptionDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.OptionDTO::image = value;
  }-*/;
  
  private static native java.lang.String getMail(ecr.web.app.shared.dto.OptionDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.OptionDTO::mail;
  }-*/;
  
  private static native void setMail(ecr.web.app.shared.dto.OptionDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.OptionDTO::mail = value;
  }-*/;
  
  private static native java.lang.String getName(ecr.web.app.shared.dto.OptionDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.OptionDTO::name;
  }-*/;
  
  private static native void setName(ecr.web.app.shared.dto.OptionDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.OptionDTO::name = value;
  }-*/;
  
  private static native java.lang.String getPasswordmail(ecr.web.app.shared.dto.OptionDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.OptionDTO::passwordmail;
  }-*/;
  
  private static native void setPasswordmail(ecr.web.app.shared.dto.OptionDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.OptionDTO::passwordmail = value;
  }-*/;
  
  private static native java.lang.String getPied(ecr.web.app.shared.dto.OptionDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.OptionDTO::pied;
  }-*/;
  
  private static native void setPied(ecr.web.app.shared.dto.OptionDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.OptionDTO::pied = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.OptionDTO instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setEntete(instance, streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setImage(instance, streamReader.readString());
    setMail(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    setPasswordmail(instance, streamReader.readString());
    setPied(instance, streamReader.readString());
    
  }
  
  public static ecr.web.app.shared.dto.OptionDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.dto.OptionDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.OptionDTO instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getEntete(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getImage(instance));
    streamWriter.writeString(getMail(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getPasswordmail(instance));
    streamWriter.writeString(getPied(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.OptionDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.OptionDTO_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.OptionDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.OptionDTO_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.OptionDTO)object);
  }
  
}
