package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i
  implements Parcelable.Creator<ConnectionResult>
{
  static void a(ConnectionResult paramConnectionResult, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramConnectionResult.w);
    b.a(paramParcel, 2, paramConnectionResult.c());
    b.a(paramParcel, 3, paramConnectionResult.d(), paramInt, false);
    b.a(paramParcel, 4, paramConnectionResult.e(), false);
    b.a(paramParcel, i);
  }
  
  public ConnectionResult a(Parcel paramParcel)
  {
    String str = null;
    int j = 0;
    int m = a.b(paramParcel);
    PendingIntent localPendingIntent = null;
    int i = 0;
    if (paramParcel.dataPosition() < m)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        k = j;
        j = i;
        i = k;
      }
      for (;;)
      {
        k = j;
        j = i;
        i = k;
        break;
        k = a.g(paramParcel, k);
        i = j;
        j = k;
        continue;
        k = a.g(paramParcel, k);
        j = i;
        i = k;
        continue;
        localPendingIntent = (PendingIntent)a.a(paramParcel, k, PendingIntent.CREATOR);
        k = i;
        i = j;
        j = k;
        continue;
        str = a.q(paramParcel, k);
        k = i;
        i = j;
        j = k;
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new ConnectionResult(i, j, localPendingIntent, str);
  }
  
  public ConnectionResult[] a(int paramInt)
  {
    return new ConnectionResult[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */