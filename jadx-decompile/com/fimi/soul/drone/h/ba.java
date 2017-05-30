package com.fimi.soul.drone.h;

import com.google.android.gms.maps.model.LatLng;
import java.io.Serializable;

public class ba implements Serializable {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 1;
    public static final int e = 0;
    public static final int f = 0;
    public static final int g = 1;
    private static final long serialVersionUID = -7608904935347290492L;
    private LatLng h;
    private int i = 10;
    private int j = 0;
    private int k = 0;
    private int l;
    private int m = 1;
    private boolean n;

    public void a(int i) {
        this.i = i;
    }

    public void a(LatLng latLng) {
        this.h = latLng;
    }

    public void a(boolean z) {
        this.n = z;
    }

    public boolean a() {
        return this.n;
    }

    public LatLng b() {
        return this.h;
    }

    public void b(int i) {
        this.j = i;
    }

    public int c() {
        return this.i;
    }

    public void c(int i) {
        this.k = i;
    }

    public int d() {
        return this.j;
    }

    public void d(int i) {
        this.l = i;
    }

    public int e() {
        return this.k;
    }

    public void e(int i) {
        this.m = i;
    }

    public int f() {
        return this.l;
    }

    public int g() {
        return this.m;
    }
}
