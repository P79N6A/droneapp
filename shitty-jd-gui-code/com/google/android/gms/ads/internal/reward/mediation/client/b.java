package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.RemoteException;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;

@aaa
public class b
  implements com.google.android.gms.ads.b.a.b
{
  private final a a;
  
  public b(a parama)
  {
    this.a = parama;
  }
  
  public void a(com.google.android.gms.ads.b.a.a parama)
  {
    d.b("onInitializationSucceeded must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.b.a("Adapter called onInitializationSucceeded.");
    try
    {
      this.a.a(f.a(parama));
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not call onInitializationSucceeded.", parama);
    }
  }
  
  public void a(com.google.android.gms.ads.b.a.a parama, int paramInt)
  {
    d.b("onInitializationFailed must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.b.a("Adapter called onInitializationFailed.");
    try
    {
      this.a.a(f.a(parama), paramInt);
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not call onInitializationFailed.", parama);
    }
  }
  
  public void a(com.google.android.gms.ads.b.a.a parama, com.google.android.gms.ads.b.a parama1)
  {
    d.b("onRewarded must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.b.a("Adapter called onRewarded.");
    if (parama1 != null) {}
    try
    {
      this.a.a(f.a(parama), new RewardItemParcel(parama1));
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not call onRewarded.", parama);
    }
    this.a.a(f.a(parama), new RewardItemParcel(parama.getClass().getName(), 1));
    return;
  }
  
  public void b(com.google.android.gms.ads.b.a.a parama)
  {
    d.b("onAdLoaded must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.b.a("Adapter called onAdLoaded.");
    try
    {
      this.a.b(f.a(parama));
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not call onAdLoaded.", parama);
    }
  }
  
  public void b(com.google.android.gms.ads.b.a.a parama, int paramInt)
  {
    d.b("onAdFailedToLoad must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.b.a("Adapter called onAdFailedToLoad.");
    try
    {
      this.a.b(f.a(parama), paramInt);
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not call onAdFailedToLoad.", parama);
    }
  }
  
  public void c(com.google.android.gms.ads.b.a.a parama)
  {
    d.b("onAdOpened must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.b.a("Adapter called onAdOpened.");
    try
    {
      this.a.c(f.a(parama));
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not call onAdOpened.", parama);
    }
  }
  
  public void d(com.google.android.gms.ads.b.a.a parama)
  {
    d.b("onVideoStarted must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.b.a("Adapter called onVideoStarted.");
    try
    {
      this.a.d(f.a(parama));
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not call onVideoStarted.", parama);
    }
  }
  
  public void e(com.google.android.gms.ads.b.a.a parama)
  {
    d.b("onAdClosed must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.b.a("Adapter called onAdClosed.");
    try
    {
      this.a.e(f.a(parama));
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not call onAdClosed.", parama);
    }
  }
  
  public void f(com.google.android.gms.ads.b.a.a parama)
  {
    d.b("onAdClicked must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.b.a("Adapter called onAdClicked.");
    try
    {
      this.a.f(f.a(parama));
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not call onAdClicked.", parama);
    }
  }
  
  public void g(com.google.android.gms.ads.b.a.a parama)
  {
    d.b("onAdLeftApplication must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.b.a("Adapter called onAdLeftApplication.");
    try
    {
      this.a.g(f.a(parama));
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not call onAdLeftApplication.", parama);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/reward/mediation/client/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */