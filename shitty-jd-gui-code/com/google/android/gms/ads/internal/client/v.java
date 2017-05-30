package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h;
import com.google.android.gms.c.h.a;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.xq;

@aaa
public class v
  extends h<al>
{
  public v()
  {
    super("com.google.android.gms.ads.AdManagerCreatorImpl");
  }
  
  public ak a(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, xq paramxq, int paramInt)
  {
    try
    {
      e locale = f.a(paramContext);
      paramContext = ak.a.a(((al)b(paramContext)).a(locale, paramAdSizeParcel, paramString, paramxq, 9683000, paramInt));
      return paramContext;
    }
    catch (RemoteException paramContext)
    {
      b.a("Could not create remote AdManager.", paramContext);
      return null;
    }
    catch (h.a paramContext)
    {
      for (;;) {}
    }
  }
  
  protected al a(IBinder paramIBinder)
  {
    return al.a.a(paramIBinder);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */