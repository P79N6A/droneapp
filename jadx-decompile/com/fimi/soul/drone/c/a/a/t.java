package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import java.io.Serializable;

public class t extends b implements Serializable {
    static final byte b = (byte) 10;
    static final byte c = (byte) 108;
    static final byte d = (byte) 1;
    static final byte e = (byte) 11;
    static final byte f = (byte) 1;
    public static final byte g = (byte) 8;
    public static final byte h = (byte) 9;
    byte i;
    byte j;
    public byte k;
    public byte l;
    public byte m;
    public byte n;
    public byte o;

    public t() {
        this.i = (byte) 8;
        this.j = e;
        this.a = 108;
    }

    public c a() {
        c cVar = new c();
        cVar.c = 108;
        cVar.b = 10;
        cVar.d.b(this.j);
        cVar.d.b((byte) 1);
        cVar.d.b(this.i);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 0);
        return cVar;
    }

    public void a(byte b) {
        this.i = b;
    }

    public void a(c cVar) {
        a(cVar.d);
    }

    public void a(d dVar) {
        dVar.c();
        this.l = dVar.d();
        this.m = dVar.d();
        this.n = dVar.d();
        this.o = dVar.d();
    }

    public void a(boolean z) {
        if (z) {
            this.j = e;
        } else {
            this.j = (byte) 1;
        }
    }
}
