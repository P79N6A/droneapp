package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@aaa
public class abi {
    public final long A;
    public final long B;
    public final String C;
    public final String D;
    @Nullable
    public final com.google.android.gms.ads.internal.formats.i.a E;
    public boolean F;
    public boolean G;
    public boolean H;
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

    @aaa
    public static final class a {
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

        public a(AdRequestInfoParcel adRequestInfoParcel, AdResponseParcel adResponseParcel, xh xhVar, AdSizeParcel adSizeParcel, int i, long j, long j2, JSONObject jSONObject) {
            this.a = adRequestInfoParcel;
            this.b = adResponseParcel;
            this.c = xhVar;
            this.d = adSizeParcel;
            this.e = i;
            this.f = j;
            this.g = j2;
            this.h = jSONObject;
        }
    }

    public abi(AdRequestParcel adRequestParcel, @Nullable acy com_google_android_gms_internal_acy, List<String> list, int i, List<String> list2, List<String> list3, int i2, long j, String str, boolean z, @Nullable xg xgVar, @Nullable xr xrVar, @Nullable String str2, xh xhVar, @Nullable xj xjVar, long j2, AdSizeParcel adSizeParcel, long j3, long j4, long j5, String str3, JSONObject jSONObject, @Nullable com.google.android.gms.ads.internal.formats.i.a aVar, RewardItemParcel rewardItemParcel, List<String> list4, List<String> list5, boolean z2, AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel, @Nullable String str4, List<String> list6, String str5) {
        this.F = false;
        this.G = false;
        this.H = false;
        this.a = adRequestParcel;
        this.b = com_google_android_gms_internal_acy;
        this.c = a(list);
        this.d = i;
        this.e = a(list2);
        this.f = a(list3);
        this.g = i2;
        this.h = j;
        this.i = str;
        this.n = z;
        this.o = xgVar;
        this.p = xrVar;
        this.q = str2;
        this.r = xhVar;
        this.s = xjVar;
        this.t = j2;
        this.v = adSizeParcel;
        this.w = j3;
        this.A = j4;
        this.B = j5;
        this.C = str3;
        this.j = jSONObject;
        this.E = aVar;
        this.x = rewardItemParcel;
        this.y = a(list4);
        this.z = a(list5);
        this.k = z2;
        this.l = autoClickProtectionConfigurationParcel;
        this.u = str4;
        this.I = a(list6);
        this.D = str5;
    }

    public abi(a aVar, @Nullable acy com_google_android_gms_internal_acy, @Nullable xg xgVar, @Nullable xr xrVar, @Nullable String str, @Nullable xj xjVar, @Nullable com.google.android.gms.ads.internal.formats.i.a aVar2, @Nullable String str2) {
        this(aVar.a.c, com_google_android_gms_internal_acy, aVar.b.d, aVar.e, aVar.b.f, aVar.b.j, aVar.b.l, aVar.b.k, aVar.a.i, aVar.b.h, xgVar, xrVar, str, aVar.c, xjVar, aVar.b.i, aVar.d, aVar.b.g, aVar.f, aVar.g, aVar.b.o, aVar.h, aVar2, aVar.b.C, aVar.b.D, aVar.b.D, aVar.b.F, aVar.b.G, str2, aVar.b.J, aVar.b.N);
    }

    @Nullable
    private static <T> List<T> a(@Nullable List<T> list) {
        return list == null ? null : Collections.unmodifiableList(list);
    }

    public boolean a() {
        return (this.b == null || this.b.l() == null) ? false : this.b.l().b();
    }
}
