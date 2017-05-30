package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e
  implements Parcelable.Creator<NetworkStateImpl>
{
  static void a(NetworkStateImpl paramNetworkStateImpl, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramNetworkStateImpl.b());
    b.a(paramParcel, 2, paramNetworkStateImpl.a());
    b.a(paramParcel, 3, paramNetworkStateImpl.c());
    b.a(paramParcel, paramInt);
  }
  
  public NetworkStateImpl a(Parcel paramParcel)
  {
    int k = 0;
    int m = a.b(paramParcel);
    int j = 0;
    int i = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        i = a.g(paramParcel, n);
        break;
      case 2: 
        j = a.g(paramParcel, n);
        break;
      case 3: 
        k = a.g(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new NetworkStateImpl(i, j, k);
  }
  
  public NetworkStateImpl[] a(int paramInt)
  {
    return new NetworkStateImpl[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */