package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.util.client.a;

public final class d
{
  public static final int a = -1;
  public static final int b = -2;
  public static final d c = new d(320, 50, "320x50_mb");
  public static final d d = new d(468, 60, "468x60_as");
  public static final d e = new d(320, 100, "320x100_as");
  public static final d f = new d(728, 90, "728x90_as");
  public static final d g = new d(300, 250, "300x250_as");
  public static final d h = new d(160, 600, "160x600_as");
  public static final d i = new d(-1, -2, "smart_banner");
  public static final d j = new d(-3, -4, "fluid");
  public static final d k = new d(-3, 0, "search_v2");
  private final int l;
  private final int m;
  private final String n;
  
  public d(int paramInt1, int paramInt2) {}
  
  d(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 < 0) && (paramInt1 != -1) && (paramInt1 != -3)) {
      throw new IllegalArgumentException(37 + "Invalid width for AdSize: " + paramInt1);
    }
    if ((paramInt2 < 0) && (paramInt2 != -2) && (paramInt2 != -4)) {
      throw new IllegalArgumentException(38 + "Invalid height for AdSize: " + paramInt2);
    }
    this.l = paramInt1;
    this.m = paramInt2;
    this.n = paramString;
  }
  
  public int a()
  {
    return this.m;
  }
  
  public int a(Context paramContext)
  {
    switch (this.m)
    {
    default: 
      return ac.a().a(paramContext, this.m);
    case -2: 
      return AdSizeParcel.b(paramContext.getResources().getDisplayMetrics());
    }
    return -1;
  }
  
  public int b()
  {
    return this.l;
  }
  
  public int b(Context paramContext)
  {
    switch (this.l)
    {
    case -2: 
    default: 
      return ac.a().a(paramContext, this.l);
    case -1: 
      return AdSizeParcel.a(paramContext.getResources().getDisplayMetrics());
    }
    return -1;
  }
  
  public boolean c()
  {
    return this.m == -2;
  }
  
  public boolean d()
  {
    return this.l == -1;
  }
  
  public boolean e()
  {
    return (this.l == -3) && (this.m == -4);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof d)) {
        return false;
      }
      paramObject = (d)paramObject;
    } while ((this.l == ((d)paramObject).l) && (this.m == ((d)paramObject).m) && (this.n.equals(((d)paramObject).n)));
    return false;
  }
  
  public int hashCode()
  {
    return this.n.hashCode();
  }
  
  public String toString()
  {
    return this.n;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */