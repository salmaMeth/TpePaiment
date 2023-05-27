package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class DiscountsDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Long getAmount(ecr.web.app.shared.dto.DiscountsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.DiscountsDTO::amount;
  }-*/;
  
  private static native void setAmount(ecr.web.app.shared.dto.DiscountsDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.DiscountsDTO::amount = value;
  }-*/;
  
  private static native java.lang.Long getId_discount(ecr.web.app.shared.dto.DiscountsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.DiscountsDTO::id_discount;
  }-*/;
  
  private static native void setId_discount(ecr.web.app.shared.dto.DiscountsDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.DiscountsDTO::id_discount = value;
  }-*/;
  
  private static native java.lang.String getLibelle(ecr.web.app.shared.dto.DiscountsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.DiscountsDTO::libelle;
  }-*/;
  
  private static native void setLibelle(ecr.web.app.shared.dto.DiscountsDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.DiscountsDTO::libelle = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.DiscountsDTO instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setAmount(instance, (java.lang.Long) streamReader.readObject());
    setId_discount(instance, (java.lang.Long) streamReader.readObject());
    setLibelle(instance, streamReader.readString());
    
  }
  
  public static ecr.web.app.shared.dto.DiscountsDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.dto.DiscountsDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.DiscountsDTO instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeObject(getAmount(instance));
    streamWriter.writeObject(getId_discount(instance));
    streamWriter.writeString(getLibelle(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.DiscountsDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.DiscountsDTO_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.DiscountsDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.DiscountsDTO_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.DiscountsDTO)object);
  }
  
}
