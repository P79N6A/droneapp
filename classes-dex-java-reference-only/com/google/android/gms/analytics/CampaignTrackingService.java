package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.ah;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aon;

public class CampaignTrackingService
  extends Service
{
  private static Boolean b;
  private Handler a;
  
  private void a()
  {
    try
    {
      synchronized (CampaignTrackingReceiver.a)
      {
        aon localaon = CampaignTrackingReceiver.b;
        if ((localaon != null) && (localaon.b())) {
          localaon.a();
        }
        return;
      }
      return;
    }
    catch (SecurityException localSecurityException) {}
  }
  
  public static boolean a(Context paramContext)
  {
    d.a(paramContext);
    if (b != null) {
      return b.booleanValue();
    }
    boolean bool = com.google.android.gms.analytics.internal.p.a(paramContext, "com.google.android.gms.analytics.CampaignTrackingService");
    b = Boolean.valueOf(bool);
    return bool;
  }
  
  private Handler b()
  {
    Handler localHandler2 = this.a;
    Handler localHandler1 = localHandler2;
    if (localHandler2 == null)
    {
      localHandler1 = new Handler(getMainLooper());
      this.a = localHandler1;
    }
    return localHandler1;
  }
  
  protected void a(final g paramg, Handler paramHandler, final int paramInt)
  {
    paramHandler.post(new Runnable()
    {
      public void run()
      {
        boolean bool = CampaignTrackingService.this.stopSelfResult(paramInt);
        if (bool) {
          paramg.a("Install campaign broadcast processed", Boolean.valueOf(bool));
        }
      }
    });
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public void onCreate()
  {
    super.onCreate();
    v.a(this).f().q("CampaignTrackingService is starting up");
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public void onDestroy()
  {
    v.a(this).f().q("CampaignTrackingService is shutting down");
    super.onDestroy();
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public int onStartCommand(Intent paramIntent, int paramInt1, final int paramInt2)
  {
    a();
    v localv = v.a(this);
    final g localg = localv.f();
    final Handler localHandler = null;
    if (localv.e().a()) {
      localg.u("Unexpected installation campaign (package side)");
    }
    for (paramIntent = localHandler;; paramIntent = paramIntent.getStringExtra("referrer"))
    {
      localHandler = b();
      if (!TextUtils.isEmpty(paramIntent)) {
        break;
      }
      if (!localv.e().a()) {
        localg.t("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
      }
      localv.h().a(new Runnable()
      {
        public void run()
        {
          CampaignTrackingService.this.a(localg, localHandler, paramInt2);
        }
      });
      return 2;
    }
    paramInt1 = localv.e().e();
    if (paramIntent.length() <= paramInt1) {}
    for (;;)
    {
      localg.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(paramInt2), paramIntent);
      localv.i().a(paramIntent, new Runnable()
      {
        public void run()
        {
          CampaignTrackingService.this.a(localg, localHandler, paramInt2);
        }
      });
      return 2;
      localg.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(paramIntent.length()), Integer.valueOf(paramInt1));
      paramIntent = paramIntent.substring(0, paramInt1);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/CampaignTrackingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */