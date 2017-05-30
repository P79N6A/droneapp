package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.a.m;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final l CREATOR = new l();
    private final int a;
    private StreetViewPanoramaCamera b;
    private String c;
    private LatLng d;
    private Integer e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;

    public StreetViewPanoramaOptions() {
        this.f = Boolean.valueOf(true);
        this.g = Boolean.valueOf(true);
        this.h = Boolean.valueOf(true);
        this.i = Boolean.valueOf(true);
        this.a = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5) {
        this.f = Boolean.valueOf(true);
        this.g = Boolean.valueOf(true);
        this.h = Boolean.valueOf(true);
        this.i = Boolean.valueOf(true);
        this.a = i;
        this.b = streetViewPanoramaCamera;
        this.d = latLng;
        this.e = num;
        this.c = str;
        this.f = m.a(b);
        this.g = m.a(b2);
        this.h = m.a(b3);
        this.i = m.a(b4);
        this.j = m.a(b5);
    }

    int a() {
        return this.a;
    }

    public StreetViewPanoramaOptions a(LatLng latLng) {
        this.d = latLng;
        return this;
    }

    public StreetViewPanoramaOptions a(LatLng latLng, Integer num) {
        this.d = latLng;
        this.e = num;
        return this;
    }

    public StreetViewPanoramaOptions a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.b = streetViewPanoramaCamera;
        return this;
    }

    public StreetViewPanoramaOptions a(String str) {
        this.c = str;
        return this;
    }

    public StreetViewPanoramaOptions a(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    byte b() {
        return m.a(this.f);
    }

    public StreetViewPanoramaOptions b(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    byte c() {
        return m.a(this.g);
    }

    public StreetViewPanoramaOptions c(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }

    byte d() {
        return m.a(this.h);
    }

    public StreetViewPanoramaOptions d(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    byte e() {
        return m.a(this.i);
    }

    public StreetViewPanoramaOptions e(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    byte f() {
        return m.a(this.j);
    }

    public StreetViewPanoramaCamera g() {
        return this.b;
    }

    public LatLng h() {
        return this.d;
    }

    public Integer i() {
        return this.e;
    }

    public String j() {
        return this.c;
    }

    public Boolean k() {
        return this.f;
    }

    public Boolean l() {
        return this.g;
    }

    public Boolean m() {
        return this.h;
    }

    public Boolean n() {
        return this.i;
    }

    public Boolean o() {
        return this.j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
