package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d
  implements Parcelable.Creator<ProxyRequest>
{
  static void a(ProxyRequest paramProxyRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramProxyRequest.l, false);
    b.a(paramParcel, 2, paramProxyRequest.m);
    b.a(paramParcel, 3, paramProxyRequest.n);
    b.a(paramParcel, 4, paramProxyRequest.o, false);
    b.a(paramParcel, 5, paramProxyRequest.p, false);
    b.a(paramParcel, 1000, paramProxyRequest.k);
    b.a(paramParcel, paramInt);
  }
  
  public ProxyRequest a(Parcel paramParcel)
  {
    int i = 0;
    Bundle localBundle = null;
    int k = a.b(paramParcel);
    long l = 0L;
    byte[] arrayOfByte = null;
    String str = null;
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
        str = a.q(paramParcel, m);
        break;
      case 2: 
        i = a.g(paramParcel, m);
        break;
      case 3: 
        l = a.i(paramParcel, m);
        break;
      case 4: 
        arrayOfByte = a.t(paramParcel, m);
        break;
      case 5: 
        localBundle = a.s(paramParcel, m);
        break;
      case 1000: 
        j = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new ProxyRequest(j, str, i, l, arrayOfByte, localBundle);
  }
  
  public ProxyRequest[] a(int paramInt)
  {
    return new ProxyRequest[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/proxy/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */