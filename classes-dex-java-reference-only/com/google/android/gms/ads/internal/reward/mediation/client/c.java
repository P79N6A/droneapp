package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c
  implements Parcelable.Creator<RewardItemParcel>
{
  static void a(RewardItemParcel paramRewardItemParcel, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramRewardItemParcel.a);
    b.a(paramParcel, 2, paramRewardItemParcel.b, false);
    b.a(paramParcel, 3, paramRewardItemParcel.c);
    b.a(paramParcel, paramInt);
  }
  
  public RewardItemParcel a(Parcel paramParcel)
  {
    int j = 0;
    int k = a.b(paramParcel);
    String str = null;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        i = a.g(paramParcel, m);
        break;
      case 2: 
        str = a.q(paramParcel, m);
        break;
      case 3: 
        j = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new RewardItemParcel(i, str, j);
  }
  
  public RewardItemParcel[] a(int paramInt)
  {
    return new RewardItemParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/reward/mediation/client/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */