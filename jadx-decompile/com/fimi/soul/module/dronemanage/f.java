package com.fimi.soul.module.dronemanage;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.fimi.soul.drone.a;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import java.lang.ref.WeakReference;

public class f {
    private Context a = ((Context) this.c.get());
    private d b;
    private WeakReference<Context> c;
    private WeakReference<a> d;

    public f(a aVar, FragmentActivity fragmentActivity, FlightMapFragment flightMapFragment) {
        this.c = new WeakReference(fragmentActivity);
        this.d = new WeakReference(aVar);
        a(this.a, aVar.aa(), (a) this.d.get(), flightMapFragment);
    }

    private void a(Context context, c cVar, a aVar, FlightMapFragment flightMapFragment) {
        this.b = new d(cVar, context, aVar);
    }

    public d a() {
        return this.b;
    }

    public void a(int i) {
        a().a();
        a().d();
    }

    public void a(int i, LatLng latLng) {
        switch (i.a()) {
        }
    }

    public void b() {
        this.b.c();
    }
}
