package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class CustomEventAdapter
  implements com.google.android.gms.ads.mediation.c, com.google.android.gms.ads.mediation.e, g
{
  b a;
  e b;
  h c;
  private View d;
  
  private static <T> T a(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return (T)localObject;
    }
    catch (Throwable localThrowable)
    {
      String str = String.valueOf(localThrowable.getMessage());
      com.google.android.gms.ads.internal.util.client.b.d(String.valueOf(paramString).length() + 46 + String.valueOf(str).length() + "Could not instantiate custom event adapter: " + paramString + ". " + str);
    }
    return null;
  }
  
  private void a(View paramView)
  {
    this.d = paramView;
  }
  
  b a(com.google.android.gms.ads.mediation.f paramf)
  {
    return new b(this, paramf);
  }
  
  public View getBannerView()
  {
    return this.d;
  }
  
  public void onDestroy()
  {
    if (this.a != null) {
      this.a.a();
    }
    if (this.b != null) {
      this.b.a();
    }
    if (this.c != null) {
      this.c.a();
    }
  }
  
  public void onPause()
  {
    if (this.a != null) {
      this.a.b();
    }
    if (this.b != null) {
      this.b.b();
    }
    if (this.c != null) {
      this.c.b();
    }
  }
  
  public void onResume()
  {
    if (this.a != null) {
      this.a.c();
    }
    if (this.b != null) {
      this.b.c();
    }
    if (this.c != null) {
      this.c.c();
    }
  }
  
  public void requestBannerAd(Context paramContext, com.google.android.gms.ads.mediation.d paramd, Bundle paramBundle1, com.google.android.gms.ads.d paramd1, a parama, Bundle paramBundle2)
  {
    this.a = ((b)a(paramBundle1.getString("class_name")));
    if (this.a == null)
    {
      paramd.a(this, 0);
      return;
    }
    if (paramBundle2 == null) {}
    for (paramBundle2 = null;; paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name")))
    {
      this.a.a(paramContext, new a(this, paramd), paramBundle1.getString("parameter"), paramd1, parama, paramBundle2);
      return;
    }
  }
  
  public void requestInterstitialAd(Context paramContext, com.google.android.gms.ads.mediation.f paramf, Bundle paramBundle1, a parama, Bundle paramBundle2)
  {
    this.b = ((e)a(paramBundle1.getString("class_name")));
    if (this.b == null)
    {
      paramf.a(this, 0);
      return;
    }
    if (paramBundle2 == null) {}
    for (paramBundle2 = null;; paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name")))
    {
      this.b.a(paramContext, a(paramf), paramBundle1.getString("parameter"), parama, paramBundle2);
      return;
    }
  }
  
  public void requestNativeAd(Context paramContext, com.google.android.gms.ads.mediation.h paramh, Bundle paramBundle1, l paraml, Bundle paramBundle2)
  {
    this.c = ((h)a(paramBundle1.getString("class_name")));
    if (this.c == null)
    {
      paramh.a(this, 0);
      return;
    }
    if (paramBundle2 == null) {}
    for (paramBundle2 = null;; paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name")))
    {
      this.c.a(paramContext, new c(this, paramh), paramBundle1.getString("parameter"), paraml, paramBundle2);
      return;
    }
  }
  
  public void showInterstitial()
  {
    this.b.d();
  }
  
  static final class a
    implements c
  {
    private final CustomEventAdapter a;
    private final com.google.android.gms.ads.mediation.d b;
    
    public a(CustomEventAdapter paramCustomEventAdapter, com.google.android.gms.ads.mediation.d paramd)
    {
      this.a = paramCustomEventAdapter;
      this.b = paramd;
    }
    
    public void a()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdClicked.");
      this.b.e(this.a);
    }
    
    public void a(int paramInt)
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdFailedToLoad.");
      this.b.a(this.a, paramInt);
    }
    
    public void a(View paramView)
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdLoaded.");
      CustomEventAdapter.a(this.a, paramView);
      this.b.a(this.a);
    }
    
    public void b()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdOpened.");
      this.b.b(this.a);
    }
    
    public void c()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdClosed.");
      this.b.c(this.a);
    }
    
    public void d()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdLeftApplication.");
      this.b.d(this.a);
    }
  }
  
  class b
    implements f
  {
    private final CustomEventAdapter b;
    private final com.google.android.gms.ads.mediation.f c;
    
    public b(CustomEventAdapter paramCustomEventAdapter, com.google.android.gms.ads.mediation.f paramf)
    {
      this.b = paramCustomEventAdapter;
      this.c = paramf;
    }
    
    public void a()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdClicked.");
      this.c.e(this.b);
    }
    
    public void a(int paramInt)
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onFailedToReceiveAd.");
      this.c.a(this.b, paramInt);
    }
    
    public void b()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdOpened.");
      this.c.b(this.b);
    }
    
    public void c()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdClosed.");
      this.c.c(this.b);
    }
    
    public void d()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdLeftApplication.");
      this.c.d(this.b);
    }
    
    public void e()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onReceivedAd.");
      this.c.a(CustomEventAdapter.this);
    }
  }
  
  static class c
    implements i
  {
    private final CustomEventAdapter a;
    private final com.google.android.gms.ads.mediation.h b;
    
    public c(CustomEventAdapter paramCustomEventAdapter, com.google.android.gms.ads.mediation.h paramh)
    {
      this.a = paramCustomEventAdapter;
      this.b = paramh;
    }
    
    public void a()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdClicked.");
      this.b.d(this.a);
    }
    
    public void a(int paramInt)
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdFailedToLoad.");
      this.b.a(this.a, paramInt);
    }
    
    public void a(com.google.android.gms.ads.mediation.i parami)
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdLoaded.");
      this.b.a(this.a, parami);
    }
    
    public void b()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdOpened.");
      this.b.a(this.a);
    }
    
    public void c()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdClosed.");
      this.b.b(this.a);
    }
    
    public void d()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdLeftApplication.");
      this.b.c(this.a);
    }
    
    public void e()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdImpression.");
      this.b.e(this.a);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/mediation/customevent/CustomEventAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */