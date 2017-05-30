package org.codehaus.jackson.map;

import org.codehaus.jackson.JsonGenerator;

public abstract class JsonSerializer<T>
{
  public Class<T> handledType()
  {
    return null;
  }
  
  public abstract void serialize(T paramT, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider);
  
  public void serializeWithType(T paramT, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    serialize(paramT, paramJsonGenerator, paramSerializerProvider);
  }
  
  public static abstract class None
    extends JsonSerializer<Object>
  {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/codehaus/jackson/map/JsonSerializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */