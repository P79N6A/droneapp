package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.y;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;

@aaa
public class i
  implements com.google.android.gms.ads.b.b
{
  private final b a;
  private final Context b;
  private final Object c = new Object();
  private com.google.android.gms.ads.b.c d;
  
  public i(Context paramContext, b paramb)
  {
    this.a = paramb;
    this.b = paramContext;
  }
  
  public void a()
  {
    synchronized (this.c)
    {
      if (this.a == null) {
        return;
      }
    }
    try
    {
      this.a.a();
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Could not forward show to RewardedVideoAd", localRemoteException);
      }
    }
  }
  
  public void a(Context paramContext)
  {
    synchronized (this.c)
    {
      if (this.a == null) {
        return;
      }
    }
    try
    {
      this.a.a(f.a(paramContext));
      return;
      paramContext = finally;
      throw paramContext;
    }
    catch (RemoteException paramContext)
    {
      for (;;)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Could not forward pause to RewardedVideoAd", paramContext);
      }
    }
  }
  
  public void a(com.google.android.gms.ads.b.c paramc)
  {
    synchronized (this.c)
    {
      this.d = paramc;
      b localb = this.a;
      if (localb != null) {}
      try
      {
        this.a.a(new g(paramc));
        return;
      }
      catch (RemoteException paramc)
      {
        for (;;)
        {
          com.google.android.gms.ads.internal.util.client.b.d("Could not forward setRewardedVideoAdListener to RewardedVideoAd", paramc);
        }
      }
    }
  }
  
  public void a(String paramString)
  {
    com.google.android.gms.ads.internal.util.client.b.d("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
  }
  
  public void a(String paramString, com.google.android.gms.ads.c paramc)
  {
    synchronized (this.c)
    {
      if (this.a == null) {
        return;
      }
    }
    try
    {
      this.a.a(y.a().a(this.b, paramc.f(), paramString));
      return;
      paramString = finally;
      throw paramString;
    }
    catch (RemoteException paramString)
    {
      for (;;)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Could not forward loadAd to RewardedVideoAd", paramString);
      }
    }
  }
  
  public void b(Context paramContext)
  {
    synchronized (this.c)
    {
      if (this.a == null) {
        return;
      }
    }
    try
    {
      this.a.b(f.a(paramContext));
      return;
      paramContext = finally;
      throw paramContext;
    }
    catch (RemoteException paramContext)
    {
      for (;;)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Could not forward resume to RewardedVideoAd", paramContext);
      }
    }
  }
  
  public boolean b()
  {
    boolean bool;
    synchronized (this.c)
    {
      if (this.a == null) {
        return false;
      }
    }
    return false;
  }
  
  public void c()
  {
    a(null);
  }
  
  public void c(Context paramContext)
  {
    synchronized (this.c)
    {
      if (this.a == null) {
        return;
      }
    }
    try
    {
      this.a.c(f.a(paramContext));
      return;
      paramContext = finally;
      throw paramContext;
    }
    catch (RemoteException paramContext)
    {
      for (;;)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Could not forward destroy to RewardedVideoAd", paramContext);
      }
    }
  }
  
  public void d()
  {
    b(null);
  }
  
  public void e()
  {
    c(null);
  }
  
  public com.google.android.gms.ads.b.c f()
  {
    synchronized (this.c)
    {
      com.google.android.gms.ads.b.c localc = this.d;
      return localc;
    }
  }
  
  public String g()
  {
    com.google.android.gms.ads.internal.util.client.b.d("RewardedVideoAd.getUserId() is deprecated. Please do not call this method.");
    return null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/reward/client/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */