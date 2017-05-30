package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.c.e;
import com.google.android.gms.c.h;
import com.google.android.gms.c.h.a;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.xq;

@aaa
public class f
  extends h<c>
{
  public f()
  {
    super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
  }
  
  public b a(Context paramContext, xq paramxq)
  {
    try
    {
      e locale = com.google.android.gms.c.f.a(paramContext);
      paramContext = b.a.a(((c)b(paramContext)).a(locale, paramxq, 9683000));
      return paramContext;
    }
    catch (RemoteException paramContext)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not get remote RewardedVideoAd.", paramContext);
      return null;
    }
    catch (h.a paramContext)
    {
      for (;;) {}
    }
  }
  
  protected c a(IBinder paramIBinder)
  {
    return c.a.a(paramIBinder);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/reward/client/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */