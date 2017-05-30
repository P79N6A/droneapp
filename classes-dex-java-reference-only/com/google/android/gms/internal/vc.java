package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.a.a;
import com.google.android.gms.ads.formats.d;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@aaa
public class vc
  extends d
{
  private final vb a;
  private final List<a.a> b = new ArrayList();
  private final uv c;
  
  public vc(vb paramvb)
  {
    this.a = paramvb;
    try
    {
      paramvb = this.a.b();
      if (paramvb != null)
      {
        paramvb = paramvb.iterator();
        while (paramvb.hasNext())
        {
          uu localuu = a(paramvb.next());
          if (localuu != null) {
            this.b.add(new uv(localuu));
          }
        }
      }
      try
      {
        paramvb = this.a.d();
        if (paramvb == null) {
          break label129;
        }
        paramvb = new uv(paramvb);
      }
      catch (RemoteException paramvb)
      {
        for (;;)
        {
          b.b("Failed to get icon.", paramvb);
          paramvb = null;
        }
      }
    }
    catch (RemoteException paramvb)
    {
      b.b("Failed to get image.", paramvb);
    }
    this.c = paramvb;
  }
  
  uu a(Object paramObject)
  {
    if ((paramObject instanceof IBinder)) {
      return uu.a.a((IBinder)paramObject);
    }
    return null;
  }
  
  public CharSequence b()
  {
    try
    {
      String str = this.a.a();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to get headline.", localRemoteException);
    }
    return null;
  }
  
  public List<a.a> c()
  {
    return this.b;
  }
  
  public CharSequence d()
  {
    try
    {
      String str = this.a.c();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to get body.", localRemoteException);
    }
    return null;
  }
  
  public a.a e()
  {
    return this.c;
  }
  
  public CharSequence f()
  {
    try
    {
      String str = this.a.e();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to get call to action.", localRemoteException);
    }
    return null;
  }
  
  public CharSequence g()
  {
    try
    {
      String str = this.a.f();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to get attribution.", localRemoteException);
    }
    return null;
  }
  
  public Bundle h()
  {
    try
    {
      Bundle localBundle = this.a.h();
      return localBundle;
    }
    catch (RemoteException localRemoteException)
    {
      b.d("Failed to get extras", localRemoteException);
    }
    return null;
  }
  
  public void i()
  {
    try
    {
      this.a.i();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to destroy", localRemoteException);
    }
  }
  
  protected e j()
  {
    try
    {
      e locale = this.a.g();
      return locale;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to retrieve native ad engine.", localRemoteException);
    }
    return null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/vc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */