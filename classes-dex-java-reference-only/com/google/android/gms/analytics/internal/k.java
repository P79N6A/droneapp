package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aon;

public final class k
{
  static Object a = new Object();
  static aon b;
  static Boolean c;
  
  public static boolean a(Context paramContext)
  {
    d.a(paramContext);
    if (c != null) {
      return c.booleanValue();
    }
    boolean bool = p.a(paramContext, "com.google.android.gms.analytics.AnalyticsReceiver", false);
    c = Boolean.valueOf(bool);
    return bool;
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public void a(Context paramContext, Intent arg2)
  {
    Object localObject = v.a(paramContext);
    localg = ((v)localObject).f();
    if (??? == null) {
      localg.t("AnalyticsReceiver called with null intent");
    }
    for (;;)
    {
      return;
      ??? = ???.getAction();
      if (((v)localObject).e().a()) {
        localg.a("Device AnalyticsReceiver got", ???);
      }
      while ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(???))
      {
        boolean bool = l.a(paramContext);
        localObject = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        ((Intent)localObject).setComponent(new ComponentName(paramContext, "com.google.android.gms.analytics.AnalyticsService"));
        ((Intent)localObject).setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        synchronized (a)
        {
          paramContext.startService((Intent)localObject);
          if (bool) {
            break label134;
          }
          return;
        }
        localg.a("Local AnalyticsReceiver got", ???);
      }
    }
    try
    {
      label134:
      if (b == null)
      {
        b = new aon(paramContext, 1, "Analytics WakeLock");
        b.a(false);
      }
      b.a(1000L);
    }
    catch (SecurityException paramContext)
    {
      for (;;)
      {
        localg.t("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */