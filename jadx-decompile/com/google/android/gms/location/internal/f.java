package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GeofencingRequest.a;
import com.google.android.gms.location.h;
import java.util.List;

public class f implements h {
    public i<Status> a(g gVar, PendingIntent pendingIntent) {
        return gVar.b(new 2(this, gVar, pendingIntent));
    }

    public i<Status> a(g gVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return gVar.b(new 1(this, gVar, geofencingRequest, pendingIntent));
    }

    public i<Status> a(g gVar, List<String> list) {
        return gVar.b(new 3(this, gVar, list));
    }

    @Deprecated
    public i<Status> a(g gVar, List<com.google.android.gms.location.f> list, PendingIntent pendingIntent) {
        a aVar = new a();
        aVar.a(list);
        aVar.a(5);
        return a(gVar, aVar.a(), pendingIntent);
    }
}
