package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class a
  implements Parcelable.Creator<ApplicationStatus>
{
  static void a(ApplicationStatus paramApplicationStatus, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramApplicationStatus.a());
    b.a(paramParcel, 2, paramApplicationStatus.b(), false);
    b.a(paramParcel, paramInt);
  }
  
  public ApplicationStatus a(Parcel paramParcel)
  {
    int j = com.google.android.gms.common.internal.safeparcel.a.b(paramParcel);
    int i = 0;
    String str = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = com.google.android.gms.common.internal.safeparcel.a.a(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, k);
        break;
      case 1: 
        i = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, k);
        break;
      case 2: 
        str = com.google.android.gms.common.internal.safeparcel.a.q(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new ApplicationStatus(i, str);
  }
  
  public ApplicationStatus[] a(int paramInt)
  {
    return new ApplicationStatus[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */