package com.google.android.gms.location.places;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class PlaceRequest extends AbstractSafeParcelable {
    public static final Creator<PlaceRequest> CREATOR = new x();
    final int a;
    private final PlaceFilter b;
    private final long c;
    private final int d;
    private final long e;
    private final boolean f;
    private final boolean g;

    public PlaceRequest(int i, PlaceFilter placeFilter, long j, int i2, long j2, boolean z, boolean z2) {
        this.a = i;
        this.b = placeFilter;
        this.c = j;
        this.d = i2;
        this.e = j2;
        this.f = z;
        this.g = z2;
    }

    @Deprecated
    public PlaceFilter a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public long d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceRequest)) {
            return false;
        }
        PlaceRequest placeRequest = (PlaceRequest) obj;
        return c.a(this.b, placeRequest.b) && this.c == placeRequest.c && this.d == placeRequest.d && this.e == placeRequest.e && this.f == placeRequest.f;
    }

    public boolean f() {
        return this.g;
    }

    public int hashCode() {
        return c.a(this.b, Long.valueOf(this.c), Integer.valueOf(this.d), Long.valueOf(this.e), Boolean.valueOf(this.f));
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return c.a((Object) this).a("filter", this.b).a("interval", Long.valueOf(this.c)).a("priority", Integer.valueOf(this.d)).a("expireAt", Long.valueOf(this.e)).a("receiveFailures", Boolean.valueOf(this.f)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        x.a(this, parcel, i);
    }
}
