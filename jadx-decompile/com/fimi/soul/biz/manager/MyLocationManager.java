package com.fimi.soul.biz.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.fimi.soul.receiver.NetworkStateReceiver;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.l;
import com.google.android.gms.location.n;
import java.util.ArrayList;
import java.util.List;

public class MyLocationManager extends NetworkStateReceiver implements b, c, l {
    private static MyLocationManager d;
    private Location e = null;
    private Location f;
    private LocationManager g;
    private List<a> h = new ArrayList();
    private g i;
    private int j = 1000;

    public interface a {
        void a(Location location);
    }

    @SuppressLint({"ServiceCast"})
    private MyLocationManager(Context context) {
        this.g = (LocationManager) context.getSystemService(com.google.firebase.a.a.b.p);
        this.i = new com.google.android.gms.common.api.g.a(context.getApplicationContext()).a((b) this).a((c) this).a(n.a).c();
    }

    public static MyLocationManager a(Context context) {
        if (d == null) {
            d = new MyLocationManager(context);
        }
        return d;
    }

    private void d() {
        if (this.i != null && !this.i.j()) {
            this.i.e();
        }
    }

    public double a() {
        return this.f != null ? this.f.getLatitude() : -1.0d;
    }

    public void a(int i) {
    }

    public void a(Location location) {
        this.f = location;
        this.e = location;
    }

    public void a(@Nullable Bundle bundle) {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.a((long) this.j);
        locationRequest.c((long) this.j);
        locationRequest.a(100);
        n.b.a(this.i, locationRequest, (l) this);
    }

    public void a(a aVar) {
        if (!this.h.contains(aVar)) {
            this.h.add(aVar);
        }
        d();
    }

    public void a(com.fimi.soul.receiver.NetworkStateReceiver.a aVar, Context context) {
        if (aVar != null && aVar != com.fimi.soul.receiver.NetworkStateReceiver.a.None) {
            d();
        }
    }

    public void a(@NonNull ConnectionResult connectionResult) {
    }

    public double b() {
        return this.f != null ? this.f.getLongitude() : -1.0d;
    }

    public void b(Location location) {
        if (com.fimi.soul.biz.n.a.a().b()) {
            location.setLatitude(location.getLatitude());
            location.setLongitude(location.getLongitude());
        } else {
            af a = z.a(location.getLatitude(), location.getLongitude());
            location.setLatitude(a.a());
            location.setLongitude(a.b());
        }
        a(location);
        for (a aVar : this.h) {
            if (aVar != null) {
                aVar.a(location);
            }
        }
    }

    public void b(a aVar) {
        if (this.h.contains(aVar)) {
            this.h.remove(aVar);
        }
    }

    public Location c() {
        return this.e == null ? null : this.e;
    }
}
