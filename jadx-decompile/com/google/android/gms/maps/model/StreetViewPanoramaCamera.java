package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class StreetViewPanoramaCamera extends AbstractSafeParcelable {
    public static final x CREATOR = new x();
    public final float a;
    public final float b;
    public final float c;
    private final int d;
    private StreetViewPanoramaOrientation e;

    public static final class a {
        public float a;
        public float b;
        public float c;

        public a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
            this.c = streetViewPanoramaCamera.a;
            this.a = streetViewPanoramaCamera.c;
            this.b = streetViewPanoramaCamera.b;
        }

        public a a(float f) {
            this.c = f;
            return this;
        }

        public a a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            this.b = streetViewPanoramaOrientation.a;
            this.a = streetViewPanoramaOrientation.b;
            return this;
        }

        public StreetViewPanoramaCamera a() {
            return new StreetViewPanoramaCamera(this.c, this.b, this.a);
        }

        public a b(float f) {
            this.b = f;
            return this;
        }

        public a c(float f) {
            this.a = f;
            return this;
        }
    }

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        this(1, f, f2, f3);
    }

    StreetViewPanoramaCamera(int i, float f, float f2, float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        d.b(z, "Tilt needs to be between -90 and 90 inclusive");
        this.d = i;
        if (((double) f) <= 0.0d) {
            f = 0.0f;
        }
        this.a = f;
        this.b = f2 + 0.0f;
        this.c = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        this.e = new com.google.android.gms.maps.model.StreetViewPanoramaOrientation.a().a(f2).b(f3).a();
    }

    public static a a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new a(streetViewPanoramaCamera);
    }

    public static a b() {
        return new a();
    }

    int a() {
        return this.d;
    }

    public StreetViewPanoramaOrientation c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.a) == Float.floatToIntBits(streetViewPanoramaCamera.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(streetViewPanoramaCamera.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(streetViewPanoramaCamera.c);
    }

    public int hashCode() {
        return c.a(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    public String toString() {
        return c.a(this).a("zoom", Float.valueOf(this.a)).a("tilt", Float.valueOf(this.b)).a("bearing", Float.valueOf(this.c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        x.a(this, parcel, i);
    }
}
