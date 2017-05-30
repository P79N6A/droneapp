package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h
  implements Parcelable.Creator<AdBreakInfo>
{
  static void a(AdBreakInfo paramAdBreakInfo, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramAdBreakInfo.a());
    b.a(paramParcel, 2, paramAdBreakInfo.b());
    b.a(paramParcel, paramInt);
  }
  
  public AdBreakInfo a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    long l = 0L;
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
        l = a.i(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new AdBreakInfo(i, l);
  }
  
  public AdBreakInfo[] a(int paramInt)
  {
    return new AdBreakInfo[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */