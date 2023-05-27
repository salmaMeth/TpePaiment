package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AdressMailDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Long getId_Mail(ecr.web.app.shared.dto.AdressMailDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.AdressMailDTO::Id_Mail;
  }-*/;
  
  private static native void setId_Mail(ecr.web.app.shared.dto.AdressMailDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.AdressMailDTO::Id_Mail = value;
  }-*/;
  
  private static native java.lang.String getAdressmail(ecr.web.app.shared.dto.AdressMailDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.AdressMailDTO::adressmail;
  }-*/;
  
  private static native void setAdressmail(ecr.web.app.shared.dto.AdressMailDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.AdressMailDTO::adressmail = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.AdressMailDTO instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setId_Mail(instance, (java.lang.Long) streamReader.readObject());
    setAdressmail(instance, streamReader.readString());
    
  }
  
  public static ecr.web.app.shared.dto.AdressMailDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.dto.AdressMailDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.AdressMailDTO instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeObject(getId_Mail(instance));
    streamWriter.writeString(getAdressmail(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.AdressMailDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.AdressMailDTO_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.AdressMailDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.AdressMailDTO_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.AdressMailDTO)object);
  }
  
}
