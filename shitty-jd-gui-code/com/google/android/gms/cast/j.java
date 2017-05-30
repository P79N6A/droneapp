package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class j
  implements Parcelable.Creator<CastDevice>
{
  static void a(CastDevice paramCastDevice, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramCastDevice.a());
    b.a(paramParcel, 2, paramCastDevice.c(), false);
    b.a(paramParcel, 3, paramCastDevice.f, false);
    b.a(paramParcel, 4, paramCastDevice.e(), false);
    b.a(paramParcel, 5, paramCastDevice.f(), false);
    b.a(paramParcel, 6, paramCastDevice.g(), false);
    b.a(paramParcel, 7, paramCastDevice.i());
    b.c(paramParcel, 8, paramCastDevice.j(), false);
    b.a(paramParcel, 9, paramCastDevice.l());
    b.a(paramParcel, 10, paramCastDevice.m());
    b.a(paramParcel, 11, paramCastDevice.h(), false);
    b.a(paramParcel, paramInt);
  }
  
  public CastDevice a(Parcel paramParcel)
  {
    int j = 0;
    String str1 = null;
    int n = a.b(paramParcel);
    int i = -1;
    ArrayList localArrayList = null;
    int k = 0;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    int m = 0;
    while (paramParcel.dataPosition() < n)
    {
      int i1 = a.a(paramParcel);
      switch (a.a(i1))
      {
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        m = a.g(paramParcel, i1);
        break;
      case 2: 
        str6 = a.q(paramParcel, i1);
        break;
      case 3: 
        str5 = a.q(paramParcel, i1);
        break;
      case 4: 
        str4 = a.q(paramParcel, i1);
        break;
      case 5: 
        str3 = a.q(paramParcel, i1);
        break;
      case 6: 
        str2 = a.q(paramParcel, i1);
        break;
      case 7: 
        k = a.g(paramParcel, i1);
        break;
      case 8: 
        localArrayList = a.c(paramParcel, i1, WebImage.CREATOR);
        break;
      case 9: 
        j = a.g(paramParcel, i1);
        break;
      case 10: 
        i = a.g(paramParcel, i1);
        break;
      case 11: 
        str1 = a.q(paramParcel, i1);
      }
    }
    if (paramParcel.dataPosition() != n) {
      throw new a.a(37 + "Overread allowed size end=" + n, paramParcel);
    }
    return new CastDevice(m, str6, str5, str4, str3, str2, k, localArrayList, j, i, str1);
  }
  
  public CastDevice[] a(int paramInt)
  {
    return new CastDevice[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */