package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d
  implements Parcelable.Creator<HeadphoneStateImpl>
{
  static void a(HeadphoneStateImpl paramHeadphoneStateImpl, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramHeadphoneStateImpl.b());
    b.a(paramParcel, 2, paramHeadphoneStateImpl.a());
    b.a(paramParcel, paramInt);
  }
  
  public HeadphoneStateImpl a(Parcel paramParcel)
  {
    int j = 0;
    int k = a.b(paramParcel);
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
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new HeadphoneStateImpl(i, j);
  }
  
  public HeadphoneStateImpl[] a(int paramInt)
  {
    return new HeadphoneStateImpl[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */