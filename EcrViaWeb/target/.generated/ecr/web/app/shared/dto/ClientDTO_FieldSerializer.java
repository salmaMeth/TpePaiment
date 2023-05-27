package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ClientDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getProfession(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::Profession;
  }-*/;
  
  private static native void setProfession(ecr.web.app.shared.dto.ClientDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::Profession = value;
  }-*/;
  
  private static native java.lang.String getSexe(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::Sexe;
  }-*/;
  
  private static native void setSexe(ecr.web.app.shared.dto.ClientDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::Sexe = value;
  }-*/;
  
  private static native java.lang.String getSituationFa(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::SituationFa;
  }-*/;
  
  private static native void setSituationFa(ecr.web.app.shared.dto.ClientDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::SituationFa = value;
  }-*/;
  
  private static native java.lang.String getAdresse(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::adresse;
  }-*/;
  
  private static native void setAdresse(ecr.web.app.shared.dto.ClientDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::adresse = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getCardid(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::cardid;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setCardid(ecr.web.app.shared.dto.ClientDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::cardid = value;
  }-*/;
  
  private static native java.lang.String getCity(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::city;
  }-*/;
  
  private static native void setCity(ecr.web.app.shared.dto.ClientDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::city = value;
  }-*/;
  
  private static native java.lang.String getCodepos(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::codepos;
  }-*/;
  
  private static native void setCodepos(ecr.web.app.shared.dto.ClientDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::codepos = value;
  }-*/;
  
  private static native java.lang.String getContinent(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::continent;
  }-*/;
  
  private static native void setContinent(ecr.web.app.shared.dto.ClientDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::continent = value;
  }-*/;
  
  private static native java.util.Date getDatenais(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::datenais;
  }-*/;
  
  private static native void setDatenais(ecr.web.app.shared.dto.ClientDTO instance, java.util.Date value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::datenais = value;
  }-*/;
  
  private static native java.lang.Long getId(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::id;
  }-*/;
  
  private static native void setId(ecr.web.app.shared.dto.ClientDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::id = value;
  }-*/;
  
  private static native java.lang.String getImage(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::image;
  }-*/;
  
  private static native void setImage(ecr.web.app.shared.dto.ClientDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::image = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getLoyality(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::loyality;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setLoyality(ecr.web.app.shared.dto.ClientDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::loyality = value;
  }-*/;
  
  private static native java.lang.String getName(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::name;
  }-*/;
  
  private static native void setName(ecr.web.app.shared.dto.ClientDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::name = value;
  }-*/;
  
  private static native java.lang.String getName2(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::name2;
  }-*/;
  
  private static native void setName2(ecr.web.app.shared.dto.ClientDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::name2 = value;
  }-*/;
  
  private static native java.lang.String getTel1(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::tel1;
  }-*/;
  
  private static native void setTel1(ecr.web.app.shared.dto.ClientDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::tel1 = value;
  }-*/;
  
  private static native java.lang.String getTel2(ecr.web.app.shared.dto.ClientDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ClientDTO::tel2;
  }-*/;
  
  private static native void setTel2(ecr.web.app.shared.dto.ClientDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ClientDTO::tel2 = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.ClientDTO instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setProfession(instance, streamReader.readString());
    setSexe(instance, streamReader.readString());
    setSituationFa(instance, streamReader.readString());
    setAdresse(instance, streamReader.readString());
    setCardid(instance, streamReader.readLong());
    setCity(instance, streamReader.readString());
    setCodepos(instance, streamReader.readString());
    setContinent(instance, streamReader.readString());
    setDatenais(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setImage(instance, streamReader.readString());
    setLoyality(instance, streamReader.readLong());
    setName(instance, streamReader.readString());
    setName2(instance, streamReader.readString());
    setTel1(instance, streamReader.readString());
    setTel2(instance, streamReader.readString());
    
  }
  
  public static ecr.web.app.shared.dto.ClientDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.dto.ClientDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.ClientDTO instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getProfession(instance));
    streamWriter.writeString(getSexe(instance));
    streamWriter.writeString(getSituationFa(instance));
    streamWriter.writeString(getAdresse(instance));
    streamWriter.writeLong(getCardid(instance));
    streamWriter.writeString(getCity(instance));
    streamWriter.writeString(getCodepos(instance));
    streamWriter.writeString(getContinent(instance));
    streamWriter.writeObject(getDatenais(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getImage(instance));
    streamWriter.writeLong(getLoyality(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getName2(instance));
    streamWriter.writeString(getTel1(instance));
    streamWriter.writeString(getTel2(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.ClientDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.ClientDTO_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.ClientDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.ClientDTO_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.ClientDTO)object);
  }
  
}
