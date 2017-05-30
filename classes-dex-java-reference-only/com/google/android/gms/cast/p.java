package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class p
  implements Parcelable.Creator<MediaStatus>
{
  static void a(MediaStatus paramMediaStatus, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramMediaStatus.a());
    b.a(paramParcel, 2, paramMediaStatus.f(), paramInt, false);
    b.a(paramParcel, 3, paramMediaStatus.b());
    b.a(paramParcel, 4, paramMediaStatus.l());
    b.a(paramParcel, 5, paramMediaStatus.e());
    b.a(paramParcel, 6, paramMediaStatus.c());
    b.a(paramParcel, 7, paramMediaStatus.d());
    b.a(paramParcel, 8, paramMediaStatus.g());
    b.a(paramParcel, 9, paramMediaStatus.u);
    b.a(paramParcel, 10, paramMediaStatus.h());
    b.a(paramParcel, 11, paramMediaStatus.i());
    b.a(paramParcel, 12, paramMediaStatus.j(), false);
    b.a(paramParcel, 13, paramMediaStatus.m());
    b.a(paramParcel, 14, paramMediaStatus.n());
    b.a(paramParcel, 15, paramMediaStatus.v, false);
    b.a(paramParcel, 16, paramMediaStatus.w);
    b.c(paramParcel, 17, paramMediaStatus.x, false);
    b.a(paramParcel, 18, paramMediaStatus.r());
    b.a(paramParcel, i);
  }
  
  public MediaStatus a(Parcel paramParcel)
  {
    int i3 = a.b(paramParcel);
    int i2 = 0;
    MediaInfo localMediaInfo = null;
    long l3 = 0L;
    int i1 = 0;
    double d2 = 0.0D;
    int n = 0;
    int m = 0;
    long l2 = 0L;
    long l1 = 0L;
    double d1 = 0.0D;
    boolean bool2 = false;
    long[] arrayOfLong = null;
    int k = 0;
    int j = 0;
    String str = null;
    int i = 0;
    ArrayList localArrayList = null;
    boolean bool1 = false;
    while (paramParcel.dataPosition() < i3)
    {
      int i4 = a.a(paramParcel);
      switch (a.a(i4))
      {
      default: 
        a.b(paramParcel, i4);
        break;
      case 1: 
        i2 = a.g(paramParcel, i4);
        break;
      case 2: 
        localMediaInfo = (MediaInfo)a.a(paramParcel, i4, MediaInfo.CREATOR);
        break;
      case 3: 
        l3 = a.i(paramParcel, i4);
        break;
      case 4: 
        i1 = a.g(paramParcel, i4);
        break;
      case 5: 
        d2 = a.n(paramParcel, i4);
        break;
      case 6: 
        n = a.g(paramParcel, i4);
        break;
      case 7: 
        m = a.g(paramParcel, i4);
        break;
      case 8: 
        l2 = a.i(paramParcel, i4);
        break;
      case 9: 
        l1 = a.i(paramParcel, i4);
        break;
      case 10: 
        d1 = a.n(paramParcel, i4);
        break;
      case 11: 
        bool2 = a.c(paramParcel, i4);
        break;
      case 12: 
        arrayOfLong = a.x(paramParcel, i4);
        break;
      case 13: 
        k = a.g(paramParcel, i4);
        break;
      case 14: 
        j = a.g(paramParcel, i4);
        break;
      case 15: 
        str = a.q(paramParcel, i4);
        break;
      case 16: 
        i = a.g(paramParcel, i4);
        break;
      case 17: 
        localArrayList = a.c(paramParcel, i4, MediaQueueItem.CREATOR);
        break;
      case 18: 
        bool1 = a.c(paramParcel, i4);
      }
    }
    if (paramParcel.dataPosition() != i3) {
      throw new a.a(37 + "Overread allowed size end=" + i3, paramParcel);
    }
    return new MediaStatus(i2, localMediaInfo, l3, i1, d2, n, m, l2, l1, d1, bool2, arrayOfLong, k, j, str, i, localArrayList, bool1);
  }
  
  public MediaStatus[] a(int paramInt)
  {
    return new MediaStatus[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */