package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h
  implements Parcelable.Creator<PowerStateImpl>
{
  static void a(PowerStateImpl paramPowerStateImpl, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramPowerStateImpl.c());
    b.a(paramParcel, 2, paramPowerStateImpl.a());
    b.a(paramParcel, 3, paramPowerStateImpl.b());
    b.a(paramParcel, paramInt);
  }
  
  public PowerStateImpl a(Parcel paramParcel)
  {
    int j = 0;
    int k = a.b(paramParcel);
    double d = 0.0D;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        i = a.g(paramParcel, m);
        break;
      case 2: 
        j = a.g(paramParcel, m);
        break;
      case 3: 
        d = a.n(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new PowerStateImpl(i, j, d);
  }
  
  public PowerStateImpl[] a(int paramInt)
  {
    return new PowerStateImpl[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */