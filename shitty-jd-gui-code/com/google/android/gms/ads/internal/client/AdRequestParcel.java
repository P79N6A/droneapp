package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import java.util.List;

@aaa
public final class AdRequestParcel
  extends AbstractSafeParcelable
{
  public static final x CREATOR = new x();
  public final int a;
  public final long b;
  public final Bundle c;
  public final int d;
  public final List<String> e;
  public final boolean f;
  public final int g;
  public final boolean h;
  public final String i;
  public final SearchAdRequestParcel j;
  public final Location k;
  public final String l;
  public final Bundle m;
  public final Bundle n;
  public final List<String> o;
  public final String p;
  public final String q;
  public final boolean r;
  
  public AdRequestParcel(int paramInt1, long paramLong, Bundle paramBundle1, int paramInt2, List<String> paramList1, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, SearchAdRequestParcel paramSearchAdRequestParcel, Location paramLocation, String paramString2, Bundle paramBundle2, Bundle paramBundle3, List<String> paramList2, String paramString3, String paramString4, boolean paramBoolean3)
  {
    this.a = paramInt1;
    this.b = paramLong;
    Bundle localBundle = paramBundle1;
    if (paramBundle1 == null) {
      localBundle = new Bundle();
    }
    this.c = localBundle;
    this.d = paramInt2;
    this.e = paramList1;
    this.f = paramBoolean1;
    this.g = paramInt3;
    this.h = paramBoolean2;
    this.i = paramString1;
    this.j = paramSearchAdRequestParcel;
    this.k = paramLocation;
    this.l = paramString2;
    paramBundle1 = paramBundle2;
    if (paramBundle2 == null) {
      paramBundle1 = new Bundle();
    }
    this.m = paramBundle1;
    this.n = paramBundle3;
    this.o = paramList2;
    this.p = paramString3;
    this.q = paramString4;
    this.r = paramBoolean3;
  }
  
  public static void a(AdRequestParcel paramAdRequestParcel)
  {
    paramAdRequestParcel.m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", paramAdRequestParcel.c);
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof AdRequestParcel)) {}
    do
    {
      return false;
      paramObject = (AdRequestParcel)paramObject;
    } while ((this.a != ((AdRequestParcel)paramObject).a) || (this.b != ((AdRequestParcel)paramObject).b) || (!c.a(this.c, ((AdRequestParcel)paramObject).c)) || (this.d != ((AdRequestParcel)paramObject).d) || (!c.a(this.e, ((AdRequestParcel)paramObject).e)) || (this.f != ((AdRequestParcel)paramObject).f) || (this.g != ((AdRequestParcel)paramObject).g) || (this.h != ((AdRequestParcel)paramObject).h) || (!c.a(this.i, ((AdRequestParcel)paramObject).i)) || (!c.a(this.j, ((AdRequestParcel)paramObject).j)) || (!c.a(this.k, ((AdRequestParcel)paramObject).k)) || (!c.a(this.l, ((AdRequestParcel)paramObject).l)) || (!c.a(this.m, ((AdRequestParcel)paramObject).m)) || (!c.a(this.n, ((AdRequestParcel)paramObject).n)) || (!c.a(this.o, ((AdRequestParcel)paramObject).o)) || (!c.a(this.p, ((AdRequestParcel)paramObject).p)) || (!c.a(this.q, ((AdRequestParcel)paramObject).q)) || (this.r != ((AdRequestParcel)paramObject).r));
    return true;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    x.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/AdRequestParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */