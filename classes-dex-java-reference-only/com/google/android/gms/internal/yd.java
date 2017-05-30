package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.d;
import com.google.ads.mediation.g;
import com.google.ads.mediation.i;
import com.google.ads.mediation.j;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@aaa
public final class yd<NETWORK_EXTRAS extends j, SERVER_PARAMETERS extends i>
  extends xr.a
{
  private final d<NETWORK_EXTRAS, SERVER_PARAMETERS> a;
  private final NETWORK_EXTRAS b;
  
  public yd(d<NETWORK_EXTRAS, SERVER_PARAMETERS> paramd, NETWORK_EXTRAS paramNETWORK_EXTRAS)
  {
    this.a = paramd;
    this.b = paramNETWORK_EXTRAS;
  }
  
  private SERVER_PARAMETERS a(String paramString1, int paramInt, String paramString2)
  {
    if (paramString1 != null) {
      try
      {
        localObject = new JSONObject(paramString1);
        paramString2 = new HashMap(((JSONObject)localObject).length());
        Iterator localIterator = ((JSONObject)localObject).keys();
        for (;;)
        {
          paramString1 = paramString2;
          if (!localIterator.hasNext()) {
            break;
          }
          paramString1 = (String)localIterator.next();
          paramString2.put(paramString1, ((JSONObject)localObject).getString(paramString1));
        }
        paramString1 = new HashMap(0);
      }
      catch (Throwable paramString1)
      {
        b.d("Could not get MediationServerParameters.", paramString1);
        throw new RemoteException();
      }
    }
    Object localObject = this.a.c();
    paramString2 = null;
    if (localObject != null)
    {
      paramString2 = (i)((Class)localObject).newInstance();
      paramString2.a(paramString1);
    }
    return paramString2;
  }
  
  public com.google.android.gms.c.e a()
  {
    Object localObject;
    if (!(this.a instanceof com.google.ads.mediation.e))
    {
      localObject = String.valueOf(this.a.getClass().getCanonicalName());
      if (((String)localObject).length() != 0) {}
      for (localObject = "MediationAdapter is not a MediationBannerAdapter: ".concat((String)localObject);; localObject = new String("MediationAdapter is not a MediationBannerAdapter: "))
      {
        b.d((String)localObject);
        throw new RemoteException();
      }
    }
    try
    {
      localObject = f.a(((com.google.ads.mediation.e)this.a).d());
      return (com.google.android.gms.c.e)localObject;
    }
    catch (Throwable localThrowable)
    {
      b.d("Could not get banner view from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public void a(AdRequestParcel paramAdRequestParcel, String paramString) {}
  
  public void a(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2) {}
  
  public void a(com.google.android.gms.c.e parame) {}
  
  public void a(com.google.android.gms.c.e parame, AdRequestParcel paramAdRequestParcel, String paramString1, a parama, String paramString2) {}
  
  public void a(com.google.android.gms.c.e parame, AdRequestParcel paramAdRequestParcel, String paramString, xs paramxs)
  {
    a(parame, paramAdRequestParcel, paramString, null, paramxs);
  }
  
  public void a(com.google.android.gms.c.e parame, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, xs paramxs)
  {
    if (!(this.a instanceof g))
    {
      parame = String.valueOf(this.a.getClass().getCanonicalName());
      if (parame.length() != 0) {}
      for (parame = "MediationAdapter is not a MediationInterstitialAdapter: ".concat(parame);; parame = new String("MediationAdapter is not a MediationInterstitialAdapter: "))
      {
        b.d(parame);
        throw new RemoteException();
      }
    }
    b.a("Requesting interstitial ad from adapter.");
    try
    {
      ((g)this.a).a(new ye(paramxs), (Activity)f.a(parame), a(paramString1, paramAdRequestParcel.g, paramString2), yf.a(paramAdRequestParcel), this.b);
      return;
    }
    catch (Throwable parame)
    {
      b.d("Could not request interstitial ad from adapter.", parame);
      throw new RemoteException();
    }
  }
  
  public void a(com.google.android.gms.c.e parame, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, xs paramxs, NativeAdOptionsParcel paramNativeAdOptionsParcel, List<String> paramList) {}
  
  public void a(com.google.android.gms.c.e parame, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, xs paramxs)
  {
    a(parame, paramAdSizeParcel, paramAdRequestParcel, paramString, null, paramxs);
  }
  
  public void a(com.google.android.gms.c.e parame, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, xs paramxs)
  {
    if (!(this.a instanceof com.google.ads.mediation.e))
    {
      parame = String.valueOf(this.a.getClass().getCanonicalName());
      if (parame.length() != 0) {}
      for (parame = "MediationAdapter is not a MediationBannerAdapter: ".concat(parame);; parame = new String("MediationAdapter is not a MediationBannerAdapter: "))
      {
        b.d(parame);
        throw new RemoteException();
      }
    }
    b.a("Requesting banner ad from adapter.");
    try
    {
      ((com.google.ads.mediation.e)this.a).a(new ye(paramxs), (Activity)f.a(parame), a(paramString1, paramAdRequestParcel.g, paramString2), yf.a(paramAdSizeParcel), yf.a(paramAdRequestParcel), this.b);
      return;
    }
    catch (Throwable parame)
    {
      b.d("Could not request banner ad from adapter.", parame);
      throw new RemoteException();
    }
  }
  
  public void b()
  {
    if (!(this.a instanceof g))
    {
      String str = String.valueOf(this.a.getClass().getCanonicalName());
      if (str.length() != 0) {}
      for (str = "MediationAdapter is not a MediationInterstitialAdapter: ".concat(str);; str = new String("MediationAdapter is not a MediationInterstitialAdapter: "))
      {
        b.d(str);
        throw new RemoteException();
      }
    }
    b.a("Showing interstitial from adapter.");
    try
    {
      ((g)this.a).e();
      return;
    }
    catch (Throwable localThrowable)
    {
      b.d("Could not show interstitial from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public void c()
  {
    try
    {
      this.a.a();
      return;
    }
    catch (Throwable localThrowable)
    {
      b.d("Could not destroy adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public void d()
  {
    throw new RemoteException();
  }
  
  public void e()
  {
    throw new RemoteException();
  }
  
  public void f() {}
  
  public boolean g()
  {
    return true;
  }
  
  public xu h()
  {
    return null;
  }
  
  public xv i()
  {
    return null;
  }
  
  public Bundle j()
  {
    return new Bundle();
  }
  
  public Bundle k()
  {
    return new Bundle();
  }
  
  public Bundle l()
  {
    return new Bundle();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/yd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */