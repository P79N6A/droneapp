package com.fimi.soul.utils;

import com.google.gson.Gson;
import java.lang.reflect.Type;

public class ad
{
  public static Gson a = new Gson();
  
  public static <T> T a(String paramString, Class<T> paramClass)
  {
    return (T)a.fromJson(paramString, paramClass);
  }
  
  public static <T> T a(String paramString, Type paramType)
  {
    return (T)a.fromJson(paramString, paramType);
  }
  
  public static String a(Object paramObject)
  {
    return a.toJson(paramObject);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */