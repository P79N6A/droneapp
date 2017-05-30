package org.codehaus.jackson.map.deser.impl;

import java.lang.reflect.Constructor;
import java.util.Collection;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.ContainerDeserializer;
import org.codehaus.jackson.type.JavaType;

@JacksonStdImpl
public final class StringCollectionDeserializer
  extends ContainerDeserializer<Collection<String>>
{
  protected final JavaType _collectionType;
  final Constructor<Collection<String>> _defaultCtor;
  protected final boolean _isDefaultDeserializer;
  protected final JsonDeserializer<String> _valueDeserializer;
  
  public StringCollectionDeserializer(JavaType paramJavaType, JsonDeserializer<?> paramJsonDeserializer, Constructor<?> paramConstructor)
  {
    super(paramJavaType.getRawClass());
    this._collectionType = paramJavaType;
    this._valueDeserializer = paramJsonDeserializer;
    this._defaultCtor = paramConstructor;
    this._isDefaultDeserializer = isDefaultSerializer(paramJsonDeserializer);
  }
  
  private Collection<String> deserializeUsingCustom(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Collection<String> paramCollection)
  {
    JsonDeserializer localJsonDeserializer = this._valueDeserializer;
    Object localObject = paramJsonParser.nextToken();
    if (localObject != JsonToken.END_ARRAY)
    {
      if (localObject == JsonToken.VALUE_NULL) {}
      for (localObject = null;; localObject = (String)localJsonDeserializer.deserialize(paramJsonParser, paramDeserializationContext))
      {
        paramCollection.add(localObject);
        break;
      }
    }
    return paramCollection;
  }
  
  private final Collection<String> handleNonArray(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Collection<String> paramCollection)
  {
    if (!paramDeserializationContext.isEnabled(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
      throw paramDeserializationContext.mappingException(this._collectionType.getRawClass());
    }
    JsonDeserializer localJsonDeserializer = this._valueDeserializer;
    if (paramJsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
      paramJsonParser = null;
    }
    for (;;)
    {
      paramCollection.add(paramJsonParser);
      return paramCollection;
      if (localJsonDeserializer == null) {
        paramJsonParser = paramJsonParser.getText();
      } else {
        paramJsonParser = (String)localJsonDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
      }
    }
  }
  
  public Collection<String> deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    try
    {
      Collection localCollection = (Collection)this._defaultCtor.newInstance(new Object[0]);
      return deserialize(paramJsonParser, paramDeserializationContext, localCollection);
    }
    catch (Exception paramJsonParser)
    {
      throw paramDeserializationContext.instantiationException(this._collectionType.getRawClass(), paramJsonParser);
    }
  }
  
  public Collection<String> deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Collection<String> paramCollection)
  {
    if (!paramJsonParser.isExpectedStartArrayToken()) {
      paramDeserializationContext = handleNonArray(paramJsonParser, paramDeserializationContext, paramCollection);
    }
    JsonToken localJsonToken;
    do
    {
      return paramDeserializationContext;
      if (!this._isDefaultDeserializer) {
        return deserializeUsingCustom(paramJsonParser, paramDeserializationContext, paramCollection);
      }
      localJsonToken = paramJsonParser.nextToken();
      paramDeserializationContext = paramCollection;
    } while (localJsonToken == JsonToken.END_ARRAY);
    if (localJsonToken == JsonToken.VALUE_NULL) {}
    for (paramDeserializationContext = null;; paramDeserializationContext = paramJsonParser.getText())
    {
      paramCollection.add(paramDeserializationContext);
      break;
    }
  }
  
  public Object deserializeWithType(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, TypeDeserializer paramTypeDeserializer)
  {
    return paramTypeDeserializer.deserializeTypedFromArray(paramJsonParser, paramDeserializationContext);
  }
  
  public JsonDeserializer<Object> getContentDeserializer()
  {
    return this._valueDeserializer;
  }
  
  public JavaType getContentType()
  {
    return this._collectionType.getContentType();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/codehaus/jackson/map/deser/impl/StringCollectionDeserializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */