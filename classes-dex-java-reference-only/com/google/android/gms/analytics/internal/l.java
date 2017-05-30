package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aon;

public final class l
{
  private static Boolean d;
  private final Handler a;
  private final a b;
  private final Context c;
  
  public l(a parama)
  {
    this.c = parama.a();
    d.a(this.c);
    this.b = parama;
    this.a = new Handler();
  }
  
  public static boolean a(Context paramContext)
  {
    d.a(paramContext);
    if (d != null) {
      return d.booleanValue();
    }
    boolean bool = p.a(paramContext, "com.google.android.gms.analytics.AnalyticsService");
    d = Boolean.valueOf(bool);
    return bool;
  }
  
  private void c()
  {
    try
    {
      synchronized (k.a)
      {
        aon localaon = k.b;
        if ((localaon != null) && (localaon.b())) {
          localaon.a();
        }
        return;
      }
      return;
    }
    catch (SecurityException localSecurityException) {}
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public int a(Intent paramIntent, int paramInt1, final int paramInt2)
  {
    c();
    final v localv = v.a(this.c);
    final g localg = localv.f();
    if (paramIntent == null) {
      localg.t("AnalyticsService started with null intent");
    }
    for (;;)
    {
      return 2;
      paramIntent = paramIntent.getAction();
      if (localv.e().a()) {
        localg.a("Device AnalyticsService called. startId, action", Integer.valueOf(paramInt2), paramIntent);
      }
      while ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(paramIntent))
      {
        localv.i().a(new am()
        {
          public void a(Throwable paramAnonymousThrowable)
          {
            l.b(l.this).post(new Runnable()
            {
              public void run()
              {
                if (l.a(l.this).a(l.1.this.a))
                {
                  if (l.1.this.b.e().a()) {
                    l.1.this.c.q("Device AnalyticsService processed last dispatch request");
                  }
                }
                else {
                  return;
                }
                l.1.this.c.q("Local AnalyticsService processed last dispatch request");
              }
            });
          }
        });
        return 2;
        localg.a("Local AnalyticsService called. startId, action", Integer.valueOf(paramInt2), paramIntent);
      }
    }
  }
  
  public IBinder a(Intent paramIntent)
  {
    return null;
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public void a()
  {
    v localv = v.a(this.c);
    g localg = localv.f();
    if (localv.e().a())
    {
      localg.q("Device AnalyticsService is starting up");
      return;
    }
    localg.q("Local AnalyticsService is starting up");
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public void b()
  {
    v localv = v.a(this.c);
    g localg = localv.f();
    if (localv.e().a())
    {
      localg.q("Device AnalyticsService is shutting down");
      return;
    }
    localg.q("Local AnalyticsService is shutting down");
  }
  
  public static abstract interface a
  {
    public abstract Context a();
    
    public abstract boolean a(int paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */