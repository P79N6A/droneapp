package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class n
  implements Parcelable.Creator<BeaconStateImpl.TypeFilterImpl>
{
  static void a(BeaconStateImpl.TypeFilterImpl paramTypeFilterImpl, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramTypeFilterImpl.e());
    b.a(paramParcel, 2, paramTypeFilterImpl.f(), false);
    b.a(paramParcel, paramInt);
  }
  
  public BeaconStateImpl.TypeFilterImpl a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    byte[] arrayOfByte = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        i = a.g(paramParcel, k);
        break;
      case 2: 
        arrayOfByte = a.t(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new BeaconStateImpl.TypeFilterImpl(i, arrayOfByte);
  }
  
  public BeaconStateImpl.TypeFilterImpl[] a(int paramInt)
  {
    return new BeaconStateImpl.TypeFilterImpl[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */