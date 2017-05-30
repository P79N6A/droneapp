package com.google.android.gms.ads.internal.cache;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.p.b;
import com.google.android.gms.common.internal.p.c;
import com.google.android.gms.internal.aaa;

@aaa
public class c
  extends p<f>
{
  c(Context paramContext, Looper paramLooper, p.b paramb, p.c paramc)
  {
    super(paramContext, paramLooper, 123, paramb, paramc, null);
  }
  
  protected f a(IBinder paramIBinder)
  {
    return f.a.a(paramIBinder);
  }
  
  protected String a()
  {
    return "com.google.android.gms.ads.service.CACHE";
  }
  
  public f a_()
  {
    return (f)super.G();
  }
  
  protected String b()
  {
    return "com.google.android.gms.ads.internal.cache.ICacheService";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/cache/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */