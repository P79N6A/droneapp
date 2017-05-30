package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g
  implements Parcelable.Creator<HintRequest>
{
  static void a(HintRequest paramHintRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramHintRequest.a(), paramInt, false);
    b.a(paramParcel, 2, paramHintRequest.b());
    b.a(paramParcel, 3, paramHintRequest.c());
    b.a(paramParcel, 4, paramHintRequest.d(), false);
    b.a(paramParcel, 1000, paramHintRequest.a);
    b.a(paramParcel, i);
  }
  
  public HintRequest a(Parcel paramParcel)
  {
    String[] arrayOfString = null;
    boolean bool1 = false;
    int j = a.b(paramParcel);
    boolean bool2 = false;
    CredentialPickerConfig localCredentialPickerConfig = null;
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
        localCredentialPickerConfig = (CredentialPickerConfig)a.a(paramParcel, k, CredentialPickerConfig.CREATOR);
        break;
      case 2: 
        bool2 = a.c(paramParcel, k);
        break;
      case 3: 
        bool1 = a.c(paramParcel, k);
        break;
      case 4: 
        arrayOfString = a.C(paramParcel, k);
        break;
      case 1000: 
        i = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new HintRequest(i, localCredentialPickerConfig, bool2, bool1, arrayOfString);
  }
  
  public HintRequest[] a(int paramInt)
  {
    return new HintRequest[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */