package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.c.e;
import com.google.android.gms.cast.internal.m;

public class k
{
  private static final m a = new m("SessionManager");
  private final aa b;
  
  public k(aa paramaa)
  {
    this.b = paramaa;
  }
  
  public j a()
  {
    try
    {
      j localj = (j)com.google.android.gms.c.f.a(this.b.a());
      return localj;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "getWrappedCurrentSession", aa.class.getSimpleName() });
    }
    return null;
  }
  
  public void a(f paramf)
  {
    com.google.android.gms.common.internal.d.a(paramf);
    try
    {
      this.b.a(new p(paramf));
      return;
    }
    catch (RemoteException paramf)
    {
      a.a(paramf, "Unable to call %s on %s.", new Object[] { "addCastStateListener", aa.class.getSimpleName() });
    }
  }
  
  public void a(l<j> paraml)
  {
    a(paraml, j.class);
  }
  
  public <T extends j> void a(l<T> paraml, Class<T> paramClass)
  {
    com.google.android.gms.common.internal.d.a(paraml);
    com.google.android.gms.common.internal.d.a(paramClass);
    try
    {
      this.b.a(new ae(paraml, paramClass));
      return;
    }
    catch (RemoteException paraml)
    {
      a.a(paraml, "Unable to call %s on %s.", new Object[] { "addSessionManagerListener", aa.class.getSimpleName() });
    }
  }
  
  public void a(boolean paramBoolean)
  {
    try
    {
      this.b.a(true, paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "endCurrentSession", aa.class.getSimpleName() });
    }
  }
  
  public d b()
  {
    j localj = a();
    if ((localj != null) && ((localj instanceof d))) {
      return (d)localj;
    }
    return null;
  }
  
  public void b(f paramf)
  {
    if (paramf == null) {
      return;
    }
    try
    {
      this.b.b(new p(paramf));
      return;
    }
    catch (RemoteException paramf)
    {
      a.a(paramf, "Unable to call %s on %s.", new Object[] { "removeCastStateListener", aa.class.getSimpleName() });
    }
  }
  
  public void b(l<j> paraml)
  {
    b(paraml, j.class);
  }
  
  public <T extends j> void b(l<T> paraml, Class paramClass)
  {
    com.google.android.gms.common.internal.d.a(paramClass);
    if (paraml == null) {
      return;
    }
    try
    {
      this.b.b(new ae(paraml, paramClass));
      return;
    }
    catch (RemoteException paraml)
    {
      a.a(paraml, "Unable to call %s on %s.", new Object[] { "removeSessionManagerListener", aa.class.getSimpleName() });
    }
  }
  
  public e c()
  {
    try
    {
      e locale = this.b.b();
      return locale;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "getWrappedThis", aa.class.getSimpleName() });
    }
    return null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */