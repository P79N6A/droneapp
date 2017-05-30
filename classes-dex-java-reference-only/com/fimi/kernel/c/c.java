package com.fimi.kernel.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

public class c
  implements a
{
  public static final ObjectMapper a = new ObjectMapper();
  private static c b = null;
  private static final String e = "BeautifulKernel_SPStoreManager";
  private Gson c = new Gson();
  private SharedPreferences d = com.fimi.kernel.c.a().getSharedPreferences("BeautifulKernel_SPStoreManager", 0);
  
  public static c a()
  {
    try
    {
      if (b == null) {
        b = new c();
      }
      c localc = b;
      return localc;
    }
    finally {}
  }
  
  public <T> T a(String paramString, Class<?> paramClass)
  {
    Object localObject = null;
    try
    {
      String str = this.d.getString(paramString, null);
      paramString = (String)localObject;
      if (str != null) {
        paramString = this.c.fromJson(str, paramClass);
      }
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public String a(String paramString)
  {
    return this.d.getString(paramString, null);
  }
  
  public void a(String paramString, int paramInt)
  {
    SharedPreferences.Editor localEditor = this.d.edit();
    localEditor.putInt(paramString, paramInt);
    localEditor.commit();
  }
  
  public void a(String paramString, long paramLong)
  {
    SharedPreferences.Editor localEditor = this.d.edit();
    localEditor.putLong(paramString, paramLong);
    localEditor.commit();
  }
  
  public void a(String paramString, Object paramObject)
  {
    SharedPreferences.Editor localEditor = this.d.edit();
    localEditor.putString(paramString, this.c.toJson(paramObject, paramObject.getClass()));
    localEditor.commit();
  }
  
  public void a(String paramString1, String paramString2)
  {
    SharedPreferences.Editor localEditor = this.d.edit();
    localEditor.putString(paramString1, paramString2);
    localEditor.commit();
  }
  
  public <T> void a(String paramString, List<T> paramList)
  {
    SharedPreferences.Editor localEditor = this.d.edit();
    localEditor.putString(paramString, this.c.toJson(paramList));
    localEditor.commit();
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = this.d.edit();
    localEditor.putBoolean(paramString, paramBoolean);
    localEditor.commit();
  }
  
  public int b(String paramString)
  {
    return this.d.getInt(paramString, 0);
  }
  
  public List b(String paramString, Class<?> paramClass)
  {
    paramClass = a.getTypeFactory().constructCollectionType(ArrayList.class, paramClass);
    try
    {
      paramString = this.d.getString(paramString, null);
      if (paramString != null)
      {
        paramString = (List)a.readValue(paramString, paramClass);
        return paramString;
      }
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public long c(String paramString)
  {
    return this.d.getLong(paramString, 0L);
  }
  
  public boolean d(String paramString)
  {
    return this.d.getBoolean(paramString, false);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */