package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;

public class e extends com.fimi.soul.drone.e {
    public short b;
    public short c;
    public short d;
    public short e;
    public short f;

    public e(a aVar) {
        super(aVar);
    }

    public short a() {
        return this.b;
    }

    public void a(short s, short s2, short s3, short s4, short s5) {
        this.b = s;
        this.c = s2;
        this.d = s5;
        this.e = s3;
        this.f = s4;
        if (this.a != null) {
            this.a.a(d.a.BATTERYINFO);
        }
    }

    public short b() {
        return this.c;
    }

    public short c() {
        return this.d;
    }

    public short d() {
        return this.e;
    }

    public short e() {
        return this.f;
    }
}
