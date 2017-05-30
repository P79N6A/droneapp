package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class r
  implements Parcelable.Creator<VideoOptionsParcel>
{
  static void a(VideoOptionsParcel paramVideoOptionsParcel, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramVideoOptionsParcel.a);
    b.a(paramParcel, 2, paramVideoOptionsParcel.b);
    b.a(paramParcel, paramInt);
  }
  
  public VideoOptionsParcel a(Parcel paramParcel)
  {
    boolean bool = false;
    int j = a.b(paramParcel);
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
        bool = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new VideoOptionsParcel(i, bool);
  }
  
  public VideoOptionsParcel[] a(int paramInt)
  {
    return new VideoOptionsParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */