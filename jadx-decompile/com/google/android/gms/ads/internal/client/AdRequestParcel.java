package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import java.util.List;

@aaa
public final class AdRequestParcel extends AbstractSafeParcelable {
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

    public AdRequestParcel(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, SearchAdRequestParcel searchAdRequestParcel, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.a = i;
        this.b = j;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.c = bundle;
        this.d = i2;
        this.e = list;
        this.f = z;
        this.g = i3;
        this.h = z2;
        this.i = str;
        this.j = searchAdRequestParcel;
        this.k = location;
        this.l = str2;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        this.m = bundle2;
        this.n = bundle3;
        this.o = list2;
        this.p = str3;
        this.q = str4;
        this.r = z3;
    }

    public static void a(AdRequestParcel adRequestParcel) {
        adRequestParcel.m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", adRequestParcel.c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AdRequestParcel)) {
            return false;
        }
        AdRequestParcel adRequestParcel = (AdRequestParcel) obj;
        return this.a == adRequestParcel.a && this.b == adRequestParcel.b && c.a(this.c, adRequestParcel.c) && this.d == adRequestParcel.d && c.a(this.e, adRequestParcel.e) && this.f == adRequestParcel.f && this.g == adRequestParcel.g && this.h == adRequestParcel.h && c.a(this.i, adRequestParcel.i) && c.a(this.j, adRequestParcel.j) && c.a(this.k, adRequestParcel.k) && c.a(this.l, adRequestParcel.l) && c.a(this.m, adRequestParcel.m) && c.a(this.n, adRequestParcel.n) && c.a(this.o, adRequestParcel.o) && c.a(this.p, adRequestParcel.p) && c.a(this.q, adRequestParcel.q) && this.r == adRequestParcel.r;
    }

    public int hashCode() {
        return c.a(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r));
    }

    public void writeToParcel(Parcel parcel, int i) {
        x.a(this, parcel, i);
    }
}
