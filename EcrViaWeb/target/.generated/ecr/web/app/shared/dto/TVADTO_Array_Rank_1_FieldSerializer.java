package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TVADTO_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.TVADTO[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static ecr.web.app.shared.dto.TVADTO[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new ecr.web.app.shared.dto.TVADTO[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.TVADTO[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.TVADTO_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.TVADTO_Array_Rank_1_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.TVADTO[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.TVADTO_Array_Rank_1_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.TVADTO[])object);
  }
  
}
