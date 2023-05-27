package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ShiftDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getAmount(ecr.web.app.shared.dto.ShiftDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ShiftDTO::amount;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setAmount(ecr.web.app.shared.dto.ShiftDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ShiftDTO::amount = value;
  }-*/;
  
  private static native java.util.Date getDate(ecr.web.app.shared.dto.ShiftDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ShiftDTO::date;
  }-*/;
  
  private static native void setDate(ecr.web.app.shared.dto.ShiftDTO instance, java.util.Date value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ShiftDTO::date = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getId_caisse(ecr.web.app.shared.dto.ShiftDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ShiftDTO::id_caisse;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setId_caisse(ecr.web.app.shared.dto.ShiftDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ShiftDTO::id_caisse = value;
  }-*/;
  
  private static native java.lang.Long getId_shift(ecr.web.app.shared.dto.ShiftDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ShiftDTO::id_shift;
  }-*/;
  
  private static native void setId_shift(ecr.web.app.shared.dto.ShiftDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ShiftDTO::id_shift = value;
  }-*/;
  
  private static native java.lang.String getNum_shift(ecr.web.app.shared.dto.ShiftDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ShiftDTO::num_shift;
  }-*/;
  
  private static native void setNum_shift(ecr.web.app.shared.dto.ShiftDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ShiftDTO::num_shift = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.ShiftDTO instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setAmount(instance, streamReader.readLong());
    setDate(instance, (java.util.Date) streamReader.readObject());
    setId_caisse(instance, streamReader.readLong());
    setId_shift(instance, (java.lang.Long) streamReader.readObject());
    setNum_shift(instance, streamReader.readString());
    
  }
  
  public static ecr.web.app.shared.dto.ShiftDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.dto.ShiftDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.ShiftDTO instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeLong(getAmount(instance));
    streamWriter.writeObject(getDate(instance));
    streamWriter.writeLong(getId_caisse(instance));
    streamWriter.writeObject(getId_shift(instance));
    streamWriter.writeString(getNum_shift(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.ShiftDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.ShiftDTO_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.ShiftDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.ShiftDTO_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.ShiftDTO)object);
  }
  
}
