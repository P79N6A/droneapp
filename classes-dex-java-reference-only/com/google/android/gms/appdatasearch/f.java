package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f
  implements Parcelable.Creator<GetRecentContextCall.Request>
{
  static void a(GetRecentContextCall.Request paramRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramRequest.b, paramInt, false);
    b.a(paramParcel, 2, paramRequest.c);
    b.a(paramParcel, 3, paramRequest.d);
    b.a(paramParcel, 4, paramRequest.e);
    b.a(paramParcel, 5, paramRequest.f, false);
    b.a(paramParcel, 1000, paramRequest.a);
    b.a(paramParcel, i);
  }
  
  public GetRecentContextCall.Request a(Parcel paramParcel)
  {
    String str = null;
    boolean bool1 = false;
    int j = a.b(paramParcel);
    boolean bool2 = false;
    boolean bool3 = false;
    Account localAccount = null;
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
        localAccount = (Account)a.a(paramParcel, k, Account.CREATOR);
        break;
      case 2: 
        bool3 = a.c(paramParcel, k);
        break;
      case 3: 
        bool2 = a.c(paramParcel, k);
        break;
      case 4: 
        bool1 = a.c(paramParcel, k);
        break;
      case 5: 
        str = a.q(paramParcel, k);
        break;
      case 1000: 
        i = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new GetRecentContextCall.Request(i, localAccount, bool3, bool2, bool1, str);
  }
  
  public GetRecentContextCall.Request[] a(int paramInt)
  {
    return new GetRecentContextCall.Request[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appdatasearch/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */