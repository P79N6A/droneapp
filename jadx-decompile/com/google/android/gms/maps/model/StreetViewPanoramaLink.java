package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final y CREATOR = new y();
    public final String a;
    public final float b;
    private final int c;

    StreetViewPanoramaLink(int i, String str, float f) {
        this.c = i;
        this.a = str;
        if (((double) f) <= 0.0d) {
            f = (f % 360.0f) + 360.0f;
        }
        this.b = f % 360.0f;
    }

    int a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.a.equals(streetViewPanoramaLink.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(streetViewPanoramaLink.b);
    }

    public int hashCode() {
        return c.a(new Object[]{this.a, Float.valueOf(this.b)});
    }

    public String toString() {
        return c.a(this).a("panoId", this.a).a("bearing", Float.valueOf(this.b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        y.a(this, parcel, i);
    }
}
