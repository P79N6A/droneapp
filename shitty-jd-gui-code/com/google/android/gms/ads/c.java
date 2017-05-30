package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.e;
import com.google.android.gms.ads.internal.client.e.a;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.customevent.a;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.common.internal.d;
import java.util.Date;
import java.util.Set;

public final class c
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  public static final int e = 0;
  public static final int f = 1;
  public static final int g = 2;
  public static final int h = 512;
  public static final String i = e.a;
  private final e j;
  
  private c(a parama)
  {
    this.j = new e(a.a(parama));
  }
  
  @Deprecated
  public <T extends m> T a(Class<T> paramClass)
  {
    return this.j.a(paramClass);
  }
  
  public Date a()
  {
    return this.j.a();
  }
  
  public boolean a(Context paramContext)
  {
    return this.j.a(paramContext);
  }
  
  public <T extends b> Bundle b(Class<T> paramClass)
  {
    return this.j.b(paramClass);
  }
  
  public String b()
  {
    return this.j.b();
  }
  
  public int c()
  {
    return this.j.c();
  }
  
  public <T extends a> Bundle c(Class<T> paramClass)
  {
    return this.j.c(paramClass);
  }
  
  public Set<String> d()
  {
    return this.j.d();
  }
  
  public Location e()
  {
    return this.j.e();
  }
  
  public e f()
  {
    return this.j;
  }
  
  public static final class a
  {
    private final e.a a = new e.a();
    
    public a()
    {
      this.a.b(c.i);
    }
    
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
      if ((paramClass.equals(AdMobAdapter.class)) && (paramBundle.getBoolean("_emulatorLiveAds"))) {
        this.a.c(c.i);
      }
      return this;
    }
    
    public a a(String paramString)
    {
      this.a.a(paramString);
      return this;
    }
    
    public a a(Date paramDate)
    {
      this.a.a(paramDate);
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      this.a.b(paramBoolean);
      return this;
    }
    
    public c a()
    {
      return new c(this, null);
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
      this.a.c(paramBoolean);
      return this;
    }
    
    public a c(String paramString)
    {
      d.a(paramString, "Content URL must be non-null.");
      d.a(paramString, "Content URL must be non-empty.");
      if (paramString.length() <= 512) {}
      for (boolean bool = true;; bool = false)
      {
        d.b(bool, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] { Integer.valueOf(512), Integer.valueOf(paramString.length()) });
        this.a.d(paramString);
        return this;
      }
    }
    
    public a d(String paramString)
    {
      this.a.f(paramString);
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */