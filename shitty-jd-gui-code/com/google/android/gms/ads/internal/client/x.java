package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class x
  implements Parcelable.Creator<AdRequestParcel>
{
  static void a(AdRequestParcel paramAdRequestParcel, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramAdRequestParcel.a);
    b.a(paramParcel, 2, paramAdRequestParcel.b);
    b.a(paramParcel, 3, paramAdRequestParcel.c, false);
    b.a(paramParcel, 4, paramAdRequestParcel.d);
    b.b(paramParcel, 5, paramAdRequestParcel.e, false);
    b.a(paramParcel, 6, paramAdRequestParcel.f);
    b.a(paramParcel, 7, paramAdRequestParcel.g);
    b.a(paramParcel, 8, paramAdRequestParcel.h);
    b.a(paramParcel, 9, paramAdRequestParcel.i, false);
    b.a(paramParcel, 10, paramAdRequestParcel.j, paramInt, false);
    b.a(paramParcel, 11, paramAdRequestParcel.k, paramInt, false);
    b.a(paramParcel, 12, paramAdRequestParcel.l, false);
    b.a(paramParcel, 13, paramAdRequestParcel.m, false);
    b.a(paramParcel, 14, paramAdRequestParcel.n, false);
    b.b(paramParcel, 15, paramAdRequestParcel.o, false);
    b.a(paramParcel, 16, paramAdRequestParcel.p, false);
    b.a(paramParcel, 17, paramAdRequestParcel.q, false);
    b.a(paramParcel, 18, paramAdRequestParcel.r);
    b.a(paramParcel, i);
  }
  
  public AdRequestParcel a(Parcel paramParcel)
  {
    int m = a.b(paramParcel);
    int k = 0;
    long l = 0L;
    Bundle localBundle3 = null;
    int j = 0;
    ArrayList localArrayList2 = null;
    boolean bool3 = false;
    int i = 0;
    boolean bool2 = false;
    String str4 = null;
    SearchAdRequestParcel localSearchAdRequestParcel = null;
    Location localLocation = null;
    String str3 = null;
    Bundle localBundle2 = null;
    Bundle localBundle1 = null;
    ArrayList localArrayList1 = null;
    String str2 = null;
    String str1 = null;
    boolean bool1 = false;
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
        l = a.i(paramParcel, n);
        break;
      case 3: 
        localBundle3 = a.s(paramParcel, n);
        break;
      case 4: 
        j = a.g(paramParcel, n);
        break;
      case 5: 
        localArrayList2 = a.E(paramParcel, n);
        break;
      case 6: 
        bool3 = a.c(paramParcel, n);
        break;
      case 7: 
        i = a.g(paramParcel, n);
        break;
      case 8: 
        bool2 = a.c(paramParcel, n);
        break;
      case 9: 
        str4 = a.q(paramParcel, n);
        break;
      case 10: 
        localSearchAdRequestParcel = (SearchAdRequestParcel)a.a(paramParcel, n, SearchAdRequestParcel.CREATOR);
        break;
      case 11: 
        localLocation = (Location)a.a(paramParcel, n, Location.CREATOR);
        break;
      case 12: 
        str3 = a.q(paramParcel, n);
        break;
      case 13: 
        localBundle2 = a.s(paramParcel, n);
        break;
      case 14: 
        localBundle1 = a.s(paramParcel, n);
        break;
      case 15: 
        localArrayList1 = a.E(paramParcel, n);
        break;
      case 16: 
        str2 = a.q(paramParcel, n);
        break;
      case 17: 
        str1 = a.q(paramParcel, n);
        break;
      case 18: 
        bool1 = a.c(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new AdRequestParcel(k, l, localBundle3, j, localArrayList2, bool3, i, bool2, str4, localSearchAdRequestParcel, localLocation, str3, localBundle2, localBundle1, localArrayList1, str2, str1, bool1);
  }
  
  public AdRequestParcel[] a(int paramInt)
  {
    return new AdRequestParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */