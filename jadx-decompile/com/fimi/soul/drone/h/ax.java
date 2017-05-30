package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class ax extends e {
    public byte b;
    public byte c;
    public byte d;

    public ax(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.b;
    }

    public void a(byte b, byte b2, byte b3) {
        this.b = b;
        this.c = b2;
        this.d = b3;
        this.a.a(d.a.UPDATEDRONEOBJECTREPORT);
    }

    public byte b() {
        return this.c;
    }

    public byte c() {
        return this.d;
    }
}
