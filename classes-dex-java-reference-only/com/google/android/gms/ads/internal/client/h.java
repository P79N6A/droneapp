package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.xp;

@aaa
public class h
{
  private static h a;
  private static final Object b = new Object();
  private ap c;
  private com.google.android.gms.ads.b.b d;
  
  public static h a()
  {
    synchronized (b)
    {
      if (a == null) {
        a = new h();
      }
      h localh = a;
      return localh;
    }
  }
  
  public com.google.android.gms.ads.b.b a(Context paramContext)
  {
    synchronized (b)
    {
      if (this.d != null)
      {
        paramContext = this.d;
        return paramContext;
      }
      xp localxp = new xp();
      this.d = new com.google.android.gms.ads.internal.reward.client.i(paramContext, ac.b().a(paramContext, localxp));
      paramContext = this.d;
      return paramContext;
    }
  }
  
  public void a(float paramFloat)
  {
    boolean bool2 = true;
    if ((0.0F <= paramFloat) && (paramFloat <= 1.0F))
    {
      bool1 = true;
      d.b(bool1, "The app volume must be a value between 0 and 1 inclusive.");
      if (this.c == null) {
        break label53;
      }
    }
    label53:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      d.a(bool1, "MobileAds.initialize() must be called prior to setting the app volume.");
      try
      {
        this.c.a(paramFloat);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.client.b.b("Unable to set app volume.", localRemoteException);
      }
      bool1 = false;
      break;
    }
  }
  
  public void a(Context paramContext, String paramString)
  {
    if (this.c != null) {}
    for (boolean bool = true;; bool = false)
    {
      d.a(bool, "MobileAds.initialize() must be called prior to opening debug menu.");
      try
      {
        this.c.a(f.a(paramContext), paramString);
        return;
      }
      catch (RemoteException paramContext)
      {
        com.google.android.gms.ads.internal.util.client.b.b("Unable to open debug menu.", paramContext);
      }
    }
  }
  
  public void a(Context paramContext, String paramString, i arg3)
  {
    synchronized (b)
    {
      if (this.c != null) {
        return;
      }
      if (paramContext == null) {
        throw new IllegalArgumentException("Context cannot be null.");
      }
    }
    try
    {
      this.c = ac.b().a(paramContext);
      this.c.a();
      if (paramString != null) {
        this.c.a(paramString);
      }
    }
    catch (RemoteException paramContext)
    {
      for (;;)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Fail to initialize or set applicationCode on mobile ads setting manager", paramContext);
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.c != null) {}
    for (boolean bool = true;; bool = false)
    {
      d.a(bool, "MobileAds.initialize() must be called prior to setting the app volume.");
      try
      {
        this.c.a(paramBoolean);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.client.b.b("Unable to set app mute state.", localRemoteException);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */