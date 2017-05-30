package com.google.android.gms.internal;

import android.location.Location;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.formats.b.b;
import com.google.android.gms.ads.i.a;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.mediation.l;
import java.util.Date;
import java.util.List;
import java.util.Set;

@aaa
public final class yc
  implements l
{
  private final Date d;
  private final int e;
  private final Set<String> f;
  private final boolean g;
  private final Location h;
  private final int i;
  private final NativeAdOptionsParcel j;
  private final List<String> k;
  private final boolean l;
  
  public yc(@Nullable Date paramDate, int paramInt1, @Nullable Set<String> paramSet, @Nullable Location paramLocation, boolean paramBoolean1, int paramInt2, NativeAdOptionsParcel paramNativeAdOptionsParcel, List<String> paramList, boolean paramBoolean2)
  {
    this.d = paramDate;
    this.e = paramInt1;
    this.f = paramSet;
    this.h = paramLocation;
    this.g = paramBoolean1;
    this.i = paramInt2;
    this.j = paramNativeAdOptionsParcel;
    this.k = paramList;
    this.l = paramBoolean2;
  }
  
  public Date a()
  {
    return this.d;
  }
  
  public int b()
  {
    return this.e;
  }
  
  public Set<String> c()
  {
    return this.f;
  }
  
  public Location d()
  {
    return this.h;
  }
  
  public int e()
  {
    return this.i;
  }
  
  public boolean f()
  {
    return this.g;
  }
  
  public boolean g()
  {
    return this.l;
  }
  
  public b h()
  {
    if (this.j == null) {
      return null;
    }
    b.b localb = new b.b().a(this.j.b).a(this.j.c).b(this.j.d);
    if (this.j.a >= 2) {
      localb.b(this.j.e);
    }
    if ((this.j.a >= 3) && (this.j.f != null)) {
      localb.a(new i.a().a(this.j.f.b).a());
    }
    return localb.a();
  }
  
  public boolean i()
  {
    return (this.k != null) && (this.k.contains("2"));
  }
  
  public boolean j()
  {
    return (this.k != null) && (this.k.contains("1"));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/yc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */