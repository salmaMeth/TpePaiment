package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ProductsDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getID_provider(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::ID_provider;
  }-*/;
  
  private static native void setID_provider(ecr.web.app.shared.dto.ProductsDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::ID_provider = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getPrice(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::Price;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setPrice(ecr.web.app.shared.dto.ProductsDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::Price = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getBarcode(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::barcode;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setBarcode(ecr.web.app.shared.dto.ProductsDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::barcode = value;
  }-*/;
  
  private static native java.lang.String getBuy(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::buy;
  }-*/;
  
  private static native void setBuy(ecr.web.app.shared.dto.ProductsDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::buy = value;
  }-*/;
  
  private static native java.lang.String getCode(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::code;
  }-*/;
  
  private static native void setCode(ecr.web.app.shared.dto.ProductsDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::code = value;
  }-*/;
  
  private static native java.lang.String getCode_proviser(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::code_proviser;
  }-*/;
  
  private static native void setCode_proviser(ecr.web.app.shared.dto.ProductsDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::code_proviser = value;
  }-*/;
  
  private static native java.lang.String getCode_range(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::code_range;
  }-*/;
  
  private static native void setCode_range(ecr.web.app.shared.dto.ProductsDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::code_range = value;
  }-*/;
  
  private static native java.lang.String getDescreption(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::descreption;
  }-*/;
  
  private static native void setDescreption(ecr.web.app.shared.dto.ProductsDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::descreption = value;
  }-*/;
  
  private static native java.lang.String getId_discount(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::id_discount;
  }-*/;
  
  private static native void setId_discount(ecr.web.app.shared.dto.ProductsDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::id_discount = value;
  }-*/;
  
  private static native java.lang.Long getId_product(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::id_product;
  }-*/;
  
  private static native void setId_product(ecr.web.app.shared.dto.ProductsDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::id_product = value;
  }-*/;
  
  private static native java.lang.String getId_tva(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::id_tva;
  }-*/;
  
  private static native void setId_tva(ecr.web.app.shared.dto.ProductsDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::id_tva = value;
  }-*/;
  
  private static native java.lang.String getImage(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::image;
  }-*/;
  
  private static native void setImage(ecr.web.app.shared.dto.ProductsDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::image = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getLoyality(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::loyality;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setLoyality(ecr.web.app.shared.dto.ProductsDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::loyality = value;
  }-*/;
  
  private static native java.lang.String getName(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::name;
  }-*/;
  
  private static native void setName(ecr.web.app.shared.dto.ProductsDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::name = value;
  }-*/;
  
  private static native java.lang.String getQt_stock(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::qt_stock;
  }-*/;
  
  private static native void setQt_stock(ecr.web.app.shared.dto.ProductsDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::qt_stock = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getQuantity(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::quantity;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setQuantity(ecr.web.app.shared.dto.ProductsDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::quantity = value;
  }-*/;
  
  private static native java.lang.String getSale(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::sale;
  }-*/;
  
  private static native void setSale(ecr.web.app.shared.dto.ProductsDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::sale = value;
  }-*/;
  
  private static native java.lang.String getState(ecr.web.app.shared.dto.ProductsDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.ProductsDTO::state;
  }-*/;
  
  private static native void setState(ecr.web.app.shared.dto.ProductsDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.ProductsDTO::state = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.ProductsDTO instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setID_provider(instance, streamReader.readString());
    setPrice(instance, streamReader.readLong());
    setBarcode(instance, streamReader.readLong());
    setBuy(instance, streamReader.readString());
    setCode(instance, streamReader.readString());
    setCode_proviser(instance, streamReader.readString());
    setCode_range(instance, streamReader.readString());
    setDescreption(instance, streamReader.readString());
    setId_discount(instance, streamReader.readString());
    setId_product(instance, (java.lang.Long) streamReader.readObject());
    setId_tva(instance, streamReader.readString());
    setImage(instance, streamReader.readString());
    setLoyality(instance, streamReader.readLong());
    setName(instance, streamReader.readString());
    setQt_stock(instance, streamReader.readString());
    setQuantity(instance, streamReader.readLong());
    setSale(instance, streamReader.readString());
    setState(instance, streamReader.readString());
    
  }
  
  public static ecr.web.app.shared.dto.ProductsDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.dto.ProductsDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.ProductsDTO instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getID_provider(instance));
    streamWriter.writeLong(getPrice(instance));
    streamWriter.writeLong(getBarcode(instance));
    streamWriter.writeString(getBuy(instance));
    streamWriter.writeString(getCode(instance));
    streamWriter.writeString(getCode_proviser(instance));
    streamWriter.writeString(getCode_range(instance));
    streamWriter.writeString(getDescreption(instance));
    streamWriter.writeString(getId_discount(instance));
    streamWriter.writeObject(getId_product(instance));
    streamWriter.writeString(getId_tva(instance));
    streamWriter.writeString(getImage(instance));
    streamWriter.writeLong(getLoyality(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getQt_stock(instance));
    streamWriter.writeLong(getQuantity(instance));
    streamWriter.writeString(getSale(instance));
    streamWriter.writeString(getState(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.ProductsDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.ProductsDTO_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.ProductsDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.ProductsDTO_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.ProductsDTO)object);
  }
  
}
