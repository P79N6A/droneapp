package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class f
  implements Parcelable.Creator<AdRequestInfoParcel>
{
  static void a(AdRequestInfoParcel paramAdRequestInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramAdRequestInfoParcel.a);
    b.a(paramParcel, 2, paramAdRequestInfoParcel.b, false);
    b.a(paramParcel, 3, paramAdRequestInfoParcel.c, paramInt, false);
    b.a(paramParcel, 4, paramAdRequestInfoParcel.d, paramInt, false);
    b.a(paramParcel, 5, paramAdRequestInfoParcel.e, false);
    b.a(paramParcel, 6, paramAdRequestInfoParcel.f, paramInt, false);
    b.a(paramParcel, 7, paramAdRequestInfoParcel.g, paramInt, false);
    b.a(paramParcel, 8, paramAdRequestInfoParcel.h, false);
    b.a(paramParcel, 9, paramAdRequestInfoParcel.i, false);
    b.a(paramParcel, 10, paramAdRequestInfoParcel.j, false);
    b.a(paramParcel, 11, paramAdRequestInfoParcel.k, paramInt, false);
    b.a(paramParcel, 12, paramAdRequestInfoParcel.l, false);
    b.a(paramParcel, 13, paramAdRequestInfoParcel.m);
    b.b(paramParcel, 14, paramAdRequestInfoParcel.n, false);
    b.a(paramParcel, 15, paramAdRequestInfoParcel.o, false);
    b.a(paramParcel, 16, paramAdRequestInfoParcel.p);
    b.a(paramParcel, 17, paramAdRequestInfoParcel.q, paramInt, false);
    b.a(paramParcel, 18, paramAdRequestInfoParcel.r);
    b.a(paramParcel, 19, paramAdRequestInfoParcel.s);
    b.a(paramParcel, 20, paramAdRequestInfoParcel.t);
    b.a(paramParcel, 21, paramAdRequestInfoParcel.u, false);
    b.a(paramParcel, 25, paramAdRequestInfoParcel.v);
    b.a(paramParcel, 26, paramAdRequestInfoParcel.w, false);
    b.b(paramParcel, 27, paramAdRequestInfoParcel.x, false);
    b.a(paramParcel, 28, paramAdRequestInfoParcel.y, false);
    b.a(paramParcel, 29, paramAdRequestInfoParcel.z, paramInt, false);
    b.b(paramParcel, 30, paramAdRequestInfoParcel.A, false);
    b.a(paramParcel, 31, paramAdRequestInfoParcel.B);
    b.a(paramParcel, 32, paramAdRequestInfoParcel.C, paramInt, false);
    b.a(paramParcel, 33, paramAdRequestInfoParcel.D, false);
    b.a(paramParcel, 34, paramAdRequestInfoParcel.E);
    b.a(paramParcel, 35, paramAdRequestInfoParcel.F);
    b.a(paramParcel, 36, paramAdRequestInfoParcel.G);
    b.a(paramParcel, 37, paramAdRequestInfoParcel.H);
    b.a(paramParcel, 38, paramAdRequestInfoParcel.I);
    b.a(paramParcel, 39, paramAdRequestInfoParcel.J, false);
    b.a(paramParcel, 40, paramAdRequestInfoParcel.K);
    b.a(paramParcel, 41, paramAdRequestInfoParcel.L, false);
    b.a(paramParcel, 42, paramAdRequestInfoParcel.M);
    b.a(paramParcel, 43, paramAdRequestInfoParcel.N);
    b.a(paramParcel, 44, paramAdRequestInfoParcel.O, false);
    b.a(paramParcel, 45, paramAdRequestInfoParcel.P, false);
    b.a(paramParcel, i);
  }
  
  public AdRequestInfoParcel a(Parcel paramParcel)
  {
    int i3 = a.b(paramParcel);
    int i2 = 0;
    Bundle localBundle4 = null;
    AdRequestParcel localAdRequestParcel = null;
    AdSizeParcel localAdSizeParcel = null;
    String str11 = null;
    ApplicationInfo localApplicationInfo = null;
    PackageInfo localPackageInfo = null;
    String str10 = null;
    String str9 = null;
    String str8 = null;
    VersionInfoParcel localVersionInfoParcel = null;
    Bundle localBundle3 = null;
    int i1 = 0;
    ArrayList localArrayList3 = null;
    Bundle localBundle2 = null;
    boolean bool5 = false;
    Messenger localMessenger = null;
    int n = 0;
    int m = 0;
    float f2 = 0.0F;
    String str7 = null;
    long l2 = 0L;
    String str6 = null;
    ArrayList localArrayList2 = null;
    String str5 = null;
    NativeAdOptionsParcel localNativeAdOptionsParcel = null;
    ArrayList localArrayList1 = null;
    long l1 = 0L;
    CapabilityParcel localCapabilityParcel = null;
    String str4 = null;
    float f1 = 0.0F;
    boolean bool4 = false;
    int k = 0;
    int j = 0;
    boolean bool3 = false;
    boolean bool2 = false;
    String str3 = null;
    String str2 = null;
    boolean bool1 = false;
    int i = 0;
    Bundle localBundle1 = null;
    String str1 = null;
    while (paramParcel.dataPosition() < i3)
    {
      int i4 = a.a(paramParcel);
      switch (a.a(i4))
      {
      case 22: 
      case 23: 
      case 24: 
      default: 
        a.b(paramParcel, i4);
        break;
      case 1: 
        i2 = a.g(paramParcel, i4);
        break;
      case 2: 
        localBundle4 = a.s(paramParcel, i4);
        break;
      case 3: 
        localAdRequestParcel = (AdRequestParcel)a.a(paramParcel, i4, AdRequestParcel.CREATOR);
        break;
      case 4: 
        localAdSizeParcel = (AdSizeParcel)a.a(paramParcel, i4, AdSizeParcel.CREATOR);
        break;
      case 5: 
        str11 = a.q(paramParcel, i4);
        break;
      case 6: 
        localApplicationInfo = (ApplicationInfo)a.a(paramParcel, i4, ApplicationInfo.CREATOR);
        break;
      case 7: 
        localPackageInfo = (PackageInfo)a.a(paramParcel, i4, PackageInfo.CREATOR);
        break;
      case 8: 
        str10 = a.q(paramParcel, i4);
        break;
      case 9: 
        str9 = a.q(paramParcel, i4);
        break;
      case 10: 
        str8 = a.q(paramParcel, i4);
        break;
      case 11: 
        localVersionInfoParcel = (VersionInfoParcel)a.a(paramParcel, i4, VersionInfoParcel.CREATOR);
        break;
      case 12: 
        localBundle3 = a.s(paramParcel, i4);
        break;
      case 13: 
        i1 = a.g(paramParcel, i4);
        break;
      case 14: 
        localArrayList3 = a.E(paramParcel, i4);
        break;
      case 15: 
        localBundle2 = a.s(paramParcel, i4);
        break;
      case 16: 
        bool5 = a.c(paramParcel, i4);
        break;
      case 17: 
        localMessenger = (Messenger)a.a(paramParcel, i4, Messenger.CREATOR);
        break;
      case 18: 
        n = a.g(paramParcel, i4);
        break;
      case 19: 
        m = a.g(paramParcel, i4);
        break;
      case 20: 
        f2 = a.l(paramParcel, i4);
        break;
      case 21: 
        str7 = a.q(paramParcel, i4);
        break;
      case 25: 
        l2 = a.i(paramParcel, i4);
        break;
      case 26: 
        str6 = a.q(paramParcel, i4);
        break;
      case 27: 
        localArrayList2 = a.E(paramParcel, i4);
        break;
      case 28: 
        str5 = a.q(paramParcel, i4);
        break;
      case 29: 
        localNativeAdOptionsParcel = (NativeAdOptionsParcel)a.a(paramParcel, i4, NativeAdOptionsParcel.CREATOR);
        break;
      case 30: 
        localArrayList1 = a.E(paramParcel, i4);
        break;
      case 31: 
        l1 = a.i(paramParcel, i4);
        break;
      case 32: 
        localCapabilityParcel = (CapabilityParcel)a.a(paramParcel, i4, CapabilityParcel.CREATOR);
        break;
      case 33: 
        str4 = a.q(paramParcel, i4);
        break;
      case 34: 
        f1 = a.l(paramParcel, i4);
        break;
      case 35: 
        k = a.g(paramParcel, i4);
        break;
      case 36: 
        j = a.g(paramParcel, i4);
        break;
      case 37: 
        bool3 = a.c(paramParcel, i4);
        break;
      case 38: 
        bool2 = a.c(paramParcel, i4);
        break;
      case 39: 
        str3 = a.q(paramParcel, i4);
        break;
      case 40: 
        bool4 = a.c(paramParcel, i4);
        break;
      case 41: 
        str2 = a.q(paramParcel, i4);
        break;
      case 42: 
        bool1 = a.c(paramParcel, i4);
        break;
      case 43: 
        i = a.g(paramParcel, i4);
        break;
      case 44: 
        localBundle1 = a.s(paramParcel, i4);
        break;
      case 45: 
        str1 = a.q(paramParcel, i4);
      }
    }
    if (paramParcel.dataPosition() != i3) {
      throw new a.a(37 + "Overread allowed size end=" + i3, paramParcel);
    }
    return new AdRequestInfoParcel(i2, localBundle4, localAdRequestParcel, localAdSizeParcel, str11, localApplicationInfo, localPackageInfo, str10, str9, str8, localVersionInfoParcel, localBundle3, i1, localArrayList3, localBundle2, bool5, localMessenger, n, m, f2, str7, l2, str6, localArrayList2, str5, localNativeAdOptionsParcel, localArrayList1, l1, localCapabilityParcel, str4, f1, bool4, k, j, bool3, bool2, str3, str2, bool1, i, localBundle1, str1);
  }
  
  public AdRequestInfoParcel[] a(int paramInt)
  {
    return new AdRequestInfoParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */