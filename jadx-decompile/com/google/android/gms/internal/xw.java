package com.google.android.gms.internal;

import android.location.Location;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.mediation.a;
import java.util.Date;
import java.util.Set;

@aaa
public final class xw implements a {
    private final Date d;
    private final int e;
    private final Set<String> f;
    private final boolean g;
    private final Location h;
    private final int i;
    private final boolean j;

    public xw(@Nullable Date date, int i, @Nullable Set<String> set, @Nullable Location location, boolean z, int i2, boolean z2) {
        this.d = date;
        this.e = i;
        this.f = set;
        this.h = location;
        this.g = z;
        this.i = i2;
        this.j = z2;
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
        return this.j;
    }
}
