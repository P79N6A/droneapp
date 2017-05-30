package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.c.e;
import com.google.android.gms.cast.internal.m;

public class q
{
  private static final m a = new m("DiscoveryManager");
  private final w b;
  
  q(w paramw)
  {
    this.b = paramw;
  }
  
  public e a()
  {
    try
    {
      e locale = this.b.c();
      return locale;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "getWrappedThis", w.class.getSimpleName() });
    }
    return null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */