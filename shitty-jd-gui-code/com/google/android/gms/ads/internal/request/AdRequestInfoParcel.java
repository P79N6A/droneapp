package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import java.util.Collections;
import java.util.List;

@aaa
public final class AdRequestInfoParcel
  extends AbstractSafeParcelable
{
  public static final f CREATOR = new f();
  public final List<String> A;
  public final long B;
  public final CapabilityParcel C;
  public final String D;
  public final float E;
  public final int F;
  public final int G;
  public final boolean H;
  public final boolean I;
  public final String J;
  public final boolean K;
  public final String L;
  public final boolean M;
  public final int N;
  public final Bundle O;
  public final String P;
  public final int a;
  @Nullable
  public final Bundle b;
  public final AdRequestParcel c;
  public final AdSizeParcel d;
  public final String e;
  public final ApplicationInfo f;
  @Nullable
  public final PackageInfo g;
  public final String h;
  public final String i;
  public final String j;
  public final VersionInfoParcel k;
  public final Bundle l;
  public final int m;
  public final List<String> n;
  public final Bundle o;
  public final boolean p;
  public final Messenger q;
  public final int r;
  public final int s;
  public final float t;
  public final String u;
  public final long v;
  public final String w;
  @Nullable
  public final List<String> x;
  public final String y;
  public final NativeAdOptionsParcel z;
  
  AdRequestInfoParcel(int paramInt1, Bundle paramBundle1, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, VersionInfoParcel paramVersionInfoParcel, Bundle paramBundle2, int paramInt2, List<String> paramList1, Bundle paramBundle3, boolean paramBoolean1, Messenger paramMessenger, int paramInt3, int paramInt4, float paramFloat1, String paramString5, long paramLong1, String paramString6, List<String> paramList2, String paramString7, NativeAdOptionsParcel paramNativeAdOptionsParcel, List<String> paramList3, long paramLong2, CapabilityParcel paramCapabilityParcel, String paramString8, float paramFloat2, boolean paramBoolean2, int paramInt5, int paramInt6, boolean paramBoolean3, boolean paramBoolean4, String paramString9, String paramString10, boolean paramBoolean5, int paramInt7, Bundle paramBundle4, String paramString11)
  {
    this.a = paramInt1;
    this.b = paramBundle1;
    this.c = paramAdRequestParcel;
    this.d = paramAdSizeParcel;
    this.e = paramString1;
    this.f = paramApplicationInfo;
    this.g = paramPackageInfo;
    this.h = paramString2;
    this.i = paramString3;
    this.j = paramString4;
    this.k = paramVersionInfoParcel;
    this.l = paramBundle2;
    this.m = paramInt2;
    this.n = paramList1;
    if (paramList3 == null)
    {
      paramBundle1 = Collections.emptyList();
      this.A = paramBundle1;
      this.o = paramBundle3;
      this.p = paramBoolean1;
      this.q = paramMessenger;
      this.r = paramInt3;
      this.s = paramInt4;
      this.t = paramFloat1;
      this.u = paramString5;
      this.v = paramLong1;
      this.w = paramString6;
      if (paramList2 != null) {
        break label279;
      }
    }
    label279:
    for (paramBundle1 = Collections.emptyList();; paramBundle1 = Collections.unmodifiableList(paramList2))
    {
      this.x = paramBundle1;
      this.y = paramString7;
      this.z = paramNativeAdOptionsParcel;
      this.B = paramLong2;
      this.C = paramCapabilityParcel;
      this.D = paramString8;
      this.E = paramFloat2;
      this.K = paramBoolean2;
      this.F = paramInt5;
      this.G = paramInt6;
      this.H = paramBoolean3;
      this.I = paramBoolean4;
      this.J = paramString9;
      this.L = paramString10;
      this.M = paramBoolean5;
      this.N = paramInt7;
      this.O = paramBundle4;
      this.P = paramString11;
      return;
      paramBundle1 = Collections.unmodifiableList(paramList3);
      break;
    }
  }
  
  public AdRequestInfoParcel(@Nullable Bundle paramBundle1, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, String paramString1, ApplicationInfo paramApplicationInfo, @Nullable PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, VersionInfoParcel paramVersionInfoParcel, Bundle paramBundle2, int paramInt1, List<String> paramList1, List<String> paramList2, Bundle paramBundle3, boolean paramBoolean1, Messenger paramMessenger, int paramInt2, int paramInt3, float paramFloat1, String paramString5, long paramLong1, String paramString6, @Nullable List<String> paramList3, String paramString7, NativeAdOptionsParcel paramNativeAdOptionsParcel, long paramLong2, CapabilityParcel paramCapabilityParcel, String paramString8, float paramFloat2, boolean paramBoolean2, int paramInt4, int paramInt5, boolean paramBoolean3, boolean paramBoolean4, String paramString9, String paramString10, boolean paramBoolean5, int paramInt6, Bundle paramBundle4, String paramString11)
  {
    this(19, paramBundle1, paramAdRequestParcel, paramAdSizeParcel, paramString1, paramApplicationInfo, paramPackageInfo, paramString2, paramString3, paramString4, paramVersionInfoParcel, paramBundle2, paramInt1, paramList1, paramBundle3, paramBoolean1, paramMessenger, paramInt2, paramInt3, paramFloat1, paramString5, paramLong1, paramString6, paramList3, paramString7, paramNativeAdOptionsParcel, paramList2, paramLong2, paramCapabilityParcel, paramString8, paramFloat2, paramBoolean2, paramInt4, paramInt5, paramBoolean3, paramBoolean4, paramString9, paramString10, paramBoolean5, paramInt6, paramBundle4, paramString11);
  }
  
  public AdRequestInfoParcel(a parama, String paramString, long paramLong)
  {
    this(parama.a, parama.b, parama.c, parama.d, parama.e, parama.f, paramString, parama.g, parama.h, parama.j, parama.i, parama.k, parama.l, parama.m, parama.n, parama.o, parama.p, parama.q, parama.r, parama.s, parama.t, parama.u, parama.v, parama.w, parama.x, parama.y, paramLong, parama.z, parama.A, parama.B, parama.C, parama.D, parama.E, parama.F, parama.G, parama.H, parama.I, parama.J, parama.K, parama.L, parama.M);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
  
  @aaa
  public static final class a
  {
    public final String A;
    public final float B;
    public final boolean C;
    public final int D;
    public final int E;
    public final boolean F;
    public final boolean G;
    public final String H;
    public final String I;
    public final boolean J;
    public final int K;
    public final Bundle L;
    public final String M;
    @Nullable
    public final Bundle a;
    public final AdRequestParcel b;
    public final AdSizeParcel c;
    public final String d;
    public final ApplicationInfo e;
    @Nullable
    public final PackageInfo f;
    public final String g;
    public final String h;
    public final Bundle i;
    public final VersionInfoParcel j;
    public final int k;
    public final List<String> l;
    public final List<String> m;
    public final Bundle n;
    public final boolean o;
    public final Messenger p;
    public final int q;
    public final int r;
    public final float s;
    public final String t;
    public final long u;
    public final String v;
    @Nullable
    public final List<String> w;
    public final String x;
    public final NativeAdOptionsParcel y;
    public final CapabilityParcel z;
    
    public a(@Nullable Bundle paramBundle1, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, String paramString1, ApplicationInfo paramApplicationInfo, @Nullable PackageInfo paramPackageInfo, String paramString2, String paramString3, VersionInfoParcel paramVersionInfoParcel, Bundle paramBundle2, List<String> paramList1, List<String> paramList2, Bundle paramBundle3, boolean paramBoolean1, Messenger paramMessenger, int paramInt1, int paramInt2, float paramFloat1, String paramString4, long paramLong, String paramString5, @Nullable List<String> paramList3, String paramString6, NativeAdOptionsParcel paramNativeAdOptionsParcel, CapabilityParcel paramCapabilityParcel, String paramString7, float paramFloat2, boolean paramBoolean2, int paramInt3, int paramInt4, boolean paramBoolean3, boolean paramBoolean4, String paramString8, String paramString9, boolean paramBoolean5, int paramInt5, Bundle paramBundle4, String paramString10)
    {
      this.a = paramBundle1;
      this.b = paramAdRequestParcel;
      this.c = paramAdSizeParcel;
      this.d = paramString1;
      this.e = paramApplicationInfo;
      this.f = paramPackageInfo;
      this.g = paramString2;
      this.h = paramString3;
      this.j = paramVersionInfoParcel;
      this.i = paramBundle2;
      this.o = paramBoolean1;
      this.p = paramMessenger;
      this.q = paramInt1;
      this.r = paramInt2;
      this.s = paramFloat1;
      if ((paramList1 != null) && (paramList1.size() > 0))
      {
        this.k = 3;
        this.l = paramList1;
      }
      for (this.m = paramList2;; this.m = null)
      {
        this.n = paramBundle3;
        this.t = paramString4;
        this.u = paramLong;
        this.v = paramString5;
        this.w = paramList3;
        this.x = paramString6;
        this.y = paramNativeAdOptionsParcel;
        this.z = paramCapabilityParcel;
        this.A = paramString7;
        this.B = paramFloat2;
        this.C = paramBoolean2;
        this.D = paramInt3;
        this.E = paramInt4;
        this.F = paramBoolean3;
        this.G = paramBoolean4;
        this.H = paramString8;
        this.I = paramString9;
        this.J = paramBoolean5;
        this.K = paramInt5;
        this.L = paramBundle4;
        this.M = paramString10;
        return;
        this.k = 0;
        this.l = null;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/AdRequestInfoParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */