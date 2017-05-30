package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import java.io.Serializable;

public class l extends b implements Serializable {
    public final int b;
    private final byte c;
    private byte[] d;
    private byte[] e;
    private byte f;

    public l() {
        this.b = 137;
        this.c = (byte) 19;
        this.d = new byte[2];
        this.a = 137;
    }

    public c a() {
        c cVar = new c();
        cVar.c = 137;
        cVar.b = 19;
        if (this.e != null && this.e.length > 0) {
            for (byte b : this.e) {
                cVar.d.b(b);
            }
        }
        return cVar;
    }

    public void a(byte b) {
        this.f = b;
    }

    public void a(c cVar) {
        a(cVar.d);
    }

    public void a(d dVar) {
        dVar.c();
        this.d[0] = dVar.d();
        this.d[1] = dVar.d();
        this.f = dVar.d();
    }

    public void a(byte[] bArr) {
        this.d = bArr;
    }

    public void b(byte[] bArr) {
        this.e = bArr;
    }

    public byte[] b() {
        return this.d;
    }

    public byte c() {
        return this.f;
    }
}
