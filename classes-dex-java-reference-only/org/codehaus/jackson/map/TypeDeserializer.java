package org.codehaus.jackson.map;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.map.jsontype.TypeIdResolver;

public abstract class TypeDeserializer
{
  public abstract Object deserializeTypedFromAny(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext);
  
  public abstract Object deserializeTypedFromArray(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext);
  
  public abstract Object deserializeTypedFromObject(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext);
  
  public abstract Object deserializeTypedFromScalar(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext);
  
  public abstract String getPropertyName();
  
  public abstract TypeIdResolver getTypeIdResolver();
  
  public abstract JsonTypeInfo.As getTypeInclusion();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/codehaus/jackson/map/TypeDeserializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */