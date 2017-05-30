package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class n
  implements Parcelable.Creator<MediaMetadata>
{
  static void a(MediaMetadata paramMediaMetadata, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramMediaMetadata.a());
    b.c(paramParcel, 2, paramMediaMetadata.f(), false);
    b.a(paramParcel, 3, paramMediaMetadata.g, false);
    b.a(paramParcel, 4, paramMediaMetadata.b());
    b.a(paramParcel, paramInt);
  }
  
  public MediaMetadata a(Parcel paramParcel)
  {
    Bundle localBundle = null;
    int j = 0;
    int k = a.b(paramParcel);
    ArrayList localArrayList = null;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        i = a.g(paramParcel, m);
        break;
      case 2: 
        localArrayList = a.c(paramParcel, m, WebImage.CREATOR);
        break;
      case 3: 
        localBundle = a.s(paramParcel, m);
        break;
      case 4: 
        j = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new MediaMetadata(i, localArrayList, localBundle, j);
  }
  
  public MediaMetadata[] a(int paramInt)
  {
    return new MediaMetadata[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */