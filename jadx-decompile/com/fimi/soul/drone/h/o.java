package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;
import java.util.Arrays;

public class o extends e {
    public byte b;
    public byte c;
    public byte d;
    public byte e;
    public byte f;
    private byte g;
    private byte[] h;

    public o(a aVar) {
        super(aVar);
        aVar.a(d.a.DYNAMIC_RESULT);
    }

    public byte a() {
        return this.g;
    }

    public void a(byte b) {
        this.g = b;
    }

    public void a(byte[] bArr) {
        this.h = bArr;
    }

    public byte b() {
        return this.b;
    }

    public void b(byte b) {
        this.b = b;
    }

    public byte c() {
        return this.c;
    }

    public void c(byte b) {
        this.c = b;
    }

    public void d(byte b) {
        this.d = b;
    }

    public byte[] d() {
        return this.h;
    }

    public byte e() {
        return this.d;
    }

    public void e(byte b) {
        this.e = b;
    }

    public byte f() {
        return this.e;
    }

    public void f(byte b) {
        this.f = b;
    }

    public byte g() {
        return this.f;
    }

    public String toString() {
        return "DynamicStatus{msg_id=" + this.g + ", tagertId=" + this.b + ", sourceId=" + this.c + ", packetNum=" + Arrays.toString(this.h) + ", gps_status=" + this.d + ", received=" + this.e + ", report_status=" + this.f + '}';
    }
}
