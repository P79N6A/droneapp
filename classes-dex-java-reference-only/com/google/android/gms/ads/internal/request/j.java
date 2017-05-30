package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class j
  implements Parcelable.Creator<CapabilityParcel>
{
  static void a(CapabilityParcel paramCapabilityParcel, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramCapabilityParcel.a);
    b.a(paramParcel, 2, paramCapabilityParcel.b);
    b.a(paramParcel, 3, paramCapabilityParcel.c);
    b.a(paramParcel, 4, paramCapabilityParcel.d);
    b.a(paramParcel, paramInt);
  }
  
  public CapabilityParcel a(Parcel paramParcel)
  {
    boolean bool3 = false;
    int j = a.b(paramParcel);
    boolean bool2 = false;
    boolean bool1 = false;
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
        bool1 = a.c(paramParcel, k);
        break;
      case 3: 
        bool2 = a.c(paramParcel, k);
        break;
      case 4: 
        bool3 = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new CapabilityParcel(i, bool1, bool2, bool3);
  }
  
  public CapabilityParcel[] a(int paramInt)
  {
    return new CapabilityParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */