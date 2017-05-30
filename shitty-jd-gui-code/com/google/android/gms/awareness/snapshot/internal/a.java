package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class a
  implements Parcelable.Creator<BeaconStateImpl.BeaconInfoImpl>
{
  static void a(BeaconStateImpl.BeaconInfoImpl paramBeaconInfoImpl, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramBeaconInfoImpl.d());
    b.a(paramParcel, 2, paramBeaconInfoImpl.a(), false);
    b.a(paramParcel, 3, paramBeaconInfoImpl.b(), false);
    b.a(paramParcel, 4, paramBeaconInfoImpl.c(), false);
    b.a(paramParcel, paramInt);
  }
  
  public BeaconStateImpl.BeaconInfoImpl a(Parcel paramParcel)
  {
    byte[] arrayOfByte = null;
    int j = com.google.android.gms.common.internal.safeparcel.a.b(paramParcel);
    int i = 0;
    String str2 = null;
    String str1 = null;
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
        str1 = com.google.android.gms.common.internal.safeparcel.a.q(paramParcel, k);
        break;
      case 3: 
        str2 = com.google.android.gms.common.internal.safeparcel.a.q(paramParcel, k);
        break;
      case 4: 
        arrayOfByte = com.google.android.gms.common.internal.safeparcel.a.t(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new BeaconStateImpl.BeaconInfoImpl(i, str1, str2, arrayOfByte);
  }
  
  public BeaconStateImpl.BeaconInfoImpl[] a(int paramInt)
  {
    return new BeaconStateImpl.BeaconInfoImpl[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */