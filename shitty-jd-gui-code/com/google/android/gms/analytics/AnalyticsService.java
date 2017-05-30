package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.analytics.internal.l;
import com.google.android.gms.analytics.internal.l.a;

public final class AnalyticsService
  extends Service
  implements l.a
{
  private l a;
  
  private l b()
  {
    if (this.a == null) {
      this.a = new l(this);
    }
    return this.a;
  }
  
  public Context a()
  {
    return this;
  }
  
  public boolean a(int paramInt)
  {
    return stopSelfResult(paramInt);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return b().a(paramIntent);
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public void onCreate()
  {
    super.onCreate();
    b().a();
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public void onDestroy()
  {
    b().b();
    super.onDestroy();
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return b().a(paramIntent, paramInt1, paramInt2);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/AnalyticsService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */