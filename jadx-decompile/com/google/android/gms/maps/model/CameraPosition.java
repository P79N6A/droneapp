package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final n CREATOR = new n();
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;
    private final int e;

    public static final class a {
        private LatLng a;
        private float b;
        private float c;
        private float d;

        public a(CameraPosition cameraPosition) {
            this.a = cameraPosition.a;
            this.b = cameraPosition.b;
            this.c = cameraPosition.c;
            this.d = cameraPosition.d;
        }

        public a a(float f) {
            this.b = f;
            return this;
        }

        public a a(LatLng latLng) {
            this.a = latLng;
            return this;
        }

        public CameraPosition a() {
            return new CameraPosition(this.a, this.b, this.c, this.d);
        }

        public a b(float f) {
            this.c = f;
            return this;
        }

        public a c(float f) {
            this.d = f;
            return this;
        }
    }

    CameraPosition(int i, LatLng latLng, float f, float f2, float f3) {
        d.a(latLng, "null camera target");
        boolean z = 0.0f <= f2 && f2 <= 90.0f;
        d.b(z, "Tilt needs to be between 0 and 90 inclusive: %s", new Object[]{Float.valueOf(f2)});
        this.e = i;
        this.a = latLng;
        this.b = f;
        this.c = f2 + 0.0f;
        if (((double) f3) <= 0.0d) {
            f3 = (f3 % 360.0f) + 360.0f;
        }
        this.d = f3 % 360.0f;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this(1, latLng, f, f2, f3);
    }

    public static a a(CameraPosition cameraPosition) {
        return new a(cameraPosition);
    }

    public static CameraPosition a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraTargetLat) ? obtainAttributes.getFloat(R.styleable.MapAttrs_cameraTargetLat, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(R.styleable.MapAttrs_cameraTargetLng, 0.0f) : 0.0f));
        a b = b();
        b.a(latLng);
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraZoom)) {
            b.a(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraZoom, 0.0f));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraBearing)) {
            b.c(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraBearing, 0.0f));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraTilt)) {
            b.b(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraTilt, 0.0f));
        }
        return b.a();
    }

    public static final CameraPosition a(LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public static a b() {
        return new a();
    }

    int a() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.a.equals(cameraPosition.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d);
    }

    public int hashCode() {
        return c.a(new Object[]{this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }

    public String toString() {
        return c.a(this).a("target", this.a).a("zoom", Float.valueOf(this.b)).a("tilt", Float.valueOf(this.c)).a("bearing", Float.valueOf(this.d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        n.a(this, parcel, i);
    }
}
