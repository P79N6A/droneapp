package com.fimi.soul.module.droneTrack.a;

import com.fimi.soul.drone.h.a.b;
import com.fimi.soul.drone.h.a.e;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.ao;
import com.fimi.soul.drone.h.c;
import com.fimi.soul.drone.h.d;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.drone.h.y;
import com.fimi.soul.drone.h.z;

public class a {
    y a = new y();
    ag b = new ag();
    z c = new z();
    d d = new d();
    b e = new b();
    e f = new e();
    ao g = new ao();
    com.fimi.soul.drone.h.e h = new com.fimi.soul.drone.h.e();
    ad i = new ad();
    c j;
    boolean k;
    q l = new q();

    public e a() {
        return this.f;
    }

    public void a(b bVar) {
        this.e = bVar;
    }

    public void a(e eVar) {
        this.f = eVar;
    }

    public void a(ad adVar) {
        this.i = adVar;
    }

    public void a(ag agVar) {
        this.b = agVar;
    }

    public void a(ao aoVar) {
        this.g = aoVar;
    }

    public void a(c cVar) {
        this.j = cVar;
    }

    public void a(d dVar) {
        this.d = dVar;
    }

    public void a(com.fimi.soul.drone.h.e eVar) {
        this.h = eVar;
    }

    public void a(q qVar) {
        this.l = qVar;
    }

    public void a(y yVar) {
        this.a = yVar;
        if (((yVar.g() & 240) >> 4) == 1) {
            a(true);
        } else {
            a(false);
        }
    }

    public void a(z zVar) {
        this.c = zVar;
    }

    public void a(boolean z) {
        this.k = z;
    }

    public q b() {
        return this.l;
    }

    public b c() {
        return this.e;
    }

    public d d() {
        return this.d;
    }

    public z e() {
        return this.c;
    }

    public ag f() {
        return this.b;
    }

    public y g() {
        return this.a;
    }

    public ao h() {
        return this.g;
    }

    public com.fimi.soul.drone.h.e i() {
        return this.h;
    }

    public boolean j() {
        return this.k;
    }

    public ad k() {
        return this.i;
    }

    public c l() {
        return this.j;
    }

    public boolean m() {
        return this.g != null && com.fimi.soul.utils.ao.a(this.g.e(), Math.abs(0)) > 0;
    }

    public boolean n() {
        return this.g != null ? com.fimi.soul.utils.ao.a(this.g.e(), Math.abs(1)) > 0 : false;
    }
}
