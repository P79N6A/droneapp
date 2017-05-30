package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class k
  implements Parcelable.Creator<ValidateAccountRequest>
{
  static void a(ValidateAccountRequest paramValidateAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramValidateAccountRequest.a);
    b.a(paramParcel, 2, paramValidateAccountRequest.a());
    b.a(paramParcel, 3, paramValidateAccountRequest.b, false);
    b.a(paramParcel, 4, paramValidateAccountRequest.b(), paramInt, false);
    b.a(paramParcel, 5, paramValidateAccountRequest.d(), false);
    b.a(paramParcel, 6, paramValidateAccountRequest.c(), false);
    b.a(paramParcel, i);
  }
  
  public ValidateAccountRequest a(Parcel paramParcel)
  {
    int i = 0;
    String str = null;
    int k = a.b(paramParcel);
    Bundle localBundle = null;
    Scope[] arrayOfScope = null;
    IBinder localIBinder = null;
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
        i = a.g(paramParcel, m);
        break;
      case 3: 
        localIBinder = a.r(paramParcel, m);
        break;
      case 4: 
        arrayOfScope = (Scope[])a.b(paramParcel, m, Scope.CREATOR);
        break;
      case 5: 
        localBundle = a.s(paramParcel, m);
        break;
      case 6: 
        str = a.q(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new ValidateAccountRequest(j, i, localIBinder, arrayOfScope, localBundle, str);
  }
  
  public ValidateAccountRequest[] a(int paramInt)
  {
    return new ValidateAccountRequest[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */