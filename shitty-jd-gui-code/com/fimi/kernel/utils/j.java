package com.fimi.kernel.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class j<T>
{
  public static Object a(String paramString, Class paramClass)
  {
    try
    {
      paramString = new GsonBuilder().create().fromJson(paramString, paramClass);
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String a(Object paramObject)
  {
    try
    {
      paramObject = new GsonBuilder().create().toJson(paramObject);
      return (String)paramObject;
    }
    catch (Exception paramObject)
    {
      ((Exception)paramObject).printStackTrace();
    }
    return null;
  }
  
  public static String a(List<?> paramList)
  {
    try
    {
      paramList = new GsonBuilder().create().toJson(paramList);
      return paramList;
    }
    catch (Exception paramList)
    {
      paramList.printStackTrace();
    }
    return null;
  }
  
  public static List<?> a(String paramString, TypeToken paramTypeToken)
  {
    try
    {
      paramString = (List)new GsonBuilder().create().fromJson(paramString, paramTypeToken.getType());
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static void a(String[] paramArrayOfString)
  {
    paramArrayOfString = a("[{id:1,name:22},{id:2,name:33}]", new TypeToken() {});
    System.out.println(paramArrayOfString.size());
    paramArrayOfString = paramArrayOfString.iterator();
    while (paramArrayOfString.hasNext())
    {
      a locala = (a)paramArrayOfString.next();
      System.out.println(locala.b());
    }
    paramArrayOfString = (a)a("{id:1,name:22}", a.class);
    System.out.println(paramArrayOfString.b());
  }
  
  static class a
  {
    String a;
    String b;
    
    public String a()
    {
      return this.a;
    }
    
    public void a(String paramString)
    {
      this.a = paramString;
    }
    
    public String b()
    {
      return this.b;
    }
    
    public void b(String paramString)
    {
      this.b = paramString;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */