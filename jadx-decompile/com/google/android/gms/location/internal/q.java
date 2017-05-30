package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.ahl.b;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.n.a;

public class q implements com.google.android.gms.location.q {
    public i<LocationSettingsResult> a(g gVar, LocationSettingsRequest locationSettingsRequest) {
        return a(gVar, locationSettingsRequest, null);
    }

    public i<LocationSettingsResult> a(g gVar, final LocationSettingsRequest locationSettingsRequest, final String str) {
        return gVar.a(new a<LocationSettingsResult>(this, gVar) {
            final /* synthetic */ q c;

            public LocationSettingsResult a(Status status) {
                return new LocationSettingsResult(status);
            }

            protected void a(l lVar) {
                lVar.a(locationSettingsRequest, (b) this, str);
            }

            public /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }
}
