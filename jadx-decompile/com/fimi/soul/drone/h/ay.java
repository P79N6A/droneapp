package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class ay extends e {
    public byte b;
    public byte c;

    public ay(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.b;
    }

    public void a(byte b, byte b2) {
        this.b = b;
        this.c = b2;
        this.a.a(d.a.UPDATEDRONEORDERREPORT);
    }

    public byte b() {
        return this.c;
    }
}
