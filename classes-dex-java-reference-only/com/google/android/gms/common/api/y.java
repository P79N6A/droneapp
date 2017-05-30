package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class y
  implements Parcelable.Creator<Status>
{
  static void a(Status paramStatus, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramStatus.i());
    b.a(paramParcel, 2, paramStatus.c(), false);
    b.a(paramParcel, 3, paramStatus.b(), paramInt, false);
    b.a(paramParcel, 1000, paramStatus.d());
    b.a(paramParcel, i);
  }
  
  public Status a(Parcel paramParcel)
  {
    PendingIntent localPendingIntent = null;
    int j = 0;
    int k = a.b(paramParcel);
    String str = null;
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
        j = a.g(paramParcel, m);
        break;
      case 2: 
        str = a.q(paramParcel, m);
        break;
      case 3: 
        localPendingIntent = (PendingIntent)a.a(paramParcel, m, PendingIntent.CREATOR);
        break;
      case 1000: 
        i = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new Status(i, j, str, localPendingIntent);
  }
  
  public Status[] a(int paramInt)
  {
    return new Status[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */