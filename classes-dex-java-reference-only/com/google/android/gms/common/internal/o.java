package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class o
  implements Parcelable.Creator<AuthAccountRequest>
{
  static void a(AuthAccountRequest paramAuthAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramAuthAccountRequest.a);
    b.a(paramParcel, 2, paramAuthAccountRequest.b, false);
    b.a(paramParcel, 3, paramAuthAccountRequest.c, paramInt, false);
    b.a(paramParcel, 4, paramAuthAccountRequest.d, false);
    b.a(paramParcel, 5, paramAuthAccountRequest.e, false);
    b.a(paramParcel, i);
  }
  
  public AuthAccountRequest a(Parcel paramParcel)
  {
    Integer localInteger1 = null;
    int j = a.b(paramParcel);
    int i = 0;
    Integer localInteger2 = null;
    Scope[] arrayOfScope = null;
    IBinder localIBinder = null;
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
        localIBinder = a.r(paramParcel, k);
        break;
      case 3: 
        arrayOfScope = (Scope[])a.b(paramParcel, k, Scope.CREATOR);
        break;
      case 4: 
        localInteger2 = a.h(paramParcel, k);
        break;
      case 5: 
        localInteger1 = a.h(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new AuthAccountRequest(i, localIBinder, arrayOfScope, localInteger2, localInteger1);
  }
  
  public AuthAccountRequest[] a(int paramInt)
  {
    return new AuthAccountRequest[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */