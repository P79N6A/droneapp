package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class m
  implements Parcelable.Creator<MediaInfo>
{
  static void a(MediaInfo paramMediaInfo, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramMediaInfo.a());
    b.a(paramParcel, 2, paramMediaInfo.b(), false);
    b.a(paramParcel, 3, paramMediaInfo.c());
    b.a(paramParcel, 4, paramMediaInfo.d(), false);
    b.a(paramParcel, 5, paramMediaInfo.e(), paramInt, false);
    b.a(paramParcel, 6, paramMediaInfo.f());
    b.c(paramParcel, 7, paramMediaInfo.g(), false);
    b.a(paramParcel, 8, paramMediaInfo.h(), paramInt, false);
    b.a(paramParcel, 9, paramMediaInfo.f, false);
    b.c(paramParcel, 10, paramMediaInfo.j(), false);
    b.a(paramParcel, i);
  }
  
  public MediaInfo a(Parcel paramParcel)
  {
    int i = 0;
    ArrayList localArrayList1 = null;
    int k = a.b(paramParcel);
    long l = 0L;
    String str1 = null;
    TextTrackStyle localTextTrackStyle = null;
    ArrayList localArrayList2 = null;
    MediaMetadata localMediaMetadata = null;
    String str2 = null;
    String str3 = null;
    int j = 0;
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
        str3 = a.q(paramParcel, m);
        break;
      case 3: 
        i = a.g(paramParcel, m);
        break;
      case 4: 
        str2 = a.q(paramParcel, m);
        break;
      case 5: 
        localMediaMetadata = (MediaMetadata)a.a(paramParcel, m, MediaMetadata.CREATOR);
        break;
      case 6: 
        l = a.i(paramParcel, m);
        break;
      case 7: 
        localArrayList2 = a.c(paramParcel, m, MediaTrack.CREATOR);
        break;
      case 8: 
        localTextTrackStyle = (TextTrackStyle)a.a(paramParcel, m, TextTrackStyle.CREATOR);
        break;
      case 9: 
        str1 = a.q(paramParcel, m);
        break;
      case 10: 
        localArrayList1 = a.c(paramParcel, m, AdBreakInfo.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new MediaInfo(j, str3, i, str2, localMediaMetadata, l, localArrayList2, localTextTrackStyle, str1, localArrayList1);
  }
  
  public MediaInfo[] a(int paramInt)
  {
    return new MediaInfo[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */