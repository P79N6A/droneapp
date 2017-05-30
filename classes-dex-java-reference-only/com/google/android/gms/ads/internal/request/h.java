package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class h
  implements Parcelable.Creator<AdResponseParcel>
{
  static void a(AdResponseParcel paramAdResponseParcel, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramAdResponseParcel.a);
    b.a(paramParcel, 2, paramAdResponseParcel.b, false);
    b.a(paramParcel, 3, paramAdResponseParcel.c, false);
    b.b(paramParcel, 4, paramAdResponseParcel.d, false);
    b.a(paramParcel, 5, paramAdResponseParcel.e);
    b.b(paramParcel, 6, paramAdResponseParcel.f, false);
    b.a(paramParcel, 7, paramAdResponseParcel.g);
    b.a(paramParcel, 8, paramAdResponseParcel.h);
    b.a(paramParcel, 9, paramAdResponseParcel.i);
    b.b(paramParcel, 10, paramAdResponseParcel.j, false);
    b.a(paramParcel, 11, paramAdResponseParcel.k);
    b.a(paramParcel, 12, paramAdResponseParcel.l);
    b.a(paramParcel, 13, paramAdResponseParcel.m, false);
    b.a(paramParcel, 14, paramAdResponseParcel.n);
    b.a(paramParcel, 15, paramAdResponseParcel.o, false);
    b.a(paramParcel, 18, paramAdResponseParcel.p);
    b.a(paramParcel, 19, paramAdResponseParcel.q, false);
    b.a(paramParcel, 21, paramAdResponseParcel.r, false);
    b.a(paramParcel, 22, paramAdResponseParcel.s);
    b.a(paramParcel, 23, paramAdResponseParcel.t);
    b.a(paramParcel, 24, paramAdResponseParcel.u);
    b.a(paramParcel, 25, paramAdResponseParcel.v);
    b.a(paramParcel, 26, paramAdResponseParcel.w);
    b.a(paramParcel, 28, paramAdResponseParcel.x, paramInt, false);
    b.a(paramParcel, 29, paramAdResponseParcel.y, false);
    b.a(paramParcel, 30, paramAdResponseParcel.z, false);
    b.a(paramParcel, 31, paramAdResponseParcel.A);
    b.a(paramParcel, 32, paramAdResponseParcel.B);
    b.a(paramParcel, 33, paramAdResponseParcel.C, paramInt, false);
    b.b(paramParcel, 34, paramAdResponseParcel.D, false);
    b.b(paramParcel, 35, paramAdResponseParcel.E, false);
    b.a(paramParcel, 36, paramAdResponseParcel.F);
    b.a(paramParcel, 37, paramAdResponseParcel.G, paramInt, false);
    b.a(paramParcel, 38, paramAdResponseParcel.H);
    b.a(paramParcel, 39, paramAdResponseParcel.I, false);
    b.b(paramParcel, 40, paramAdResponseParcel.J, false);
    b.a(paramParcel, 42, paramAdResponseParcel.K);
    b.a(paramParcel, 43, paramAdResponseParcel.L, false);
    b.a(paramParcel, 44, paramAdResponseParcel.M, paramInt, false);
    b.a(paramParcel, 45, paramAdResponseParcel.N, false);
    b.a(paramParcel, i);
  }
  
  public AdResponseParcel a(Parcel paramParcel)
  {
    int m = a.b(paramParcel);
    int k = 0;
    String str11 = null;
    String str10 = null;
    ArrayList localArrayList6 = null;
    int j = 0;
    ArrayList localArrayList5 = null;
    long l4 = 0L;
    boolean bool12 = false;
    long l3 = 0L;
    ArrayList localArrayList4 = null;
    long l2 = 0L;
    int i = 0;
    String str9 = null;
    long l1 = 0L;
    String str8 = null;
    boolean bool11 = false;
    String str7 = null;
    String str6 = null;
    boolean bool10 = false;
    boolean bool9 = false;
    boolean bool8 = false;
    boolean bool7 = false;
    boolean bool6 = false;
    LargeParcelTeleporter localLargeParcelTeleporter = null;
    String str5 = null;
    String str4 = null;
    boolean bool5 = false;
    boolean bool4 = false;
    RewardItemParcel localRewardItemParcel = null;
    ArrayList localArrayList3 = null;
    ArrayList localArrayList2 = null;
    boolean bool3 = false;
    AutoClickProtectionConfigurationParcel localAutoClickProtectionConfigurationParcel = null;
    boolean bool2 = false;
    String str3 = null;
    ArrayList localArrayList1 = null;
    boolean bool1 = false;
    String str2 = null;
    SafeBrowsingConfigParcel localSafeBrowsingConfigParcel = null;
    String str1 = null;
    while (paramParcel.dataPosition() < m)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      case 16: 
      case 17: 
      case 20: 
      case 27: 
      case 41: 
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        k = a.g(paramParcel, n);
        break;
      case 2: 
        str11 = a.q(paramParcel, n);
        break;
      case 3: 
        str10 = a.q(paramParcel, n);
        break;
      case 4: 
        localArrayList6 = a.E(paramParcel, n);
        break;
      case 5: 
        j = a.g(paramParcel, n);
        break;
      case 6: 
        localArrayList5 = a.E(paramParcel, n);
        break;
      case 7: 
        l4 = a.i(paramParcel, n);
        break;
      case 8: 
        bool12 = a.c(paramParcel, n);
        break;
      case 9: 
        l3 = a.i(paramParcel, n);
        break;
      case 10: 
        localArrayList4 = a.E(paramParcel, n);
        break;
      case 11: 
        l2 = a.i(paramParcel, n);
        break;
      case 12: 
        i = a.g(paramParcel, n);
        break;
      case 13: 
        str9 = a.q(paramParcel, n);
        break;
      case 14: 
        l1 = a.i(paramParcel, n);
        break;
      case 15: 
        str8 = a.q(paramParcel, n);
        break;
      case 18: 
        bool11 = a.c(paramParcel, n);
        break;
      case 19: 
        str7 = a.q(paramParcel, n);
        break;
      case 21: 
        str6 = a.q(paramParcel, n);
        break;
      case 22: 
        bool10 = a.c(paramParcel, n);
        break;
      case 23: 
        bool9 = a.c(paramParcel, n);
        break;
      case 24: 
        bool8 = a.c(paramParcel, n);
        break;
      case 25: 
        bool7 = a.c(paramParcel, n);
        break;
      case 26: 
        bool6 = a.c(paramParcel, n);
        break;
      case 28: 
        localLargeParcelTeleporter = (LargeParcelTeleporter)a.a(paramParcel, n, LargeParcelTeleporter.CREATOR);
        break;
      case 29: 
        str5 = a.q(paramParcel, n);
        break;
      case 30: 
        str4 = a.q(paramParcel, n);
        break;
      case 31: 
        bool5 = a.c(paramParcel, n);
        break;
      case 32: 
        bool4 = a.c(paramParcel, n);
        break;
      case 33: 
        localRewardItemParcel = (RewardItemParcel)a.a(paramParcel, n, RewardItemParcel.CREATOR);
        break;
      case 34: 
        localArrayList3 = a.E(paramParcel, n);
        break;
      case 35: 
        localArrayList2 = a.E(paramParcel, n);
        break;
      case 36: 
        bool3 = a.c(paramParcel, n);
        break;
      case 37: 
        localAutoClickProtectionConfigurationParcel = (AutoClickProtectionConfigurationParcel)a.a(paramParcel, n, AutoClickProtectionConfigurationParcel.CREATOR);
        break;
      case 38: 
        bool2 = a.c(paramParcel, n);
        break;
      case 39: 
        str3 = a.q(paramParcel, n);
        break;
      case 40: 
        localArrayList1 = a.E(paramParcel, n);
        break;
      case 42: 
        bool1 = a.c(paramParcel, n);
        break;
      case 43: 
        str2 = a.q(paramParcel, n);
        break;
      case 44: 
        localSafeBrowsingConfigParcel = (SafeBrowsingConfigParcel)a.a(paramParcel, n, SafeBrowsingConfigParcel.CREATOR);
        break;
      case 45: 
        str1 = a.q(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new AdResponseParcel(k, str11, str10, localArrayList6, j, localArrayList5, l4, bool12, l3, localArrayList4, l2, i, str9, l1, str8, bool11, str7, str6, bool10, bool9, bool8, bool7, bool6, localLargeParcelTeleporter, str5, str4, bool5, bool4, localRewardItemParcel, localArrayList3, localArrayList2, bool3, localAutoClickProtectionConfigurationParcel, bool2, str3, localArrayList1, bool1, str2, localSafeBrowsingConfigParcel, str1);
  }
  
  public AdResponseParcel[] a(int paramInt)
  {
    return new AdResponseParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */