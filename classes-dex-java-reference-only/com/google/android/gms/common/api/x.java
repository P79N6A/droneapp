package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class x
  implements Parcelable.Creator<Scope>
{
  static void a(Scope paramScope, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramScope.a);
    b.a(paramParcel, 2, paramScope.a(), false);
    b.a(paramParcel, paramInt);
  }
  
  public Scope a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    String str = null;
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
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new Scope(i, str);
  }
  
  public Scope[] a(int paramInt)
  {
    return new Scope[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */