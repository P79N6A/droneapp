package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class PointOfInterest extends AbstractSafeParcelable {
    public static final u CREATOR = new u();
    public final LatLng a;
    public final String b;
    public final String c;
    private final int d;

    PointOfInterest(int i, LatLng latLng, String str, String str2) {
        this.d = i;
        this.a = latLng;
        this.b = str;
        this.c = str2;
    }

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this(1, latLng, str, str2);
    }

    int a() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        u.a(this, parcel, i);
    }
}
