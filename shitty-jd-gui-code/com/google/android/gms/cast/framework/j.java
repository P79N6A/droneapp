package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.internal.afc;

public abstract class j
{
  private static final m a = new m("Session");
  private final z b = afc.a(paramContext, paramString1, paramString2, this.c);
  private final a c = new a(null);
  
  protected j(Context paramContext, String paramString1, String paramString2) {}
  
  protected final void a(int paramInt)
  {
    try
    {
      this.b.a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "notifyFailedToStartSession", z.class.getSimpleName() });
    }
  }
  
  protected abstract void a(Bundle paramBundle);
  
  protected abstract void a(boolean paramBoolean);
  
  protected final void b(int paramInt)
  {
    try
    {
      this.b.b(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "notifySessionEnded", z.class.getSimpleName() });
    }
  }
  
  protected abstract void b(Bundle paramBundle);
  
  protected final void b(String paramString)
  {
    try
    {
      this.b.a(paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      a.a(paramString, "Unable to call %s on %s.", new Object[] { "notifySessionStarted", z.class.getSimpleName() });
    }
  }
  
  protected final void c(int paramInt)
  {
    try
    {
      this.b.c(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "notifyFailedToResumeSession", z.class.getSimpleName() });
    }
  }
  
  protected final void c(boolean paramBoolean)
  {
    try
    {
      this.b.a(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "notifySessionResumed", z.class.getSimpleName() });
    }
  }
  
  protected final void d(int paramInt)
  {
    try
    {
      this.b.d(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "notifySessionSuspended", z.class.getSimpleName() });
    }
  }
  
  public long k()
  {
    return 0L;
  }
  
  public final String m()
  {
    try
    {
      String str = this.b.b();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "getCategory", z.class.getSimpleName() });
    }
    return null;
  }
  
  public final String n()
  {
    try
    {
      String str = this.b.c();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "getSessionId", z.class.getSimpleName() });
    }
    return null;
  }
  
  public boolean o()
  {
    try
    {
      boolean bool = this.b.e();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "isConnected", z.class.getSimpleName() });
    }
    return false;
  }
  
  public boolean p()
  {
    try
    {
      boolean bool = this.b.f();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "isConnecting", z.class.getSimpleName() });
    }
    return false;
  }
  
  public boolean q()
  {
    try
    {
      boolean bool = this.b.g();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "isDisconnecting", z.class.getSimpleName() });
    }
    return false;
  }
  
  public boolean r()
  {
    try
    {
      boolean bool = this.b.h();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "isDisconnected", z.class.getSimpleName() });
    }
    return true;
  }
  
  public boolean s()
  {
    try
    {
      boolean bool = this.b.i();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "isResuming", z.class.getSimpleName() });
    }
    return false;
  }
  
  public boolean t()
  {
    try
    {
      boolean bool = this.b.j();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "isSuspended", z.class.getSimpleName() });
    }
    return false;
  }
  
  public final e u()
  {
    try
    {
      e locale = this.b.a();
      return locale;
    }
    catch (RemoteException localRemoteException)
    {
      a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "getWrappedObject", z.class.getSimpleName() });
    }
    return null;
  }
  
  private class a
    extends ad.a
  {
    private a() {}
    
    public int a()
    {
      return 9683208;
    }
    
    public void a(Bundle paramBundle)
    {
      j.this.a(paramBundle);
    }
    
    public void a(boolean paramBoolean)
    {
      j.this.a(paramBoolean);
    }
    
    public e b()
    {
      return f.a(j.this);
    }
    
    public void b(Bundle paramBundle)
    {
      j.this.b(paramBundle);
    }
    
    public long c()
    {
      return j.this.k();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */