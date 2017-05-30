package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class o
  implements Parcelable.Creator<CastOptions>
{
  static void a(CastOptions paramCastOptions, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramCastOptions.a());
    b.a(paramParcel, 2, paramCastOptions.b(), false);
    b.b(paramParcel, 3, paramCastOptions.c(), false);
    b.a(paramParcel, 4, paramCastOptions.d());
    b.a(paramParcel, 5, paramCastOptions.e(), paramInt, false);
    b.a(paramParcel, 6, paramCastOptions.f());
    b.a(paramParcel, 7, paramCastOptions.g(), paramInt, false);
    b.a(paramParcel, 8, paramCastOptions.h());
    b.a(paramParcel, 9, paramCastOptions.i());
    b.a(paramParcel, i);
  }
  
  public CastOptions a(Parcel paramParcel)
  {
    CastMediaOptions localCastMediaOptions = null;
    boolean bool1 = false;
    int j = a.b(paramParcel);
    double d = 0.0D;
    boolean bool2 = false;
    LaunchOptions localLaunchOptions = null;
    boolean bool3 = false;
    ArrayList localArrayList = null;
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
        str = a.q(paramParcel, k);
        break;
      case 3: 
        localArrayList = a.E(paramParcel, k);
        break;
      case 4: 
        bool3 = a.c(paramParcel, k);
        break;
      case 5: 
        localLaunchOptions = (LaunchOptions)a.a(paramParcel, k, LaunchOptions.CREATOR);
        break;
      case 6: 
        bool2 = a.c(paramParcel, k);
        break;
      case 7: 
        localCastMediaOptions = (CastMediaOptions)a.a(paramParcel, k, CastMediaOptions.CREATOR);
        break;
      case 8: 
        bool1 = a.c(paramParcel, k);
        break;
      case 9: 
        d = a.n(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new CastOptions(i, str, localArrayList, bool3, localLaunchOptions, bool2, localCastMediaOptions, bool1, d);
  }
  
  public CastOptions[] a(int paramInt)
  {
    return new CastOptions[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */