package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.u;

@aaa
public class abm
{
  long a = -1L;
  long b = -1L;
  int c = -1;
  int d = -1;
  final String e;
  int f = 0;
  int g = 0;
  private final Object h = new Object();
  
  public abm(String paramString)
  {
    this.e = paramString;
  }
  
  public static boolean a(Context paramContext)
  {
    int i = paramContext.getResources().getIdentifier("Theme.Translucent", "style", "android");
    if (i == 0)
    {
      abr.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    }
    ComponentName localComponentName = new ComponentName(paramContext.getPackageName(), "com.google.android.gms.ads.AdActivity");
    try
    {
      if (i == paramContext.getPackageManager().getActivityInfo(localComponentName, 0).theme) {
        return true;
      }
      abr.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      abr.d("Fail to fetch AdActivity theme");
      abr.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
    }
    return false;
  }
  
  public long a()
  {
    return this.b;
  }
  
  public Bundle a(Context paramContext, String paramString)
  {
    synchronized (this.h)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("session_id", this.e);
      localBundle.putLong("basets", this.b);
      localBundle.putLong("currts", this.a);
      localBundle.putString("seq_num", paramString);
      localBundle.putInt("preqs", this.c);
      localBundle.putInt("preqs_in_session", this.d);
      localBundle.putInt("pclick", this.f);
      localBundle.putInt("pimp", this.g);
      localBundle.putBoolean("support_transparent_background", a(paramContext));
      return localBundle;
    }
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a(AdRequestParcel paramAdRequestParcel, long paramLong)
  {
    for (;;)
    {
      synchronized (this.h)
      {
        if (this.b == -1L)
        {
          if (paramLong - u.i().l() > ((Long)uf.aq.c()).longValue())
          {
            a(-1);
            this.b = paramLong;
            this.a = this.b;
            if ((paramAdRequestParcel.c == null) || (paramAdRequestParcel.c.getInt("gw", 2) != 1)) {
              break;
            }
            return;
          }
          a(u.i().m());
        }
      }
      this.a = paramLong;
    }
    this.c += 1;
    this.d += 1;
  }
  
  public void b()
  {
    synchronized (this.h)
    {
      this.f += 1;
      return;
    }
  }
  
  public void c()
  {
    synchronized (this.h)
    {
      this.g += 1;
      return;
    }
  }
  
  public int d()
  {
    return this.d;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/abm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */