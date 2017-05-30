package com.google.android.gms.cast.a;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.agm;
import org.json.JSONObject;

public final class a
{
  public static final int a = 2150;
  public static final int b = 2151;
  public static final int c = 0;
  public static final int d = 1;
  public static final int e = 2;
  public static final int f = 3;
  public static final int g = 4;
  public static final int h = 5;
  public static final int i = 6;
  public static final int j = 0;
  public static final int k = 1;
  public static final int l = 2;
  public static final int m = 0;
  public static final int n = 1;
  public static final int o = 2;
  public static final int p = 3;
  public static final int q = 4;
  private final agm r;
  
  public a(agm paramagm)
  {
    this.r = paramagm;
  }
  
  public static i<a> a(g paramg, String paramString)
  {
    return a(new agm(paramg, paramString, com.google.android.gms.cast.a.l));
  }
  
  static i<a> a(agm paramagm)
  {
    return paramagm.a(new a(paramagm));
  }
  
  private i<b> a(String paramString, int paramInt, JSONObject paramJSONObject)
  {
    return this.r.a(paramString, paramInt, paramJSONObject);
  }
  
  public b a()
  {
    try
    {
      b localb = this.r.e();
      return localb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public i<b> a(String paramString, JSONObject paramJSONObject)
  {
    return a(paramString, 3, paramJSONObject);
  }
  
  public i<b> a(JSONObject paramJSONObject)
  {
    return a(b(), 3, paramJSONObject);
  }
  
  public void a(c paramc)
  {
    this.r.a(paramc);
  }
  
  public void a(String paramString)
  {
    this.r.a(paramString);
  }
  
  public i<b> b(String paramString, JSONObject paramJSONObject)
  {
    return a(paramString, 4, paramJSONObject);
  }
  
  public i<b> b(JSONObject paramJSONObject)
  {
    return a(b(), 4, paramJSONObject);
  }
  
  public String b()
  {
    return this.r.f();
  }
  
  public i<b> c(String paramString, JSONObject paramJSONObject)
  {
    return a(paramString, 6, paramJSONObject);
  }
  
  public i<b> c(JSONObject paramJSONObject)
  {
    return a(b(), 6, paramJSONObject);
  }
  
  public void c()
  {
    this.r.d();
  }
  
  public i<b> d(String paramString, JSONObject paramJSONObject)
  {
    return a(paramString, 5, paramJSONObject);
  }
  
  public i<b> d(JSONObject paramJSONObject)
  {
    return a(b(), 5, paramJSONObject);
  }
  
  public boolean d()
  {
    return this.r.g();
  }
  
  public i<b> e(String paramString, JSONObject paramJSONObject)
  {
    return a(paramString, 2, paramJSONObject);
  }
  
  public i<b> e(JSONObject paramJSONObject)
  {
    return a(b(), 2, paramJSONObject);
  }
  
  public i<b> f(String paramString, JSONObject paramJSONObject)
  {
    return this.r.b(paramString, paramJSONObject);
  }
  
  public i<b> f(JSONObject paramJSONObject)
  {
    return f(b(), paramJSONObject);
  }
  
  public void g(String paramString, JSONObject paramJSONObject)
  {
    this.r.a(paramString, paramJSONObject);
  }
  
  public void g(JSONObject paramJSONObject)
  {
    g(b(), paramJSONObject);
  }
  
  public static abstract interface a
    extends m
  {
    public abstract a b();
  }
  
  public static abstract interface b
    extends m
  {
    public abstract String b();
    
    public abstract long c();
    
    public abstract JSONObject d();
  }
  
  public static abstract interface c
  {
    public abstract void a(b paramb1, b paramb2);
    
    public abstract void a(String paramString, JSONObject paramJSONObject);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */