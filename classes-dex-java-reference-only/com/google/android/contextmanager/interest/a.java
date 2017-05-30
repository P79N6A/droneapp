package com.google.android.contextmanager.interest;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class a
  implements Parcelable.Creator<InterestRecordStub>
{
  static void a(InterestRecordStub paramInterestRecordStub, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramInterestRecordStub.a());
    b.a(paramParcel, 2, paramInterestRecordStub.b(), false);
    b.a(paramParcel, paramInt);
  }
  
  public InterestRecordStub a(Parcel paramParcel)
  {
    int j = com.google.android.gms.common.internal.safeparcel.a.b(paramParcel);
    int i = 0;
    byte[] arrayOfByte = null;
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
        arrayOfByte = com.google.android.gms.common.internal.safeparcel.a.t(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new InterestRecordStub(i, arrayOfByte);
  }
  
  public InterestRecordStub[] a(int paramInt)
  {
    return new InterestRecordStub[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/contextmanager/interest/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */