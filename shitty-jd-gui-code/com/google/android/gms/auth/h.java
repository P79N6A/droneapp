package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class h
  implements Parcelable.Creator<AccountChangeEventsResponse>
{
  static void a(AccountChangeEventsResponse paramAccountChangeEventsResponse, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramAccountChangeEventsResponse.a);
    b.c(paramParcel, 2, paramAccountChangeEventsResponse.b, false);
    b.a(paramParcel, paramInt);
  }
  
  public AccountChangeEventsResponse a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    ArrayList localArrayList = null;
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
        localArrayList = a.c(paramParcel, k, AccountChangeEvent.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new AccountChangeEventsResponse(i, localArrayList);
  }
  
  public AccountChangeEventsResponse[] a(int paramInt)
  {
    return new AccountChangeEventsResponse[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */