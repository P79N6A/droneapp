package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.search.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public final class SearchAdRequestParcel
  extends AbstractSafeParcelable
{
  public static final p CREATOR = new p();
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  public final int i;
  public final String j;
  public final int k;
  public final String l;
  public final int m;
  public final int n;
  public final String o;
  
  SearchAdRequestParcel(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, String paramString1, int paramInt10, String paramString2, int paramInt11, int paramInt12, String paramString3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramInt5;
    this.f = paramInt6;
    this.g = paramInt7;
    this.h = paramInt8;
    this.i = paramInt9;
    this.j = paramString1;
    this.k = paramInt10;
    this.l = paramString2;
    this.m = paramInt11;
    this.n = paramInt12;
    this.o = paramString3;
  }
  
  public SearchAdRequestParcel(b paramb)
  {
    this.a = 1;
    this.b = paramb.a();
    this.c = paramb.b();
    this.d = paramb.c();
    this.e = paramb.d();
    this.f = paramb.e();
    this.g = paramb.f();
    this.h = paramb.g();
    this.i = paramb.h();
    this.j = paramb.i();
    this.k = paramb.j();
    this.l = paramb.k();
    this.m = paramb.l();
    this.n = paramb.m();
    this.o = paramb.o();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    p.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/SearchAdRequestParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */