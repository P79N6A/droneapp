package com.fimi.soul.biz.c;

import com.fimi.soul.entity.FlyActionBean;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.c;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.i;
import java.util.ArrayList;
import java.util.List;

public class d {
    private int a = 5;
    private int b = 1;
    private int c = 4;
    private c d;
    private volatile List<LatLng> e = new ArrayList();
    private volatile List<LatLng> f = new ArrayList();
    private i g;
    private volatile FlyActionBean h;
    private volatile int i = 30;
    private g j;
    private boolean k;
    private List<g> l = new ArrayList();
    private volatile List<FlyActionBean> m = new ArrayList();

    static class a {
        static final d a = new d();

        a() {
        }
    }

    public static d k() {
        return a.a;
    }

    public c a() {
        return this.d;
    }

    public void a(int i) {
        if (i < this.a) {
            i = this.a;
        }
        this.i = i;
    }

    public void a(FlyActionBean flyActionBean) {
        this.h = flyActionBean;
    }

    public void a(c cVar) {
        this.d = cVar;
    }

    public void a(g gVar) {
        this.j = gVar;
    }

    public void a(i iVar) {
        this.g = iVar;
    }

    public void a(List<FlyActionBean> list) {
        this.m = list;
    }

    public void a(boolean z) {
        this.k = z;
    }

    public List<LatLng> b() {
        return this.e;
    }

    public void b(int i) {
        if (i < this.c) {
            i = this.c;
        }
        this.b = i;
    }

    public g c() {
        return this.j;
    }

    public boolean d() {
        return this.k;
    }

    public List<g> e() {
        return this.l;
    }

    public List<FlyActionBean> f() {
        return this.m;
    }

    public int g() {
        return this.i;
    }

    public List<LatLng> h() {
        return this.f;
    }

    public i i() {
        return this.g;
    }

    public FlyActionBean j() {
        return this.h;
    }

    public int l() {
        return this.b;
    }

    public void m() {
        if (this.l != null) {
            for (g a : this.l) {
                a.a();
            }
            this.l.clear();
        }
        if (this.g != null) {
            this.g.a();
            this.g = null;
        }
        this.f.clear();
        this.m.clear();
        this.e.clear();
    }
}
