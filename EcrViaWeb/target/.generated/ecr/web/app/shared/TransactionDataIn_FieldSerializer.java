package ecr.web.app.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TransactionDataIn_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getAmount(ecr.web.app.shared.TransactionDataIn instance) /*-{
    return instance.@ecr.web.app.shared.TransactionDataIn::amount;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setAmount(ecr.web.app.shared.TransactionDataIn instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.TransactionDataIn::amount = value;
  }-*/;
  
  private static native java.lang.String getAmountlabel(ecr.web.app.shared.TransactionDataIn instance) /*-{
    return instance.@ecr.web.app.shared.TransactionDataIn::amountlabel;
  }-*/;
  
  private static native void setAmountlabel(ecr.web.app.shared.TransactionDataIn instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.TransactionDataIn::amountlabel = value;
  }-*/;
  
  private static native java.util.Date getDate(ecr.web.app.shared.TransactionDataIn instance) /*-{
    return instance.@ecr.web.app.shared.TransactionDataIn::date;
  }-*/;
  
  private static native void setDate(ecr.web.app.shared.TransactionDataIn instance, java.util.Date value) 
  /*-{
    instance.@ecr.web.app.shared.TransactionDataIn::date = value;
  }-*/;
  
  private static native int getMessage(ecr.web.app.shared.TransactionDataIn instance) /*-{
    return instance.@ecr.web.app.shared.TransactionDataIn::message;
  }-*/;
  
  private static native void setMessage(ecr.web.app.shared.TransactionDataIn instance, int value) 
  /*-{
    instance.@ecr.web.app.shared.TransactionDataIn::message = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getRef(ecr.web.app.shared.TransactionDataIn instance) /*-{
    return instance.@ecr.web.app.shared.TransactionDataIn::ref;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setRef(ecr.web.app.shared.TransactionDataIn instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.TransactionDataIn::ref = value;
  }-*/;
  
  private static native java.lang.String getTypepay(ecr.web.app.shared.TransactionDataIn instance) /*-{
    return instance.@ecr.web.app.shared.TransactionDataIn::typepay;
  }-*/;
  
  private static native void setTypepay(ecr.web.app.shared.TransactionDataIn instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.TransactionDataIn::typepay = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.TransactionDataIn instance) throws SerializationException {
    setAmount(instance, streamReader.readLong());
    setAmountlabel(instance, streamReader.readString());
    setDate(instance, (java.util.Date) streamReader.readObject());
    setMessage(instance, streamReader.readInt());
    setRef(instance, streamReader.readLong());
    setTypepay(instance, streamReader.readString());
    
  }
  
  public static ecr.web.app.shared.TransactionDataIn instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.TransactionDataIn();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.TransactionDataIn instance) throws SerializationException {
    streamWriter.writeLong(getAmount(instance));
    streamWriter.writeString(getAmountlabel(instance));
    streamWriter.writeObject(getDate(instance));
    streamWriter.writeInt(getMessage(instance));
    streamWriter.writeLong(getRef(instance));
    streamWriter.writeString(getTypepay(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.TransactionDataIn_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.TransactionDataIn_FieldSerializer.deserialize(reader, (ecr.web.app.shared.TransactionDataIn)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.TransactionDataIn_FieldSerializer.serialize(writer, (ecr.web.app.shared.TransactionDataIn)object);
  }
  
}
