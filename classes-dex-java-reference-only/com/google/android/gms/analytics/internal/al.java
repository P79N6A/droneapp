package com.google.android.gms.analytics.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;

public class al
  extends t
{
  private boolean a;
  private boolean b;
  private AlarmManager c = (AlarmManager)o().getSystemService("alarm");
  
  protected al(v paramv)
  {
    super(paramv);
  }
  
  private PendingIntent f()
  {
    Intent localIntent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
    localIntent.setComponent(new ComponentName(o(), "com.google.android.gms.analytics.AnalyticsReceiver"));
    return PendingIntent.getBroadcast(o(), 0, localIntent, 0);
  }
  
  protected void a()
  {
    try
    {
      this.c.cancel(f());
      if (q().j() > 0L)
      {
        ActivityInfo localActivityInfo = o().getPackageManager().getReceiverInfo(new ComponentName(o(), "com.google.android.gms.analytics.AnalyticsReceiver"), 2);
        if ((localActivityInfo != null) && (localActivityInfo.enabled))
        {
          q("Receiver registered. Using alarm for local dispatch.");
          this.a = true;
        }
      }
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
  }
  
  public boolean b()
  {
    return this.a;
  }
  
  public boolean c()
  {
    return this.b;
  }
  
  public void d()
  {
    D();
    d.a(b(), "Receiver not registered");
    long l1 = q().j();
    if (l1 > 0L)
    {
      e();
      long l2 = n().b();
      this.b = true;
      this.c.setInexactRepeating(2, l2 + l1, 0L, f());
    }
  }
  
  public void e()
  {
    D();
    this.b = false;
    this.c.cancel(f());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */