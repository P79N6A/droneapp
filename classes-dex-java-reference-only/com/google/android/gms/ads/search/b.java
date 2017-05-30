package com.google.android.gms.ads.search;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.e;
import com.google.android.gms.ads.internal.client.e.a;
import com.google.android.gms.ads.mediation.customevent.a;
import com.google.android.gms.ads.mediation.m;

public final class b
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  public static final String e = e.a;
  public static final int f = 0;
  public static final int g = 1;
  public static final int h = 2;
  public static final int i = 3;
  public static final int j = 0;
  public static final int k = 1;
  public static final int l = 2;
  private final String A;
  private final e m;
  private final int n;
  private final int o;
  private final int p;
  private final int q;
  private final int r;
  private final int s;
  private final int t;
  private final int u;
  private final String v;
  private final int w;
  private final String x;
  private final int y;
  private final int z;
  
  private b(a parama)
  {
    this.n = a.a(parama);
    this.o = a.b(parama);
    this.p = a.c(parama);
    this.q = a.d(parama);
    this.r = a.e(parama);
    this.s = a.f(parama);
    this.t = a.g(parama);
    this.u = a.h(parama);
    this.v = a.i(parama);
    this.w = a.j(parama);
    this.x = a.k(parama);
    this.y = a.l(parama);
    this.z = a.m(parama);
    this.A = a.n(parama);
    this.m = new e(a.o(parama), this);
  }
  
  public int a()
  {
    return this.n;
  }
  
  @Deprecated
  public <T extends m> T a(Class<T> paramClass)
  {
    return this.m.a(paramClass);
  }
  
  public boolean a(Context paramContext)
  {
    return this.m.a(paramContext);
  }
  
  public int b()
  {
    return this.o;
  }
  
  public <T extends com.google.android.gms.ads.mediation.b> Bundle b(Class<T> paramClass)
  {
    return this.m.b(paramClass);
  }
  
  public int c()
  {
    return this.p;
  }
  
  public <T extends a> Bundle c(Class<T> paramClass)
  {
    return this.m.c(paramClass);
  }
  
  public int d()
  {
    return this.q;
  }
  
  public int e()
  {
    return this.r;
  }
  
  public int f()
  {
    return this.s;
  }
  
  public int g()
  {
    return this.t;
  }
  
  public int h()
  {
    return this.u;
  }
  
  public String i()
  {
    return this.v;
  }
  
  public int j()
  {
    return this.w;
  }
  
  public String k()
  {
    return this.x;
  }
  
  public int l()
  {
    return this.y;
  }
  
  public int m()
  {
    return this.z;
  }
  
  public Location n()
  {
    return this.m.e();
  }
  
  public String o()
  {
    return this.A;
  }
  
  e p()
  {
    return this.m;
  }
  
  public static final class a
  {
    private final e.a a = new e.a();
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h = 0;
    private int i;
    private String j;
    private int k;
    private String l;
    private int m;
    private int n;
    private String o;
    
    public a a(int paramInt)
    {
      this.b = paramInt;
      return this;
    }
    
    public a a(int paramInt1, int paramInt2)
    {
      this.c = Color.argb(0, 0, 0, 0);
      this.d = paramInt2;
      this.e = paramInt1;
      return this;
    }
    
    public a a(Location paramLocation)
    {
      this.a.a(paramLocation);
      return this;
    }
    
    public a a(m paramm)
    {
      this.a.a(paramm);
      return this;
    }
    
    public a a(Class<? extends com.google.android.gms.ads.mediation.b> paramClass, Bundle paramBundle)
    {
      this.a.a(paramClass, paramBundle);
      return this;
    }
    
    public a a(String paramString)
    {
      this.a.b(paramString);
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      this.a.b(paramBoolean);
      return this;
    }
    
    public b a()
    {
      return new b(this, null);
    }
    
    public a b(int paramInt)
    {
      this.c = paramInt;
      this.d = Color.argb(0, 0, 0, 0);
      this.e = Color.argb(0, 0, 0, 0);
      return this;
    }
    
    public a b(Class<? extends a> paramClass, Bundle paramBundle)
    {
      this.a.b(paramClass, paramBundle);
      return this;
    }
    
    public a b(String paramString)
    {
      this.j = paramString;
      return this;
    }
    
    public a c(int paramInt)
    {
      this.f = paramInt;
      return this;
    }
    
    public a c(String paramString)
    {
      this.l = paramString;
      return this;
    }
    
    public a d(int paramInt)
    {
      this.g = paramInt;
      return this;
    }
    
    public a d(String paramString)
    {
      this.o = paramString;
      return this;
    }
    
    public a e(int paramInt)
    {
      this.h = paramInt;
      return this;
    }
    
    public a e(String paramString)
    {
      this.a.f(paramString);
      return this;
    }
    
    public a f(int paramInt)
    {
      this.i = paramInt;
      return this;
    }
    
    public a g(int paramInt)
    {
      this.k = paramInt;
      return this;
    }
    
    public a h(int paramInt)
    {
      this.m = paramInt;
      return this;
    }
    
    public a i(int paramInt)
    {
      this.n = paramInt;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/search/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */