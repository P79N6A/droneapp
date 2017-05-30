package com.google.android.gms.ads.internal.client;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.b.a;
import com.google.android.gms.ads.internal.reward.client.d;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;

public class o
  extends b.a
{
  private d a;
  
  public void a() {}
  
  public void a(RewardedVideoAdRequestParcel paramRewardedVideoAdRequestParcel)
  {
    b.b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
    a.a.post(new Runnable()
    {
      public void run()
      {
        if (o.a(o.this) != null) {}
        try
        {
          o.a(o.this).a(1);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          b.d("Could not notify onRewardedVideoAdFailedToLoad event.", localRemoteException);
        }
      }
    });
  }
  
  public void a(d paramd)
  {
    this.a = paramd;
  }
  
  public void a(e parame) {}
  
  public void a(String paramString) {}
  
  public void b(e parame) {}
  
  public boolean b()
  {
    return false;
  }
  
  public void c() {}
  
  public void c(e parame) {}
  
  public void d() {}
  
  public void e() {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */