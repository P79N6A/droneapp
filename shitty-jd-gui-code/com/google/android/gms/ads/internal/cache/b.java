package com.google.android.gms.ads.internal.cache;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;

public class b
  implements Parcelable.Creator<CacheEntryParcel>
{
  static void a(CacheEntryParcel paramCacheEntryParcel, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 1, paramCacheEntryParcel.a);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramCacheEntryParcel.c(), paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, i);
  }
  
  public CacheEntryParcel a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    ParcelFileDescriptor localParcelFileDescriptor = null;
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
        localParcelFileDescriptor = (ParcelFileDescriptor)a.a(paramParcel, k, ParcelFileDescriptor.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new CacheEntryParcel(i, localParcelFileDescriptor);
  }
  
  public CacheEntryParcel[] a(int paramInt)
  {
    return new CacheEntryParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/cache/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */