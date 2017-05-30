package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c
  implements Parcelable.Creator<ProxyGrpcRequest>
{
  static void a(ProxyGrpcRequest paramProxyGrpcRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramProxyGrpcRequest.b, false);
    b.a(paramParcel, 2, paramProxyGrpcRequest.c);
    b.a(paramParcel, 3, paramProxyGrpcRequest.d);
    b.a(paramParcel, 4, paramProxyGrpcRequest.e, false);
    b.a(paramParcel, 5, paramProxyGrpcRequest.f, false);
    b.a(paramParcel, 1000, paramProxyGrpcRequest.a);
    b.a(paramParcel, paramInt);
  }
  
  public ProxyGrpcRequest a(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int k = a.b(paramParcel);
    long l = 0L;
    byte[] arrayOfByte = null;
    String str2 = null;
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
        str2 = a.q(paramParcel, m);
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
        str1 = a.q(paramParcel, m);
        break;
      case 1000: 
        j = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new ProxyGrpcRequest(j, str2, i, l, arrayOfByte, str1);
  }
  
  public ProxyGrpcRequest[] a(int paramInt)
  {
    return new ProxyGrpcRequest[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/proxy/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */