package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g
  implements Parcelable.Creator<AccountChangeEventsRequest>
{
  static void a(AccountChangeEventsRequest paramAccountChangeEventsRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramAccountChangeEventsRequest.a);
    b.a(paramParcel, 2, paramAccountChangeEventsRequest.b);
    b.a(paramParcel, 3, paramAccountChangeEventsRequest.c, false);
    b.a(paramParcel, 4, paramAccountChangeEventsRequest.d, paramInt, false);
    b.a(paramParcel, i);
  }
  
  public AccountChangeEventsRequest a(Parcel paramParcel)
  {
    Account localAccount = null;
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
        i = a.g(paramParcel, m);
        break;
      case 2: 
        j = a.g(paramParcel, m);
        break;
      case 3: 
        str = a.q(paramParcel, m);
        break;
      case 4: 
        localAccount = (Account)a.a(paramParcel, m, Account.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new AccountChangeEventsRequest(i, j, str, localAccount);
  }
  
  public AccountChangeEventsRequest[] a(int paramInt)
  {
    return new AccountChangeEventsRequest[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */