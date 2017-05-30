package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e
  implements Parcelable.Creator<ResolveAccountRequest>
{
  static void a(ResolveAccountRequest paramResolveAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramResolveAccountRequest.a);
    b.a(paramParcel, 2, paramResolveAccountRequest.a(), paramInt, false);
    b.a(paramParcel, 3, paramResolveAccountRequest.b());
    b.a(paramParcel, 4, paramResolveAccountRequest.c(), paramInt, false);
    b.a(paramParcel, i);
  }
  
  public ResolveAccountRequest a(Parcel paramParcel)
  {
    GoogleSignInAccount localGoogleSignInAccount = null;
    int j = 0;
    int m = a.b(paramParcel);
    Account localAccount = null;
    int i = 0;
    if (paramParcel.dataPosition() < m)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        k = j;
        j = i;
        i = k;
      }
      for (;;)
      {
        k = j;
        j = i;
        i = k;
        break;
        k = a.g(paramParcel, k);
        i = j;
        j = k;
        continue;
        localAccount = (Account)a.a(paramParcel, k, Account.CREATOR);
        k = i;
        i = j;
        j = k;
        continue;
        k = a.g(paramParcel, k);
        j = i;
        i = k;
        continue;
        localGoogleSignInAccount = (GoogleSignInAccount)a.a(paramParcel, k, GoogleSignInAccount.CREATOR);
        k = i;
        i = j;
        j = k;
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new ResolveAccountRequest(i, localAccount, j, localGoogleSignInAccount);
  }
  
  public ResolveAccountRequest[] a(int paramInt)
  {
    return new ResolveAccountRequest[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */