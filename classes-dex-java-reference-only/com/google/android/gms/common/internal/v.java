package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class v
  implements Parcelable.Creator<GetServiceRequest>
{
  static void a(GetServiceRequest paramGetServiceRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramGetServiceRequest.a);
    b.a(paramParcel, 2, paramGetServiceRequest.b);
    b.a(paramParcel, 3, paramGetServiceRequest.c);
    b.a(paramParcel, 4, paramGetServiceRequest.d, false);
    b.a(paramParcel, 5, paramGetServiceRequest.e, false);
    b.a(paramParcel, 6, paramGetServiceRequest.f, paramInt, false);
    b.a(paramParcel, 7, paramGetServiceRequest.g, false);
    b.a(paramParcel, 8, paramGetServiceRequest.h, paramInt, false);
    b.a(paramParcel, 9, paramGetServiceRequest.i);
    b.a(paramParcel, i);
  }
  
  public GetServiceRequest a(Parcel paramParcel)
  {
    int i = 0;
    Account localAccount = null;
    int m = a.b(paramParcel);
    long l = 0L;
    Bundle localBundle = null;
    Scope[] arrayOfScope = null;
    IBinder localIBinder = null;
    String str = null;
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
        k = a.g(paramParcel, n);
        break;
      case 2: 
        j = a.g(paramParcel, n);
        break;
      case 3: 
        i = a.g(paramParcel, n);
        break;
      case 4: 
        str = a.q(paramParcel, n);
        break;
      case 5: 
        localIBinder = a.r(paramParcel, n);
        break;
      case 6: 
        arrayOfScope = (Scope[])a.b(paramParcel, n, Scope.CREATOR);
        break;
      case 7: 
        localBundle = a.s(paramParcel, n);
        break;
      case 8: 
        localAccount = (Account)a.a(paramParcel, n, Account.CREATOR);
        break;
      case 9: 
        l = a.i(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new GetServiceRequest(k, j, i, str, localIBinder, arrayOfScope, localBundle, localAccount, l);
  }
  
  public GetServiceRequest[] a(int paramInt)
  {
    return new GetServiceRequest[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */