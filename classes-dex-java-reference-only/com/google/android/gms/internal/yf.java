package com.google.android.gms.internal;

import com.google.ads.a.a;
import com.google.ads.a.b;
import com.google.ads.b;
import com.google.ads.mediation.c;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.j;
import java.util.Date;
import java.util.HashSet;

@aaa
public final class yf
{
  public static int a(a.a parama)
  {
    switch (yf.1.b[parama.ordinal()])
    {
    default: 
      return 0;
    case 2: 
      return 1;
    case 3: 
      return 2;
    }
    return 3;
  }
  
  public static a.b a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return a.b.a;
    case 2: 
      return a.b.c;
    }
    return a.b.b;
  }
  
  public static b a(AdSizeParcel paramAdSizeParcel)
  {
    int i = 0;
    b[] arrayOfb = new b[6];
    arrayOfb[0] = b.f;
    arrayOfb[1] = b.g;
    arrayOfb[2] = b.h;
    arrayOfb[3] = b.i;
    arrayOfb[4] = b.j;
    arrayOfb[5] = b.k;
    while (i < 6)
    {
      if ((arrayOfb[i].a() == paramAdSizeParcel.f) && (arrayOfb[i].b() == paramAdSizeParcel.c)) {
        return arrayOfb[i];
      }
      i += 1;
    }
    return new b(j.a(paramAdSizeParcel.f, paramAdSizeParcel.c, paramAdSizeParcel.b));
  }
  
  public static c a(AdRequestParcel paramAdRequestParcel)
  {
    if (paramAdRequestParcel.e != null) {}
    for (HashSet localHashSet = new HashSet(paramAdRequestParcel.e);; localHashSet = null) {
      return new c(new Date(paramAdRequestParcel.b), a(paramAdRequestParcel.d), localHashSet, paramAdRequestParcel.f, paramAdRequestParcel.k);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/yf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */