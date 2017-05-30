package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.e;
import com.google.android.gms.ads.internal.client.e.a;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.customevent.a;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.common.internal.ak;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class d
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  public static final int e = 0;
  public static final int f = 1;
  public static final int g = 2;
  public static final String h = e.a;
  private final e i;
  
  private d(a parama)
  {
    this.i = new e(a.a(parama));
  }
  
  public static void i() {}
  
  @Deprecated
  public <T extends m> T a(Class<T> paramClass)
  {
    return this.i.a(paramClass);
  }
  
  public Date a()
  {
    return this.i.a();
  }
  
  public boolean a(Context paramContext)
  {
    return this.i.a(paramContext);
  }
  
  public <T extends b> Bundle b(Class<T> paramClass)
  {
    return this.i.b(paramClass);
  }
  
  public String b()
  {
    return this.i.b();
  }
  
  public int c()
  {
    return this.i.c();
  }
  
  public <T extends a> Bundle c(Class<T> paramClass)
  {
    return this.i.c(paramClass);
  }
  
  public Set<String> d()
  {
    return this.i.d();
  }
  
  public Location e()
  {
    return this.i.e();
  }
  
  public boolean f()
  {
    return this.i.f();
  }
  
  public String g()
  {
    return this.i.g();
  }
  
  public Bundle h()
  {
    return this.i.m();
  }
  
  public e j()
  {
    return this.i;
  }
  
  public static final class a
  {
    private final e.a a = new e.a();
    
    public a a(int paramInt)
    {
      this.a.a(paramInt);
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
    
    public a a(Class<? extends b> paramClass, Bundle paramBundle)
    {
      this.a.a(paramClass, paramBundle);
      return this;
    }
    
    public a a(String paramString)
    {
      this.a.a(paramString);
      return this;
    }
    
    public a a(String paramString1, String paramString2)
    {
      this.a.a(paramString1, paramString2);
      return this;
    }
    
    public a a(String paramString, List<String> paramList)
    {
      if (paramList != null) {
        this.a.a(paramString, ak.a(",").a(paramList));
      }
      return this;
    }
    
    public a a(Date paramDate)
    {
      this.a.a(paramDate);
      return this;
    }
    
    @Deprecated
    public a a(boolean paramBoolean)
    {
      this.a.a(paramBoolean);
      return this;
    }
    
    public d a()
    {
      return new d(this, null);
    }
    
    public a b(Class<? extends a> paramClass, Bundle paramBundle)
    {
      this.a.b(paramClass, paramBundle);
      return this;
    }
    
    public a b(String paramString)
    {
      this.a.b(paramString);
      return this;
    }
    
    public a b(boolean paramBoolean)
    {
      this.a.b(paramBoolean);
      return this;
    }
    
    public a c(String paramString)
    {
      com.google.android.gms.common.internal.d.a(paramString, "Content URL must be non-null.");
      com.google.android.gms.common.internal.d.a(paramString, "Content URL must be non-empty.");
      if (paramString.length() <= 512) {}
      for (boolean bool = true;; bool = false)
      {
        com.google.android.gms.common.internal.d.b(bool, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] { Integer.valueOf(512), Integer.valueOf(paramString.length()) });
        this.a.d(paramString);
        return this;
      }
    }
    
    public a c(boolean paramBoolean)
    {
      this.a.c(paramBoolean);
      return this;
    }
    
    public a d(String paramString)
    {
      this.a.e(paramString);
      return this;
    }
    
    public a e(String paramString)
    {
      this.a.f(paramString);
      return this;
    }
    
    public a f(String paramString)
    {
      this.a.g(paramString);
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/doubleclick/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */