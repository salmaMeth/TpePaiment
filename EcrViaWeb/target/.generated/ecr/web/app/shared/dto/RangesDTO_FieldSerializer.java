package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RangesDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCode(ecr.web.app.shared.dto.RangesDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.RangesDTO::Code;
  }-*/;
  
  private static native void setCode(ecr.web.app.shared.dto.RangesDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.RangesDTO::Code = value;
  }-*/;
  
  private static native java.lang.String getDescription(ecr.web.app.shared.dto.RangesDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.RangesDTO::Description;
  }-*/;
  
  private static native void setDescription(ecr.web.app.shared.dto.RangesDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.RangesDTO::Description = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getId_range(ecr.web.app.shared.dto.RangesDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.RangesDTO::id_range;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setId_range(ecr.web.app.shared.dto.RangesDTO instance, long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.RangesDTO::id_range = value;
  }-*/;
  
  private static native java.lang.String getImage(ecr.web.app.shared.dto.RangesDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.RangesDTO::image;
  }-*/;
  
  private static native void setImage(ecr.web.app.shared.dto.RangesDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.RangesDTO::image = value;
  }-*/;
  
  private static native java.lang.String getName(ecr.web.app.shared.dto.RangesDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.RangesDTO::name;
  }-*/;
  
  private static native void setName(ecr.web.app.shared.dto.RangesDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.RangesDTO::name = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.RangesDTO instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setCode(instance, streamReader.readString());
    setDescription(instance, streamReader.readString());
    setId_range(instance, streamReader.readLong());
    setImage(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    
  }
  
  public static ecr.web.app.shared.dto.RangesDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.dto.RangesDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.RangesDTO instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getCode(instance));
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeLong(getId_range(instance));
    streamWriter.writeString(getImage(instance));
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.RangesDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.RangesDTO_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.RangesDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.RangesDTO_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.RangesDTO)object);
  }
  
}
