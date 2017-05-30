package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g
  implements Parcelable.Creator<SignInButtonConfig>
{
  static void a(SignInButtonConfig paramSignInButtonConfig, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramSignInButtonConfig.a);
    b.a(paramParcel, 2, paramSignInButtonConfig.a());
    b.a(paramParcel, 3, paramSignInButtonConfig.b());
    b.a(paramParcel, 4, paramSignInButtonConfig.c(), paramInt, false);
    b.a(paramParcel, i);
  }
  
  public SignInButtonConfig a(Parcel paramParcel)
  {
    int k = 0;
    int m = a.b(paramParcel);
    Scope[] arrayOfScope = null;
    int j = 0;
    int i = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        i = a.g(paramParcel, n);
        break;
      case 2: 
        j = a.g(paramParcel, n);
        break;
      case 3: 
        k = a.g(paramParcel, n);
        break;
      case 4: 
        arrayOfScope = (Scope[])a.b(paramParcel, n, Scope.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new SignInButtonConfig(i, j, k, arrayOfScope);
  }
  
  public SignInButtonConfig[] a(int paramInt)
  {
    return new SignInButtonConfig[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */