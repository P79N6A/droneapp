package com.fimi.soul.module.b;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.c.a.a.ak;
import com.fimi.soul.drone.c.a.a.an;
import com.fimi.soul.drone.c.a.a.ao;
import com.fimi.soul.drone.c.a.a.bc;
import com.fimi.soul.drone.c.a.a.bf;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.module.droneui.DroneMap;

public class d {
    private static d a = null;
    private static a b;
    private com.fimi.soul.module.calibcompass.a c = com.fimi.soul.module.calibcompass.a.a();
    private b d = b.a();

    private d() {
    }

    public static d a(a aVar) {
        b = aVar;
        if (a == null) {
            a = new d();
        }
        return a;
    }

    private void a(c cVar) {
        a a = a.a(this.d);
        this.c.a(cVar.c + "", a);
        a.a(b, cVar);
        a.a();
        com.fimi.soul.drone.g.c.a(com.fimi.soul.drone.g.c.a.PHONESEND);
    }

    public void a() {
        if (!b.ac()) {
            bc bcVar = new bc();
            bcVar.d = (short) 1;
            b.T().a(bcVar.a());
            a(bcVar.a());
        }
    }

    public void a(byte b) {
        c cVar = new c();
        cVar.c = 153;
        cVar.b = 2;
        cVar.d.b((byte) 1);
        cVar.d.b(b);
        b.T().a(cVar);
        a(cVar);
    }

    public void a(byte b, byte b2, byte b3) {
        c cVar = new c();
        cVar.c = 153;
        cVar.b = 3;
        cVar.d.b(b);
        cVar.d.b(b2);
        cVar.d.b(b3);
        b.T().a(cVar);
        a(cVar);
    }

    public void a(byte b, byte b2, short s, short s2, byte b3, short s3, float f, float f2) {
        c cVar = new c();
        cVar.c = 134;
        cVar.b = 19;
        cVar.d.b((byte) 1);
        cVar.d.b(b);
        cVar.d.b(b2);
        cVar.d.a(s);
        cVar.d.a(s2);
        cVar.d.b(b3);
        cVar.d.a(s3);
        cVar.d.a(f);
        cVar.d.a(f2);
        cVar.d.b((byte) 0);
        b.T().a(cVar);
        a(cVar);
    }

    public void a(double d, double d2) {
        c cVar = new c();
        cVar.c = 128;
        cVar.b = 14;
        cVar.d.b((byte) 1);
        cVar.d.b((byte) 0);
        cVar.d.a((float) d);
        cVar.d.a((float) d2);
        cVar.d.a((short) 0);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 0);
        b.T().a(cVar);
        a(cVar);
    }

    public void a(int i) {
        c cVar = new c();
        cVar.c = 130;
        cVar.b = 2;
        cVar.d.a((short) i);
        b.T().a(cVar);
        a(cVar);
    }

    public void a(int i, double d, double d2, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        c cVar = new c();
        cVar.c = 129;
        cVar.b = 19;
        cVar.d.b((byte) i);
        cVar.d.b((byte) i3);
        cVar.d.a((float) d);
        cVar.d.a((float) d2);
        cVar.d.a((short) i2);
        cVar.d.a((short) i4);
        cVar.d.b((byte) i5);
        cVar.d.b((byte) i6);
        cVar.d.b((byte) i7);
        cVar.d.b((byte) i8);
        cVar.d.b((byte) 0);
        b.T().a(cVar);
        a(cVar);
    }

    public void a(int i, double d, double d2, short s, int i2, int i3) {
        c cVar = new c();
        cVar.c = 133;
        cVar.b = 16;
        cVar.d.b((byte) i);
        cVar.d.b((byte) i3);
        cVar.d.a((float) d);
        cVar.d.a((float) d2);
        cVar.d.a(s);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) i2);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 0);
        b.T().a(cVar);
        a(cVar);
    }

    public void a(int i, double d, double d2, short s, short s2, int i2) {
        c cVar = new c();
        cVar.c = 131;
        cVar.b = 19;
        cVar.d.a((short) i);
        cVar.d.a((float) d);
        cVar.d.a((float) d2);
        cVar.d.a(s);
        cVar.d.a((short) 0);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) i2);
        cVar.d.b((byte) 0);
        cVar.d.a(s2);
        b.T().a(cVar);
        a(cVar);
    }

    public void b() {
        ao aoVar = new ao();
        aoVar.d = (short) 1;
        b.T().a(aoVar.a());
        a(aoVar.a());
    }

    public void b(byte b, byte b2, byte b3) {
        c cVar = new c();
        cVar.c = 153;
        cVar.b = 3;
        cVar.d.b(b);
        cVar.d.b(b2);
        cVar.d.b(b3);
        b.T().a(cVar);
        a(cVar);
    }

    public void b(int i) {
        c cVar = new c();
        cVar.c = 204;
        cVar.b = 2;
        cVar.d.b((byte) i);
        cVar.d.b((byte) 2);
        b.T().a(cVar);
        a(cVar);
    }

    public void c() {
        ak akVar = new ak();
        akVar.d = (short) 1;
        b.T().a(akVar.a());
        a(akVar.a());
    }

    public void c(int i) {
        this.c.a(i + "");
    }

    public void d() {
        an anVar = new an();
        anVar.d = (short) 1;
        anVar.e = DroneMap.o;
        b.T().a(anVar.a());
        a(anVar.a());
    }

    public void e() {
        an anVar = new an();
        anVar.d = (short) 1;
        anVar.e = DroneMap.n;
        b.T().a(anVar.a());
        a(anVar.a());
    }

    public void f() {
        an anVar = new an();
        anVar.d = (short) 1;
        anVar.e = DroneMap.m;
        b.T().a(anVar.a());
        a(anVar.a());
    }

    public void g() {
        bf bfVar = new bf();
        bfVar.e = (byte) 1;
        bfVar.d = (byte) 114;
        bfVar.f = (byte) 3;
        b.T().a(bfVar.a());
        a(bfVar.a());
    }

    public void h() {
        bf bfVar = new bf();
        bfVar.e = (byte) 1;
        bfVar.d = (byte) 114;
        bfVar.f = (byte) 1;
        b.T().a(bfVar.a());
        a(bfVar.a());
    }

    public void i() {
        bf bfVar = new bf();
        bfVar.e = (byte) 1;
        bfVar.d = (byte) 114;
        bfVar.f = (byte) 2;
        b.T().a(bfVar.a());
        a(bfVar.a());
    }

    public void j() {
        bf bfVar = new bf();
        bfVar.e = (byte) 1;
        bfVar.d = (byte) 87;
        bfVar.f = (byte) 0;
        b.T().a(bfVar.a());
        a(bfVar.a());
    }

    public void k() {
        bf bfVar = new bf();
        bfVar.e = (byte) 2;
        bfVar.d = DroneMap.n;
        bfVar.f = (byte) 0;
        b.T().a(bfVar.a());
        a(bfVar.a());
    }

    public void l() {
        bf bfVar = new bf();
        bfVar.e = (byte) 1;
        bfVar.d = (byte) 84;
        bfVar.f = (byte) 0;
        b.T().a(bfVar.a());
        a(bfVar.a());
    }

    public void m() {
        bf bfVar = new bf();
        bfVar.e = (byte) 1;
        bfVar.d = (byte) 88;
        bfVar.f = (byte) 0;
        b.T().a(bfVar.a());
        a(bfVar.a());
    }

    public void n() {
        bf bfVar = new bf();
        bfVar.e = (byte) 1;
        bfVar.d = (byte) 86;
        bfVar.f = (byte) 2;
        b.T().a(bfVar.a());
        a(bfVar.a());
    }

    public void o() {
        bf bfVar = new bf();
        bfVar.e = (byte) 1;
        bfVar.d = com.fimi.soul.module.setting.newhand.c.f;
        bfVar.f = (byte) 1;
        b.T().a(bfVar.a());
        a(bfVar.a());
    }

    public void p() {
        bf bfVar = new bf();
        bfVar.e = (byte) 1;
        bfVar.d = (byte) 86;
        bfVar.f = (byte) 1;
        b.T().a(bfVar.a());
        a(bfVar.a());
    }

    public void q() {
        c cVar = new c();
        cVar.c = 148;
        cVar.b = 2;
        cVar.d.a((short) 1);
        b.T().a(cVar);
        a(cVar);
    }

    public void r() {
        c cVar = new c();
        cVar.c = 122;
        cVar.b = 2;
        cVar.d.b((byte) 10);
        cVar.d.b((byte) 0);
        b.T().a(cVar);
        a(cVar);
    }
}
