package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.PlacePhotoResult;
import com.google.android.gms.location.places.i;

public class q extends t implements i {
    private final String c = e("photo_fife_url");

    public q(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public com.google.android.gms.common.api.i<PlacePhotoResult> a(g gVar) {
        return a(gVar, c(), d());
    }

    public com.google.android.gms.common.api.i<PlacePhotoResult> a(g gVar, int i, int i2) {
        return ((i) a()).a(gVar, i, i2);
    }

    public /* synthetic */ Object a() {
        return f();
    }

    public int c() {
        return a("photo_max_width", 0);
    }

    public int d() {
        return a("photo_max_height", 0);
    }

    public CharSequence e() {
        return a("photo_attributions", null);
    }

    public i f() {
        return new p(this.c, c(), d(), e(), this.d_);
    }
}
