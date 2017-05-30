package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.c.h;
import com.google.android.gms.c.h.a;

@aaa
public final class zf
  extends h<za>
{
  public zf()
  {
    super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
  }
  
  public yz a(Activity paramActivity)
  {
    try
    {
      e locale = f.a(paramActivity);
      paramActivity = yz.a.a(((za)b(paramActivity)).a(locale));
      return paramActivity;
    }
    catch (RemoteException paramActivity)
    {
      b.d("Could not create remote InAppPurchaseManager.", paramActivity);
      return null;
    }
    catch (h.a paramActivity)
    {
      b.d("Could not create remote InAppPurchaseManager.", paramActivity);
    }
    return null;
  }
  
  protected za a(IBinder paramIBinder)
  {
    return za.a.a(paramIBinder);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */