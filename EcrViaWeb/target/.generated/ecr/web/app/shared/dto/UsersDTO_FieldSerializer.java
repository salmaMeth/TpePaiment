package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UsersDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getInterest(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::Interest;
  }-*/;
  
  private static native void setInterest(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::Interest = value;
  }-*/;
  
  private static native java.lang.String getAdresse(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::adresse;
  }-*/;
  
  private static native void setAdresse(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::adresse = value;
  }-*/;
  
  private static native java.lang.String getCodepos(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::codepos;
  }-*/;
  
  private static native void setCodepos(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::codepos = value;
  }-*/;
  
  private static native java.util.Date getDatenais(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::datenais;
  }-*/;
  
  private static native void setDatenais(ecr.web.app.shared.dto.UsersDTO instance, java.util.Date value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::datenais = value;
  }-*/;
  
  private static native java.lang.Long getId(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::id;
  }-*/;
  
  private static native void setId(ecr.web.app.shared.dto.UsersDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::id = value;
  }-*/;
  
  private static native java.lang.Long getIdcash(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::idcash;
  }-*/;
  
  private static native void setIdcash(ecr.web.app.shared.dto.UsersDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::idcash = value;
  }-*/;
  
  private static native java.lang.String getImage(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::image;
  }-*/;
  
  private static native void setImage(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::image = value;
  }-*/;
  
  private static native java.lang.String getIpadess(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::ipadess;
  }-*/;
  
  private static native void setIpadess(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::ipadess = value;
  }-*/;
  
  private static native java.lang.String getIpadess1(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::ipadess1;
  }-*/;
  
  private static native void setIpadess1(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::ipadess1 = value;
  }-*/;
  
  private static native java.lang.String getIpadess2(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::ipadess2;
  }-*/;
  
  private static native void setIpadess2(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::ipadess2 = value;
  }-*/;
  
  private static native java.lang.String getIpadess3(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::ipadess3;
  }-*/;
  
  private static native void setIpadess3(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::ipadess3 = value;
  }-*/;
  
  private static native java.lang.String getLogin(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::login;
  }-*/;
  
  private static native void setLogin(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::login = value;
  }-*/;
  
  private static native java.lang.String getMail(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::mail;
  }-*/;
  
  private static native void setMail(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::mail = value;
  }-*/;
  
  private static native java.lang.String getName(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::name;
  }-*/;
  
  private static native void setName(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::name = value;
  }-*/;
  
  private static native java.lang.String getName2(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::name2;
  }-*/;
  
  private static native void setName2(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::name2 = value;
  }-*/;
  
  private static native java.lang.String getPassword(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::password;
  }-*/;
  
  private static native void setPassword(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::password = value;
  }-*/;
  
  private static native java.lang.String getRole(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::role;
  }-*/;
  
  private static native void setRole(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::role = value;
  }-*/;
  
  private static native java.lang.String getTel1(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::tel1;
  }-*/;
  
  private static native void setTel1(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::tel1 = value;
  }-*/;
  
  private static native java.lang.String getTel2(ecr.web.app.shared.dto.UsersDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.UsersDTO::tel2;
  }-*/;
  
  private static native void setTel2(ecr.web.app.shared.dto.UsersDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.UsersDTO::tel2 = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.UsersDTO instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setInterest(instance, streamReader.readString());
    setAdresse(instance, streamReader.readString());
    setCodepos(instance, streamReader.readString());
    setDatenais(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setIdcash(instance, (java.lang.Long) streamReader.readObject());
    setImage(instance, streamReader.readString());
    setIpadess(instance, streamReader.readString());
    setIpadess1(instance, streamReader.readString());
    setIpadess2(instance, streamReader.readString());
    setIpadess3(instance, streamReader.readString());
    setLogin(instance, streamReader.readString());
    setMail(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    setName2(instance, streamReader.readString());
    setPassword(instance, streamReader.readString());
    setRole(instance, streamReader.readString());
    setTel1(instance, streamReader.readString());
    setTel2(instance, streamReader.readString());
    
  }
  
  public static ecr.web.app.shared.dto.UsersDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.dto.UsersDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.UsersDTO instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getInterest(instance));
    streamWriter.writeString(getAdresse(instance));
    streamWriter.writeString(getCodepos(instance));
    streamWriter.writeObject(getDatenais(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getIdcash(instance));
    streamWriter.writeString(getImage(instance));
    streamWriter.writeString(getIpadess(instance));
    streamWriter.writeString(getIpadess1(instance));
    streamWriter.writeString(getIpadess2(instance));
    streamWriter.writeString(getIpadess3(instance));
    streamWriter.writeString(getLogin(instance));
    streamWriter.writeString(getMail(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getName2(instance));
    streamWriter.writeString(getPassword(instance));
    streamWriter.writeString(getRole(instance));
    streamWriter.writeString(getTel1(instance));
    streamWriter.writeString(getTel2(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.UsersDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.UsersDTO_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.UsersDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.UsersDTO_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.UsersDTO)object);
  }
  
}
