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
public final class u
  extends h<aj>
{
  public u()
  {
    super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
  }
  
  public ai a(Context paramContext, String paramString, xq paramxq)
  {
    try
    {
      e locale = f.a(paramContext);
      paramContext = ai.a.a(((aj)b(paramContext)).a(locale, paramString, paramxq, 9683000));
      return paramContext;
    }
    catch (RemoteException paramContext)
    {
      b.d("Could not create remote builder for AdLoader.", paramContext);
      return null;
    }
    catch (h.a paramContext)
    {
      for (;;)
      {
        b.d("Could not create remote builder for AdLoader.", paramContext);
      }
    }
  }
  
  protected aj a(IBinder paramIBinder)
  {
    return aj.a.a(paramIBinder);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */