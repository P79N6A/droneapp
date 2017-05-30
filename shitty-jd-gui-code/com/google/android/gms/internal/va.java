package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.a.a;
import com.google.android.gms.ads.formats.c;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@aaa
public class va
  extends c
{
  private final uz a;
  private final List<a.a> b = new ArrayList();
  private final uv c;
  private h d = new h();
  
  public va(uz paramuz)
  {
    this.a = paramuz;
    try
    {
      paramuz = this.a.b();
      if (paramuz != null)
      {
        paramuz = paramuz.iterator();
        while (paramuz.hasNext())
        {
          uu localuu = a(paramuz.next());
          if (localuu != null) {
            this.b.add(new uv(localuu));
          }
        }
      }
      try
      {
        paramuz = this.a.d();
        if (paramuz == null) {
          break label140;
        }
        paramuz = new uv(paramuz);
      }
      catch (RemoteException paramuz)
      {
        for (;;)
        {
          b.b("Failed to get icon.", paramuz);
          paramuz = null;
        }
      }
    }
    catch (RemoteException paramuz)
    {
      b.b("Failed to get image.", paramuz);
    }
    this.c = paramuz;
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
  
  public Double g()
  {
    try
    {
      double d1 = this.a.f();
      if (d1 == -1.0D) {
        return null;
      }
      return Double.valueOf(d1);
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to get star rating.", localRemoteException);
    }
    return null;
  }
  
  public CharSequence h()
  {
    try
    {
      String str = this.a.g();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to get store", localRemoteException);
    }
    return null;
  }
  
  public CharSequence i()
  {
    try
    {
      String str = this.a.h();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to get price.", localRemoteException);
    }
    return null;
  }
  
  public h j()
  {
    try
    {
      if (this.a.i() != null) {
        this.d.a(this.a.i());
      }
      return this.d;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        b.b("Exception occurred while getting video controller", localRemoteException);
      }
    }
  }
  
  public Bundle k()
  {
    try
    {
      Bundle localBundle = this.a.n();
      return localBundle;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to get extras", localRemoteException);
    }
    return null;
  }
  
  public void l()
  {
    try
    {
      this.a.p();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to destroy", localRemoteException);
    }
  }
  
  protected e m()
  {
    try
    {
      e locale = this.a.j();
      return locale;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to retrieve native ad engine.", localRemoteException);
    }
    return null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/va.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */