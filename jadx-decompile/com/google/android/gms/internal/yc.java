package com.google.android.gms.internal;

import android.location.Location;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.i.a;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.mediation.l;
import java.util.Date;
import java.util.List;
import java.util.Set;

@aaa
public final class yc implements l {
    private final Date d;
    private final int e;
    private final Set<String> f;
    private final boolean g;
    private final Location h;
    private final int i;
    private final NativeAdOptionsParcel j;
    private final List<String> k;
    private final boolean l;

    public yc(@Nullable Date date, int i, @Nullable Set<String> set, @Nullable Location location, boolean z, int i2, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list, boolean z2) {
        this.d = date;
        this.e = i;
        this.f = set;
        this.h = location;
        this.g = z;
        this.i = i2;
        this.j = nativeAdOptionsParcel;
        this.k = list;
        this.l = z2;
    }

    public Date a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public Set<String> c() {
        return this.f;
    }

    public Location d() {
        return this.h;
    }

    public int e() {
        return this.i;
    }

    public boolean f() {
        return this.g;
    }

    public boolean g() {
        return this.l;
    }

    public b h() {
        if (this.j == null) {
            return null;
        }
        b.b b = new b.b().a(this.j.b).a(this.j.c).b(this.j.d);
        if (this.j.a >= 2) {
            b.b(this.j.e);
        }
        if (this.j.a >= 3 && this.j.f != null) {
            b.a(new a().a(this.j.f.b).a());
        }
        return b.a();
    }

    public boolean i() {
        return this.k != null && this.k.contains("2");
    }

    public boolean j() {
        return this.k != null && this.k.contains("1");
    }
}
