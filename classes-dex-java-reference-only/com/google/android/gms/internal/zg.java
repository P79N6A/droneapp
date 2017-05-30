package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.ads.purchase.c;

@aaa
public class zg
  implements c
{
  private final zc a;
  
  public zg(zc paramzc)
  {
    this.a = paramzc;
  }
  
  public String a()
  {
    try
    {
      String str = this.a.b();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      b.d("Could not forward getProductId to InAppPurchaseResult", localRemoteException);
    }
    return null;
  }
  
  public Intent b()
  {
    try
    {
      Intent localIntent = this.a.c();
      return localIntent;
    }
    catch (RemoteException localRemoteException)
    {
      b.d("Could not forward getPurchaseData to InAppPurchaseResult", localRemoteException);
    }
    return null;
  }
  
  public int c()
  {
    try
    {
      int i = this.a.d();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      b.d("Could not forward getPurchaseData to InAppPurchaseResult", localRemoteException);
    }
    return 0;
  }
  
  public boolean d()
  {
    try
    {
      boolean bool = this.a.a();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      b.d("Could not forward isVerified to InAppPurchaseResult", localRemoteException);
    }
    return false;
  }
  
  public void e()
  {
    try
    {
      this.a.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      b.d("Could not forward finishPurchase to InAppPurchaseResult", localRemoteException);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */