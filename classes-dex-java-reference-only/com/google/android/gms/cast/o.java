package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class o
  implements Parcelable.Creator<MediaQueueItem>
{
  static void a(MediaQueueItem paramMediaQueueItem, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramMediaQueueItem.a());
    b.a(paramParcel, 2, paramMediaQueueItem.b(), paramInt, false);
    b.a(paramParcel, 3, paramMediaQueueItem.c());
    b.a(paramParcel, 4, paramMediaQueueItem.d());
    b.a(paramParcel, 5, paramMediaQueueItem.e());
    b.a(paramParcel, 6, paramMediaQueueItem.f());
    b.a(paramParcel, 7, paramMediaQueueItem.g());
    b.a(paramParcel, 8, paramMediaQueueItem.h(), false);
    b.a(paramParcel, 9, paramMediaQueueItem.c, false);
    b.a(paramParcel, i);
  }
  
  public MediaQueueItem a(Parcel paramParcel)
  {
    int k = a.b(paramParcel);
    int j = 0;
    MediaInfo localMediaInfo = null;
    int i = 0;
    boolean bool = false;
    double d3 = 0.0D;
    double d2 = 0.0D;
    double d1 = 0.0D;
    long[] arrayOfLong = null;
    String str = null;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        j = a.g(paramParcel, m);
        break;
      case 2: 
        localMediaInfo = (MediaInfo)a.a(paramParcel, m, MediaInfo.CREATOR);
        break;
      case 3: 
        i = a.g(paramParcel, m);
        break;
      case 4: 
        bool = a.c(paramParcel, m);
        break;
      case 5: 
        d3 = a.n(paramParcel, m);
        break;
      case 6: 
        d2 = a.n(paramParcel, m);
        break;
      case 7: 
        d1 = a.n(paramParcel, m);
        break;
      case 8: 
        arrayOfLong = a.x(paramParcel, m);
        break;
      case 9: 
        str = a.q(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new MediaQueueItem(j, localMediaInfo, i, bool, d3, d2, d1, arrayOfLong, str);
  }
  
  public MediaQueueItem[] a(int paramInt)
  {
    return new MediaQueueItem[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */