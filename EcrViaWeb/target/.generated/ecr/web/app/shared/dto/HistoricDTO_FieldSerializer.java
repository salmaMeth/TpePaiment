package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class HistoricDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getPrice(ecr.web.app.shared.dto.HistoricDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.HistoricDTO::Price;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setPrice(ecr.web.app.shared.dto.HistoricDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.HistoricDTO::Price = value;
  }-*/;
  
  private static native java.lang.String getCode(ecr.web.app.shared.dto.HistoricDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.HistoricDTO::code;
  }-*/;
  
  private static native void setCode(ecr.web.app.shared.dto.HistoricDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.HistoricDTO::code = value;
  }-*/;
  
  private static native java.lang.String getCode_range(ecr.web.app.shared.dto.HistoricDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.HistoricDTO::code_range;
  }-*/;
  
  private static native void setCode_range(ecr.web.app.shared.dto.HistoricDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.HistoricDTO::code_range = value;
  }-*/;
  
  private static native java.lang.String getDescreption(ecr.web.app.shared.dto.HistoricDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.HistoricDTO::descreption;
  }-*/;
  
  private static native void setDescreption(ecr.web.app.shared.dto.HistoricDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.HistoricDTO::descreption = value;
  }-*/;
  
  private static native java.lang.Long getId(ecr.web.app.shared.dto.HistoricDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.HistoricDTO::id;
  }-*/;
  
  private static native void setId(ecr.web.app.shared.dto.HistoricDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.HistoricDTO::id = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getIdtransaction(ecr.web.app.shared.dto.HistoricDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.HistoricDTO::idtransaction;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setIdtransaction(ecr.web.app.shared.dto.HistoricDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.HistoricDTO::idtransaction = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getLoyality(ecr.web.app.shared.dto.HistoricDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.HistoricDTO::loyality;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setLoyality(ecr.web.app.shared.dto.HistoricDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.HistoricDTO::loyality = value;
  }-*/;
  
  private static native java.lang.String getMarque(ecr.web.app.shared.dto.HistoricDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.HistoricDTO::marque;
  }-*/;
  
  private static native void setMarque(ecr.web.app.shared.dto.HistoricDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.HistoricDTO::marque = value;
  }-*/;
  
  private static native java.lang.String getName(ecr.web.app.shared.dto.HistoricDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.HistoricDTO::name;
  }-*/;
  
  private static native void setName(ecr.web.app.shared.dto.HistoricDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.HistoricDTO::name = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getProductid(ecr.web.app.shared.dto.HistoricDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.HistoricDTO::productid;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setProductid(ecr.web.app.shared.dto.HistoricDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.HistoricDTO::productid = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getQuantity(ecr.web.app.shared.dto.HistoricDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.HistoricDTO::quantity;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setQuantity(ecr.web.app.shared.dto.HistoricDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.HistoricDTO::quantity = value;
  }-*/;
  
  private static native java.lang.String getSale(ecr.web.app.shared.dto.HistoricDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.HistoricDTO::sale;
  }-*/;
  
  private static native void setSale(ecr.web.app.shared.dto.HistoricDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.HistoricDTO::sale = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.HistoricDTO instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setPrice(instance, streamReader.readLong());
    setCode(instance, streamReader.readString());
    setCode_range(instance, streamReader.readString());
    setDescreption(instance, streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setIdtransaction(instance, streamReader.readLong());
    setLoyality(instance, streamReader.readLong());
    setMarque(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    setProductid(instance, streamReader.readLong());
    setQuantity(instance, streamReader.readLong());
    setSale(instance, streamReader.readString());
    
  }
  
  public static ecr.web.app.shared.dto.HistoricDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.dto.HistoricDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.HistoricDTO instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeLong(getPrice(instance));
    streamWriter.writeString(getCode(instance));
    streamWriter.writeString(getCode_range(instance));
    streamWriter.writeString(getDescreption(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeLong(getIdtransaction(instance));
    streamWriter.writeLong(getLoyality(instance));
    streamWriter.writeString(getMarque(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeLong(getProductid(instance));
    streamWriter.writeLong(getQuantity(instance));
    streamWriter.writeString(getSale(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.HistoricDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.HistoricDTO_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.HistoricDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.HistoricDTO_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.HistoricDTO)object);
  }
  
}
