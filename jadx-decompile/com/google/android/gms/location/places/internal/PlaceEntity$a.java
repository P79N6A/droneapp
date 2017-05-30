package com.google.android.gms.location.places.internal;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;

public class PlaceEntity$a {
    private int a = 0;
    private String b;
    private String c;
    private LatLng d;
    private float e;
    private LatLngBounds f;
    private Uri g;
    private boolean h;
    private float i;
    private int j;
    private long k;
    private List<Integer> l;
    private String m;
    private String n;
    private List<String> o;

    public PlaceEntity$a a(float f) {
        this.e = f;
        return this;
    }

    public PlaceEntity$a a(int i) {
        this.j = i;
        return this;
    }

    public PlaceEntity$a a(long j) {
        this.k = j;
        return this;
    }

    public PlaceEntity$a a(Uri uri) {
        this.g = uri;
        return this;
    }

    public PlaceEntity$a a(LatLng latLng) {
        this.d = latLng;
        return this;
    }

    public PlaceEntity$a a(LatLngBounds latLngBounds) {
        this.f = latLngBounds;
        return this;
    }

    public PlaceEntity$a a(String str) {
        this.b = str;
        return this;
    }

    public PlaceEntity$a a(List<Integer> list) {
        this.l = list;
        return this;
    }

    public PlaceEntity$a a(boolean z) {
        this.h = z;
        return this;
    }

    public PlaceEntity a() {
        return new PlaceEntity(0, this.b, this.l, Collections.emptyList(), null, this.c, this.m, this.n, null, this.o, this.d, this.e, this.f, null, this.g, this.h, this.i, this.j, this.k, PlaceLocalization.a(this.c, this.m, this.n, null, this.o));
    }

    public PlaceEntity$a b(float f) {
        this.i = f;
        return this;
    }

    public PlaceEntity$a b(String str) {
        this.c = str;
        return this;
    }

    public PlaceEntity$a b(List<String> list) {
        this.o = list;
        return this;
    }

    public PlaceEntity$a c(String str) {
        this.m = str;
        return this;
    }

    public PlaceEntity$a d(String str) {
        this.n = str;
        return this;
    }
}
