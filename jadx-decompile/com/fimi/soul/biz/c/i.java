package com.fimi.soul.biz.c;

import android.content.Context;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.List;

public class i {
    public static MarkerOptions a(LatLng latLng, int i) {
        return new MarkerOptions().a(latLng).a(j.a(i)).a(true);
    }

    public static MarkerOptions a(LatLng latLng, Context context, int i, boolean z, int i2) {
        return new MarkerOptions().a(latLng).a(j.a(context, i2, i, z)).a(true);
    }

    public static PolylineOptions a(List<LatLng> list, int i, int i2) {
        return new PolylineOptions().a(list).a(i2).a((float) i);
    }
}
