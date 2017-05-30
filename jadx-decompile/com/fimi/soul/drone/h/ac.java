package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;
import org.codehaus.jackson.smile.SmileConstants;

public class ac extends e {
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public byte f;
    public byte g;
    public byte h;
    public byte i;
    public float j;
    public byte k;
    public byte l = (byte) 0;
    private boolean m;
    private boolean n = false;
    private boolean o = true;

    public ac(a aVar) {
        super(aVar);
    }

    private void k() {
        if (this.f == SmileConstants.TOKEN_LITERAL_FALSE) {
            if (this.h == (byte) 1 || this.h == (byte) 3) {
                if ((((int) this.j) & 1) == 1) {
                    this.m = false;
                }
                if ((((int) this.j) & 2) == 2) {
                    this.m = false;
                    this.n = true;
                }
                if ((((int) this.j) & 4) == 4) {
                    this.m = true;
                    this.n = false;
                }
            }
        } else if (this.f != (byte) 51 || this.h != (byte) 3 || this.i != (byte) 4) {
        } else {
            if (this.j == 1.0f) {
                this.m = true;
            } else {
                this.m = false;
            }
        }
    }

    public void a(byte b) {
        this.l = b;
    }

    public void a(byte b, byte b2, byte b3, byte b4, int i, byte b5) {
        this.f = b;
        this.g = b2;
        this.h = b3;
        this.i = b4;
        this.j = (float) i;
        this.k = b5;
        this.a.a(d.a.NEW_HAND_OPERATE);
    }

    public void a(c cVar) {
        com.fimi.soul.drone.c.a.d dVar = cVar.d;
        dVar.c();
        this.f = dVar.d();
        this.g = dVar.d();
        dVar.d();
        dVar.d();
        dVar.d();
        dVar.d();
        this.k = dVar.d();
        this.a.a(d.a.NEW_HAND_OPERATE);
    }

    public void a(boolean z) {
        this.o = z;
    }

    public boolean a() {
        return this.n;
    }

    public byte b() {
        return this.l;
    }

    public void b(c cVar) {
        com.fimi.soul.drone.c.a.d dVar = cVar.d;
        dVar.c();
        this.f = dVar.d();
        this.g = dVar.d();
        this.h = dVar.d();
        this.i = dVar.d();
        if (this.h == (byte) 4) {
            this.j = dVar.i();
        } else {
            this.j = (float) dVar.f();
        }
        this.k = dVar.d();
        k();
        this.a.a(d.a.NEW_HAND_OPERATE);
    }

    public void b(boolean z) {
        this.m = z;
    }

    public boolean c() {
        return this.o;
    }

    public byte d() {
        return this.f;
    }

    public byte e() {
        return this.g;
    }

    public byte f() {
        return this.h;
    }

    public byte g() {
        return this.i;
    }

    public float h() {
        return this.j;
    }

    public byte i() {
        return this.k;
    }

    public boolean j() {
        return this.m;
    }

    public String toString() {
        return "NewHandDroneVariable{report=" + this.k + ", valueToBeOperate=" + this.j + ", byteCode=" + this.i + ", targetByteID=" + this.h + ", pilotMode=" + this.g + ", operation=" + this.f + '}';
    }
}
