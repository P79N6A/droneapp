package com.google.android.gms.location.places.ui;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.location.places.d;
import com.google.android.gms.maps.model.LatLngBounds;

public class b extends d {
    public static final int a = 2;

    private b() {
    }

    public static d a(Context context, Intent intent) {
        return d.c(context, intent);
    }

    @Deprecated
    public static d a(Intent intent, Context context) {
        return d.c(context, intent);
    }

    @Deprecated
    public static String a(Intent intent) {
        return intent.getStringExtra("third_party_attributions");
    }

    public static LatLngBounds b(Intent intent) {
        return (LatLngBounds) c.a(intent, "final_latlng_bounds", LatLngBounds.CREATOR);
    }
}
