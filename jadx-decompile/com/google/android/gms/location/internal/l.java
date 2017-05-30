package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.k;
import com.google.android.gms.location.p;
import java.util.List;

public class l extends b {
    private final k e;

    private static final class a extends com.google.android.gms.location.internal.h.a {
        private com.google.android.gms.internal.ahl.b<Status> a;

        public a(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = bVar;
        }

        public void a(int i, PendingIntent pendingIntent) {
            Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
        }

        public void a(int i, String[] strArr) {
            if (this.a == null) {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            }
            this.a.a(p.b(p.a(i)));
            this.a = null;
        }

        public void b(int i, String[] strArr) {
            Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
        }
    }

    private static final class b extends com.google.android.gms.location.internal.h.a {
        private com.google.android.gms.internal.ahl.b<Status> a;

        public b(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = bVar;
        }

        private void a(int i) {
            if (this.a == null) {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
                return;
            }
            this.a.a(p.b(p.a(i)));
            this.a = null;
        }

        public void a(int i, PendingIntent pendingIntent) {
            a(i);
        }

        public void a(int i, String[] strArr) {
            Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
        }

        public void b(int i, String[] strArr) {
            a(i);
        }
    }

    private static final class c extends com.google.android.gms.location.internal.j.a {
        private com.google.android.gms.internal.ahl.b<LocationSettingsResult> a;

        public c(com.google.android.gms.internal.ahl.b<LocationSettingsResult> bVar) {
            d.b(bVar != null, "listener can't be null.");
            this.a = bVar;
        }

        public void a(LocationSettingsResult locationSettingsResult) {
            this.a.a(locationSettingsResult);
            this.a = null;
        }
    }

    public l(Context context, Looper looper, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar, String str) {
        this(context, looper, bVar, cVar, str, s.a(context));
    }

    public l(Context context, Looper looper, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar, String str, s sVar) {
        super(context, looper, bVar, cVar, str, sVar);
        this.e = new k(context, this.a);
    }

    public void a(long j, PendingIntent pendingIntent) {
        F();
        d.a(pendingIntent);
        d.b(j >= 0, "detectionIntervalMillis must be >= 0");
        ((i) G()).a(j, true, pendingIntent);
    }

    public void a(PendingIntent pendingIntent) {
        F();
        d.a(pendingIntent);
        ((i) G()).a(pendingIntent);
    }

    public void a(PendingIntent pendingIntent, com.google.android.gms.internal.ahl.b<Status> bVar) {
        F();
        d.a(pendingIntent, "PendingIntent must be specified.");
        d.a(bVar, "ResultHolder not provided.");
        ((i) G()).a(pendingIntent, new b(bVar), B().getPackageName());
    }

    public void a(PendingIntent pendingIntent, g gVar) {
        this.e.a(pendingIntent, gVar);
    }

    public void a(Location location) {
        this.e.a(location);
    }

    public void a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, com.google.android.gms.internal.ahl.b<Status> bVar) {
        F();
        d.a(geofencingRequest, "geofencingRequest can't be null.");
        d.a(pendingIntent, "PendingIntent must be specified.");
        d.a(bVar, "ResultHolder not provided.");
        ((i) G()).a(geofencingRequest, pendingIntent, new a(bVar));
    }

    public void a(LocationRequest locationRequest, PendingIntent pendingIntent, g gVar) {
        this.e.a(locationRequest, pendingIntent, gVar);
    }

    public void a(LocationRequest locationRequest, com.google.android.gms.location.l lVar, Looper looper, g gVar) {
        synchronized (this.e) {
            this.e.a(locationRequest, lVar, looper, gVar);
        }
    }

    public void a(LocationSettingsRequest locationSettingsRequest, com.google.android.gms.internal.ahl.b<LocationSettingsResult> bVar, String str) {
        boolean z = true;
        F();
        d.b(locationSettingsRequest != null, "locationSettingsRequest can't be null nor empty.");
        if (bVar == null) {
            z = false;
        }
        d.b(z, "listener can't be null.");
        ((i) G()).a(locationSettingsRequest, new c(bVar), str);
    }

    public void a(LocationRequestInternal locationRequestInternal, k kVar, Looper looper, g gVar) {
        synchronized (this.e) {
            this.e.a(locationRequestInternal, kVar, looper, gVar);
        }
    }

    public void a(g gVar) {
        this.e.a(gVar);
    }

    public void a(k kVar, g gVar) {
        this.e.a(kVar, gVar);
    }

    public void a(com.google.android.gms.location.l lVar, g gVar) {
        this.e.a(lVar, gVar);
    }

    public void a(List<String> list, com.google.android.gms.internal.ahl.b<Status> bVar) {
        F();
        boolean z = list != null && list.size() > 0;
        d.b(z, "geofenceRequestIds can't be null nor empty.");
        d.a(bVar, "ResultHolder not provided.");
        ((i) G()).a((String[]) list.toArray(new String[0]), new b(bVar), B().getPackageName());
    }

    public void a(boolean z) {
        this.e.a(z);
    }

    public void f() {
        synchronized (this.e) {
            if (t()) {
                try {
                    this.e.c();
                    this.e.d();
                } catch (Throwable e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.f();
        }
    }

    public Location h() {
        return this.e.a();
    }

    public LocationAvailability i() {
        return this.e.b();
    }
}
