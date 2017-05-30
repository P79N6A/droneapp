package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class l
  implements Parcelable.Creator<LaunchOptions>
{
  static void a(LaunchOptions paramLaunchOptions, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramLaunchOptions.a());
    b.a(paramParcel, 2, paramLaunchOptions.b());
    b.a(paramParcel, 3, paramLaunchOptions.c(), false);
    b.a(paramParcel, paramInt);
  }
  
  public LaunchOptions a(Parcel paramParcel)
  {
    boolean bool = false;
    int j = a.b(paramParcel);
    String str = null;
    int i = 0;
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
        bool = a.c(paramParcel, k);
        break;
      case 3: 
        str = a.q(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new LaunchOptions(i, bool, str);
  }
  
  public LaunchOptions[] a(int paramInt)
  {
    return new LaunchOptions[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */