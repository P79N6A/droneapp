package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class aq extends e {
    private short b;

    public aq(a aVar) {
        super(aVar);
    }

    public short a() {
        return this.b;
    }

    public void a(short s) {
        this.b = s;
        this.a.a(d.a.ResumeWaypoint);
    }

    public void b() {
        this.b = (short) 0;
    }
}
