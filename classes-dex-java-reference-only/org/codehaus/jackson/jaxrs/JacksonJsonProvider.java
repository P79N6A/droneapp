package org.codehaus.jackson.jaxrs;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.Providers;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonGenerator.Feature;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonParser.Feature;
import org.codehaus.jackson.Version;
import org.codehaus.jackson.Versioned;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.codehaus.jackson.map.type.ClassKey;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.map.util.JSONPObject;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.util.VersionUtil;

@Consumes({"application/json", "text/json"})
@Produces({"application/json", "text/json"})
@Provider
public class JacksonJsonProvider
  implements MessageBodyReader<Object>, MessageBodyWriter<Object>, Versioned
{
  public static final Annotations[] BASIC_ANNOTATIONS = { Annotations.JACKSON };
  public static final Class<?>[] _unreadableClasses = { InputStream.class, Reader.class };
  public static final HashSet<ClassKey> _untouchables = new HashSet();
  public static final Class<?>[] _unwritableClasses = { OutputStream.class, Writer.class, StreamingOutput.class, Response.class };
  protected boolean _cfgCheckCanDeserialize = false;
  protected boolean _cfgCheckCanSerialize = false;
  protected HashSet<ClassKey> _cfgCustomUntouchables;
  protected String _jsonpFunctionName;
  protected final MapperConfigurator _mapperConfig;
  @Context
  protected Providers _providers;
  
  static
  {
    _untouchables.add(new ClassKey(InputStream.class));
    _untouchables.add(new ClassKey(Reader.class));
    _untouchables.add(new ClassKey(OutputStream.class));
    _untouchables.add(new ClassKey(Writer.class));
    _untouchables.add(new ClassKey(byte[].class));
    _untouchables.add(new ClassKey(char[].class));
    _untouchables.add(new ClassKey(String.class));
    _untouchables.add(new ClassKey(StreamingOutput.class));
    _untouchables.add(new ClassKey(Response.class));
  }
  
  public JacksonJsonProvider()
  {
    this(null, BASIC_ANNOTATIONS);
  }
  
  public JacksonJsonProvider(ObjectMapper paramObjectMapper)
  {
    this(paramObjectMapper, BASIC_ANNOTATIONS);
  }
  
  public JacksonJsonProvider(ObjectMapper paramObjectMapper, Annotations[] paramArrayOfAnnotations)
  {
    this._mapperConfig = new MapperConfigurator(paramObjectMapper, paramArrayOfAnnotations);
  }
  
  public JacksonJsonProvider(Annotations... paramVarArgs)
  {
    this(null, paramVarArgs);
  }
  
  protected static boolean _containedIn(Class<?> paramClass, HashSet<ClassKey> paramHashSet)
  {
    if (paramHashSet != null)
    {
      ClassKey localClassKey = new ClassKey(paramClass);
      if (paramHashSet.contains(localClassKey)) {
        return true;
      }
      paramClass = ClassUtil.findSuperTypes(paramClass, null).iterator();
      while (paramClass.hasNext())
      {
        localClassKey.reset((Class)paramClass.next());
        if (paramHashSet.contains(localClassKey)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public void addUntouchable(Class<?> paramClass)
  {
    if (this._cfgCustomUntouchables == null) {
      this._cfgCustomUntouchables = new HashSet();
    }
    this._cfgCustomUntouchables.add(new ClassKey(paramClass));
  }
  
  public void checkCanDeserialize(boolean paramBoolean)
  {
    this._cfgCheckCanDeserialize = paramBoolean;
  }
  
  public void checkCanSerialize(boolean paramBoolean)
  {
    this._cfgCheckCanSerialize = paramBoolean;
  }
  
  public JacksonJsonProvider configure(JsonGenerator.Feature paramFeature, boolean paramBoolean)
  {
    this._mapperConfig.configure(paramFeature, paramBoolean);
    return this;
  }
  
  public JacksonJsonProvider configure(JsonParser.Feature paramFeature, boolean paramBoolean)
  {
    this._mapperConfig.configure(paramFeature, paramBoolean);
    return this;
  }
  
  public JacksonJsonProvider configure(DeserializationConfig.Feature paramFeature, boolean paramBoolean)
  {
    this._mapperConfig.configure(paramFeature, paramBoolean);
    return this;
  }
  
  public JacksonJsonProvider configure(SerializationConfig.Feature paramFeature, boolean paramBoolean)
  {
    this._mapperConfig.configure(paramFeature, paramBoolean);
    return this;
  }
  
  public JacksonJsonProvider disable(JsonGenerator.Feature paramFeature, boolean paramBoolean)
  {
    this._mapperConfig.configure(paramFeature, false);
    return this;
  }
  
  public JacksonJsonProvider disable(JsonParser.Feature paramFeature, boolean paramBoolean)
  {
    this._mapperConfig.configure(paramFeature, false);
    return this;
  }
  
  public JacksonJsonProvider disable(DeserializationConfig.Feature paramFeature, boolean paramBoolean)
  {
    this._mapperConfig.configure(paramFeature, false);
    return this;
  }
  
  public JacksonJsonProvider disable(SerializationConfig.Feature paramFeature, boolean paramBoolean)
  {
    this._mapperConfig.configure(paramFeature, false);
    return this;
  }
  
  public JacksonJsonProvider enable(JsonGenerator.Feature paramFeature, boolean paramBoolean)
  {
    this._mapperConfig.configure(paramFeature, true);
    return this;
  }
  
  public JacksonJsonProvider enable(JsonParser.Feature paramFeature, boolean paramBoolean)
  {
    this._mapperConfig.configure(paramFeature, true);
    return this;
  }
  
  public JacksonJsonProvider enable(DeserializationConfig.Feature paramFeature, boolean paramBoolean)
  {
    this._mapperConfig.configure(paramFeature, true);
    return this;
  }
  
  public JacksonJsonProvider enable(SerializationConfig.Feature paramFeature, boolean paramBoolean)
  {
    this._mapperConfig.configure(paramFeature, true);
    return this;
  }
  
  protected JsonEncoding findEncoding(MediaType paramMediaType, MultivaluedMap<String, Object> paramMultivaluedMap)
  {
    return JsonEncoding.UTF8;
  }
  
  public long getSize(Object paramObject, Class<?> paramClass, Type paramType, Annotation[] paramArrayOfAnnotation, MediaType paramMediaType)
  {
    return -1L;
  }
  
  protected boolean isJsonType(MediaType paramMediaType)
  {
    if (paramMediaType != null) {
      paramMediaType = paramMediaType.getSubtype();
    }
    return ("json".equalsIgnoreCase(paramMediaType)) || (paramMediaType.endsWith("+json"));
  }
  
  public boolean isReadable(Class<?> paramClass, Type paramType, Annotation[] paramArrayOfAnnotation, MediaType paramMediaType)
  {
    if (!isJsonType(paramMediaType)) {}
    label66:
    do
    {
      do
      {
        do
        {
          return false;
        } while (_untouchables.contains(new ClassKey(paramClass)));
        paramType = _unreadableClasses;
        int j = paramType.length;
        int i = 0;
        for (;;)
        {
          if (i >= j) {
            break label66;
          }
          if (paramType[i].isAssignableFrom(paramClass)) {
            break;
          }
          i += 1;
        }
      } while (_containedIn(paramClass, this._cfgCustomUntouchables));
      if (!this._cfgCheckCanSerialize) {
        break;
      }
      paramType = locateMapper(paramClass, paramMediaType);
    } while (!paramType.canDeserialize(paramType.constructType(paramClass)));
    return true;
  }
  
  public boolean isWriteable(Class<?> paramClass, Type paramType, Annotation[] paramArrayOfAnnotation, MediaType paramMediaType)
  {
    if (!isJsonType(paramMediaType)) {}
    label66:
    do
    {
      do
      {
        return false;
      } while (_untouchables.contains(new ClassKey(paramClass)));
      paramType = _unwritableClasses;
      int j = paramType.length;
      int i = 0;
      for (;;)
      {
        if (i >= j) {
          break label66;
        }
        if (paramType[i].isAssignableFrom(paramClass)) {
          break;
        }
        i += 1;
      }
    } while ((_containedIn(paramClass, this._cfgCustomUntouchables)) || ((this._cfgCheckCanSerialize) && (!locateMapper(paramClass, paramMediaType).canSerialize(paramClass))));
    return true;
  }
  
  public ObjectMapper locateMapper(Class<?> paramClass, MediaType paramMediaType)
  {
    ObjectMapper localObjectMapper = this._mapperConfig.getConfiguredMapper();
    Object localObject2 = localObjectMapper;
    if (localObjectMapper == null)
    {
      Object localObject1 = localObjectMapper;
      if (this._providers != null)
      {
        localObject1 = this._providers.getContextResolver(ObjectMapper.class, paramMediaType);
        paramMediaType = (MediaType)localObject1;
        if (localObject1 == null) {
          paramMediaType = this._providers.getContextResolver(ObjectMapper.class, null);
        }
        localObject1 = localObjectMapper;
        if (paramMediaType != null) {
          localObject1 = (ObjectMapper)paramMediaType.getContext(paramClass);
        }
      }
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = this._mapperConfig.getDefaultMapper();
      }
    }
    return (ObjectMapper)localObject2;
  }
  
  public Object readFrom(Class<Object> paramClass, Type paramType, Annotation[] paramArrayOfAnnotation, MediaType paramMediaType, MultivaluedMap<String, String> paramMultivaluedMap, InputStream paramInputStream)
  {
    paramClass = locateMapper(paramClass, paramMediaType);
    paramArrayOfAnnotation = paramClass.getJsonFactory().createJsonParser(paramInputStream);
    paramArrayOfAnnotation.disable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
    return paramClass.readValue(paramArrayOfAnnotation, paramClass.constructType(paramType));
  }
  
  public void setAnnotationsToUse(Annotations[] paramArrayOfAnnotations)
  {
    this._mapperConfig.setAnnotationsToUse(paramArrayOfAnnotations);
  }
  
  public void setJSONPFunctionName(String paramString)
  {
    this._jsonpFunctionName = paramString;
  }
  
  public void setMapper(ObjectMapper paramObjectMapper)
  {
    this._mapperConfig.setMapper(paramObjectMapper);
  }
  
  public Version version()
  {
    return VersionUtil.versionFor(getClass());
  }
  
  public void writeTo(Object paramObject, Class<?> paramClass, Type paramType, Annotation[] paramArrayOfAnnotation, MediaType paramMediaType, MultivaluedMap<String, Object> paramMultivaluedMap, OutputStream paramOutputStream)
  {
    paramArrayOfAnnotation = null;
    ObjectMapper localObjectMapper = locateMapper(paramClass, paramMediaType);
    paramClass = findEncoding(paramMediaType, paramMultivaluedMap);
    paramMediaType = localObjectMapper.getJsonFactory().createJsonGenerator(paramOutputStream, paramClass);
    paramMediaType.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
    if (localObjectMapper.getSerializationConfig().isEnabled(SerializationConfig.Feature.INDENT_OUTPUT)) {
      paramMediaType.useDefaultPrettyPrinter();
    }
    paramClass = paramArrayOfAnnotation;
    if (paramType != null)
    {
      paramClass = paramArrayOfAnnotation;
      if (paramObject != null)
      {
        paramClass = paramArrayOfAnnotation;
        if (paramType.getClass() != Class.class)
        {
          paramClass = localObjectMapper.getTypeFactory().constructType(paramType);
          if (paramClass.getRawClass() != Object.class) {
            break label165;
          }
          paramClass = paramArrayOfAnnotation;
        }
      }
    }
    label165:
    for (;;)
    {
      if (this._jsonpFunctionName != null)
      {
        localObjectMapper.writeValue(paramMediaType, new JSONPObject(this._jsonpFunctionName, paramObject, paramClass));
        return;
      }
      if (paramClass != null)
      {
        localObjectMapper.typedWriter(paramClass).writeValue(paramMediaType, paramObject);
        return;
      }
      localObjectMapper.writeValue(paramMediaType, paramObject);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/codehaus/jackson/jaxrs/JacksonJsonProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */