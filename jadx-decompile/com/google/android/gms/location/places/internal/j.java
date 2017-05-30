package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.f;
import com.google.android.gms.location.places.h;
import com.google.android.gms.location.places.l;
import com.google.android.gms.location.places.y;
import com.google.android.gms.location.places.y.d;

public class j implements f {
    public i<h> a(g gVar, final PlaceFilter placeFilter) {
        return gVar.a(new d<k>(this, l.d, gVar) {
            final /* synthetic */ j b;

            protected void a(k kVar) {
                kVar.a(new y((d) this), placeFilter);
            }
        });
    }

    public i<Status> a(g gVar, final PlaceReport placeReport) {
        return gVar.b(new y.f<k>(this, l.d, gVar) {
            final /* synthetic */ j b;

            protected void a(k kVar) {
                kVar.a(new y((y.f) this), placeReport);
            }
        });
    }
}
