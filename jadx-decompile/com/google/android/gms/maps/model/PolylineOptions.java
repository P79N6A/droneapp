package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.v4.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.tencent.open.yyb.TitleBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PolylineOptions extends AbstractSafeParcelable {
    public static final w CREATOR = new w();
    private final int a;
    private final List<LatLng> b;
    private float c;
    private int d;
    private float e;
    private boolean f;
    private boolean g;
    private boolean h;

    public PolylineOptions() {
        this.c = TitleBar.SHAREBTN_RIGHT_MARGIN;
        this.d = ViewCompat.MEASURED_STATE_MASK;
        this.e = 0.0f;
        this.f = true;
        this.g = false;
        this.h = false;
        this.a = 1;
        this.b = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int i2, float f2, boolean z, boolean z2, boolean z3) {
        this.c = TitleBar.SHAREBTN_RIGHT_MARGIN;
        this.d = ViewCompat.MEASURED_STATE_MASK;
        this.e = 0.0f;
        this.f = true;
        this.g = false;
        this.h = false;
        this.a = i;
        this.b = list;
        this.c = f;
        this.d = i2;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    int a() {
        return this.a;
    }

    public PolylineOptions a(float f) {
        this.c = f;
        return this;
    }

    public PolylineOptions a(int i) {
        this.d = i;
        return this;
    }

    public PolylineOptions a(LatLng latLng) {
        this.b.add(latLng);
        return this;
    }

    public PolylineOptions a(Iterable<LatLng> iterable) {
        for (LatLng add : iterable) {
            this.b.add(add);
        }
        return this;
    }

    public PolylineOptions a(boolean z) {
        this.f = z;
        return this;
    }

    public PolylineOptions a(LatLng... latLngArr) {
        this.b.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolylineOptions b(float f) {
        this.e = f;
        return this;
    }

    public PolylineOptions b(boolean z) {
        this.g = z;
        return this;
    }

    public List<LatLng> b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }

    public PolylineOptions c(boolean z) {
        this.h = z;
        return this;
    }

    public int d() {
        return this.d;
    }

    public float e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        w.a(this, parcel, i);
    }
}
