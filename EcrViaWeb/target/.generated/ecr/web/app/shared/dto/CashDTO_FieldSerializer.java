package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CashDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getAmount(ecr.web.app.shared.dto.CashDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.CashDTO::amount;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setAmount(ecr.web.app.shared.dto.CashDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.CashDTO::amount = value;
  }-*/;
  
  private static native java.util.Date getDate(ecr.web.app.shared.dto.CashDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.CashDTO::date;
  }-*/;
  
  private static native void setDate(ecr.web.app.shared.dto.CashDTO instance, java.util.Date value) 
  /*-{
    instance.@ecr.web.app.shared.dto.CashDTO::date = value;
  }-*/;
  
  private static native java.lang.Long getId_caisse(ecr.web.app.shared.dto.CashDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.CashDTO::id_caisse;
  }-*/;
  
  private static native void setId_caisse(ecr.web.app.shared.dto.CashDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.CashDTO::id_caisse = value;
  }-*/;
  
  private static native java.lang.Long getId_cash(ecr.web.app.shared.dto.CashDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.CashDTO::id_cash;
  }-*/;
  
  private static native void setId_cash(ecr.web.app.shared.dto.CashDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.CashDTO::id_cash = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.CashDTO instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setAmount(instance, streamReader.readLong());
    setDate(instance, (java.util.Date) streamReader.readObject());
    setId_caisse(instance, (java.lang.Long) streamReader.readObject());
    setId_cash(instance, (java.lang.Long) streamReader.readObject());
    
  }
  
  public static ecr.web.app.shared.dto.CashDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.dto.CashDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.CashDTO instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeLong(getAmount(instance));
    streamWriter.writeObject(getDate(instance));
    streamWriter.writeObject(getId_caisse(instance));
    streamWriter.writeObject(getId_cash(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.CashDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.CashDTO_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.CashDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.CashDTO_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.CashDTO)object);
  }
  
}
