package com.google.android.gms.internal;

import android.app.Service;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.c.e;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ad;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.s;
import com.google.android.gms.cast.framework.t;
import com.google.android.gms.cast.framework.u;
import com.google.android.gms.cast.framework.y;
import com.google.android.gms.cast.framework.z;
import com.google.android.gms.cast.internal.m;
import java.util.Map;

public class afc
{
  private static final m a = new m("CastDynamiteModule");
  
  private static IBinder a(Context paramContext, String paramString)
  {
    try
    {
      paramContext = (IBinder)paramContext.getClassLoader().loadClass(paramString).newInstance();
      return paramContext;
    }
    catch (ClassNotFoundException paramContext)
    {
      throw new RuntimeException(paramContext);
    }
    catch (InstantiationException paramContext)
    {
      for (;;) {}
    }
    catch (IllegalAccessException paramContext)
    {
      for (;;) {}
    }
  }
  
  public static com.google.android.gms.cast.framework.media.f a(Service paramService, e parame1, e parame2, CastMediaOptions paramCastMediaOptions)
  {
    aff localaff = a(paramService.getApplicationContext());
    try
    {
      paramService = localaff.a(com.google.android.gms.c.f.a(paramService), parame1, parame2, paramCastMediaOptions);
      return paramService;
    }
    catch (RemoteException paramService)
    {
      a.a(paramService, "Unable to call %s on %s.", new Object[] { "newMediaNotificationServiceImpl", aff.class.getSimpleName() });
    }
    return null;
  }
  
  public static t a(Context paramContext, CastOptions paramCastOptions, afh paramafh, Map<String, IBinder> paramMap)
  {
    aff localaff = a(paramContext);
    try
    {
      paramContext = localaff.a(com.google.android.gms.c.f.a(paramContext.getApplicationContext()), paramCastOptions, paramafh, paramMap);
      return paramContext;
    }
    catch (RemoteException paramContext)
    {
      a.a(paramContext, "Unable to call %s on %s.", new Object[] { "newCastContextImpl", aff.class.getSimpleName() });
    }
    return null;
  }
  
  public static u a(Context paramContext, CastOptions paramCastOptions, e parame, s params)
  {
    paramContext = a(paramContext);
    try
    {
      paramContext = paramContext.a(paramCastOptions, parame, params);
      return paramContext;
    }
    catch (RemoteException paramContext)
    {
      a.a(paramContext, "Unable to call %s on %s.", new Object[] { "newCastSessionImpl", aff.class.getSimpleName() });
    }
    return null;
  }
  
  public static y a(Service paramService, e parame1, e parame2)
  {
    aff localaff = a(paramService.getApplicationContext());
    paramService = com.google.android.gms.c.f.a(paramService);
    try
    {
      paramService = localaff.a(paramService, parame1, parame2);
      return paramService;
    }
    catch (RemoteException paramService)
    {
      a.a(paramService, "Unable to call %s on %s.", new Object[] { "newReconnectionServiceImpl", aff.class.getSimpleName() });
    }
    return null;
  }
  
  public static z a(Context paramContext, String paramString1, String paramString2, ad paramad)
  {
    paramContext = a(paramContext);
    try
    {
      paramContext = paramContext.a(paramString1, paramString2, paramad);
      return paramContext;
    }
    catch (RemoteException paramContext)
    {
      a.a(paramContext, "Unable to call %s on %s.", new Object[] { "newSessionImpl", aff.class.getSimpleName() });
    }
    return null;
  }
  
  private static aff a(Context paramContext)
  {
    if (!a()) {
      return b(paramContext);
    }
    try
    {
      paramContext = aff.a.a(akb.a(paramContext, akb.a, "com.google.android.gms.cast.framework.dynamite").a("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"));
      return paramContext;
    }
    catch (akb.a paramContext)
    {
      throw new RuntimeException(paramContext);
    }
  }
  
  public static afo a(Context paramContext, AsyncTask<Uri, Long, Bitmap> paramAsyncTask, afp paramafp, int paramInt1, int paramInt2, boolean paramBoolean, long paramLong, int paramInt3, int paramInt4, int paramInt5)
  {
    paramContext = a(paramContext.getApplicationContext());
    try
    {
      paramContext = paramContext.a(com.google.android.gms.c.f.a(paramAsyncTask), paramafp, paramInt1, paramInt2, paramBoolean, paramLong, paramInt3, paramInt4, paramInt5);
      return paramContext;
    }
    catch (RemoteException paramContext)
    {
      a.a(paramContext, "Unable to call %s on %s.", new Object[] { "newFetchBitmapTaskImpl", aff.class.getSimpleName() });
    }
    return null;
  }
  
  static boolean a()
  {
    return true;
  }
  
  private static aff b(Context paramContext)
  {
    return aff.a.a(a(paramContext, "com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/afc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */