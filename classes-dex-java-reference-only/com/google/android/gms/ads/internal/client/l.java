package com.google.android.gms.ads.internal.client;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.reward.client.d;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.internal.ur;
import com.google.android.gms.internal.yy;
import com.google.android.gms.internal.zd;

public class l
  extends ak.a
{
  private ag a;
  
  public e a()
  {
    return null;
  }
  
  public void a(AdSizeParcel paramAdSizeParcel) {}
  
  public void a(VideoOptionsParcel paramVideoOptionsParcel) {}
  
  public void a(af paramaf) {}
  
  public void a(ag paramag)
  {
    this.a = paramag;
  }
  
  public void a(am paramam) {}
  
  public void a(ao paramao) {}
  
  public void a(d paramd) {}
  
  public void a(ur paramur) {}
  
  public void a(yy paramyy) {}
  
  public void a(zd paramzd, String paramString) {}
  
  public void a(String paramString) {}
  
  public void a(boolean paramBoolean) {}
  
  public boolean a(AdRequestParcel paramAdRequestParcel)
  {
    b.b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
    a.a.post(new Runnable()
    {
      public void run()
      {
        if (l.a(l.this) != null) {}
        try
        {
          l.a(l.this).a(1);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          b.d("Could not notify onAdFailedToLoad event.", localRemoteException);
        }
      }
    });
    return false;
  }
  
  public void b() {}
  
  public boolean c()
  {
    return false;
  }
  
  public void c_() {}
  
  public void d() {}
  
  public void f() {}
  
  public void g_() {}
  
  public void h() {}
  
  public AdSizeParcel i()
  {
    return null;
  }
  
  public String j()
  {
    return null;
  }
  
  public boolean k()
  {
    return false;
  }
  
  public c l()
  {
    return null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */