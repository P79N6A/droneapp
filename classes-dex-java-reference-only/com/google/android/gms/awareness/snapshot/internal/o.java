package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class o
  implements Parcelable.Creator<WeatherImpl>
{
  static void a(WeatherImpl paramWeatherImpl, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramWeatherImpl.a());
    b.a(paramParcel, 2, paramWeatherImpl.d());
    b.a(paramParcel, 3, paramWeatherImpl.c());
    b.a(paramParcel, 4, paramWeatherImpl.b());
    b.a(paramParcel, 5, paramWeatherImpl.e());
    b.a(paramParcel, 6, paramWeatherImpl.f(), false);
    b.a(paramParcel, paramInt);
  }
  
  public WeatherImpl a(Parcel paramParcel)
  {
    int i = 0;
    float f1 = 0.0F;
    int k = a.b(paramParcel);
    int[] arrayOfInt = null;
    float f2 = 0.0F;
    float f3 = 0.0F;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        j = a.g(paramParcel, m);
        break;
      case 2: 
        f3 = a.l(paramParcel, m);
        break;
      case 3: 
        f2 = a.l(paramParcel, m);
        break;
      case 4: 
        f1 = a.l(paramParcel, m);
        break;
      case 5: 
        i = a.g(paramParcel, m);
        break;
      case 6: 
        arrayOfInt = a.w(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new WeatherImpl(j, f3, f2, f1, i, arrayOfInt);
  }
  
  public WeatherImpl[] a(int paramInt)
  {
    return new WeatherImpl[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */