package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d
  implements Parcelable.Creator<VersionInfoParcel>
{
  static void a(VersionInfoParcel paramVersionInfoParcel, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramVersionInfoParcel.a);
    b.a(paramParcel, 2, paramVersionInfoParcel.b, false);
    b.a(paramParcel, 3, paramVersionInfoParcel.c);
    b.a(paramParcel, 4, paramVersionInfoParcel.d);
    b.a(paramParcel, 5, paramVersionInfoParcel.e);
    b.a(paramParcel, paramInt);
  }
  
  public VersionInfoParcel a(Parcel paramParcel)
  {
    boolean bool = false;
    int m = a.b(paramParcel);
    String str = null;
    int i = 0;
    int j = 0;
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
        str = a.q(paramParcel, n);
        break;
      case 3: 
        j = a.g(paramParcel, n);
        break;
      case 4: 
        i = a.g(paramParcel, n);
        break;
      case 5: 
        bool = a.c(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new VersionInfoParcel(k, str, j, i, bool);
  }
  
  public VersionInfoParcel[] a(int paramInt)
  {
    return new VersionInfoParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/client/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */