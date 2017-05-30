package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.a.a;
import com.google.android.gms.ads.formats.e;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.List;

@aaa
public class ve
  implements e
{
  private final vd a;
  
  public ve(vd paramvd)
  {
    this.a = paramvd;
  }
  
  public CharSequence a(String paramString)
  {
    try
    {
      paramString = this.a.a(paramString);
      return paramString;
    }
    catch (RemoteException paramString)
    {
      b.b("Failed to get string.", paramString);
    }
    return null;
  }
  
  public List<String> a()
  {
    try
    {
      List localList = this.a.a();
      return localList;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to get available asset names.", localRemoteException);
    }
    return null;
  }
  
  public a.a b(String paramString)
  {
    try
    {
      paramString = this.a.b(paramString);
      if (paramString != null)
      {
        paramString = new uv(paramString);
        return paramString;
      }
    }
    catch (RemoteException paramString)
    {
      b.b("Failed to get image.", paramString);
    }
    return null;
  }
  
  public String b()
  {
    try
    {
      String str = this.a.l();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to get custom template id.", localRemoteException);
    }
    return null;
  }
  
  public void c()
  {
    try
    {
      this.a.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Failed to record impression.", localRemoteException);
    }
  }
  
  public void c(String paramString)
  {
    try
    {
      this.a.c(paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      b.b("Failed to perform click.", paramString);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */