package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class m
  implements Parcelable.Creator<InterstitialAdParameterParcel>
{
  static void a(InterstitialAdParameterParcel paramInterstitialAdParameterParcel, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramInterstitialAdParameterParcel.a);
    b.a(paramParcel, 2, paramInterstitialAdParameterParcel.b);
    b.a(paramParcel, 3, paramInterstitialAdParameterParcel.c);
    b.a(paramParcel, 4, paramInterstitialAdParameterParcel.d, false);
    b.a(paramParcel, 5, paramInterstitialAdParameterParcel.e);
    b.a(paramParcel, 6, paramInterstitialAdParameterParcel.f);
    b.a(paramParcel, 7, paramInterstitialAdParameterParcel.g);
    b.a(paramParcel, paramInt);
  }
  
  public InterstitialAdParameterParcel a(Parcel paramParcel)
  {
    int i = 0;
    int k = a.b(paramParcel);
    String str = null;
    float f = 0.0F;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
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
        bool3 = a.c(paramParcel, m);
        break;
      case 3: 
        bool2 = a.c(paramParcel, m);
        break;
      case 4: 
        str = a.q(paramParcel, m);
        break;
      case 5: 
        bool1 = a.c(paramParcel, m);
        break;
      case 6: 
        f = a.l(paramParcel, m);
        break;
      case 7: 
        i = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new InterstitialAdParameterParcel(j, bool3, bool2, str, bool1, f, i);
  }
  
  public InterstitialAdParameterParcel[] a(int paramInt)
  {
    return new InterstitialAdParameterParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */