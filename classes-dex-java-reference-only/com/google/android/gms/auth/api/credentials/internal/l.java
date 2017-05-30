package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class l
  implements Parcelable.Creator<SaveRequest>
{
  static void a(SaveRequest paramSaveRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramSaveRequest.a(), paramInt, false);
    b.a(paramParcel, 1000, paramSaveRequest.a);
    b.a(paramParcel, i);
  }
  
  public SaveRequest a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    Credential localCredential = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localCredential = (Credential)a.a(paramParcel, k, Credential.CREATOR);
        break;
      case 1000: 
        i = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new SaveRequest(i, localCredential);
  }
  
  public SaveRequest[] a(int paramInt)
  {
    return new SaveRequest[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */