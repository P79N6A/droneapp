package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class i
  implements Parcelable.Creator<PasswordSpecification>
{
  static void a(PasswordSpecification paramPasswordSpecification, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramPasswordSpecification.d, false);
    b.b(paramParcel, 2, paramPasswordSpecification.e, false);
    b.a(paramParcel, 3, paramPasswordSpecification.f, false);
    b.a(paramParcel, 4, paramPasswordSpecification.g);
    b.a(paramParcel, 5, paramPasswordSpecification.h);
    b.a(paramParcel, 1000, paramPasswordSpecification.c);
    b.a(paramParcel, paramInt);
  }
  
  public PasswordSpecification a(Parcel paramParcel)
  {
    ArrayList localArrayList1 = null;
    int i = 0;
    int m = a.b(paramParcel);
    int j = 0;
    ArrayList localArrayList2 = null;
    String str = null;
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
        str = a.q(paramParcel, n);
        break;
      case 2: 
        localArrayList2 = a.E(paramParcel, n);
        break;
      case 3: 
        localArrayList1 = a.D(paramParcel, n);
        break;
      case 4: 
        j = a.g(paramParcel, n);
        break;
      case 5: 
        i = a.g(paramParcel, n);
        break;
      case 1000: 
        k = a.g(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new PasswordSpecification(k, str, localArrayList2, localArrayList1, j, i);
  }
  
  public PasswordSpecification[] a(int paramInt)
  {
    return new PasswordSpecification[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */