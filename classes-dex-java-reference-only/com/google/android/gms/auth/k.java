package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class k
  implements Parcelable.Creator<TokenData>
{
  static void a(TokenData paramTokenData, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramTokenData.a);
    b.a(paramParcel, 2, paramTokenData.a(), false);
    b.a(paramParcel, 3, paramTokenData.b(), false);
    b.a(paramParcel, 4, paramTokenData.c());
    b.a(paramParcel, 5, paramTokenData.d());
    b.b(paramParcel, 6, paramTokenData.e(), false);
    b.a(paramParcel, paramInt);
  }
  
  public TokenData a(Parcel paramParcel)
  {
    ArrayList localArrayList = null;
    boolean bool1 = false;
    int j = a.b(paramParcel);
    boolean bool2 = false;
    Long localLong = null;
    String str = null;
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
        str = a.q(paramParcel, k);
        break;
      case 3: 
        localLong = a.j(paramParcel, k);
        break;
      case 4: 
        bool2 = a.c(paramParcel, k);
        break;
      case 5: 
        bool1 = a.c(paramParcel, k);
        break;
      case 6: 
        localArrayList = a.E(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new TokenData(i, str, localLong, bool2, bool1, localArrayList);
  }
  
  public TokenData[] a(int paramInt)
  {
    return new TokenData[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */