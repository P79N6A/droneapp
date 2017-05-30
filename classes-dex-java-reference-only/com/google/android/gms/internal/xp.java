package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.i;
import com.google.ads.mediation.j;
import com.google.android.gms.ads.mediation.customevent.a;
import com.google.android.gms.ads.mediation.m;
import java.util.Map;

@aaa
public final class xp
  extends xq.a
{
  private Map<Class<? extends m>, m> a;
  
  private <NETWORK_EXTRAS extends j, SERVER_PARAMETERS extends i> xr c(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString, false, xp.class.getClassLoader());
      if (com.google.ads.mediation.d.class.isAssignableFrom((Class)localObject))
      {
        localObject = (com.google.ads.mediation.d)((Class)localObject).newInstance();
        return new yd((com.google.ads.mediation.d)localObject, (j)this.a.get(((com.google.ads.mediation.d)localObject).b()));
      }
      if (com.google.android.gms.ads.mediation.b.class.isAssignableFrom((Class)localObject)) {
        return new xx((com.google.android.gms.ads.mediation.b)((Class)localObject).newInstance());
      }
      com.google.android.gms.ads.internal.util.client.b.d(String.valueOf(paramString).length() + 64 + "Could not instantiate mediation adapter: " + paramString + " (not a valid adapter).");
      throw new RemoteException();
    }
    catch (Throwable localThrowable) {}
    return d(paramString);
  }
  
  private xr d(String paramString)
  {
    do
    {
      try
      {
        com.google.android.gms.ads.internal.util.client.b.a("Reflection failed, retrying using direct instantiation");
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString)) {
          return new xx(new AdMobAdapter());
        }
        if ("com.google.ads.mediation.AdUrlAdapter".equals(paramString))
        {
          xx localxx = new xx(new AdUrlAdapter());
          return localxx;
        }
      }
      catch (Throwable localThrowable)
      {
        com.google.android.gms.ads.internal.util.client.b.d(String.valueOf(paramString).length() + 43 + "Could not instantiate mediation adapter: " + paramString + ". ", localThrowable);
        throw new RemoteException();
      }
      if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(paramString)) {
        return new xx(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
      }
    } while (!"com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString));
    Object localObject = new com.google.ads.mediation.customevent.CustomEventAdapter();
    localObject = new yd((com.google.ads.mediation.d)localObject, (com.google.android.gms.ads.mediation.customevent.d)this.a.get(((com.google.ads.mediation.customevent.CustomEventAdapter)localObject).b()));
    return (xr)localObject;
  }
  
  public xr a(String paramString)
  {
    return c(paramString);
  }
  
  public void a(Map<Class<? extends m>, m> paramMap)
  {
    this.a = paramMap;
  }
  
  public boolean b(String paramString)
  {
    try
    {
      boolean bool = a.class.isAssignableFrom(Class.forName(paramString, false, xp.class.getClassLoader()));
      return bool;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.b.d(String.valueOf(paramString).length() + 80 + "Could not load custom event implementation class: " + paramString + ", assuming old implementation.");
    }
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/xp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */