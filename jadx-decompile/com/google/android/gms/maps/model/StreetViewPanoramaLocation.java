package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final z CREATOR = new z();
    public final StreetViewPanoramaLink[] a;
    public final LatLng b;
    public final String c;
    private final int d;

    StreetViewPanoramaLocation(int i, StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.d = i;
        this.a = streetViewPanoramaLinkArr;
        this.b = latLng;
        this.c = str;
    }

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this(1, streetViewPanoramaLinkArr, latLng, str);
    }

    int a() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.c.equals(streetViewPanoramaLocation.c) && this.b.equals(streetViewPanoramaLocation.b);
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c});
    }

    public String toString() {
        return c.a(this).a("panoId", this.c).a("position", this.b.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        z.a(this, parcel, i);
    }
}
