package com.fimi.soul.module.droneTrack.a;

import com.fimi.soul.drone.h.c;
import com.fimi.soul.drone.h.e;
import com.google.android.gms.maps.model.LatLng;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class b {
    public static b a;
    e b = new e();
    c c = new c();
    private volatile LinkedHashMap<Integer, List<Object>> d = new LinkedHashMap();
    private volatile List<LatLng> e = new LinkedList();
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private double[] j = new double[]{3.15d, 3.47d, 3.64d, 3.79d, 4.1d};
    private double[] k = new double[]{3.43d, 3.73d, 3.88d, 4.02d, 4.16d};

    public static b a() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                }
            }
        }
        return a;
    }

    private void a(boolean... zArr) {
        for (boolean z : zArr) {
        }
    }

    public void a(c cVar) {
        this.c = cVar;
    }

    public void a(e eVar) {
        this.b = eVar;
    }

    public void a(List<LatLng> list) {
        this.e = list;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public void a(double[] dArr) {
        this.k = dArr;
    }

    public LinkedHashMap<Integer, List<Object>> b() {
        return this.d;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public void b(double[] dArr) {
        this.j = dArr;
    }

    public List<LatLng> c() {
        return this.e;
    }

    public void c(boolean z) {
        this.g = z;
    }

    public void d() {
        this.d.clear();
        this.e.clear();
        a(this.f, this.g, this.h, this.i);
    }

    public void d(boolean z) {
        this.f = z;
    }

    public boolean e() {
        return this.i;
    }

    public boolean f() {
        return this.h;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.f;
    }

    public double[] i() {
        return this.k;
    }

    public double[] j() {
        return this.j;
    }

    public c k() {
        return this.c;
    }

    public e l() {
        return this.b;
    }
}
