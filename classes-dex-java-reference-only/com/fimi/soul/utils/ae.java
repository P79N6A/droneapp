package com.fimi.soul.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.codehaus.jackson.JsonParser.Feature;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationProblemHandler;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

public class ae
{
  private static ObjectMapper a = new ObjectMapper();
  
  static
  {
    a.getDeserializationConfig().set(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    a.getSerializationConfig().setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
    a.getSerializationConfig().setSerializationInclusion(JsonSerialize.Inclusion.NON_DEFAULT);
    a.configure(DeserializationConfig.Feature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
    a.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
    a.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
    a.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, false);
    a.configure(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
  }
  
  public static <T> T a(Class<T> paramClass, File paramFile)
  {
    return (T)a.readValue(paramFile, paramClass);
  }
  
  public static <T> ArrayList<T> a(Class<? extends T[]> paramClass, String paramString)
  {
    paramClass = (Object[])a.readValue(paramString, paramClass);
    paramString = new ArrayList();
    int j = paramClass.length;
    int i = 0;
    while (i < j)
    {
      paramString.add(paramClass[i]);
      i += 1;
    }
    return paramString;
  }
  
  public static List<LinkedHashMap<String, Object>> a(String paramString)
  {
    return (List)a.readValue(paramString, List.class);
  }
  
  public static void a(DeserializationProblemHandler paramDeserializationProblemHandler)
  {
    a.getDeserializationConfig().addHandler(paramDeserializationProblemHandler);
  }
  
  public static <T> T b(Class<T> paramClass, String paramString)
  {
    return (T)a.readValue(paramString, paramClass);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */