package com.fimi.soul.module.droneFragment;

import android.annotation.TargetApi;
import com.fimi.overseas.soul.R;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.a;
import com.google.android.gms.maps.model.b;
import java.util.HashMap;

@TargetApi(19)
public class g {
    private static g d;
    com.google.android.gms.maps.model.g a;
    private c b;
    private HashMap<String, com.google.android.gms.maps.model.g> c = new HashMap();
    private com.google.android.gms.maps.model.g e;
    private LatLng f;
    private a g;
    private a h;

    private g() {
    }

    public static g a() {
        if (d == null) {
            d = new g();
        }
        return d;
    }

    private MarkerOptions d(String str) {
        return new MarkerOptions().a(this.f).a(c(str));
    }

    public void a(c cVar, LatLng latLng) {
        this.b = cVar;
        this.f = latLng;
    }

    public void a(String str) {
        if (this.c.containsKey(str)) {
            ((com.google.android.gms.maps.model.g) this.c.get(str)).a(this.f);
            return;
        }
        this.a = this.b.a(d(str));
        this.a.a(str);
        if (com.fimi.soul.drone.g.c.Y.equals(str)) {
            this.a.a(0.15f, 1.0f);
            this.a.a(80.0f);
        } else {
            this.a.a(0.5f, 0.5f);
            this.a.a(100.0f);
        }
        this.c.put(str, this.a);
    }

    public void b() {
        for (Object obj : this.c.keySet()) {
            ((com.google.android.gms.maps.model.g) this.c.get(obj)).a();
        }
        this.c.clear();
    }

    public void b(String str) {
        if (this.c.containsKey(str)) {
            this.e = (com.google.android.gms.maps.model.g) this.c.get(str);
            this.c.remove(str);
            this.e.a();
        }
    }

    protected a c(String str) {
        if (com.fimi.soul.drone.g.c.X.equals(str)) {
            if (this.h == null) {
                this.h = b.a(R.drawable.fuselage);
            }
            return this.h;
        }
        if (this.g == null) {
            this.g = b.a(R.drawable.home_point);
        }
        return this.g;
    }
}
