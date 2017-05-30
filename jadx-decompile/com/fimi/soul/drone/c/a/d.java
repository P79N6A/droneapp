package com.fimi.soul.drone.c.a;

import java.math.BigInteger;
import java.nio.ByteBuffer;

public class d {
    public static final int a = 512;
    public ByteBuffer b = ByteBuffer.allocate(512);
    public int c;

    public ByteBuffer a() {
        return this.b;
    }

    public void a(byte b) {
        this.b.put(b);
    }

    public void a(char c) {
        a((byte) (c >> 0));
        a((byte) (c >> 8));
    }

    public void a(double d) {
        b(Double.doubleToLongBits(d));
    }

    public void a(float f) {
        b(Float.floatToIntBits(f));
    }

    public void a(int i) {
        a((byte) (i >> 0));
        a((byte) (i >> 8));
        a((byte) (i >> 16));
    }

    public void a(long j) {
        a((byte) ((int) (j >> null)));
        a((byte) ((int) (j >> 8)));
        a((byte) ((int) (j >> 16)));
        a((byte) ((int) (j >> 24)));
    }

    public void a(short s) {
        a((byte) (s >> 0));
        a((byte) (s >> 8));
    }

    public int b() {
        return this.b.position() + 1;
    }

    public void b(byte b) {
        a(b);
    }

    public void b(int i) {
        a((byte) (i >> 0));
        a((byte) (i >> 8));
        a((byte) (i >> 16));
        a((byte) (i >> 24));
    }

    public void b(long j) {
        a((byte) ((int) (j >> null)));
        a((byte) ((int) (j >> 8)));
        a((byte) ((int) (j >> 16)));
        a((byte) ((int) (j >> 24)));
        a((byte) ((int) (j >> 32)));
        a((byte) ((int) (j >> 40)));
        a((byte) ((int) (j >> 48)));
        a((byte) ((int) (j >> 56)));
    }

    public void c() {
        this.c = 0;
    }

    public void c(int i) {
        this.c = i;
    }

    public byte d() {
        byte b = (byte) (0 | (this.b.get(this.c + 0) & 255));
        this.c++;
        return b;
    }

    public short e() {
        short s = (short) (((short) (0 | ((this.b.get(this.c + 1) & 255) << 8))) | (this.b.get(this.c + 0) & 255));
        this.c += 2;
        return s;
    }

    public int f() {
        int i = (((0 | ((this.b.get(this.c + 3) & 255) << 24)) | ((this.b.get(this.c + 2) & 255) << 16)) | ((this.b.get(this.c + 1) & 255) << 8)) | (this.b.get(this.c + 0) & 255);
        this.c += 4;
        return i;
    }

    public long g() {
        long j = (((((((0 | ((((long) this.b.get(this.c + 7)) & 255) << 56)) | ((((long) this.b.get(this.c + 6)) & 255) << 48)) | ((((long) this.b.get(this.c + 5)) & 255) << 40)) | ((((long) this.b.get(this.c + 4)) & 255) << 32)) | ((((long) this.b.get(this.c + 3)) & 255) << 24)) | ((((long) this.b.get(this.c + 2)) & 255) << 16)) | ((((long) this.b.get(this.c + 1)) & 255) << 8)) | (((long) this.b.get(this.c + 0)) & 255);
        this.c += 8;
        return j;
    }

    public long h() {
        long j = (((((((0 | ((((long) this.b.get(this.c + 0)) & 255) << 56)) | ((((long) this.b.get(this.c + 1)) & 255) << 48)) | ((((long) this.b.get(this.c + 2)) & 255) << 40)) | ((((long) this.b.get(this.c + 3)) & 255) << 32)) | ((((long) this.b.get(this.c + 4)) & 255) << 24)) | ((((long) this.b.get(this.c + 5)) & 255) << 16)) | ((((long) this.b.get(this.c + 6)) & 255) << 8)) | (((long) this.b.get(this.c + 7)) & 255);
        this.c += 8;
        return j;
    }

    public float i() {
        return Float.intBitsToFloat(f());
    }

    public float j() {
        byte b = (byte) ((this.b.get(this.c + 2) & 255) | 0);
        byte b2 = (byte) ((this.b.get(this.c + 1) & 255) | 0);
        byte b3 = (byte) ((this.b.get(this.c + 0) & 255) | 0);
        BigInteger bigInteger = new BigInteger(1, new byte[]{b, b2, b3});
        this.c += 3;
        return Float.parseFloat(bigInteger.toString());
    }

    public Double k() {
        return Double.valueOf(Double.longBitsToDouble(g()));
    }

    public char l() {
        char c = (char) (((char) (0 | ((this.b.get(this.c + 1) & 255) << 8))) | (this.b.get(this.c + 0) & 255));
        this.c += 2;
        return c;
    }

    public long m() {
        long j = (((0 | ((((long) this.b.get(this.c + 3)) & 255) << 24)) | ((((long) this.b.get(this.c + 2)) & 255) << 16)) | ((((long) this.b.get(this.c + 1)) & 255) << 8)) | (((long) this.b.get(this.c + 0)) & 255);
        this.c += 4;
        return j;
    }
}
