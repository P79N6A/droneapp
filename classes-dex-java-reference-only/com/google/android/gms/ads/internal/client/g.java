package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.purchase.d;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.us;
import com.google.android.gms.internal.xp;
import com.google.android.gms.internal.ze;
import com.google.android.gms.internal.zi;

@aaa
public class g
{
  private final xp a = new xp();
  private final Context b;
  private final y c;
  private com.google.android.gms.ads.a d;
  private a e;
  private ak f;
  private String g;
  private String h;
  private com.google.android.gms.ads.doubleclick.a i;
  private d j;
  private com.google.android.gms.ads.purchase.b k;
  private com.google.android.gms.ads.doubleclick.e l;
  private com.google.android.gms.ads.doubleclick.c m;
  private com.google.android.gms.ads.e n;
  private com.google.android.gms.ads.b.c o;
  private boolean p;
  
  public g(Context paramContext)
  {
    this(paramContext, y.a(), null);
  }
  
  public g(Context paramContext, com.google.android.gms.ads.doubleclick.e parame)
  {
    this(paramContext, y.a(), parame);
  }
  
  public g(Context paramContext, y paramy, com.google.android.gms.ads.doubleclick.e parame)
  {
    this.b = paramContext;
    this.c = paramy;
    this.l = parame;
  }
  
  private void b(String paramString)
  {
    if (this.g == null) {
      c(paramString);
    }
    if (this.p) {}
    for (paramString = AdSizeParcel.a();; paramString = new AdSizeParcel())
    {
      this.f = ac.b().b(this.b, paramString, this.g, this.a);
      if (this.d != null) {
        this.f.a(new t(this.d));
      }
      if (this.e != null) {
        this.f.a(new s(this.e));
      }
      if (this.i != null) {
        this.f.a(new aa(this.i));
      }
      if (this.k != null) {
        this.f.a(new ze(this.k));
      }
      if (this.j != null) {
        this.f.a(new zi(this.j), this.h);
      }
      if (this.m != null) {
        this.f.a(new us(this.m));
      }
      if (this.n != null) {
        this.f.a(this.n.b());
      }
      if (this.o != null) {
        this.f.a(new com.google.android.gms.ads.internal.reward.client.g(this.o));
      }
      return;
    }
  }
  
  private void c(String paramString)
  {
    if (this.f == null) {
      throw new IllegalStateException(String.valueOf(paramString).length() + 63 + "The ad unit ID must be set on InterstitialAd before " + paramString + " is called.");
    }
  }
  
  public com.google.android.gms.ads.a a()
  {
    return this.d;
  }
  
  public void a(com.google.android.gms.ads.a parama)
  {
    try
    {
      this.d = parama;
      ak localak;
      if (this.f != null)
      {
        localak = this.f;
        if (parama == null) {
          break label38;
        }
      }
      label38:
      for (parama = new t(parama);; parama = null)
      {
        localak.a(parama);
        return;
      }
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set the AdListener.", parama);
    }
  }
  
