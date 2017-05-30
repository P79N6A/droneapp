package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.ads.purchase.a;

@aaa
public class zh
  implements a
{
  private final yx e;
  
  public zh(yx paramyx)
  {
    this.e = paramyx;
  }
  
  public String a()
  {
    try
    {
      String str = this.e.a();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      b.d("Could not forward getProductId to InAppPurchase", localRemoteException);
    }
    return null;
  }
  
  public void a(int paramInt)
  {
    try
    {
      this.e.b(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      b.d("Could not forward recordResolution to InAppPurchase", localRemoteException);
    }
  }
  
  public void b(int paramInt)
  {
    try
    {
      this.e.c(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      b.d("Could not forward recordPlayBillingResolution to InAppPurchase", localRemoteException);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */