package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.ab;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.yz;

public class InAppPurchaseActivity
  extends Activity
{
  public static final String a = "com.google.android.gms.ads.purchase.InAppPurchaseActivity";
  public static final String b = "InAppPurchaseActivity";
  private yz c;
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      if (this.c != null) {
        this.c.a(paramInt1, paramInt2, paramIntent);
      }
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        b.d("Could not forward onActivityResult to in-app purchase manager:", localRemoteException);
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.c = ac.b().a(this);
    if (this.c == null)
    {
      b.d("Could not create in-app purchase manager.");
      finish();
      return;
    }
    try
    {
      this.c.a();
      return;
    }
    catch (RemoteException paramBundle)
    {
      b.d("Could not forward onCreate to in-app purchase manager:", paramBundle);
      finish();
    }
  }
  
  protected void onDestroy()
  {
    try
    {
      if (this.c != null) {
        this.c.b();
      }
      super.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        b.d("Could not forward onDestroy to in-app purchase manager:", localRemoteException);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/purchase/InAppPurchaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */