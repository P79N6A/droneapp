package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class r extends e {
    private short b;
    private byte c = (byte) 100;

    public r(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.c;
    }

    public void a(short s, byte b) {
        this.b = s;
        this.c = b;
        this.a.a(d.a.ExecuteWaypoint);
    }

    public short b() {
        return this.b;
    }

    public void c() {
        this.b = (short) 0;
    }
}
