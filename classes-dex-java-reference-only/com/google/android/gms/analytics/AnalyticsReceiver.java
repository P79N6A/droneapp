package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.analytics.internal.k;

public final class AnalyticsReceiver
  extends BroadcastReceiver
{
  private k a;
  
  private k a()
  {
    if (this.a == null) {
      this.a = new k();
    }
    return this.a;
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    a().a(paramContext, paramIntent);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/AnalyticsReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */