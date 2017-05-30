package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.i;

@aaa
public final class xy
  implements com.google.android.gms.ads.mediation.d, f, h
{
  private final xs a;
  private i b;
  
  public xy(xs paramxs)
  {
    this.a = paramxs;
  }
  
  public i a()
  {
    return this.b;
  }
  
  public void a(c paramc)
  {
    com.google.android.gms.common.internal.d.b("onAdLoaded must be called on the main UI thread.");
    b.a("Adapter called onAdLoaded.");
    try
    {
      this.a.e();
      return;
    }
    catch (RemoteException paramc)
    {
      b.d("Could not call onAdLoaded.", paramc);
    }
  }
  
  public void a(c paramc, int paramInt)
  {
    com.google.android.gms.common.internal.d.b("onAdFailedToLoad must be called on the main UI thread.");
    b.a(55 + "Adapter called onAdFailedToLoad with error. " + paramInt);
    try
    {
      this.a.a(paramInt);
      return;
    }
    catch (RemoteException paramc)
    {
      b.d("Could not call onAdFailedToLoad.", paramc);
    }
  }
  
  public void a(e parame)
  {
    com.google.android.gms.common.internal.d.b("onAdLoaded must be called on the main UI thread.");
    b.a("Adapter called onAdLoaded.");
    try
    {
      this.a.e();
      return;
    }
    catch (RemoteException parame)
    {
      b.d("Could not call onAdLoaded.", parame);
    }
  }
  
  public void a(e parame, int paramInt)
  {
    com.google.android.gms.common.internal.d.b("onAdFailedToLoad must be called on the main UI thread.");
    b.a(55 + "Adapter called onAdFailedToLoad with error " + paramInt + ".");
    try
    {
      this.a.a(paramInt);
      return;
    }
    catch (RemoteException parame)
    {
      b.d("Could not call onAdFailedToLoad.", parame);
    }
  }
  
  public void a(g paramg)
  {
    com.google.android.gms.common.internal.d.b("onAdOpened must be called on the main UI thread.");
    b.a("Adapter called onAdOpened.");
    try
    {
      this.a.d();
      return;
    }
    catch (RemoteException paramg)
    {
      b.d("Could not call onAdOpened.", paramg);
    }
  }
  
  public void a(g paramg, int paramInt)
  {
    com.google.android.gms.common.internal.d.b("onAdFailedToLoad must be called on the main UI thread.");
    b.a(55 + "Adapter called onAdFailedToLoad with error " + paramInt + ".");
    try
    {
      this.a.a(paramInt);
      return;
    }
    catch (RemoteException paramg)
    {
      b.d("Could not call onAdFailedToLoad.", paramg);
    }
  }
  
  public void a(g paramg, i parami)
  {
    com.google.android.gms.common.internal.d.b("onAdLoaded must be called on the main UI thread.");
    b.a("Adapter called onAdLoaded.");
    this.b = parami;
    try
    {
      this.a.e();
      return;
    }
    catch (RemoteException paramg)
    {
      b.d("Could not call onAdLoaded.", paramg);
    }
  }
  
  public void b(c paramc)
  {
    com.google.android.gms.common.internal.d.b("onAdOpened must be called on the main UI thread.");
    b.a("Adapter called onAdOpened.");
    try
    {
      this.a.d();
      return;
    }
    catch (RemoteException paramc)
    {
      b.d("Could not call onAdOpened.", paramc);
    }
  }
  
  public void b(e parame)
  {
    com.google.android.gms.common.internal.d.b("onAdOpened must be called on the main UI thread.");
    b.a("Adapter called onAdOpened.");
    try
    {
      this.a.d();
      return;
    }
    catch (RemoteException parame)
    {
      b.d("Could not call onAdOpened.", parame);
    }
  }
  
  public void b(g paramg)
  {
    com.google.android.gms.common.internal.d.b("onAdClosed must be called on the main UI thread.");
    b.a("Adapter called onAdClosed.");
    try
    {
      this.a.b();
      return;
    }
    catch (RemoteException paramg)
    {
      b.d("Could not call onAdClosed.", paramg);
    }
  }
  
  public void c(c paramc)
  {
    com.google.android.gms.common.internal.d.b("onAdClosed must be called on the main UI thread.");
    b.a("Adapter called onAdClosed.");
    try
    {
      this.a.b();
      return;
    }
    catch (RemoteException paramc)
    {
      b.d("Could not call onAdClosed.", paramc);
    }
  }
  
  public void c(e parame)
  {
    com.google.android.gms.common.internal.d.b("onAdClosed must be called on the main UI thread.");
    b.a("Adapter called onAdClosed.");
    try
    {
      this.a.b();
      return;
    }
    catch (RemoteException parame)
    {
      b.d("Could not call onAdClosed.", parame);
    }
  }
  
  public void c(g paramg)
  {
    com.google.android.gms.common.internal.d.b("onAdLeftApplication must be called on the main UI thread.");
    b.a("Adapter called onAdLeftApplication.");
    try
    {
      this.a.c();
      return;
    }
    catch (RemoteException paramg)
    {
      b.d("Could not call onAdLeftApplication.", paramg);
    }
  }
  
  public void d(c paramc)
  {
    com.google.android.gms.common.internal.d.b("onAdLeftApplication must be called on the main UI thread.");
    b.a("Adapter called onAdLeftApplication.");
    try
    {
      this.a.c();
      return;
    }
    catch (RemoteException paramc)
    {
      b.d("Could not call onAdLeftApplication.", paramc);
    }
  }
  
  public void d(e parame)
  {
    com.google.android.gms.common.internal.d.b("onAdLeftApplication must be called on the main UI thread.");
    b.a("Adapter called onAdLeftApplication.");
    try
    {
      this.a.c();
      return;
    }
    catch (RemoteException parame)
    {
      b.d("Could not call onAdLeftApplication.", parame);
    }
  }
  
  public void d(g paramg)
  {
    com.google.android.gms.common.internal.d.b("onAdClicked must be called on the main UI thread.");
    paramg = a();
    if (paramg == null)
    {
      b.d("Could not call onAdClicked since NativeAdMapper is null.");
      return;
    }
    if (!paramg.b())
    {
      b.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
      return;
    }
    b.a("Adapter called onAdClicked.");
    try
    {
      this.a.a();
      return;
    }
    catch (RemoteException paramg)
    {
      b.d("Could not call onAdClicked.", paramg);
    }
  }
  
  public void e(c paramc)
  {
    com.google.android.gms.common.internal.d.b("onAdClicked must be called on the main UI thread.");
    b.a("Adapter called onAdClicked.");
    try
    {
      this.a.a();
      return;
    }
    catch (RemoteException paramc)
    {
      b.d("Could not call onAdClicked.", paramc);
    }
  }
  
  public void e(e parame)
  {
    com.google.android.gms.common.internal.d.b("onAdClicked must be called on the main UI thread.");
    b.a("Adapter called onAdClicked.");
    try
    {
      this.a.a();
      return;
    }
    catch (RemoteException parame)
    {
      b.d("Could not call onAdClicked.", parame);
    }
  }
  
  public void e(g paramg)
  {
    com.google.android.gms.common.internal.d.b("onAdImpression must be called on the main UI thread.");
    paramg = a();
    if (paramg == null)
    {
      b.d("Could not call onAdImpression since NativeAdMapper is null. ");
      return;
    }
    if (!paramg.a())
    {
      b.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
      return;
    }
    b.a("Adapter called onAdImpression.");
    try
    {
      this.a.f();
      return;
    }
    catch (RemoteException paramg)
    {
      b.d("Could not call onAdImpression.", paramg);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/xy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */