package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.i.a;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@aaa
public class abi
{
  public final long A;
  public final long B;
  public final String C;
  public final String D;
  @Nullable
  public final i.a E;
  public boolean F = false;
  public boolean G = false;
  public boolean H = false;
  @Nullable
  public final List<String> I;
  public final AdRequestParcel a;
  @Nullable
  public final acy b;
  public final List<String> c;
  public final int d;
  public final List<String> e;
  public final List<String> f;
  public final int g;
  public final long h;
  public final String i;
  public final JSONObject j;
  public final boolean k;
  public final AutoClickProtectionConfigurationParcel l;
  public boolean m;
  public final boolean n;
  @Nullable
  public final xg o;
  @Nullable
  public final xr p;
  @Nullable
  public final String q;
  public final xh r;
  @Nullable
  public final xj s;
  public final long t;
  @Nullable
  public final String u;
  public final AdSizeParcel v;
  public final long w;
  @Nullable
  public final RewardItemParcel x;
  @Nullable
  public final List<String> y;
  @Nullable
  public final List<String> z;
  
  public abi(AdRequestParcel paramAdRequestParcel, @Nullable acy paramacy, List<String> paramList1, int paramInt1, List<String> paramList2, List<String> paramList3, int paramInt2, long paramLong1, String paramString1, boolean paramBoolean1, @Nullable xg paramxg, @Nullable xr paramxr, @Nullable String paramString2, xh paramxh, @Nullable xj paramxj, long paramLong2, AdSizeParcel paramAdSizeParcel, long paramLong3, long paramLong4, long paramLong5, String paramString3, JSONObject paramJSONObject, @Nullable i.a parama, RewardItemParcel paramRewardItemParcel, List<String> paramList4, List<String> paramList5, boolean paramBoolean2, AutoClickProtectionConfigurationParcel paramAutoClickProtectionConfigurationParcel, @Nullable String paramString4, List<String> paramList6, String paramString5)
  {
    this.a = paramAdRequestParcel;
    this.b = paramacy;
    this.c = a(paramList1);
    this.d = paramInt1;
    this.e = a(paramList2);
    this.f = a(paramList3);
    this.g = paramInt2;
    this.h = paramLong1;
    this.i = paramString1;
    this.n = paramBoolean1;
    this.o = paramxg;
    this.p = paramxr;
    this.q = paramString2;
    this.r = paramxh;
    this.s = paramxj;
    this.t = paramLong2;
    this.v = paramAdSizeParcel;
    this.w = paramLong3;
    this.A = paramLong4;
    this.B = paramLong5;
    this.C = paramString3;
    this.j = paramJSONObject;
    this.E = parama;
    this.x = paramRewardItemParcel;
    this.y = a(paramList4);
    this.z = a(paramList5);
    this.k = paramBoolean2;
    this.l = paramAutoClickProtectionConfigurationParcel;
    this.u = paramString4;
    this.I = a(paramList6);
    this.D = paramString5;
  }
  
  public abi(a parama, @Nullable acy paramacy, @Nullable xg paramxg, @Nullable xr paramxr, @Nullable String paramString1, @Nullable xj paramxj, @Nullable i.a parama1, @Nullable String paramString2)
  {
    this(parama.a.c, paramacy, parama.b.d, parama.e, parama.b.f, parama.b.j, parama.b.l, parama.b.k, parama.a.i, parama.b.h, paramxg, paramxr, paramString1, parama.c, paramxj, parama.b.i, parama.d, parama.b.g, parama.f, parama.g, parama.b.o, parama.h, parama1, parama.b.C, parama.b.D, parama.b.D, parama.b.F, parama.b.G, paramString2, parama.b.J, parama.b.N);
  }
  
  @Nullable
  private static <T> List<T> a(@Nullable List<T> paramList)
  {
    if (paramList == null) {
      return null;
    }
    return Collections.unmodifiableList(paramList);
  }
  
  public boolean a()
  {
    if ((this.b == null) || (this.b.l() == null)) {
      return false;
    }
    return this.b.l().b();
  }
  
  @aaa
  public static final class a
  {
    public final AdRequestInfoParcel a;
    public final AdResponseParcel b;
    public final xh c;
    @Nullable
    public final AdSizeParcel d;
    public final int e;
    public final long f;
    public final long g;
    @Nullable
    public final JSONObject h;
    
    public a(AdRequestInfoParcel paramAdRequestInfoParcel, AdResponseParcel paramAdResponseParcel, xh paramxh, AdSizeParcel paramAdSizeParcel, int paramInt, long paramLong1, long paramLong2, JSONObject paramJSONObject)
    {
      this.a = paramAdRequestInfoParcel;
      this.b = paramAdResponseParcel;
      this.c = paramxh;
      this.d = paramAdSizeParcel;
      this.e = paramInt;
      this.f = paramLong1;
      this.g = paramLong2;
      this.h = paramJSONObject;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/abi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */