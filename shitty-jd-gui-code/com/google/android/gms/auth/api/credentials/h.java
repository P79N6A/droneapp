package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h
  implements Parcelable.Creator<IdToken>
{
  static void a(IdToken paramIdToken, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramIdToken.a(), false);
    b.a(paramParcel, 2, paramIdToken.b(), false);
    b.a(paramParcel, 1000, paramIdToken.a);
    b.a(paramParcel, paramInt);
  }
  
  public IdToken a(Parcel paramParcel)
  {
    String str2 = null;
    int j = a.b(paramParcel);
    int i = 0;
    String str1 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str1 = a.q(paramParcel, k);
        break;
      case 2: 
        str2 = a.q(paramParcel, k);
        break;
      case 1000: 
        i = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new IdToken(i, str1, str2);
  }
  
  public IdToken[] a(int paramInt)
  {
    return new IdToken[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */