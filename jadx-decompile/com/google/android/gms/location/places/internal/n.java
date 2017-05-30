package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.d;
import com.google.android.gms.location.places.g;

public class n extends t implements g {
    public n(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return e();
    }

    public float c() {
        return a("place_likelihood", -1.0f);
    }

    public d d() {
        return new r(this.c_, this.d_);
    }

    public g e() {
        return PlaceLikelihoodEntity.a((PlaceEntity) d().a(), c());
    }
}
