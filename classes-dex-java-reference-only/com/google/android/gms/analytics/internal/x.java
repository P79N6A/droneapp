package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class x
{
  private final long a;
  private final String b;
  private final String c;
  private final boolean d;
  private long e;
  private final Map<String, String> f;
  
  public x(long paramLong1, String paramString1, String paramString2, boolean paramBoolean, long paramLong2, Map<String, String> paramMap)
  {
    d.a(paramString1);
    d.a(paramString2);
    this.a = paramLong1;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean;
    this.e = paramLong2;
    if (paramMap != null)
    {
      this.f = new HashMap(paramMap);
      return;
    }
    this.f = Collections.emptyMap();
  }
  
  public long a()
  {
    return this.a;
  }
  
  public void a(long paramLong)
  {
    this.e = paramLong;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public boolean d()
  {
    return this.d;
  }
  
  public long e()
  {
    return this.e;
  }
  
  public Map<String, String> f()
  {
    return this.f;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */