package org.codehaus.jackson.map;

import org.codehaus.jackson.map.deser.BeanDeserializerModifier;
import org.codehaus.jackson.type.JavaType;

public abstract class DeserializerProvider
{
  public abstract int cachedDeserializersCount();
  
  @Deprecated
  public final KeyDeserializer findKeyDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType)
  {
    return findKeyDeserializer(paramDeserializationConfig, paramJavaType, null);
  }
  
  public abstract KeyDeserializer findKeyDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType, BeanProperty paramBeanProperty);
  
  @Deprecated
  public final JsonDeserializer<Object> findTypedValueDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType)
  {
    return findTypedValueDeserializer(paramDeserializationConfig, paramJavaType, null);
  }
  
  public abstract JsonDeserializer<Object> findTypedValueDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType, BeanProperty paramBeanProperty);
  
  public abstract JsonDeserializer<Object> findValueDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType, BeanProperty paramBeanProperty);
  
  @Deprecated
  public final JsonDeserializer<Object> findValueDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType1, JavaType paramJavaType2, String paramString)
  {
    return findValueDeserializer(paramDeserializationConfig, paramJavaType1, (BeanProperty)null);
  }
  
  public abstract void flushCachedDeserializers();
  
  public abstract boolean hasValueDeserializerFor(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType);
  
  public abstract DeserializerProvider withAbstractTypeResolver(AbstractTypeResolver paramAbstractTypeResolver);
  
  public abstract DeserializerProvider withAdditionalDeserializers(Deserializers paramDeserializers);
  
  public abstract DeserializerProvider withAdditionalKeyDeserializers(KeyDeserializers paramKeyDeserializers);
  
  public abstract DeserializerProvider withDeserializerModifier(BeanDeserializerModifier paramBeanDeserializerModifier);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/codehaus/jackson/map/DeserializerProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */