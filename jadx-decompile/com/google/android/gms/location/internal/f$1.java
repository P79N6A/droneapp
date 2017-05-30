package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.g;
import com.google.android.gms.internal.ahl.b;
import com.google.android.gms.location.GeofencingRequest;

class f$1 extends f$a {
    final /* synthetic */ GeofencingRequest a;
    final /* synthetic */ PendingIntent b;
    final /* synthetic */ f c;

    f$1(f fVar, g gVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.c = fVar;
        this.a = geofencingRequest;
        this.b = pendingIntent;
        super(gVar);
    }

    protected void a(l lVar) {
        lVar.a(this.a, this.b, (b) this);
    }
}
