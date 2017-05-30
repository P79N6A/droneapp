package com.google.android.gms.ads.internal.client;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.vf;
import com.google.android.gms.internal.vg;
import com.google.android.gms.internal.vh;
import com.google.android.gms.internal.vi;

public class k
  extends ai.a
{
  private ag a;
  
  public ah a()
  {
    return new a(null);
  }
  
  public void a(ag paramag)
  {
    this.a = paramag;
  }
  
  public void a(ao paramao) {}
  
  public void a(NativeAdOptionsParcel paramNativeAdOptionsParcel) {}
  
  public void a(vf paramvf) {}
  
  public void a(vg paramvg) {}
  
  public void a(String paramString, vi paramvi, vh paramvh) {}
  
  private class a
    extends ah.a
  {
    private a() {}
    
    public void a(AdRequestParcel paramAdRequestParcel)
    {
      b.b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
      a.a.post(new Runnable()
      {
        public void run()
        {
          if (k.a(k.this) != null) {}
          try
          {
            k.a(k.this).a(1);
            return;
          }
          catch (RemoteException localRemoteException)
          {
            b.d("Could not notify onAdFailedToLoad event.", localRemoteException);
          }
        }
      });
    }
    
    public boolean a()
    {
      return false;
    }
    
    public String b()
    {
      return null;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */