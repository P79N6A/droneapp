package com.fimi.kernel.b;

import java.util.Map;
import org.json.JSONObject;

public abstract interface a
  extends b
{
  public abstract void a(String paramString, e<String> parame);
  
  public abstract <T> void a(String paramString, e<T> parame, Class<?> paramClass);
  
  public abstract void a(String paramString, Map<String, String> paramMap, e<String> parame);
  
  public abstract <T> void a(String paramString, Map<String, String> paramMap, e<T> parame, Class<?> paramClass);
  
  public abstract void a(String paramString, JSONObject paramJSONObject, e<JSONObject> parame);
  
  public abstract void b(String paramString, e<String> parame);
  
  public abstract <T> void b(String paramString, e<T> parame, Class<?> paramClass);
  
  public abstract void b(String paramString, JSONObject paramJSONObject, e<JSONObject> parame);
  
  public abstract void c(String paramString, e<JSONObject> parame);
  
  public abstract void d(String paramString, e<JSONObject> parame);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */