package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class a
  implements Parcelable.Creator<FavaDiagnosticsEntity>
{
  static void a(FavaDiagnosticsEntity paramFavaDiagnosticsEntity, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramFavaDiagnosticsEntity.a);
    b.a(paramParcel, 2, paramFavaDiagnosticsEntity.b, false);
    b.a(paramParcel, 3, paramFavaDiagnosticsEntity.c);
    b.a(paramParcel, paramInt);
  }
  
  public FavaDiagnosticsEntity a(Parcel paramParcel)
  {
    int j = 0;
    int k = com.google.android.gms.common.internal.safeparcel.a.b(paramParcel);
    String str = null;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = com.google.android.gms.common.internal.safeparcel.a.a(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.a(m))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, m);
        break;
      case 1: 
        i = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
        break;
      case 2: 
        str = com.google.android.gms.common.internal.safeparcel.a.q(paramParcel, m);
        break;
      case 3: 
        j = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new FavaDiagnosticsEntity(i, str, j);
  }
  
  public FavaDiagnosticsEntity[] a(int paramInt)
  {
    return new FavaDiagnosticsEntity[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/server/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */