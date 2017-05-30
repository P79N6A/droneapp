package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class k
  implements Parcelable.Creator<JoinOptions>
{
  static void a(JoinOptions paramJoinOptions, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramJoinOptions.a());
    b.a(paramParcel, 2, paramJoinOptions.b());
    b.a(paramParcel, paramInt);
  }
  
  public JoinOptions a(Parcel paramParcel)
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
    return new JoinOptions(i, j);
  }
  
  public JoinOptions[] a(int paramInt)
  {
    return new JoinOptions[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */