package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TVADTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Long getAmount(ecr.web.app.shared.dto.TVADTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TVADTO::amount;
  }-*/;
  
  private static native void setAmount(ecr.web.app.shared.dto.TVADTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TVADTO::amount = value;
  }-*/;
  
  private static native java.lang.Long getId_tva(ecr.web.app.shared.dto.TVADTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TVADTO::id_tva;
  }-*/;
  
  private static native void setId_tva(ecr.web.app.shared.dto.TVADTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TVADTO::id_tva = value;
  }-*/;
  
  private static native java.lang.String getLibelle(ecr.web.app.shared.dto.TVADTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TVADTO::libelle;
  }-*/;
  
  private static native void setLibelle(ecr.web.app.shared.dto.TVADTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TVADTO::libelle = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.TVADTO instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setAmount(instance, (java.lang.Long) streamReader.readObject());
    setId_tva(instance, (java.lang.Long) streamReader.readObject());
    setLibelle(instance, streamReader.readString());
    
  }
  
  public static ecr.web.app.shared.dto.TVADTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.dto.TVADTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.TVADTO instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeObject(getAmount(instance));
    streamWriter.writeObject(getId_tva(instance));
    streamWriter.writeString(getLibelle(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.TVADTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.TVADTO_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.TVADTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.TVADTO_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.TVADTO)object);
  }
  
}
