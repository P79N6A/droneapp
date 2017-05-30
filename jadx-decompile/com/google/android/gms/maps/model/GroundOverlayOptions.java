package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.c.e.a;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final p CREATOR = new p();
    public static final float a = -1.0f;
    private final int b;
    private a c;
    private LatLng d;
    private float e;
    private float f;
    private LatLngBounds g;
    private float h;
    private float i;
    private boolean j;
    private float k;
    private float l;
    private float m;
    private boolean n;

    public GroundOverlayOptions() {
        this.j = true;
        this.k = 0.0f;
        this.l = 0.5f;
        this.m = 0.5f;
        this.n = false;
        this.b = 1;
    }

    GroundOverlayOptions(int i, IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.j = true;
        this.k = 0.0f;
        this.l = 0.5f;
        this.m = 0.5f;
        this.n = false;
        this.b = i;
        this.c = new a(a.a(iBinder));
        this.d = latLng;
        this.e = f;
        this.f = f2;
        this.g = latLngBounds;
        this.h = f3;
        this.i = f4;
        this.j = z;
        this.k = f5;
        this.l = f6;
        this.m = f7;
        this.n = z2;
    }

    private GroundOverlayOptions b(LatLng latLng, float f, float f2) {
        this.d = latLng;
        this.e = f;
        this.f = f2;
        return this;
    }

    IBinder a() {
        return this.c.a().asBinder();
    }

    public GroundOverlayOptions a(float f) {
        this.h = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public GroundOverlayOptions a(float f, float f2) {
        this.l = f;
        this.m = f2;
        return this;
    }

    public GroundOverlayOptions a(LatLng latLng, float f) {
        boolean z = true;
        d.a(this.g == null, "Position has already been set using positionFromBounds");
        d.b(latLng != null, "Location must be specified");
        if (f < 0.0f) {
            z = false;
        }
        d.b(z, "Width must be non-negative");
        return b(latLng, f, -1.0f);
    }

    public GroundOverlayOptions a(LatLng latLng, float f, float f2) {
        boolean z = true;
        d.a(this.g == null, "Position has already been set using positionFromBounds");
        d.b(latLng != null, "Location must be specified");
        d.b(f >= 0.0f, "Width must be non-negative");
        if (f2 < 0.0f) {
            z = false;
        }
        d.b(z, "Height must be non-negative");
        return b(latLng, f, f2);
    }

    public GroundOverlayOptions a(LatLngBounds latLngBounds) {
        boolean z = this.d == null;
        String valueOf = String.valueOf(this.d);
        d.a(z, new StringBuilder(String.valueOf(valueOf).length() + 46).append("Position has already been set using position: ").append(valueOf).toString());
        this.g = latLngBounds;
        return this;
    }

    public GroundOverlayOptions a(a aVar) {
        this.c = aVar;
        return this;
    }

    public GroundOverlayOptions a(boolean z) {
        this.j = z;
        return this;
    }

    int b() {
        return this.b;
    }

    public GroundOverlayOptions b(float f) {
        this.i = f;
        return this;
    }

    public GroundOverlayOptions b(boolean z) {
        this.n = z;
        return this;
    }

    public GroundOverlayOptions c(float f) {
        boolean z = f >= 0.0f && f <= 1.0f;
        d.b(z, "Transparency must be in the range [0..1]");
        this.k = f;
        return this;
    }

    public a c() {
        return this.c;
    }

    public LatLng d() {
        return this.d;
    }

    public float e() {
        return this.e;
    }

    public float f() {
        return this.f;
    }

    public LatLngBounds g() {
        return this.g;
    }

    public float h() {
        return this.h;
    }

    public float i() {
        return this.i;
    }

    public float j() {
        return this.k;
    }

    public float k() {
        return this.l;
    }

    public float l() {
        return this.m;
    }

    public boolean m() {
        return this.j;
    }

    public boolean n() {
        return this.n;
    }

    public void writeToParcel(Parcel parcel, int i) {
        p.a(this, parcel, i);
    }
}
