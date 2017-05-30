package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final aa CREATOR = new aa();
    public final float a;
    public final float b;
    private final int c;

    public static final class a {
        public float a;
        public float b;

        public a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            this.a = streetViewPanoramaOrientation.b;
            this.b = streetViewPanoramaOrientation.a;
        }

        public a a(float f) {
            this.b = f;
            return this;
        }

        public StreetViewPanoramaOrientation a() {
            return new StreetViewPanoramaOrientation(this.b, this.a);
        }

        public a b(float f) {
            this.a = f;
            return this;
        }
    }

    public StreetViewPanoramaOrientation(float f, float f2) {
        this(1, f, f2);
    }

    StreetViewPanoramaOrientation(int i, float f, float f2) {
        boolean z = -90.0f <= f && f <= 90.0f;
        d.b(z, "Tilt needs to be between -90 and 90 inclusive");
        this.c = i;
        this.a = 0.0f + f;
        if (((double) f2) <= 0.0d) {
            f2 = (f2 % 360.0f) + 360.0f;
        }
        this.b = f2 % 360.0f;
    }

    public static a a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        return new a(streetViewPanoramaOrientation);
    }

    public static a b() {
        return new a();
    }

    int a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.a) == Float.floatToIntBits(streetViewPanoramaOrientation.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(streetViewPanoramaOrientation.b);
    }

    public int hashCode() {
        return c.a(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b)});
    }

    public String toString() {
        return c.a(this).a("tilt", Float.valueOf(this.a)).a("bearing", Float.valueOf(this.b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        aa.a(this, parcel, i);
    }
}
