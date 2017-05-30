package com.google.android.gms.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.c.f;

@aaa
public class up
  implements com.google.android.gms.ads.doubleclick.b
{
  private final uq a;
  
  public up(uq paramuq)
  {
    this.a = paramuq;
  }
  
  public String a()
  {
    try
    {
      String str = this.a.a();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not delegate getBaseURL to CustomRenderedAd", localRemoteException);
    }
    return null;
  }
  
  public void a(View paramView)
  {
    try
    {
      uq localuq = this.a;
      if (paramView != null) {}
      for (paramView = f.a(paramView);; paramView = null)
      {
        localuq.a(paramView);
        return;
      }
      return;
    }
    catch (RemoteException paramView)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not delegate onAdRendered to CustomRenderedAd", paramView);
    }
  }
  
  public String b()
  {
    try
    {
      String str = this.a.b();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not delegate getContent to CustomRenderedAd", localRemoteException);
    }
    return null;
  }
  
  public void c()
  {
    try
    {
      this.a.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not delegate recordClick to CustomRenderedAd", localRemoteException);
    }
  }
  
  public void d()
  {
    try
    {
      this.a.d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not delegate recordImpression to CustomRenderedAd", localRemoteException);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/up.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */