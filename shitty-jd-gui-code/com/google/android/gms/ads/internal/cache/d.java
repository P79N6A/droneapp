package com.google.android.gms.ads.internal.cache;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d
  implements Parcelable.Creator<CacheOffering>
{
  static void a(CacheOffering paramCacheOffering, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramCacheOffering.a);
    b.a(paramParcel, 2, paramCacheOffering.b, false);
    b.a(paramParcel, 3, paramCacheOffering.c);
    b.a(paramParcel, 4, paramCacheOffering.d, false);
    b.a(paramParcel, 5, paramCacheOffering.e, false);
    b.a(paramParcel, 6, paramCacheOffering.f, false);
    b.a(paramParcel, 7, paramCacheOffering.g, false);
    b.a(paramParcel, 8, paramCacheOffering.h);
    b.a(paramParcel, paramInt);
  }
  
  public CacheOffering a(Parcel paramParcel)
  {
    boolean bool = false;
    Bundle localBundle = null;
    int j = a.b(paramParcel);
    long l = 0L;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
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
        str4 = a.q(paramParcel, k);
        break;
      case 3: 
        l = a.i(paramParcel, k);
        break;
      case 4: 
        str3 = a.q(paramParcel, k);
        break;
      case 5: 
        str2 = a.q(paramParcel, k);
        break;
      case 6: 
        str1 = a.q(paramParcel, k);
        break;
      case 7: 
        localBundle = a.s(paramParcel, k);
        break;
      case 8: 
        bool = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new CacheOffering(i, str4, l, str3, str2, str1, localBundle, bool);
  }
  
  public CacheOffering[] a(int paramInt)
  {
    return new CacheOffering[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/cache/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */