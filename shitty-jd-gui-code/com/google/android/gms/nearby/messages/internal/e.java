package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e
  implements Parcelable.Creator<DistanceImpl>
{
  static void a(DistanceImpl paramDistanceImpl, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramDistanceImpl.b);
    b.a(paramParcel, 2, paramDistanceImpl.c);
    b.a(paramParcel, 3, paramDistanceImpl.d);
    b.a(paramParcel, paramInt);
  }
  
  public DistanceImpl a(Parcel paramParcel)
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
    return new DistanceImpl(i, j, d);
  }
  
  public DistanceImpl[] a(int paramInt)
  {
    return new DistanceImpl[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/messages/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */