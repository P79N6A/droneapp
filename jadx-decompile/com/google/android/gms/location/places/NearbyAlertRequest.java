package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class NearbyAlertRequest extends AbstractSafeParcelable {
    public static final r CREATOR = new r();
    private final int a;
    private final int b;
    private final int c;
    @Deprecated
    private final PlaceFilter d;
    private final NearbyAlertFilter e;
    private final boolean f;
    private final int g;
    private int h = 110;

    NearbyAlertRequest(int i, int i2, int i3, PlaceFilter placeFilter, NearbyAlertFilter nearbyAlertFilter, boolean z, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (nearbyAlertFilter != null) {
            this.e = nearbyAlertFilter;
        } else if (placeFilter == null) {
            this.e = null;
        } else if (placeFilter.b() != null && !placeFilter.b().isEmpty()) {
            this.e = NearbyAlertFilter.b(placeFilter.b());
        } else if (placeFilter.c() == null || placeFilter.c().isEmpty()) {
            this.e = null;
        } else {
            this.e = NearbyAlertFilter.c(placeFilter.c());
        }
        this.d = null;
        this.f = z;
        this.g = i4;
        this.h = i5;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    @Deprecated
    public PlaceFilter d() {
        return null;
    }

    public NearbyAlertFilter e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyAlertRequest)) {
            return false;
        }
        NearbyAlertRequest nearbyAlertRequest = (NearbyAlertRequest) obj;
        return this.b == nearbyAlertRequest.b && this.c == nearbyAlertRequest.c && c.a(this.e, nearbyAlertRequest.e) && this.h == nearbyAlertRequest.h;
    }

    public boolean f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public int hashCode() {
        return c.a(Integer.valueOf(this.b), Integer.valueOf(this.c), this.e, Integer.valueOf(this.h));
    }

    public String toString() {
        return c.a((Object) this).a("transitionTypes", Integer.valueOf(this.b)).a("loiteringTimeMillis", Integer.valueOf(this.c)).a("nearbyAlertFilter", this.e).a("priority", Integer.valueOf(this.h)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
