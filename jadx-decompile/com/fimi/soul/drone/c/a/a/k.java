package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import java.io.Serializable;

public class k extends b implements Serializable {
    public final int b;
    private byte c;
    private byte[] d;
    private byte[] e;
    private byte f;
    private byte g;
    private byte h;
    private byte i;
    private byte j;
    private byte k;
    private byte l;
    private byte m;
    private boolean n;
    private boolean o;
    private boolean p;

    public k() {
        this.b = 136;
        this.c = (byte) 19;
        this.d = new byte[2];
        this.j = (byte) 0;
        this.n = false;
        this.o = true;
        this.p = false;
        this.a = 136;
    }

    private c o() {
        int i = 0;
        c cVar = new c();
        cVar.c = 136;
        if (this.o) {
            cVar.b = 19;
            if (this.e != null && this.e.length > 0) {
                byte[] bArr = this.e;
                int length = bArr.length;
                while (i < length) {
                    cVar.d.b(bArr[i]);
                    i++;
                }
            }
        } else {
            cVar.b = 10;
            cVar.d.b((byte) 0);
            cVar.d.b((byte) 0);
            cVar.d.b((byte) 13);
            cVar.d.b((byte) 1);
            cVar.d.b(this.j);
            cVar.d.b((byte) 0);
            cVar.d.b((byte) 0);
            cVar.d.b((byte) 0);
            cVar.d.b(this.l);
            cVar.d.b((byte) 0);
        }
        return cVar;
    }

    private c p() {
        int i = 0;
        c cVar = new c();
        cVar.c = 136;
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 13);
        if (this.o) {
            cVar.d.b((byte) 0);
            if (this.p) {
                cVar.b = 26;
                cVar.d.b((byte) 0);
            } else {
                cVar.b = 36;
                cVar.d.b((byte) 1);
            }
        } else {
            cVar.b = 10;
            cVar.d.b((byte) 1);
            cVar.d.b((byte) 0);
        }
        cVar.d.b(this.d[0]);
        cVar.d.b(this.d[1]);
        if (!this.o) {
            cVar.d.b((byte) 0);
            cVar.d.b((byte) 0);
            cVar.d.b((byte) 0);
        } else if (this.e != null && this.e.length > 0) {
            byte[] bArr = this.e;
            int length = bArr.length;
            while (i < length) {
                cVar.d.b(bArr[i]);
                i++;
            }
        }
        return cVar;
    }

    public c a() {
        return this.n ? p() : o();
    }

    public void a(byte b) {
        this.c = b;
    }

    public void a(c cVar) {
        a(cVar.d);
    }

    public void a(d dVar) {
        dVar.c();
        this.g = dVar.d();
        this.f = dVar.d();
        this.h = dVar.d();
        this.i = dVar.d();
        this.j = dVar.d();
        this.d[0] = dVar.d();
        this.d[1] = dVar.d();
        this.k = dVar.d();
        this.l = dVar.d();
        this.m = dVar.d();
        byte[] bArr = new byte[]{this.g, this.f, this.h, this.i, k(), this.d[0], this.d[1], this.k, this.l, this.m};
    }

    public void a(boolean z) {
        this.n = z;
    }

    public void a(byte[] bArr) {
        this.d = bArr;
    }

    public void b(byte b) {
        this.i = b;
    }

    public void b(boolean z) {
        this.p = z;
    }

    public void b(byte[] bArr) {
        this.e = bArr;
    }

    public boolean b() {
        return this.n;
    }

    public void c(byte b) {
        this.f = b;
    }

    public void c(boolean z) {
        this.o = z;
    }

    public boolean c() {
        return this.p;
    }

    public void d(byte b) {
        this.h = b;
    }

    public boolean d() {
        return this.o;
    }

    public byte e() {
        return this.c;
    }

    public void e(byte b) {
        this.j = b;
    }

    public void f(byte b) {
        this.k = b;
    }

    public byte[] f() {
        return this.d;
    }

    public byte g() {
        return this.i;
    }

    public void g(byte b) {
        this.l = b;
    }

    public void h(byte b) {
        this.m = b;
    }

    public byte[] h() {
        return this.e;
    }

    public byte i() {
        return this.f;
    }

    public byte j() {
        return this.h;
    }

    public byte k() {
        return this.j;
    }

    public byte l() {
        return this.k;
    }

    public byte m() {
        return this.l;
    }

    public byte n() {
        return this.m;
    }
}
