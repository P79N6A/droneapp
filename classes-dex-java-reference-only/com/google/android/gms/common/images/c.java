package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c
  implements Parcelable.Creator<WebImage>
{
  static void a(WebImage paramWebImage, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramWebImage.a());
    b.a(paramParcel, 2, paramWebImage.b(), paramInt, false);
    b.a(paramParcel, 3, paramWebImage.c());
    b.a(paramParcel, 4, paramWebImage.d());
    b.a(paramParcel, i);
  }
  
  public WebImage a(Parcel paramParcel)
  {
    int i = 0;
    int m = a.b(paramParcel);
    Uri localUri = null;
    int j = 0;
    int k = 0;
    if (paramParcel.dataPosition() < m)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
      }
      for (;;)
      {
        break;
        k = a.g(paramParcel, n);
        continue;
        localUri = (Uri)a.a(paramParcel, n, Uri.CREATOR);
        continue;
        j = a.g(paramParcel, n);
        continue;
        i = a.g(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new WebImage(k, localUri, j, i);
  }
  
  public WebImage[] a(int paramInt)
  {
    return new WebImage[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/images/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */