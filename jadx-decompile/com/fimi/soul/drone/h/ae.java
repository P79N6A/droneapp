package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class ae extends e {
    private byte b;
    private byte c;
    private byte d;
    private byte e;
    private byte f;

    public ae(a aVar) {
        super(aVar);
        aVar.a(d.a.PAIR_CODE);
    }

    public byte a() {
        return this.b;
    }

    public void a(byte b) {
        this.b = b;
    }

    public byte b() {
        return this.c;
    }

    public void b(byte b) {
        this.c = b;
    }

    public byte c() {
        return this.d;
    }

    public void c(byte b) {
        this.d = b;
    }

    public byte d() {
        return this.e;
    }

    public void d(byte b) {
        this.e = b;
    }

    public byte e() {
        return this.f;
    }

    public void e(byte b) {
        this.f = b;
    }

    public String toString() {
        return "PairCodeStatus{msg_id=" + this.b + ", target_id=" + this.c + ", ask_status=" + this.d + ", ask_type=" + this.e + ", pair_status=" + this.f + '}';
    }
}