  public void a(com.google.android.gms.ads.b.c paramc)
  {
    try
    {
      this.o = paramc;
      ak localak;
      if (this.f != null)
      {
        localak = this.f;
        if (paramc == null) {
          break label38;
        }
      }
      label38:
      for (paramc = new com.google.android.gms.ads.internal.reward.client.g(paramc);; paramc = null)
      {
        localak.a(paramc);
        return;
      }
      return;
    }
    catch (RemoteException paramc)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set the AdListener.", paramc);
    }
  }
  
  public void a(com.google.android.gms.ads.doubleclick.a parama)
  {
    try
    {
      this.i = parama;
      ak localak;
      if (this.f != null)
      {
        localak = this.f;
        if (parama == null) {
          break label38;
        }
      }
      label38:
      for (parama = new aa(parama);; parama = null)
      {
        localak.a(parama);
        return;
      }
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set the AppEventListener.", parama);
    }
  }
  
  public void a(com.google.android.gms.ads.doubleclick.c paramc)
  {
    try
    {
      this.m = paramc;
      ak localak;
      if (this.f != null)
      {
        localak = this.f;
        if (paramc == null) {
          break label38;
        }
      }
      label38:
      for (paramc = new us(paramc);; paramc = null)
      {
        localak.a(paramc);
        return;
      }
      return;
    }
    catch (RemoteException paramc)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set the OnCustomRenderedAdLoadedListener.", paramc);
    }
  }
  
  public void a(com.google.android.gms.ads.e parame)
  {
    this.n = parame;
    try
    {
      if (this.f != null)
      {
        ak localak = this.f;
        if (this.n == null) {}
        for (parame = null;; parame = this.n.b())
        {
          localak.a(parame);
          return;
        }
      }
      return;
    }
    catch (RemoteException parame)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set correlator.", parame);
    }
  }
  
  public void a(a parama)
  {
    try
    {
      this.e = parama;
      ak localak;
      if (this.f != null)
      {
        localak = this.f;
        if (parama == null) {
          break label38;
        }
      }
      label38:
      for (parama = new s(parama);; parama = null)
      {
        localak.a(parama);
        return;
      }
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set the AdClickListener.", parama);
    }
  }
  
  public void a(e parame)
  {
    try
    {
      if (this.f == null) {
        b("loadAd");
      }
      if (this.f.a(this.c.a(this.b, parame))) {
        this.a.a(parame.j());
      }
      return;
    }
    catch (RemoteException parame)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to load ad.", parame);
    }
  }
  
  public void a(com.google.android.gms.ads.purchase.b paramb)
  {
    if (this.j != null) {
      throw new IllegalStateException("Play store purchase parameter has already been set.");
    }
    try
    {
      this.k = paramb;
      ak localak;
      if (this.f != null)
      {
        localak = this.f;
        if (paramb == null) {
          break label55;
        }
      }
      label55:
      for (paramb = new ze(paramb);; paramb = null)
      {
        localak.a(paramb);
        return;
      }
      return;
    }
    catch (RemoteException paramb)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set the InAppPurchaseListener.", paramb);
    }
  }
  
  public void a(d paramd, String paramString)
  {
    if (this.k != null) {
      throw new IllegalStateException("In app purchase parameter has already been set.");
    }
    try
    {
      this.j = paramd;
      this.h = paramString;
      ak localak;
      if (this.f != null)
      {
        localak = this.f;
        if (paramd == null) {
          break label61;
        }
      }
      label61:
      for (paramd = new zi(paramd);; paramd = null)
      {
        localak.a(paramd, paramString);
        return;
      }
      return;
    }
    catch (RemoteException paramd)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set the play store purchase parameter.", paramd);
    }
  }
  
  public void a(String paramString)
  {
    if (this.g != null) {
      throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }
    this.g = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  public String b()
  {
    return this.g;
  }
  
  public com.google.android.gms.ads.doubleclick.a c()
  {
    return this.i;
  }
  
  public com.google.android.gms.ads.purchase.b d()
  {
    return this.k;
  }
  
  public com.google.android.gms.ads.doubleclick.c e()
  {
    return this.m;
  }
  
  public boolean f()
  {
    try
    {
      if (this.f == null) {
        return false;
      }
      boolean bool = this.f.c();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to check if ad is ready.", localRemoteException);
    }
    return false;
  }
  
  public boolean g()
  {
    try
    {
      if (this.f == null) {
        return false;
      }
      boolean bool = this.f.k();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to check if ad is loading.", localRemoteException);
    }
    return false;
  }
  
  public String h()
  {
    try
    {
      if (this.f != null)
      {
        String str = this.f.j();
        return str;
      }
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to get the mediation adapter class name.", localRemoteException);
    }
    return null;
  }
  
  public void i()
  {
    try
    {
      c("show");
      this.f.f();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to show interstitial.", localRemoteException);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */