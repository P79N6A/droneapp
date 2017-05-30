package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f
  implements Parcelable.Creator<CredentialRequest>
{
  static void a(CredentialRequest paramCredentialRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramCredentialRequest.b());
    b.a(paramParcel, 2, paramCredentialRequest.c(), false);
    b.a(paramParcel, 3, paramCredentialRequest.d(), paramInt, false);
    b.a(paramParcel, 4, paramCredentialRequest.e(), paramInt, false);
    b.a(paramParcel, 1000, paramCredentialRequest.a);
    b.a(paramParcel, i);
  }
  
  public CredentialRequest a(Parcel paramParcel)
  {
    boolean bool = false;
    CredentialPickerConfig localCredentialPickerConfig1 = null;
    int j = a.b(paramParcel);
    CredentialPickerConfig localCredentialPickerConfig2 = null;
    String[] arrayOfString = null;
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
        bool = a.c(paramParcel, k);
        break;
      case 2: 
        arrayOfString = a.C(paramParcel, k);
        break;
      case 3: 
        localCredentialPickerConfig2 = (CredentialPickerConfig)a.a(paramParcel, k, CredentialPickerConfig.CREATOR);
        break;
      case 4: 
        localCredentialPickerConfig1 = (CredentialPickerConfig)a.a(paramParcel, k, CredentialPickerConfig.CREATOR);
        break;
      case 1000: 
        i = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new CredentialRequest(i, bool, arrayOfString, localCredentialPickerConfig2, localCredentialPickerConfig1);
  }
  
  public CredentialRequest[] a(int paramInt)
  {
    return new CredentialRequest[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */