package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.a.a;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.ads.mediation.g;
import com.google.ads.mediation.h;
import com.google.ads.mediation.i;
import com.google.ads.mediation.j;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;

@aaa
public final class ye<NETWORK_EXTRAS extends j, SERVER_PARAMETERS extends i>
  implements f, h
{
  private final xs a;
  
  public ye(xs paramxs)
  {
    this.a = paramxs;
  }
  
  public void a(e<?, ?> parame)
  {
    b.a("Adapter called onReceivedAd.");
    if (!ac.a().b())
    {
      b.d("onReceivedAd must be called on the main UI thread.");
      a.a.post(new ye.10(this));
      return;
    }
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
  
  public void a(e<?, ?> parame, a.a parama)
  {
    parame = String.valueOf(parama);
    b.a(String.valueOf(parame).length() + 47 + "Adapter called onFailedToReceiveAd with error. " + parame);
    if (!ac.a().b())
    {
      b.d("onFailedToReceiveAd must be called on the main UI thread.");
      a.a.post(new ye.7(this, parama));
      return;
    }
    try
    {
      this.a.a(yf.a(parama));
      return;
    }
    catch (RemoteException parame)
    {
      b.d("Could not call onAdFailedToLoad.", parame);
    }
  }
  
  public void a(g<?, ?> paramg)
  {
    b.a("Adapter called onReceivedAd.");
    if (!ac.a().b())
    {
      b.d("onReceivedAd must be called on the main UI thread.");
      a.a.post(new ye.5(this));
      return;
    }
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
  
  public void a(g<?, ?> paramg, a.a parama)
  {
    paramg = String.valueOf(parama);
    b.a(String.valueOf(paramg).length() + 47 + "Adapter called onFailedToReceiveAd with error " + paramg + ".");
    if (!ac.a().b())
    {
      b.d("onFailedToReceiveAd must be called on the main UI thread.");
      a.a.post(new ye.2(this, parama));
      return;
    }
    try
    {
      this.a.a(yf.a(parama));
      return;
    }
    catch (RemoteException paramg)
    {
      b.d("Could not call onAdFailedToLoad.", paramg);
    }
  }
  
  public void b(e<?, ?> parame)
  {
    b.a("Adapter called onPresentScreen.");
    if (!ac.a().b())
    {
      b.d("onPresentScreen must be called on the main UI thread.");
      a.a.post(new ye.9(this));
      return;
    }
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
  
  public void b(g<?, ?> paramg)
  {
    b.a("Adapter called onPresentScreen.");
    if (!ac.a().b())
    {
      b.d("onPresentScreen must be called on the main UI thread.");
      a.a.post(new ye.4(this));
      return;
    }
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
  
  public void c(e<?, ?> parame)
  {
    b.a("Adapter called onDismissScreen.");
    if (!ac.a().b())
    {
      b.d("onDismissScreen must be called on the main UI thread.");
      a.a.post(new ye.6(this));
      return;
    }
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
  
  public void c(g<?, ?> paramg)
  {
    b.a("Adapter called onDismissScreen.");
    if (!ac.a().b())
    {
      b.d("onDismissScreen must be called on the main UI thread.");
      a.a.post(new ye.11(this));
      return;
    }
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
  
  public void d(e<?, ?> parame)
  {
    b.a("Adapter called onLeaveApplication.");
    if (!ac.a().b())
    {
      b.d("onLeaveApplication must be called on the main UI thread.");
      a.a.post(new ye.8(this));
      return;
    }
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
  
  public void d(g<?, ?> paramg)
  {
    b.a("Adapter called onLeaveApplication.");
    if (!ac.a().b())
    {
      b.d("onLeaveApplication must be called on the main UI thread.");
      a.a.post(new ye.3(this));
      return;
    }
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
  
  public void e(e<?, ?> parame)
  {
    b.a("Adapter called onClick.");
    if (!ac.a().b())
    {
      b.d("onClick must be called on the main UI thread.");
      a.a.post(new ye.1(this));
      return;
    }
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
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ye.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */