package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f
  implements Parcelable.Creator<AdOverlayInfoParcel>
{
  static void a(AdOverlayInfoParcel paramAdOverlayInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramAdOverlayInfoParcel.a);
    b.a(paramParcel, 2, paramAdOverlayInfoParcel.b, paramInt, false);
    b.a(paramParcel, 3, paramAdOverlayInfoParcel.a(), false);
    b.a(paramParcel, 4, paramAdOverlayInfoParcel.b(), false);
    b.a(paramParcel, 5, paramAdOverlayInfoParcel.c(), false);
    b.a(paramParcel, 6, paramAdOverlayInfoParcel.d(), false);
    b.a(paramParcel, 7, paramAdOverlayInfoParcel.g, false);
    b.a(paramParcel, 8, paramAdOverlayInfoParcel.h);
    b.a(paramParcel, 9, paramAdOverlayInfoParcel.i, false);
    b.a(paramParcel, 10, paramAdOverlayInfoParcel.f(), false);
    b.a(paramParcel, 11, paramAdOverlayInfoParcel.k);
    b.a(paramParcel, 12, paramAdOverlayInfoParcel.l);
    b.a(paramParcel, 13, paramAdOverlayInfoParcel.m, false);
    b.a(paramParcel, 14, paramAdOverlayInfoParcel.n, paramInt, false);
    b.a(paramParcel, 15, paramAdOverlayInfoParcel.e(), false);
    b.a(paramParcel, 16, paramAdOverlayInfoParcel.p, false);
    b.a(paramParcel, 17, paramAdOverlayInfoParcel.q, paramInt, false);
    b.a(paramParcel, i);
  }
  
  public AdOverlayInfoParcel a(Parcel paramParcel)
  {
    int m = a.b(paramParcel);
    int k = 0;
    AdLauncherIntentInfoParcel localAdLauncherIntentInfoParcel = null;
    IBinder localIBinder6 = null;
    IBinder localIBinder5 = null;
    IBinder localIBinder4 = null;
    IBinder localIBinder3 = null;
    String str4 = null;
    boolean bool = false;
    String str3 = null;
    IBinder localIBinder2 = null;
    int j = 0;
    int i = 0;
    String str2 = null;
    VersionInfoParcel localVersionInfoParcel = null;
    IBinder localIBinder1 = null;
    String str1 = null;
    InterstitialAdParameterParcel localInterstitialAdParameterParcel = null;
    while (paramParcel.dataPosition() < m)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        k = a.g(paramParcel, n);
        break;
      case 2: 
        localAdLauncherIntentInfoParcel = (AdLauncherIntentInfoParcel)a.a(paramParcel, n, AdLauncherIntentInfoParcel.CREATOR);
        break;
      case 3: 
        localIBinder6 = a.r(paramParcel, n);
        break;
      case 4: 
        localIBinder5 = a.r(paramParcel, n);
        break;
      case 5: 
        localIBinder4 = a.r(paramParcel, n);
        break;
      case 6: 
        localIBinder3 = a.r(paramParcel, n);
        break;
      case 7: 
        str4 = a.q(paramParcel, n);
        break;
      case 8: 
        bool = a.c(paramParcel, n);
        break;
      case 9: 
        str3 = a.q(paramParcel, n);
        break;
      case 10: 
        localIBinder2 = a.r(paramParcel, n);
        break;
      case 11: 
        j = a.g(paramParcel, n);
        break;
      case 12: 
        i = a.g(paramParcel, n);
        break;
      case 13: 
        str2 = a.q(paramParcel, n);
        break;
      case 14: 
        localVersionInfoParcel = (VersionInfoParcel)a.a(paramParcel, n, VersionInfoParcel.CREATOR);
        break;
      case 15: 
        localIBinder1 = a.r(paramParcel, n);
        break;
      case 16: 
        str1 = a.q(paramParcel, n);
        break;
      case 17: 
        localInterstitialAdParameterParcel = (InterstitialAdParameterParcel)a.a(paramParcel, n, InterstitialAdParameterParcel.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new AdOverlayInfoParcel(k, localAdLauncherIntentInfoParcel, localIBinder6, localIBinder5, localIBinder4, localIBinder3, str4, bool, str3, localIBinder2, j, i, str2, localVersionInfoParcel, localIBinder1, str1, localInterstitialAdParameterParcel);
  }
  
  public AdOverlayInfoParcel[] a(int paramInt)
  {
    return new AdOverlayInfoParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */