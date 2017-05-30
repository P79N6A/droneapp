package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import java.util.Arrays;

public class bn extends b {
    public static final int b = 201;
    private static final long serialVersionUID = 201;
    public int c;
    public short d;
    public byte e;
    public byte[] f;

    public bn() {
        this.a = 201;
    }

    public bn(c cVar) {
        this.a = 201;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = this.c;
        cVar.c = 201;
        cVar.d.b(this.e);
        cVar.d.a(this.d);
        for (byte b : this.f) {
            cVar.d.b(b);
        }
        return cVar;
    }

    public void a(int i) {
        this.f = new byte[i];
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.e();
    }

    public void b(int i) {
        this.c = i;
    }

    public byte[] b() {
        return this.f;
    }

    public int c() {
        return this.c;
    }

    public String toString() {
        return "updatedrone [Packet_sequence=" + this.d + ", data=" + Arrays.toString(this.f) + "]";
    }
}
