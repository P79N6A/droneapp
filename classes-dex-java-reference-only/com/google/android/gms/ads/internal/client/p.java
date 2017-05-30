package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class p
  implements Parcelable.Creator<SearchAdRequestParcel>
{
  static void a(SearchAdRequestParcel paramSearchAdRequestParcel, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramSearchAdRequestParcel.a);
    b.a(paramParcel, 2, paramSearchAdRequestParcel.b);
    b.a(paramParcel, 3, paramSearchAdRequestParcel.c);
    b.a(paramParcel, 4, paramSearchAdRequestParcel.d);
    b.a(paramParcel, 5, paramSearchAdRequestParcel.e);
    b.a(paramParcel, 6, paramSearchAdRequestParcel.f);
    b.a(paramParcel, 7, paramSearchAdRequestParcel.g);
    b.a(paramParcel, 8, paramSearchAdRequestParcel.h);
    b.a(paramParcel, 9, paramSearchAdRequestParcel.i);
    b.a(paramParcel, 10, paramSearchAdRequestParcel.j, false);
    b.a(paramParcel, 11, paramSearchAdRequestParcel.k);
    b.a(paramParcel, 12, paramSearchAdRequestParcel.l, false);
    b.a(paramParcel, 13, paramSearchAdRequestParcel.m);
    b.a(paramParcel, 14, paramSearchAdRequestParcel.n);
    b.a(paramParcel, 15, paramSearchAdRequestParcel.o, false);
    b.a(paramParcel, paramInt);
  }
  
  public SearchAdRequestParcel a(Parcel paramParcel)
  {
    int i8 = a.b(paramParcel);
    int i7 = 0;
    int i6 = 0;
    int i5 = 0;
    int i4 = 0;
    int i3 = 0;
    int i2 = 0;
    int i1 = 0;
    int n = 0;
    int m = 0;
    String str3 = null;
    int k = 0;
    String str2 = null;
    int j = 0;
    int i = 0;
    String str1 = null;
    while (paramParcel.dataPosition() < i8)
    {
      int i9 = a.a(paramParcel);
      switch (a.a(i9))
      {
      default: 
        a.b(paramParcel, i9);
        break;
      case 1: 
        i7 = a.g(paramParcel, i9);
        break;
      case 2: 
        i6 = a.g(paramParcel, i9);
        break;
      case 3: 
        i5 = a.g(paramParcel, i9);
        break;
      case 4: 
        i4 = a.g(paramParcel, i9);
        break;
      case 5: 
        i3 = a.g(paramParcel, i9);
        break;
      case 6: 
        i2 = a.g(paramParcel, i9);
        break;
      case 7: 
        i1 = a.g(paramParcel, i9);
        break;
      case 8: 
        n = a.g(paramParcel, i9);
        break;
      case 9: 
        m = a.g(paramParcel, i9);
        break;
      case 10: 
        str3 = a.q(paramParcel, i9);
        break;
      case 11: 
        k = a.g(paramParcel, i9);
        break;
      case 12: 
        str2 = a.q(paramParcel, i9);
        break;
      case 13: 
        j = a.g(paramParcel, i9);
        break;
      case 14: 
        i = a.g(paramParcel, i9);
        break;
      case 15: 
        str1 = a.q(paramParcel, i9);
      }
    }
    if (paramParcel.dataPosition() != i8) {
      throw new a.a(37 + "Overread allowed size end=" + i8, paramParcel);
    }
    return new SearchAdRequestParcel(i7, i6, i5, i4, i3, i2, i1, n, m, str3, k, str2, j, i, str1);
  }
  
  public SearchAdRequestParcel[] a(int paramInt)
  {
    return new SearchAdRequestParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */