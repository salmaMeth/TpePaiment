package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TerminalDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCode(ecr.web.app.shared.dto.TerminalDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TerminalDTO::Code;
  }-*/;
  
  private static native void setCode(ecr.web.app.shared.dto.TerminalDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TerminalDTO::Code = value;
  }-*/;
  
  private static native java.lang.String getAdressip(ecr.web.app.shared.dto.TerminalDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TerminalDTO::adressip;
  }-*/;
  
  private static native void setAdressip(ecr.web.app.shared.dto.TerminalDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TerminalDTO::adressip = value;
  }-*/;
  
  private static native java.lang.String getBrande(ecr.web.app.shared.dto.TerminalDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TerminalDTO::brande;
  }-*/;
  
  private static native void setBrande(ecr.web.app.shared.dto.TerminalDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TerminalDTO::brande = value;
  }-*/;
  
  private static native java.lang.Long getId(ecr.web.app.shared.dto.TerminalDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TerminalDTO::id;
  }-*/;
  
  private static native void setId(ecr.web.app.shared.dto.TerminalDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TerminalDTO::id = value;
  }-*/;
  
  private static native java.lang.String getReference(ecr.web.app.shared.dto.TerminalDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TerminalDTO::reference;
  }-*/;
  
  private static native void setReference(ecr.web.app.shared.dto.TerminalDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TerminalDTO::reference = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.TerminalDTO instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setCode(instance, streamReader.readString());
    setAdressip(instance, streamReader.readString());
    setBrande(instance, streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setReference(instance, streamReader.readString());
    
  }
  
  public static ecr.web.app.shared.dto.TerminalDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.dto.TerminalDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.TerminalDTO instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getCode(instance));
    streamWriter.writeString(getAdressip(instance));
    streamWriter.writeString(getBrande(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getReference(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.TerminalDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.TerminalDTO_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.TerminalDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.TerminalDTO_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.TerminalDTO)object);
  }
  
}
