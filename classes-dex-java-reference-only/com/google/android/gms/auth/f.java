package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f
  implements Parcelable.Creator<AccountChangeEvent>
{
  static void a(AccountChangeEvent paramAccountChangeEvent, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramAccountChangeEvent.a);
    b.a(paramParcel, 2, paramAccountChangeEvent.b);
    b.a(paramParcel, 3, paramAccountChangeEvent.c, false);
    b.a(paramParcel, 4, paramAccountChangeEvent.d);
    b.a(paramParcel, 5, paramAccountChangeEvent.e);
    b.a(paramParcel, 6, paramAccountChangeEvent.f, false);
    b.a(paramParcel, paramInt);
  }
  
  public AccountChangeEvent a(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    int m = a.b(paramParcel);
    long l = 0L;
    int j = 0;
    String str2 = null;
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
        l = a.i(paramParcel, n);
        break;
      case 3: 
        str2 = a.q(paramParcel, n);
        break;
      case 4: 
        j = a.g(paramParcel, n);
        break;
      case 5: 
        i = a.g(paramParcel, n);
        break;
      case 6: 
        str1 = a.q(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new AccountChangeEvent(k, l, str2, j, i, str1);
  }
  
  public AccountChangeEvent[] a(int paramInt)
  {
    return new AccountChangeEvent[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */