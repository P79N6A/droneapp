package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class q
  implements Parcelable.Creator<MediaTrack>
{
  static void a(MediaTrack paramMediaTrack, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramMediaTrack.a());
    b.a(paramParcel, 2, paramMediaTrack.b());
    b.a(paramParcel, 3, paramMediaTrack.c());
    b.a(paramParcel, 4, paramMediaTrack.d(), false);
    b.a(paramParcel, 5, paramMediaTrack.e(), false);
    b.a(paramParcel, 6, paramMediaTrack.f(), false);
    b.a(paramParcel, 7, paramMediaTrack.g(), false);
    b.a(paramParcel, 8, paramMediaTrack.h());
    b.a(paramParcel, 9, paramMediaTrack.l, false);
    b.a(paramParcel, paramInt);
  }
  
  public MediaTrack a(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int m = a.b(paramParcel);
    long l = 0L;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
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
        l = a.i(paramParcel, n);
        break;
      case 3: 
        j = a.g(paramParcel, n);
        break;
      case 4: 
        str5 = a.q(paramParcel, n);
        break;
      case 5: 
        str4 = a.q(paramParcel, n);
        break;
      case 6: 
        str3 = a.q(paramParcel, n);
        break;
      case 7: 
        str2 = a.q(paramParcel, n);
        break;
      case 8: 
        i = a.g(paramParcel, n);
        break;
      case 9: 
        str1 = a.q(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new MediaTrack(k, l, j, str5, str4, str3, str2, i, str1);
  }
  
  public MediaTrack[] a(int paramInt)
  {
    return new MediaTrack[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */