package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.ah;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aon;

public class CampaignTrackingReceiver
  extends BroadcastReceiver
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
    boolean bool = p.a(paramContext, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
    c = Boolean.valueOf(bool);
    return bool;
  }
  
  protected Class<? extends CampaignTrackingService> a()
  {
    return CampaignTrackingService.class;
  }
  
  protected void a(Context paramContext, String paramString) {}
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public void onReceive(Context paramContext, Intent arg2)
  {
    Object localObject = v.a(paramContext);
    localg = ((v)localObject).f();
    if (??? == null)
    {
      localg.t("CampaignTrackingReceiver received null intent");
      return;
    }
    String str = ???.getStringExtra("referrer");
    ??? = ???.getAction();
    localg.a("CampaignTrackingReceiver received", ???);
    if ((!"com.android.vending.INSTALL_REFERRER".equals(???)) || (TextUtils.isEmpty(str)))
    {
      localg.t("CampaignTrackingReceiver received unexpected intent without referrer extra");
      return;
    }
    boolean bool = CampaignTrackingService.a(paramContext);
    if (!bool) {
      localg.t("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
    }
    a(paramContext, str);
    if (((v)localObject).e().a())
    {
      localg.u("Received unexpected installation campaign on package side");
      return;
    }
    ??? = a();
    d.a(???);
    localObject = new Intent(paramContext, ???);
    ((Intent)localObject).putExtra("referrer", str);
    synchronized (a)
    {
      paramContext.startService((Intent)localObject);
      if (!bool) {
        return;
      }
    }
    try
    {
      if (b == null)
      {
        b = new aon(paramContext, 1, "Analytics campaign WakeLock");
        b.a(false);
      }
      b.a(1000L);
    }
    catch (SecurityException paramContext)
    {
      for (;;)
      {
        localg.t("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/CampaignTrackingReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */