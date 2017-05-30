package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class ar extends e {
    private short b;
    private byte c;

    public ar(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.c;
    }

    public void a(byte b) {
        this.c = b;
    }

    public void a(short s, byte b) {
        this.c = b;
        this.b = s;
        this.a.a(d.a.SENDHOVERWAYPOINT);
    }

    public short b() {
        return this.b;
    }

    public void c() {
        this.b = (short) 0;
    }
}
