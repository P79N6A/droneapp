package com.google.android.gms.ads.internal.reward.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;

@aaa
public class e
  implements com.google.android.gms.ads.b.a
{
  private final a a;
  
  public e(a parama)
  {
    this.a = parama;
  }
  
  public String a()
  {
    if (this.a == null) {
      return null;
    }
    try
    {
      String str = this.a.a();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      b.d("Could not forward getType to RewardItem", localRemoteException);
    }
    return null;
  }
  
  public int b()
  {
    if (this.a == null) {
      return 0;
    }
    try
    {
      int i = this.a.b();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      b.d("Could not forward getAmount to RewardItem", localRemoteException);
    }
    return 0;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/reward/client/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */