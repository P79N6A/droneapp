package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class z
  implements Parcelable.Creator<AdSizeParcel>
{
  static void a(AdSizeParcel paramAdSizeParcel, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramAdSizeParcel.a);
    b.a(paramParcel, 2, paramAdSizeParcel.b, false);
    b.a(paramParcel, 3, paramAdSizeParcel.c);
    b.a(paramParcel, 4, paramAdSizeParcel.d);
    b.a(paramParcel, 5, paramAdSizeParcel.e);
    b.a(paramParcel, 6, paramAdSizeParcel.f);
    b.a(paramParcel, 7, paramAdSizeParcel.g);
    b.a(paramParcel, 8, paramAdSizeParcel.h, paramInt, false);
    b.a(paramParcel, 9, paramAdSizeParcel.i);
    b.a(paramParcel, 10, paramAdSizeParcel.j);
    b.a(paramParcel, 11, paramAdSizeParcel.k);
    b.a(paramParcel, i);
  }
  
  public AdSizeParcel a(Parcel paramParcel)
  {
    AdSizeParcel[] arrayOfAdSizeParcel = null;
    boolean bool1 = false;
    int i1 = a.b(paramParcel);
    boolean bool2 = false;
    boolean bool3 = false;
    int i = 0;
    int j = 0;
    boolean bool4 = false;
    int k = 0;
    int m = 0;
    String str = null;
    int n = 0;
    while (paramParcel.dataPosition() < i1)
    {
      int i2 = a.a(paramParcel);
      switch (a.a(i2))
      {
      default: 
        a.b(paramParcel, i2);
        break;
      case 1: 
        n = a.g(paramParcel, i2);
        break;
      case 2: 
        str = a.q(paramParcel, i2);
        break;
      case 3: 
        m = a.g(paramParcel, i2);
        break;
      case 4: 
        k = a.g(paramParcel, i2);
        break;
      case 5: 
        bool4 = a.c(paramParcel, i2);
        break;
      case 6: 
        j = a.g(paramParcel, i2);
        break;
      case 7: 
        i = a.g(paramParcel, i2);
        break;
      case 8: 
        arrayOfAdSizeParcel = (AdSizeParcel[])a.b(paramParcel, i2, AdSizeParcel.CREATOR);
        break;
      case 9: 
        bool3 = a.c(paramParcel, i2);
        break;
      case 10: 
        bool2 = a.c(paramParcel, i2);
        break;
      case 11: 
        bool1 = a.c(paramParcel, i2);
      }
    }
    if (paramParcel.dataPosition() != i1) {
      throw new a.a(37 + "Overread allowed size end=" + i1, paramParcel);
    }
    return new AdSizeParcel(n, str, m, k, bool4, j, i, arrayOfAdSizeParcel, bool3, bool2, bool1);
  }
  
  public AdSizeParcel[] a(int paramInt)
  {
    return new AdSizeParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */