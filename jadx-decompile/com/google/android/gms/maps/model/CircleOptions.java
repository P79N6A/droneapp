package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.v4.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.tencent.open.yyb.TitleBar;

public final class CircleOptions extends AbstractSafeParcelable {
    public static final o CREATOR = new o();
    private final int a;
    private LatLng b;
    private double c;
    private float d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private boolean i;

    public CircleOptions() {
        this.b = null;
        this.c = 0.0d;
        this.d = TitleBar.SHAREBTN_RIGHT_MARGIN;
        this.e = ViewCompat.MEASURED_STATE_MASK;
        this.f = 0;
        this.g = 0.0f;
        this.h = true;
        this.i = false;
        this.a = 1;
    }

    CircleOptions(int i, LatLng latLng, double d, float f, int i2, int i3, float f2, boolean z, boolean z2) {
        this.b = null;
        this.c = 0.0d;
        this.d = TitleBar.SHAREBTN_RIGHT_MARGIN;
        this.e = ViewCompat.MEASURED_STATE_MASK;
        this.f = 0;
        this.g = 0.0f;
        this.h = true;
        this.i = false;
        this.a = i;
        this.b = latLng;
        this.c = d;
        this.d = f;
        this.e = i2;
        this.f = i3;
        this.g = f2;
        this.h = z;
        this.i = z2;
    }

    int a() {
        return this.a;
    }

    public CircleOptions a(double d) {
        this.c = d;
        return this;
    }

    public CircleOptions a(float f) {
        this.d = f;
        return this;
    }

    public CircleOptions a(int i) {
        this.e = i;
        return this;
    }

    public CircleOptions a(LatLng latLng) {
        this.b = latLng;
        return this;
    }

    public CircleOptions a(boolean z) {
        this.h = z;
        return this;
    }

    public CircleOptions b(float f) {
        this.g = f;
        return this;
    }

    public CircleOptions b(int i) {
        this.f = i;
        return this;
    }

    public CircleOptions b(boolean z) {
        this.i = z;
        return this;
    }

    public LatLng b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public float g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public boolean i() {
        return this.i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
