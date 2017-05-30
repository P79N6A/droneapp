package org.codehaus.jackson.map;

import java.lang.reflect.Type;
import java.util.Date;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ser.FilterProvider;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.schema.JsonSchema;
import org.codehaus.jackson.type.JavaType;

public abstract class SerializerProvider
{
  protected static final JavaType TYPE_OBJECT = TypeFactory.defaultInstance().uncheckedSimpleType(Object.class);
  protected final SerializationConfig _config;
  protected final Class<?> _serializationView;
  
  protected SerializerProvider(SerializationConfig paramSerializationConfig)
  {
    this._config = paramSerializationConfig;
    if (paramSerializationConfig == null) {}
    for (paramSerializationConfig = null;; paramSerializationConfig = this._config.getSerializationView())
    {
      this._serializationView = paramSerializationConfig;
      return;
    }
  }
  
  public abstract int cachedSerializersCount();
  
  public JavaType constructType(Type paramType)
  {
    return this._config.getTypeFactory().constructType(paramType);
  }
  
  public abstract void defaultSerializeDateValue(long paramLong, JsonGenerator paramJsonGenerator);
  
  public abstract void defaultSerializeDateValue(Date paramDate, JsonGenerator paramJsonGenerator);
  
  public final void defaultSerializeField(String paramString, Object paramObject, JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.writeFieldName(paramString);
    if (paramObject == null)
    {
      getNullValueSerializer().serialize(null, paramJsonGenerator, this);
      return;
    }
    findTypedValueSerializer(paramObject.getClass(), true).serialize(paramObject, paramJsonGenerator, this);
  }
  
  public final void defaultSerializeNull(JsonGenerator paramJsonGenerator)
  {
    getNullValueSerializer().serialize(null, paramJsonGenerator, this);
  }
  
  public final void defaultSerializeValue(Object paramObject, JsonGenerator paramJsonGenerator)
  {
    if (paramObject == null)
    {
      getNullValueSerializer().serialize(null, paramJsonGenerator, this);
      return;
    }
    findTypedValueSerializer(paramObject.getClass(), true).serialize(paramObject, paramJsonGenerator, this);
  }
  
  public abstract JsonSerializer<Object> findKeySerializer(JavaType paramJavaType, BeanProperty paramBeanProperty);
  
  @Deprecated
  public final JsonSerializer<Object> findTypedValueSerializer(Class<?> paramClass, boolean paramBoolean)
  {
    return findTypedValueSerializer(paramClass, paramBoolean, null);
  }
  
  public abstract JsonSerializer<Object> findTypedValueSerializer(Class<?> paramClass, boolean paramBoolean, BeanProperty paramBeanProperty);
  
  @Deprecated
  public final JsonSerializer<Object> findTypedValueSerializer(JavaType paramJavaType, boolean paramBoolean)
  {
    return findTypedValueSerializer(paramJavaType, paramBoolean, null);
  }
  
  public abstract JsonSerializer<Object> findTypedValueSerializer(JavaType paramJavaType, boolean paramBoolean, BeanProperty paramBeanProperty);
  
  @Deprecated
  public final JsonSerializer<Object> findValueSerializer(Class<?> paramClass)
  {
    return findValueSerializer(paramClass, null);
  }
  
  public abstract JsonSerializer<Object> findValueSerializer(Class<?> paramClass, BeanProperty paramBeanProperty);
  
  @Deprecated
  public final JsonSerializer<Object> findValueSerializer(JavaType paramJavaType)
  {
    return findValueSerializer(paramJavaType, null);
  }
  
  public abstract JsonSerializer<Object> findValueSerializer(JavaType paramJavaType, BeanProperty paramBeanProperty);
  
  public abstract void flushCachedSerializers();
  
  public abstract JsonSchema generateJsonSchema(Class<?> paramClass, SerializationConfig paramSerializationConfig, SerializerFactory paramSerializerFactory);
  
  public final SerializationConfig getConfig()
  {
    return this._config;
  }
  
  public final FilterProvider getFilterProvider()
  {
    return this._config.getFilterProvider();
  }
  
  @Deprecated
  public final JsonSerializer<Object> getKeySerializer()
  {
    return findKeySerializer(TYPE_OBJECT, null);
  }
  
  @Deprecated
  public final JsonSerializer<Object> getKeySerializer(JavaType paramJavaType, BeanProperty paramBeanProperty)
  {
    return findKeySerializer(paramJavaType, paramBeanProperty);
  }
  
  public abstract JsonSerializer<Object> getNullKeySerializer();
  
  public abstract JsonSerializer<Object> getNullValueSerializer();
  
  public final Class<?> getSerializationView()
  {
    return this._serializationView;
  }
  
  public abstract JsonSerializer<Object> getUnknownTypeSerializer(Class<?> paramClass);
  
  public abstract boolean hasSerializerFor(SerializationConfig paramSerializationConfig, Class<?> paramClass, SerializerFactory paramSerializerFactory);
  
  public final boolean isEnabled(SerializationConfig.Feature paramFeature)
  {
    return this._config.isEnabled(paramFeature);
  }
  
  public abstract void serializeValue(SerializationConfig paramSerializationConfig, JsonGenerator paramJsonGenerator, Object paramObject, SerializerFactory paramSerializerFactory);
  
  public abstract void serializeValue(SerializationConfig paramSerializationConfig, JsonGenerator paramJsonGenerator, Object paramObject, JavaType paramJavaType, SerializerFactory paramSerializerFactory);
  
  public abstract void setDefaultKeySerializer(JsonSerializer<Object> paramJsonSerializer);
  
  public abstract void setNullKeySerializer(JsonSerializer<Object> paramJsonSerializer);
  
  public abstract void setNullValueSerializer(JsonSerializer<Object> paramJsonSerializer);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/codehaus/jackson/map/SerializerProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */