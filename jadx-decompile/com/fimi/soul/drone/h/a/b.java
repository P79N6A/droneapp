package com.fimi.soul.drone.h.a;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;

public class b extends e {
    public byte b;
    public short c;
    public float d;
    public float e;
    public byte f;
    public short g;
    public byte h = (byte) 10;
    public byte i;
    public byte j;
    public byte k;
    public byte l;

    public b(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.b;
    }

    public void a(byte b) {
        this.f = b;
    }

    public void a(byte b, short s, float f, float f2, byte b2, short s2, byte b3, byte b4, byte b5, byte b6, byte b7) {
        if (com.fimi.soul.biz.n.a.a().b()) {
            this.d = f;
            this.e = f2;
        } else {
            af a = z.a((double) f2, (double) f);
            this.d = (float) a.b();
            this.e = (float) a.a();
        }
        this.b = b;
        this.c = s;
        this.f = b2;
        this.g = s2;
        this.h = b3;
        this.i = b4;
        this.j = b5;
        this.k = b6;
        this.l = b7;
        if (this.a != null) {
            this.a.a(d.a.NOFLYZONE);
        }
    }

    public void a(float f) {
        this.e = f;
    }

    public void a(short s) {
        this.c = s;
    }

    public byte b() {
        return this.l;
    }

    public void b(float f) {
        this.d = f;
    }

    public void b(short s) {
        this.g = s;
    }

    public byte c() {
        return this.k;
    }

    public byte d() {
        return this.j;
    }

    public byte e() {
        return this.i;
    }

    public byte f() {
        return this.h;
    }

    public short g() {
        return this.g;
    }

    public short h() {
        return this.c;
    }

    public byte i() {
        return this.f;
    }

    public float j() {
        return this.e;
    }

    public float k() {
        return this.d;
    }

    public String toString() {
        return "FlyZone{Opration_code=" + this.b + ", number=" + this.c + ", Forbiden_Longitude=" + this.d + ", Forbiden_Latitude=" + this.e + ", type=" + this.f + ", radius=" + this.g + ", status=" + this.h + ", reserve1=" + this.i + ", reserve2=" + this.j + ", reserve3=" + this.k + ", report=" + this.l + '}';
    }
}
