package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e
  implements Parcelable.Creator<CredentialPickerConfig>
{
  static void a(CredentialPickerConfig paramCredentialPickerConfig, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramCredentialPickerConfig.a());
    b.a(paramParcel, 2, paramCredentialPickerConfig.b());
    b.a(paramParcel, 3, paramCredentialPickerConfig.c());
    b.a(paramParcel, 4, paramCredentialPickerConfig.d());
    b.a(paramParcel, 1000, paramCredentialPickerConfig.a);
    b.a(paramParcel, paramInt);
  }
  
  public CredentialPickerConfig a(Parcel paramParcel)
  {
    int i = 0;
    int k = a.b(paramParcel);
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        bool3 = a.c(paramParcel, m);
        break;
      case 2: 
        bool2 = a.c(paramParcel, m);
        break;
      case 3: 
        bool1 = a.c(paramParcel, m);
        break;
      case 4: 
        i = a.g(paramParcel, m);
        break;
      case 1000: 
        j = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new CredentialPickerConfig(j, bool3, bool2, bool1, i);
  }
  
  public CredentialPickerConfig[] a(int paramInt)
  {
    return new CredentialPickerConfig[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */