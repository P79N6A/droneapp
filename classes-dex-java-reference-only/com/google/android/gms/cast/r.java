package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class r
  implements Parcelable.Creator<TextTrackStyle>
{
  static void a(TextTrackStyle paramTextTrackStyle, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramTextTrackStyle.a());
    b.a(paramParcel, 2, paramTextTrackStyle.b());
    b.a(paramParcel, 3, paramTextTrackStyle.c());
    b.a(paramParcel, 4, paramTextTrackStyle.d());
    b.a(paramParcel, 5, paramTextTrackStyle.e());
    b.a(paramParcel, 6, paramTextTrackStyle.f());
    b.a(paramParcel, 7, paramTextTrackStyle.g());
    b.a(paramParcel, 8, paramTextTrackStyle.h());
    b.a(paramParcel, 9, paramTextTrackStyle.i());
    b.a(paramParcel, 10, paramTextTrackStyle.j(), false);
    b.a(paramParcel, 11, paramTextTrackStyle.k());
    b.a(paramParcel, 12, paramTextTrackStyle.l());
    b.a(paramParcel, 13, paramTextTrackStyle.z, false);
    b.a(paramParcel, paramInt);
  }
  
  public TextTrackStyle a(Parcel paramParcel)
  {
    int i6 = a.b(paramParcel);
    int i5 = 0;
    float f = 0.0F;
    int i4 = 0;
    int i3 = 0;
    int i2 = 0;
    int i1 = 0;
    int n = 0;
    int m = 0;
    int k = 0;
    String str2 = null;
    int j = 0;
    int i = 0;
    String str1 = null;
    while (paramParcel.dataPosition() < i6)
    {
      int i7 = a.a(paramParcel);
      switch (a.a(i7))
      {
      default: 
        a.b(paramParcel, i7);
        break;
      case 1: 
        i5 = a.g(paramParcel, i7);
        break;
      case 2: 
        f = a.l(paramParcel, i7);
        break;
      case 3: 
        i4 = a.g(paramParcel, i7);
        break;
      case 4: 
        i3 = a.g(paramParcel, i7);
        break;
      case 5: 
        i2 = a.g(paramParcel, i7);
        break;
      case 6: 
        i1 = a.g(paramParcel, i7);
        break;
      case 7: 
        n = a.g(paramParcel, i7);
        break;
      case 8: 
        m = a.g(paramParcel, i7);
        break;
      case 9: 
        k = a.g(paramParcel, i7);
        break;
      case 10: 
        str2 = a.q(paramParcel, i7);
        break;
      case 11: 
        j = a.g(paramParcel, i7);
        break;
      case 12: 
        i = a.g(paramParcel, i7);
        break;
      case 13: 
        str1 = a.q(paramParcel, i7);
      }
    }
    if (paramParcel.dataPosition() != i6) {
      throw new a.a(37 + "Overread allowed size end=" + i6, paramParcel);
    }
    return new TextTrackStyle(i5, f, i4, i3, i2, i1, n, m, k, str2, j, i, str1);
  }
  
  public TextTrackStyle[] a(int paramInt)
  {
    return new TextTrackStyle[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */