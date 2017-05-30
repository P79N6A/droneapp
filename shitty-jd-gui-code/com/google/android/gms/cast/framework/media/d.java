package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d
  implements Parcelable.Creator<CastMediaOptions>
{
  static void a(CastMediaOptions paramCastMediaOptions, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramCastMediaOptions.a());
    b.a(paramParcel, 2, paramCastMediaOptions.b(), false);
    b.a(paramParcel, 3, paramCastMediaOptions.d(), false);
    b.a(paramParcel, 4, paramCastMediaOptions.f(), false);
    b.a(paramParcel, 5, paramCastMediaOptions.c(), paramInt, false);
    b.a(paramParcel, i);
  }
  
  public CastMediaOptions a(Parcel paramParcel)
  {
    NotificationOptions localNotificationOptions = null;
    int j = a.b(paramParcel);
    int i = 0;
    IBinder localIBinder = null;
    String str1 = null;
    String str2 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        i = a.g(paramParcel, k);
        break;
      case 2: 
        str2 = a.q(paramParcel, k);
        break;
      case 3: 
        str1 = a.q(paramParcel, k);
        break;
      case 4: 
        localIBinder = a.r(paramParcel, k);
        break;
      case 5: 
        localNotificationOptions = (NotificationOptions)a.a(paramParcel, k, NotificationOptions.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new CastMediaOptions(i, str2, str1, localIBinder, localNotificationOptions);
  }
  
  public CastMediaOptions[] a(int paramInt)
  {
    return new CastMediaOptions[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */