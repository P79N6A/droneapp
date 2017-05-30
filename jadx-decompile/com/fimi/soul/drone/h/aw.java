package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class aw extends e {
    public byte b;
    public byte c;

    public aw(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.c;
    }

    public void a(byte b, byte b2) {
        this.c = b;
        this.b = b2;
        this.a.a(d.a.UPDATEDRONEFINISHREPORTCRC);
    }

    public byte b() {
        return this.b;
    }
}
