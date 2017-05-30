package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.c;
import com.google.android.gms.location.places.e;
import com.google.android.gms.location.places.l;
import com.google.android.gms.location.places.s;
import com.google.android.gms.location.places.s.b;
import com.google.android.gms.location.places.y;
import com.google.android.gms.location.places.y.a;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;

public class d implements c {
    public i<e> a(g gVar, final AddPlaceRequest addPlaceRequest) {
        return gVar.b(new y.c<e>(this, l.c, gVar) {
            final /* synthetic */ d b;

            protected void a(e eVar) {
                eVar.a(new y((y.c) this), addPlaceRequest);
            }
        });
    }

    public i<PlacePhotoMetadataResult> a(g gVar, final String str) {
        return gVar.a(new b<e>(this, l.c, gVar) {
            final /* synthetic */ d b;

            protected void a(e eVar) {
                eVar.a(new s((b) this), str);
            }
        });
    }

    public i<com.google.android.gms.location.places.b> a(g gVar, String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter) {
        final String str2 = str;
        final LatLngBounds latLngBounds2 = latLngBounds;
        final AutocompleteFilter autocompleteFilter2 = autocompleteFilter;
        return gVar.a(new a<e>(this, l.c, gVar) {
            final /* synthetic */ d d;

            protected void a(e eVar) {
                eVar.a(new y((a) this), str2, latLngBounds2, autocompleteFilter2);
            }
        });
    }

    public i<e> a(g gVar, final String... strArr) {
        boolean z = true;
        if (strArr == null || strArr.length < 1) {
            z = false;
        }
        com.google.android.gms.common.internal.d.b(z);
        return gVar.a(new y.c<e>(this, l.c, gVar) {
            final /* synthetic */ d b;

            protected void a(e eVar) {
                eVar.a(new y((y.c) this), Arrays.asList(strArr));
            }
        });
    }
}
