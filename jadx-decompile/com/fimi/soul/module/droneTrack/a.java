package com.fimi.soul.module.droneTrack;

import com.fimi.soul.drone.h.a.b;
import com.fimi.soul.drone.h.a.e;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.ao;
import com.fimi.soul.drone.h.at;
import com.fimi.soul.drone.h.d;
import com.fimi.soul.drone.h.x;
import com.fimi.soul.drone.h.y;
import com.fimi.soul.drone.h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class a {
    public static final int a = 2;
    public static final int b = 3;
    public static final int c = 4;
    public static final int d = 5;
    public static final int e = 7;
    public static final int f = 9;
    public static final int g = 10;
    public static final int h = 11;
    public static final int i = 64;
    public static final int j = 63;
    public LinkedHashMap<Long, d> k = new LinkedHashMap();
    public LinkedHashMap<Long, b> l = new LinkedHashMap();
    public LinkedHashMap<Long, x> m = new LinkedHashMap();
    public LinkedHashMap<Long, y> n = new LinkedHashMap();
    public LinkedHashMap<Long, z> o = new LinkedHashMap();
    public LinkedHashMap<Long, ag> p = new LinkedHashMap();
    public LinkedHashMap<Long, ao> q = new LinkedHashMap();
    public LinkedHashMap<Long, b> r = new LinkedHashMap();
    public LinkedHashMap<Long, at> s = new LinkedHashMap();
    public LinkedHashMap<Long, e> t = new LinkedHashMap();
    private List<String> u = new ArrayList();
    private long v = 0;
    private float w;
    private List<Integer> x = new ArrayList();

    static class a {
        public static a a = new a();

        a() {
        }
    }

    public static a a() {
        return a.a;
    }

    public HashMap a(int i) {
        switch (i) {
            case 2:
                return this.n;
            case 3:
                return this.p;
            case 4:
                return this.o;
            case 5:
                return this.k;
            case 7:
                return this.l;
            case 9:
                return this.r;
            case 10:
                return this.m;
            case 11:
                return this.t;
            case 63:
                return this.q;
            case 64:
                return this.s;
            default:
                return null;
        }
    }

    public void a(float f) {
        this.w = f;
    }

    public void a(long j) {
        this.v = j;
    }

    public List<String> b() {
        return this.u;
    }

    public List<Integer> c() {
        return this.x;
    }

    public long d() {
        return this.v;
    }

    public float e() {
        return this.w;
    }

    public void f() {
        this.k.clear();
        this.l.clear();
        this.m.clear();
        this.n.clear();
        this.o.clear();
        this.p.clear();
        this.q.clear();
        this.s.clear();
        this.r.clear();
        this.t.clear();
        this.u.clear();
        this.x.clear();
    }
}
