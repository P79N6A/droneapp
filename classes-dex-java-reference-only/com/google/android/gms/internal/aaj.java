package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@aaa
class aaj
{
  private final List<String> a;
  private final List<String> b;
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  private final boolean g;
  private final boolean h;
  private final String i;
  private final String j;
  private String k;
  private int l;
  
  public aaj(int paramInt, Map<String, String> paramMap)
  {
    this.k = ((String)paramMap.get("url"));
    this.d = ((String)paramMap.get("base_uri"));
    this.e = ((String)paramMap.get("post_parameters"));
    this.g = b((String)paramMap.get("drt_include"));
    this.h = b((String)paramMap.get("pan_include"));
    this.c = ((String)paramMap.get("activation_overlay_url"));
    this.b = c((String)paramMap.get("check_packages"));
    this.i = ((String)paramMap.get("request_id"));
    this.f = ((String)paramMap.get("type"));
    this.a = c((String)paramMap.get("errors"));
    this.l = paramInt;
    this.j = ((String)paramMap.get("fetched_ad"));
  }
  
  private static boolean b(String paramString)
  {
    return (paramString != null) && ((paramString.equals("1")) || (paramString.equals("true")));
  }
  
  private List<String> c(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return Arrays.asList(paramString.split(","));
  }
  
  public int a()
  {
    return this.l;
  }
  
  public void a(String paramString)
  {
    this.k = paramString;
  }
  
  public List<String> b()
  {
    return this.a;
  }
  
  public String c()
  {
    return this.e;
  }
  
  public String d()
  {
    return this.k;
  }
  
  public String e()
  {
    return this.f;
  }
  
  public boolean f()
  {
    return this.g;
  }
  
  public String g()
  {
    return this.i;
  }
  
  public String h()
  {
    return this.j;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/aaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */