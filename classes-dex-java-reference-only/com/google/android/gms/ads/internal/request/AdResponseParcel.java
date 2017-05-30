package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import java.util.Collections;
import java.util.List;

@aaa
public final class AdResponseParcel
  extends AbstractSafeParcelable
{
  public static final h CREATOR = new h();
  public final boolean A;
  public final boolean B;
  @Nullable
  public final RewardItemParcel C;
  @Nullable
  public final List<String> D;
  @Nullable
  public final List<String> E;
  public final boolean F;
  @Nullable
  public final AutoClickProtectionConfigurationParcel G;
  public final boolean H;
  @Nullable
  public String I;
  public final List<String> J;
  public final boolean K;
  @Nullable
  public final String L;
  @Nullable
  public final SafeBrowsingConfigParcel M;
  @Nullable
  public final String N;
  private AdRequestInfoParcel O;
  public final int a;
  public final String b;
  public String c;
  public final List<String> d;
  public final int e;
  public final List<String> f;
  public final long g;
  public final boolean h;
  public final long i;
  public final List<String> j;
  public final long k;
  public final int l;
  public final String m;
  public final long n;
  public final String o;
  public final boolean p;
  public final String q;
  public final String r;
  public final boolean s;
  public final boolean t;
  public final boolean u;
  public final boolean v;
  public final boolean w;
  public LargeParcelTeleporter x;
  public String y;
  public final String z;
  
  public AdResponseParcel(int paramInt)
  {
    this(18, null, null, null, paramInt, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null);
  }
  
  public AdResponseParcel(int paramInt, long paramLong)
  {
    this(18, null, null, null, paramInt, null, -1L, false, -1L, null, paramLong, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null);
  }
  
  AdResponseParcel(int paramInt1, String paramString1, String paramString2, List<String> paramList1, int paramInt2, List<String> paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List<String> paramList3, long paramLong3, int paramInt3, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, LargeParcelTeleporter paramLargeParcelTeleporter, String paramString7, String paramString8, boolean paramBoolean8, boolean paramBoolean9, RewardItemParcel paramRewardItemParcel, List<String> paramList4, List<String> paramList5, boolean paramBoolean10, AutoClickProtectionConfigurationParcel paramAutoClickProtectionConfigurationParcel, boolean paramBoolean11, String paramString9, List<String> paramList6, boolean paramBoolean12, String paramString10, SafeBrowsingConfigParcel paramSafeBrowsingConfigParcel, String paramString11)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    if (paramList1 != null)
    {
      paramString1 = Collections.unmodifiableList(paramList1);
      this.d = paramString1;
      this.e = paramInt2;
      if (paramList2 == null) {
        break label327;
      }
      paramString1 = Collections.unmodifiableList(paramList2);
      label52:
      this.f = paramString1;
      this.g = paramLong1;
      this.h = paramBoolean1;
      this.i = paramLong2;
      if (paramList3 == null) {
        break label332;
      }
    }
    label327:
    label332:
    for (paramString1 = Collections.unmodifiableList(paramList3);; paramString1 = null)
    {
      this.j = paramString1;
      this.k = paramLong3;
      this.l = paramInt3;
      this.m = paramString3;
      this.n = paramLong4;
      this.o = paramString4;
      this.p = paramBoolean2;
      this.q = paramString5;
      this.r = paramString6;
      this.s = paramBoolean3;
      this.t = paramBoolean4;
      this.u = paramBoolean5;
      this.v = paramBoolean6;
      this.w = paramBoolean7;
      this.x = paramLargeParcelTeleporter;
      this.y = paramString7;
      this.z = paramString8;
      if ((this.c == null) && (this.x != null))
      {
        paramString1 = (StringParcel)this.x.a(StringParcel.CREATOR);
        if ((paramString1 != null) && (!TextUtils.isEmpty(paramString1.a()))) {
          this.c = paramString1.a();
        }
      }
      this.A = paramBoolean8;
      this.B = paramBoolean9;
      this.C = paramRewardItemParcel;
      this.D = paramList4;
      this.E = paramList5;
      this.F = paramBoolean10;
      this.G = paramAutoClickProtectionConfigurationParcel;
      this.H = paramBoolean11;
      this.I = paramString9;
      this.J = paramList6;
      this.K = paramBoolean12;
      this.L = paramString10;
      this.M = paramSafeBrowsingConfigParcel;
      this.N = paramString11;
      return;
      paramString1 = null;
      break;
      paramString1 = null;
      break label52;
    }
  }
  
  public AdResponseParcel(AdRequestInfoParcel paramAdRequestInfoParcel, String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List<String> paramList3, long paramLong3, int paramInt, String paramString3, long paramLong4, String paramString4, String paramString5, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, String paramString6, boolean paramBoolean7, boolean paramBoolean8, RewardItemParcel paramRewardItemParcel, List<String> paramList4, List<String> paramList5, boolean paramBoolean9, AutoClickProtectionConfigurationParcel paramAutoClickProtectionConfigurationParcel, boolean paramBoolean10, String paramString7, List<String> paramList6, boolean paramBoolean11, String paramString8, SafeBrowsingConfigParcel paramSafeBrowsingConfigParcel, String paramString9)
  {
    this(18, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean1, paramLong2, paramList3, paramLong3, paramInt, paramString3, paramLong4, paramString4, false, null, paramString5, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, null, null, paramString6, paramBoolean7, paramBoolean8, paramRewardItemParcel, paramList4, paramList5, paramBoolean9, paramAutoClickProtectionConfigurationParcel, paramBoolean10, paramString7, paramList6, paramBoolean11, paramString8, paramSafeBrowsingConfigParcel, paramString9);
    this.O = paramAdRequestInfoParcel;
  }
  
  public AdResponseParcel(AdRequestInfoParcel paramAdRequestInfoParcel, String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List<String> paramList3, long paramLong3, int paramInt, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, String paramString7, boolean paramBoolean8, boolean paramBoolean9, RewardItemParcel paramRewardItemParcel, List<String> paramList4, List<String> paramList5, boolean paramBoolean10, AutoClickProtectionConfigurationParcel paramAutoClickProtectionConfigurationParcel, boolean paramBoolean11, String paramString8, List<String> paramList6, boolean paramBoolean12, String paramString9, SafeBrowsingConfigParcel paramSafeBrowsingConfigParcel, String paramString10)
  {
    this(18, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean1, paramLong2, paramList3, paramLong3, paramInt, paramString3, paramLong4, paramString4, paramBoolean2, paramString5, paramString6, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramBoolean7, null, null, paramString7, paramBoolean8, paramBoolean9, paramRewardItemParcel, paramList4, paramList5, paramBoolean10, paramAutoClickProtectionConfigurationParcel, paramBoolean11, paramString8, paramList6, paramBoolean12, paramString9, paramSafeBrowsingConfigParcel, paramString10);
    this.O = paramAdRequestInfoParcel;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if ((this.O != null) && (this.O.a >= 9) && (!TextUtils.isEmpty(this.c)))
    {
      this.x = new LargeParcelTeleporter(new StringParcel(this.c));
      this.c = null;
    }
    h.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/AdResponseParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */