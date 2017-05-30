package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.c.f;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

@aaa
public final class xx
  extends xr.a
{
  private final com.google.android.gms.ads.mediation.b a;
  private xy b;
  
  public xx(com.google.android.gms.ads.mediation.b paramb)
  {
    this.a = paramb;
  }
  
  private Bundle a(String paramString1, int paramInt, String paramString2)
  {
    Object localObject = String.valueOf(paramString1);
    if (((String)localObject).length() != 0) {
      localObject = "Server parameters: ".concat((String)localObject);
    }
    for (;;)
    {
      com.google.android.gms.ads.internal.util.client.b.d((String)localObject);
      try
      {
        localObject = new Bundle();
        if (paramString1 == null) {
          break;
        }
        paramString1 = new JSONObject(paramString1);
        localObject = new Bundle();
        Iterator localIterator = paramString1.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          ((Bundle)localObject).putString(str, paramString1.getString(str));
        }
        localObject = new String("Server parameters: ");
      }
      catch (Throwable paramString1)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Could not get Server Parameters Bundle.", paramString1);
        throw new RemoteException();
      }
    }
    if ((this.a instanceof AdMobAdapter))
    {
      ((Bundle)localObject).putString("adJson", paramString2);
      ((Bundle)localObject).putInt("tagForChildDirectedTreatment", paramInt);
    }
    return (Bundle)localObject;
  }
  
  public com.google.android.gms.c.e a()
  {
    Object localObject;
    if (!(this.a instanceof c))
    {
      localObject = String.valueOf(this.a.getClass().getCanonicalName());
      if (((String)localObject).length() != 0) {}
      for (localObject = "MediationAdapter is not a MediationBannerAdapter: ".concat((String)localObject);; localObject = new String("MediationAdapter is not a MediationBannerAdapter: "))
      {
        com.google.android.gms.ads.internal.util.client.b.d((String)localObject);
        throw new RemoteException();
      }
    }
    try
    {
      localObject = f.a(((c)this.a).getBannerView());
      return (com.google.android.gms.c.e)localObject;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not get banner view from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public void a(AdRequestParcel paramAdRequestParcel, String paramString)
  {
    a(paramAdRequestParcel, paramString, null);
  }
  
  public void a(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2)
  {
    if (!(this.a instanceof com.google.android.gms.ads.b.a.a))
    {
      paramAdRequestParcel = String.valueOf(this.a.getClass().getCanonicalName());
      if (paramAdRequestParcel.length() != 0) {}
      for (paramAdRequestParcel = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(paramAdRequestParcel);; paramAdRequestParcel = new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "))
      {
        com.google.android.gms.ads.internal.util.client.b.d(paramAdRequestParcel);
        throw new RemoteException();
      }
    }
    com.google.android.gms.ads.internal.util.client.b.a("Requesting rewarded video ad from adapter.");
    for (;;)
    {
      try
      {
        com.google.android.gms.ads.b.a.a locala = (com.google.android.gms.ads.b.a.a)this.a;
        if (paramAdRequestParcel.e == null) {
          break label227;
        }
        localObject1 = new HashSet(paramAdRequestParcel.e);
        Object localObject2;
        if (paramAdRequestParcel.b == -1L)
        {
          localObject2 = null;
          localObject2 = new xw((Date)localObject2, paramAdRequestParcel.d, (Set)localObject1, paramAdRequestParcel.k, paramAdRequestParcel.f, paramAdRequestParcel.g, paramAdRequestParcel.r);
          if (paramAdRequestParcel.m != null)
          {
            localObject1 = paramAdRequestParcel.m.getBundle(locala.getClass().getName());
            locala.loadAd((com.google.android.gms.ads.mediation.a)localObject2, a(paramString1, paramAdRequestParcel.g, paramString2), (Bundle)localObject1);
          }
        }
        else
        {
          localObject2 = new Date(paramAdRequestParcel.b);
          continue;
        }
        localObject1 = null;
      }
      catch (Throwable paramAdRequestParcel)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Could not load rewarded video ad from adapter.", paramAdRequestParcel);
        throw new RemoteException();
      }
      continue;
      label227:
      Object localObject1 = null;
    }
  }
  
  public void a(com.google.android.gms.c.e parame)
  {
    try
    {
      parame = (Context)f.a(parame);
      ((n)this.a).a(parame);
      return;
    }
    catch (Throwable parame)
    {
      com.google.android.gms.ads.internal.util.client.b.a("Could not inform adapter of changed context", parame);
    }
  }
  
  public void a(com.google.android.gms.c.e parame, AdRequestParcel paramAdRequestParcel, String paramString1, com.google.android.gms.ads.internal.reward.mediation.client.a parama, String paramString2)
  {
    if (!(this.a instanceof com.google.android.gms.ads.b.a.a))
    {
      parame = String.valueOf(this.a.getClass().getCanonicalName());
      if (parame.length() != 0) {}
      for (parame = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(parame);; parame = new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "))
      {
        com.google.android.gms.ads.internal.util.client.b.d(parame);
        throw new RemoteException();
      }
    }
    com.google.android.gms.ads.internal.util.client.b.a("Initialize rewarded video adapter.");
    for (;;)
    {
      try
      {
        com.google.android.gms.ads.b.a.a locala = (com.google.android.gms.ads.b.a.a)this.a;
        if (paramAdRequestParcel.e == null) {
          break label245;
        }
        localObject1 = new HashSet(paramAdRequestParcel.e);
        Object localObject2;
        if (paramAdRequestParcel.b == -1L)
        {
          localObject2 = null;
          localObject2 = new xw((Date)localObject2, paramAdRequestParcel.d, (Set)localObject1, paramAdRequestParcel.k, paramAdRequestParcel.f, paramAdRequestParcel.g, paramAdRequestParcel.r);
          if (paramAdRequestParcel.m != null)
          {
            localObject1 = paramAdRequestParcel.m.getBundle(locala.getClass().getName());
            locala.initialize((Context)f.a(parame), (com.google.android.gms.ads.mediation.a)localObject2, paramString1, new com.google.android.gms.ads.internal.reward.mediation.client.b(parama), a(paramString2, paramAdRequestParcel.g, null), (Bundle)localObject1);
          }
        }
        else
        {
          localObject2 = new Date(paramAdRequestParcel.b);
          continue;
        }
        localObject1 = null;
      }
      catch (Throwable parame)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Could not initialize rewarded video adapter.", parame);
        throw new RemoteException();
      }
      continue;
      label245:
      Object localObject1 = null;
    }
  }
  
  public void a(com.google.android.gms.c.e parame, AdRequestParcel paramAdRequestParcel, String paramString, xs paramxs)
  {
    a(parame, paramAdRequestParcel, paramString, null, paramxs);
  }
  
  public void a(com.google.android.gms.c.e parame, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, xs paramxs)
  {
    if (!(this.a instanceof com.google.android.gms.ads.mediation.e))
    {
      parame = String.valueOf(this.a.getClass().getCanonicalName());
      if (parame.length() != 0) {}
      for (parame = "MediationAdapter is not a MediationInterstitialAdapter: ".concat(parame);; parame = new String("MediationAdapter is not a MediationInterstitialAdapter: "))
      {
        com.google.android.gms.ads.internal.util.client.b.d(parame);
        throw new RemoteException();
      }
    }
    com.google.android.gms.ads.internal.util.client.b.a("Requesting interstitial ad from adapter.");
    for (;;)
    {
      try
      {
        com.google.android.gms.ads.mediation.e locale = (com.google.android.gms.ads.mediation.e)this.a;
        if (paramAdRequestParcel.e == null) {
          break label244;
        }
        localObject1 = new HashSet(paramAdRequestParcel.e);
        Object localObject2;
        if (paramAdRequestParcel.b == -1L)
        {
          localObject2 = null;
          localObject2 = new xw((Date)localObject2, paramAdRequestParcel.d, (Set)localObject1, paramAdRequestParcel.k, paramAdRequestParcel.f, paramAdRequestParcel.g, paramAdRequestParcel.r);
          if (paramAdRequestParcel.m != null)
          {
            localObject1 = paramAdRequestParcel.m.getBundle(locale.getClass().getName());
            locale.requestInterstitialAd((Context)f.a(parame), new xy(paramxs), a(paramString1, paramAdRequestParcel.g, paramString2), (com.google.android.gms.ads.mediation.a)localObject2, (Bundle)localObject1);
          }
        }
        else
        {
          localObject2 = new Date(paramAdRequestParcel.b);
          continue;
        }
        localObject1 = null;
      }
      catch (Throwable parame)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Could not request interstitial ad from adapter.", parame);
        throw new RemoteException();
      }
      continue;
      label244:
      Object localObject1 = null;
    }
  }
  
  public void a(com.google.android.gms.c.e parame, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, xs paramxs, NativeAdOptionsParcel paramNativeAdOptionsParcel, List<String> paramList)
  {
    if (!(this.a instanceof g))
    {
      parame = String.valueOf(this.a.getClass().getCanonicalName());
      if (parame.length() != 0) {}
      for (parame = "MediationAdapter is not a MediationNativeAdapter: ".concat(parame);; parame = new String("MediationAdapter is not a MediationNativeAdapter: "))
      {
        com.google.android.gms.ads.internal.util.client.b.d(parame);
        throw new RemoteException();
      }
    }
    for (;;)
    {
      try
      {
        g localg = (g)this.a;
        if (paramAdRequestParcel.e == null) {
          break label252;
        }
        localHashSet = new HashSet(paramAdRequestParcel.e);
        Date localDate;
        if (paramAdRequestParcel.b == -1L)
        {
          localDate = null;
          paramList = new yc(localDate, paramAdRequestParcel.d, localHashSet, paramAdRequestParcel.k, paramAdRequestParcel.f, paramAdRequestParcel.g, paramNativeAdOptionsParcel, paramList, paramAdRequestParcel.r);
          if (paramAdRequestParcel.m != null)
          {
            paramNativeAdOptionsParcel = paramAdRequestParcel.m.getBundle(localg.getClass().getName());
            this.b = new xy(paramxs);
            localg.requestNativeAd((Context)f.a(parame), this.b, a(paramString1, paramAdRequestParcel.g, paramString2), paramList, paramNativeAdOptionsParcel);
          }
        }
        else
        {
          localDate = new Date(paramAdRequestParcel.b);
          continue;
        }
        paramNativeAdOptionsParcel = null;
      }
      catch (Throwable parame)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Could not request native ad from adapter.", parame);
        throw new RemoteException();
      }
      continue;
      label252:
      HashSet localHashSet = null;
    }
  }
  
  public void a(com.google.android.gms.c.e parame, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, xs paramxs)
  {
    a(parame, paramAdSizeParcel, paramAdRequestParcel, paramString, null, paramxs);
  }
  
  public void a(com.google.android.gms.c.e parame, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, xs paramxs)
  {
    if (!(this.a instanceof c))
    {
      parame = String.valueOf(this.a.getClass().getCanonicalName());
      if (parame.length() != 0) {}
      for (parame = "MediationAdapter is not a MediationBannerAdapter: ".concat(parame);; parame = new String("MediationAdapter is not a MediationBannerAdapter: "))
      {
        com.google.android.gms.ads.internal.util.client.b.d(parame);
        throw new RemoteException();
      }
    }
    com.google.android.gms.ads.internal.util.client.b.a("Requesting banner ad from adapter.");
    for (;;)
    {
      try
      {
        c localc = (c)this.a;
        if (paramAdRequestParcel.e == null) {
          break label262;
        }
        localObject1 = new HashSet(paramAdRequestParcel.e);
        Object localObject2;
        if (paramAdRequestParcel.b == -1L)
        {
          localObject2 = null;
          localObject2 = new xw((Date)localObject2, paramAdRequestParcel.d, (Set)localObject1, paramAdRequestParcel.k, paramAdRequestParcel.f, paramAdRequestParcel.g, paramAdRequestParcel.r);
          if (paramAdRequestParcel.m != null)
          {
            localObject1 = paramAdRequestParcel.m.getBundle(localc.getClass().getName());
            localc.requestBannerAd((Context)f.a(parame), new xy(paramxs), a(paramString1, paramAdRequestParcel.g, paramString2), com.google.android.gms.ads.j.a(paramAdSizeParcel.f, paramAdSizeParcel.c, paramAdSizeParcel.b), (com.google.android.gms.ads.mediation.a)localObject2, (Bundle)localObject1);
          }
        }
        else
        {
          localObject2 = new Date(paramAdRequestParcel.b);
          continue;
        }
        localObject1 = null;
      }
      catch (Throwable parame)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Could not request banner ad from adapter.", parame);
        throw new RemoteException();
      }
      continue;
      label262:
      Object localObject1 = null;
    }
  }
  
  public void b()
  {
    if (!(this.a instanceof com.google.android.gms.ads.mediation.e))
    {
      String str = String.valueOf(this.a.getClass().getCanonicalName());
      if (str.length() != 0) {}
      for (str = "MediationAdapter is not a MediationInterstitialAdapter: ".concat(str);; str = new String("MediationAdapter is not a MediationInterstitialAdapter: "))
      {
        com.google.android.gms.ads.internal.util.client.b.d(str);
        throw new RemoteException();
      }
    }
    com.google.android.gms.ads.internal.util.client.b.a("Showing interstitial from adapter.");
    try
    {
      ((com.google.android.gms.ads.mediation.e)this.a).showInterstitial();
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not show interstitial from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public void c()
  {
    try
    {
      this.a.onDestroy();
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not destroy adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public void d()
  {
    try
    {
      this.a.onPause();
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not pause adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public void e()
  {
    try
    {
      this.a.onResume();
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not resume adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public void f()
  {
    if (!(this.a instanceof com.google.android.gms.ads.b.a.a))
    {
      String str = String.valueOf(this.a.getClass().getCanonicalName());
      if (str.length() != 0) {}
      for (str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(str);; str = new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "))
      {
        com.google.android.gms.ads.internal.util.client.b.d(str);
        throw new RemoteException();
      }
    }
    com.google.android.gms.ads.internal.util.client.b.a("Show rewarded video ad from adapter.");
    try
    {
      ((com.google.android.gms.ads.b.a.a)this.a).showVideo();
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not show rewarded video ad from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public boolean g()
  {
    if (!(this.a instanceof com.google.android.gms.ads.b.a.a))
    {
      String str = String.valueOf(this.a.getClass().getCanonicalName());
      if (str.length() != 0) {}
      for (str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(str);; str = new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "))
      {
        com.google.android.gms.ads.internal.util.client.b.d(str);
        throw new RemoteException();
      }
    }
    com.google.android.gms.ads.internal.util.client.b.a("Check if adapter is initialized.");
    try
    {
      boolean bool = ((com.google.android.gms.ads.b.a.a)this.a).isInitialized();
      return bool;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not check if adapter is initialized.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public xu h()
  {
    i locali = this.b.a();
    if ((locali instanceof com.google.android.gms.ads.mediation.j)) {
      return new xz((com.google.android.gms.ads.mediation.j)locali);
    }
    return null;
  }
  
  public xv i()
  {
    i locali = this.b.a();
    if ((locali instanceof k)) {
      return new yb((k)locali);
    }
    return null;
  }
  
  public Bundle j()
  {
    if (!(this.a instanceof adm))
    {
      String str = String.valueOf(this.a.getClass().getCanonicalName());
      if (str.length() != 0) {}
      for (str = "MediationAdapter is not a v2 MediationBannerAdapter: ".concat(str);; str = new String("MediationAdapter is not a v2 MediationBannerAdapter: "))
      {
        com.google.android.gms.ads.internal.util.client.b.d(str);
        return new Bundle();
      }
    }
    return ((adm)this.a).a();
  }
  
  public Bundle k()
  {
    if (!(this.a instanceof adn))
    {
      String str = String.valueOf(this.a.getClass().getCanonicalName());
      if (str.length() != 0) {}
      for (str = "MediationAdapter is not a v2 MediationInterstitialAdapter: ".concat(str);; str = new String("MediationAdapter is not a v2 MediationInterstitialAdapter: "))
      {
        com.google.android.gms.ads.internal.util.client.b.d(str);
        return new Bundle();
      }
    }
    return ((adn)this.a).getInterstitialAdapterInfo();
  }
  
  public Bundle l()
  {
    return new Bundle();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/xx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */