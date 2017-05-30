package com.google.android.gms.location.places.ui;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.LatLngBounds;

public class b$a extends a {
    public b$a() {
        super("com.google.android.gms.location.places.ui.PICK_PLACE");
        this.a.putExtra("gmscore_client_jar_version", b.a);
    }

    public Intent a(Activity activity) {
        return super.a(activity);
    }

    public b$a a(LatLngBounds latLngBounds) {
        d.a(latLngBounds);
        c.a(latLngBounds, this.a, "latlng_bounds");
        return this;
    }
}
