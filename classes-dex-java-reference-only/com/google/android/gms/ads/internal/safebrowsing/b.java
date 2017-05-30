package com.google.android.gms.ads.internal.safebrowsing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;

public class b
  implements Parcelable.Creator<SafeBrowsingConfigParcel>
{
  static void a(SafeBrowsingConfigParcel paramSafeBrowsingConfigParcel, Parcel paramParcel, int paramInt)
  {
    paramInt = com.google.android.gms.common.internal.safeparcel.b.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 1, paramSafeBrowsingConfigParcel.a);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramSafeBrowsingConfigParcel.b, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramSafeBrowsingConfigParcel.c, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 4, paramSafeBrowsingConfigParcel.d);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 5, paramSafeBrowsingConfigParcel.e);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, paramInt);
  }
  
  public SafeBrowsingConfigParcel a(Parcel paramParcel)
  {
    String str1 = null;
    boolean bool1 = false;
    int j = a.b(paramParcel);
    boolean bool2 = false;
    String str2 = null;
    int i = 0;
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
        str2 = a.q(paramParcel, k);
        break;
      case 3: 
        str1 = a.q(paramParcel, k);
        break;
      case 4: 
        bool2 = a.c(paramParcel, k);
        break;
      case 5: 
        bool1 = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new SafeBrowsingConfigParcel(i, str2, str1, bool2, bool1);
  }
  
  public SafeBrowsingConfigParcel[] a(int paramInt)
  {
    return new SafeBrowsingConfigParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/safebrowsing/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */