package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i
  implements Parcelable.Creator<GeneratePasswordRequest>
{
  static void a(GeneratePasswordRequest paramGeneratePasswordRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramGeneratePasswordRequest.a(), paramInt, false);
    b.a(paramParcel, 1000, paramGeneratePasswordRequest.a);
    b.a(paramParcel, i);
  }
  
  public GeneratePasswordRequest a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    PasswordSpecification localPasswordSpecification = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localPasswordSpecification = (PasswordSpecification)a.a(paramParcel, k, PasswordSpecification.CREATOR);
        break;
      case 1000: 
        i = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new GeneratePasswordRequest(i, localPasswordSpecification);
  }
  
  public GeneratePasswordRequest[] a(int paramInt)
  {
    return new GeneratePasswordRequest[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */