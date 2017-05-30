package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e
  implements Parcelable.Creator<ProxyResponse>
{
  static void a(ProxyResponse paramProxyResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramProxyResponse.c);
    b.a(paramParcel, 2, paramProxyResponse.d, paramInt, false);
    b.a(paramParcel, 3, paramProxyResponse.e);
    b.a(paramParcel, 4, paramProxyResponse.f, false);
    b.a(paramParcel, 5, paramProxyResponse.g, false);
    b.a(paramParcel, 1000, paramProxyResponse.b);
    b.a(paramParcel, i);
  }
  
  public ProxyResponse a(Parcel paramParcel)
  {
    byte[] arrayOfByte = null;
    int i = 0;
    int m = a.b(paramParcel);
    Bundle localBundle = null;
    PendingIntent localPendingIntent = null;
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
        j = a.g(paramParcel, n);
        break;
      case 2: 
        localPendingIntent = (PendingIntent)a.a(paramParcel, n, PendingIntent.CREATOR);
        break;
      case 3: 
        i = a.g(paramParcel, n);
        break;
      case 4: 
        localBundle = a.s(paramParcel, n);
        break;
      case 5: 
        arrayOfByte = a.t(paramParcel, n);
        break;
      case 1000: 
        k = a.g(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new ProxyResponse(k, j, localPendingIntent, i, localBundle, arrayOfByte);
  }
  
  public ProxyResponse[] a(int paramInt)
  {
    return new ProxyResponse[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/proxy/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */