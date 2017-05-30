package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.v4.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.tencent.open.yyb.TitleBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PolygonOptions extends AbstractSafeParcelable {
    public static final v CREATOR = new v();
    private final int a;
    private final List<LatLng> b;
    private final List<List<LatLng>> c;
    private float d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;

    public PolygonOptions() {
        this.d = TitleBar.SHAREBTN_RIGHT_MARGIN;
        this.e = ViewCompat.MEASURED_STATE_MASK;
        this.f = 0;
        this.g = 0.0f;
        this.h = true;
        this.i = false;
        this.j = false;
        this.a = 1;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    PolygonOptions(int i, List<LatLng> list, List list2, float f, int i2, int i3, float f2, boolean z, boolean z2, boolean z3) {
        this.d = TitleBar.SHAREBTN_RIGHT_MARGIN;
        this.e = ViewCompat.MEASURED_STATE_MASK;
        this.f = 0;
        this.g = 0.0f;
        this.h = true;
        this.i = false;
        this.j = false;
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = f;
        this.e = i2;
        this.f = i3;
        this.g = f2;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    int a() {
        return this.a;
    }

    public PolygonOptions a(float f) {
        this.d = f;
        return this;
    }

    public PolygonOptions a(int i) {
        this.e = i;
        return this;
    }

    public PolygonOptions a(LatLng latLng) {
        this.b.add(latLng);
        return this;
    }

    public PolygonOptions a(Iterable<LatLng> iterable) {
        for (LatLng add : iterable) {
            this.b.add(add);
        }
        return this;
    }

    public PolygonOptions a(boolean z) {
        this.h = z;
        return this;
    }

    public PolygonOptions a(LatLng... latLngArr) {
        this.b.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolygonOptions b(float f) {
        this.g = f;
        return this;
    }

    public PolygonOptions b(int i) {
        this.f = i;
        return this;
    }

    public PolygonOptions b(Iterable<LatLng> iterable) {
        ArrayList arrayList = new ArrayList();
        for (LatLng add : iterable) {
            arrayList.add(add);
        }
        this.c.add(arrayList);
        return this;
    }

    public PolygonOptions b(boolean z) {
        this.i = z;
        return this;
    }

    List b() {
        return this.c;
    }

    public PolygonOptions c(boolean z) {
        this.j = z;
        return this;
    }

    public List<LatLng> c() {
        return this.b;
    }

    public List<List<LatLng>> d() {
        return this.c;
    }

    public float e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public float h() {
        return this.g;
    }

    public boolean i() {
        return this.h;
    }

    public boolean j() {
        return this.i;
    }

    public boolean k() {
        return this.j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        v.a(this, parcel, i);
    }
}
