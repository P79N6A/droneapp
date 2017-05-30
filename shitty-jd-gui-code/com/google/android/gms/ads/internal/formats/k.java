package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class k
  implements Parcelable.Creator<NativeAdOptionsParcel>
{
  static void a(NativeAdOptionsParcel paramNativeAdOptionsParcel, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramNativeAdOptionsParcel.a);
    b.a(paramParcel, 2, paramNativeAdOptionsParcel.b);
    b.a(paramParcel, 3, paramNativeAdOptionsParcel.c);
    b.a(paramParcel, 4, paramNativeAdOptionsParcel.d);
    b.a(paramParcel, 5, paramNativeAdOptionsParcel.e);
    b.a(paramParcel, 6, paramNativeAdOptionsParcel.f, paramInt, false);
    b.a(paramParcel, i);
  }
  
  public NativeAdOptionsParcel a(Parcel paramParcel)
  {
    int i = 0;
    int m = a.b(paramParcel);
    VideoOptionsParcel localVideoOptionsParcel = null;
    boolean bool1 = false;
    int j = 0;
    boolean bool2 = false;
    int k = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        k = a.g(paramParcel, n);
        break;
      case 2: 
        bool2 = a.c(paramParcel, n);
        break;
      case 3: 
        j = a.g(paramParcel, n);
        break;
      case 4: 
        bool1 = a.c(paramParcel, n);
        break;
      case 5: 
        i = a.g(paramParcel, n);
        break;
      case 6: 
        localVideoOptionsParcel = (VideoOptionsParcel)a.a(paramParcel, n, VideoOptionsParcel.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new NativeAdOptionsParcel(k, bool2, j, bool1, i, localVideoOptionsParcel);
  }
  
  public NativeAdOptionsParcel[] a(int paramInt)
  {
    return new NativeAdOptionsParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/formats/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */