package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h;
import com.google.android.gms.c.h.a;
import com.google.android.gms.internal.aaa;

@aaa
public class j
  extends h<b>
{
  public j()
  {
    super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
  }
  
  public ap a(Context paramContext)
  {
    try
    {
      e locale = f.a(paramContext);
      paramContext = ap.a.a(((b)b(paramContext)).a(locale, 9683000));
      return paramContext;
    }
    catch (RemoteException paramContext)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not get remote MobileAdsSettingManager.", paramContext);
      return null;
    }
    catch (h.a paramContext)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Could not get remote MobileAdsSettingManager.", paramContext);
    }
    return null;
  }
  
  protected b a(IBinder paramIBinder)
  {
    return b.a.a(paramIBinder);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */