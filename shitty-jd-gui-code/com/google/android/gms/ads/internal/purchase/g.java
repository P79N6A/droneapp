package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.zc.a;

@aaa
public final class g
  extends zc.a
  implements ServiceConnection
{
  b a;
  private boolean b = false;
  private Context c;
  private int d;
  private Intent e;
  private f f;
  private String g;
  
  public g(Context paramContext, String paramString, boolean paramBoolean, int paramInt, Intent paramIntent, f paramf)
  {
    this.g = paramString;
    this.d = paramInt;
    this.e = paramIntent;
    this.b = paramBoolean;
    this.c = paramContext;
    this.f = paramf;
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.g;
  }
  
  public Intent c()
  {
    return this.e;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public void e()
  {
    int i = u.s().a(this.e);
    if ((this.d != -1) || (i != 0)) {
      return;
    }
    this.a = new b(this.c);
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    com.google.android.gms.common.stats.b.a().a(this.c, localIntent, this, 1);
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    abr.c("In-app billing service connected.");
    this.a.a(paramIBinder);
    paramComponentName = u.s().b(this.e);
    paramComponentName = u.s().b(paramComponentName);
    if (paramComponentName == null) {
      return;
    }
    if (this.a.a(this.c.getPackageName(), paramComponentName) == 0) {
      h.a(this.c).a(this.f);
    }
    com.google.android.gms.common.stats.b.a().a(this.c, this);
    this.a.a();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    abr.c("In-app billing service disconnected.");
    this.a.a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/purchase/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */