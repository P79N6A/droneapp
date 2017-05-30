package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;

public class b
  implements Parcelable.Creator<AdLauncherIntentInfoParcel>
{
  static void a(AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 1, paramAdLauncherIntentInfoParcel.a);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramAdLauncherIntentInfoParcel.b, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramAdLauncherIntentInfoParcel.c, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 4, paramAdLauncherIntentInfoParcel.d, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 5, paramAdLauncherIntentInfoParcel.e, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 6, paramAdLauncherIntentInfoParcel.f, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 7, paramAdLauncherIntentInfoParcel.g, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 8, paramAdLauncherIntentInfoParcel.h, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 9, paramAdLauncherIntentInfoParcel.i, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, i);
  }
  
  public AdLauncherIntentInfoParcel a(Parcel paramParcel)
  {
    Intent localIntent = null;
    int j = a.b(paramParcel);
    int i = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str7 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        i = a.g(paramParcel, k);
        break;
      case 2: 
        str7 = a.q(paramParcel, k);
        break;
      case 3: 
        str6 = a.q(paramParcel, k);
        break;
      case 4: 
        str5 = a.q(paramParcel, k);
        break;
      case 5: 
        str4 = a.q(paramParcel, k);
        break;
      case 6: 
        str3 = a.q(paramParcel, k);
        break;
      case 7: 
        str2 = a.q(paramParcel, k);
        break;
      case 8: 
        str1 = a.q(paramParcel, k);
        break;
      case 9: 
        localIntent = (Intent)a.a(paramParcel, k, Intent.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new AdLauncherIntentInfoParcel(i, str7, str6, str5, str4, str3, str2, str1, localIntent);
  }
  
  public AdLauncherIntentInfoParcel[] a(int paramInt)
  {
    return new AdLauncherIntentInfoParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */