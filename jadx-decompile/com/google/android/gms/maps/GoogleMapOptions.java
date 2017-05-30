package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.a.m;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final k CREATOR = new k();
    private final int a;
    private Boolean b;
    private Boolean c;
    private int d;
    private CameraPosition e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Float o;
    private Float p;
    private LatLngBounds q;

    public GoogleMapOptions() {
        this.d = -1;
        this.o = null;
        this.p = null;
        this.q = null;
        this.a = 1;
    }

    GoogleMapOptions(int i, byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds) {
        this.d = -1;
        this.o = null;
        this.p = null;
        this.q = null;
        this.a = i;
        this.b = m.a(b);
        this.c = m.a(b2);
        this.d = i2;
        this.e = cameraPosition;
        this.f = m.a(b3);
        this.g = m.a(b4);
        this.h = m.a(b5);
        this.i = m.a(b6);
        this.j = m.a(b7);
        this.k = m.a(b8);
        this.l = m.a(b9);
        this.m = m.a(b10);
        this.n = m.a(b11);
        this.o = f;
        this.p = f2;
        this.q = latLngBounds;
    }

    public static GoogleMapOptions a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_mapType)) {
            googleMapOptions.a(obtainAttributes.getInt(R.styleable.MapAttrs_mapType, -1));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_zOrderOnTop)) {
            googleMapOptions.a(obtainAttributes.getBoolean(R.styleable.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_useViewLifecycle)) {
            googleMapOptions.b(obtainAttributes.getBoolean(R.styleable.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiCompass)) {
            googleMapOptions.d(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiRotateGestures)) {
            googleMapOptions.h(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiScrollGestures)) {
            googleMapOptions.e(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiTiltGestures)) {
            googleMapOptions.g(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiZoomGestures)) {
            googleMapOptions.f(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiZoomControls)) {
            googleMapOptions.c(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_liteMode)) {
            googleMapOptions.i(obtainAttributes.getBoolean(R.styleable.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiMapToolbar)) {
            googleMapOptions.j(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_ambientEnabled)) {
            googleMapOptions.k(obtainAttributes.getBoolean(R.styleable.MapAttrs_ambientEnabled, false));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.a(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.b(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.a(LatLngBounds.a(context, attributeSet));
        googleMapOptions.a(CameraPosition.a(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public Float A() {
        return this.p;
    }

    public LatLngBounds B() {
        return this.q;
    }

    int a() {
        return this.a;
    }

    public GoogleMapOptions a(float f) {
        this.o = Float.valueOf(f);
        return this;
    }

    public GoogleMapOptions a(int i) {
        this.d = i;
        return this;
    }

    public GoogleMapOptions a(CameraPosition cameraPosition) {
        this.e = cameraPosition;
        return this;
    }

    public GoogleMapOptions a(LatLngBounds latLngBounds) {
        this.q = latLngBounds;
        return this;
    }

    public GoogleMapOptions a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    byte b() {
        return m.a(this.b);
    }

    public GoogleMapOptions b(float f) {
        this.p = Float.valueOf(f);
        return this;
    }

    public GoogleMapOptions b(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    byte c() {
        return m.a(this.c);
    }

    public GoogleMapOptions c(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    byte d() {
        return m.a(this.f);
    }

    public GoogleMapOptions d(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    byte e() {
        return m.a(this.g);
    }

    public GoogleMapOptions e(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }

    byte f() {
        return m.a(this.h);
    }

    public GoogleMapOptions f(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    byte g() {
        return m.a(this.i);
    }

    public GoogleMapOptions g(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    byte h() {
        return m.a(this.j);
    }

    public GoogleMapOptions h(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    byte i() {
        return m.a(this.k);
    }

    public GoogleMapOptions i(boolean z) {
        this.l = Boolean.valueOf(z);
        return this;
    }

    byte j() {
        return m.a(this.l);
    }

    public GoogleMapOptions j(boolean z) {
        this.m = Boolean.valueOf(z);
        return this;
    }

    byte k() {
        return m.a(this.m);
    }

    public GoogleMapOptions k(boolean z) {
        this.n = Boolean.valueOf(z);
        return this;
    }

    byte l() {
        return m.a(this.n);
    }

    public Boolean m() {
        return this.b;
    }

    public Boolean n() {
        return this.c;
    }

    public int o() {
        return this.d;
    }

    public CameraPosition p() {
        return this.e;
    }

    public Boolean q() {
        return this.f;
    }

    public Boolean r() {
        return this.g;
    }

    public Boolean s() {
        return this.h;
    }

    public Boolean t() {
        return this.i;
    }

    public Boolean u() {
        return this.j;
    }

    public Boolean v() {
        return this.k;
    }

    public Boolean w() {
        return this.l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }

    public Boolean x() {
        return this.m;
    }

    public Boolean y() {
        return this.n;
    }

    public Float z() {
        return this.o;
    }
}
