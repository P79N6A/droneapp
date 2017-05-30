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
public final class AdRequestInfoParcel extends AbstractSafeParcelable {
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

    @aaa
    public static final class a {
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

        public a(@Nullable Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo, String str2, String str3, VersionInfoParcel versionInfoParcel, Bundle bundle2, List<String> list, List<String> list2, Bundle bundle3, boolean z, Messenger messenger, int i, int i2, float f, String str4, long j, String str5, @Nullable List<String> list3, String str6, NativeAdOptionsParcel nativeAdOptionsParcel, CapabilityParcel capabilityParcel, String str7, float f2, boolean z2, int i3, int i4, boolean z3, boolean z4, String str8, String str9, boolean z5, int i5, Bundle bundle4, String str10) {
            this.a = bundle;
            this.b = adRequestParcel;
            this.c = adSizeParcel;
            this.d = str;
            this.e = applicationInfo;
            this.f = packageInfo;
            this.g = str2;
            this.h = str3;
            this.j = versionInfoParcel;
            this.i = bundle2;
            this.o = z;
            this.p = messenger;
            this.q = i;
            this.r = i2;
            this.s = f;
            if (list == null || list.size() <= 0) {
                this.k = 0;
                this.l = null;
                this.m = null;
            } else {
                this.k = 3;
                this.l = list;
                this.m = list2;
            }
            this.n = bundle3;
            this.t = str4;
            this.u = j;
            this.v = str5;
            this.w = list3;
            this.x = str6;
            this.y = nativeAdOptionsParcel;
            this.z = capabilityParcel;
            this.A = str7;
            this.B = f2;
            this.C = z2;
            this.D = i3;
            this.E = i4;
            this.F = z3;
            this.G = z4;
            this.H = str8;
            this.I = str9;
            this.J = z5;
            this.K = i5;
            this.L = bundle4;
            this.M = str10;
        }
    }

    AdRequestInfoParcel(int i, Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, Messenger messenger, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list3, long j2, CapabilityParcel capabilityParcel, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11) {
        this.a = i;
        this.b = bundle;
        this.c = adRequestParcel;
        this.d = adSizeParcel;
        this.e = str;
        this.f = applicationInfo;
        this.g = packageInfo;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = versionInfoParcel;
        this.l = bundle2;
        this.m = i2;
        this.n = list;
        this.A = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.o = bundle3;
        this.p = z;
        this.q = messenger;
        this.r = i3;
        this.s = i4;
        this.t = f;
        this.u = str5;
        this.v = j;
        this.w = str6;
        this.x = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.y = str7;
        this.z = nativeAdOptionsParcel;
        this.B = j2;
        this.C = capabilityParcel;
        this.D = str8;
        this.E = f2;
        this.K = z2;
        this.F = i5;
        this.G = i6;
        this.H = z3;
        this.I = z4;
        this.J = str9;
        this.L = str10;
        this.M = z5;
        this.N = i7;
        this.O = bundle4;
        this.P = str11;
    }

    public AdRequestInfoParcel(@Nullable Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, Messenger messenger, int i2, int i3, float f, String str5, long j, String str6, @Nullable List<String> list3, String str7, NativeAdOptionsParcel nativeAdOptionsParcel, long j2, CapabilityParcel capabilityParcel, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4, String str11) {
        this(19, bundle, adRequestParcel, adSizeParcel, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i, list, bundle3, z, messenger, i2, i3, f, str5, j, str6, list3, str7, nativeAdOptionsParcel, list2, j2, capabilityParcel, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4, str11);
    }

    public AdRequestInfoParcel(a aVar, String str, long j) {
        this(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, str, aVar.g, aVar.h, aVar.j, aVar.i, aVar.k, aVar.l, aVar.m, aVar.n, aVar.o, aVar.p, aVar.q, aVar.r, aVar.s, aVar.t, aVar.u, aVar.v, aVar.w, aVar.x, aVar.y, j, aVar.z, aVar.A, aVar.B, aVar.C, aVar.D, aVar.E, aVar.F, aVar.G, aVar.H, aVar.I, aVar.J, aVar.K, aVar.L, aVar.M);
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
