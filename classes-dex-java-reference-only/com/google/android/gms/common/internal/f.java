package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f
  implements Parcelable.Creator<ResolveAccountResponse>
{
  static void a(ResolveAccountResponse paramResolveAccountResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramResolveAccountResponse.a);
    b.a(paramParcel, 2, paramResolveAccountResponse.b, false);
    b.a(paramParcel, 3, paramResolveAccountResponse.b(), paramInt, false);
    b.a(paramParcel, 4, paramResolveAccountResponse.c());
    b.a(paramParcel, 5, paramResolveAccountResponse.d());
    b.a(paramParcel, i);
  }
  
  public ResolveAccountResponse a(Parcel paramParcel)
  {
    ConnectionResult localConnectionResult = null;
    boolean bool1 = false;
    int j = a.b(paramParcel);
    boolean bool2 = false;
    IBinder localIBinder = null;
    int i = 0;
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
        localConnectionResult = (ConnectionResult)a.a(paramParcel, k, ConnectionResult.CREATOR);
        break;
      case 4: 
        bool2 = a.c(paramParcel, k);
        break;
      case 5: 
        bool1 = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new ResolveAccountResponse(i, localIBinder, localConnectionResult, bool2, bool1);
  }
  
  public ResolveAccountResponse[] a(int paramInt)
  {
    return new ResolveAccountResponse[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */