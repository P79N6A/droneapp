package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h
  implements Parcelable.Creator<RewardedVideoAdRequestParcel>
{
  static void a(RewardedVideoAdRequestParcel paramRewardedVideoAdRequestParcel, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramRewardedVideoAdRequestParcel.a);
    b.a(paramParcel, 2, paramRewardedVideoAdRequestParcel.b, paramInt, false);
    b.a(paramParcel, 3, paramRewardedVideoAdRequestParcel.c, false);
    b.a(paramParcel, i);
  }
  
  public RewardedVideoAdRequestParcel a(Parcel paramParcel)
  {
    String str = null;
    int j = a.b(paramParcel);
    int i = 0;
    AdRequestParcel localAdRequestParcel = null;
    if (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
      }
      for (;;)
      {
        break;
        i = a.g(paramParcel, k);
        continue;
        localAdRequestParcel = (AdRequestParcel)a.a(paramParcel, k, AdRequestParcel.CREATOR);
        continue;
        str = a.q(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new RewardedVideoAdRequestParcel(i, localAdRequestParcel, str);
  }
  
  public RewardedVideoAdRequestParcel[] a(int paramInt)
  {
    return new RewardedVideoAdRequestParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/reward/client/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */