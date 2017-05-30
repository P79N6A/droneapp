package com.fimi.soul.module.droneTrack;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.regex.Pattern;

public class f {
    public static final int c = 256;
    public ByteBuffer a;
    public int b;

    public f(char[] cArr) {
        try {
            this.a = ByteBuffer.allocate(256);
            if (cArr != null) {
                for (int i = 0; i < cArr.length - 1; i += 2) {
                    this.a.put((byte) Integer.parseInt(cArr[i] + "" + cArr[i + 1], 16));
                }
                this.b = 0;
            }
        } catch (Exception e) {
        }
    }

    public byte a() {
        byte b = (byte) (0 | (this.a.get(this.b + 0) & 255));
        this.b++;
        return b;
    }

    public boolean a(String str) {
        return Pattern.compile("[0-9a-zA-Z]*").matcher(str).matches();
    }

    public short b() {
        short s = (short) (((short) (0 | ((this.a.get(this.b + 1) & 255) << 8))) | (this.a.get(this.b + 0) & 255));
        this.b += 2;
        return s;
    }

    public int c() {
        int i = (((0 | ((this.a.get(this.b + 3) & 255) << 24)) | ((this.a.get(this.b + 2) & 255) << 16)) | ((this.a.get(this.b + 1) & 255) << 8)) | (this.a.get(this.b + 0) & 255);
        this.b += 4;
        return i;
    }

    public long d() {
        long j = (((((((0 | ((((long) this.a.get(this.b + 7)) & 255) << 56)) | ((((long) this.a.get(this.b + 6)) & 255) << 48)) | ((((long) this.a.get(this.b + 5)) & 255) << 40)) | ((((long) this.a.get(this.b + 4)) & 255) << 32)) | ((((long) this.a.get(this.b + 3)) & 255) << 24)) | ((((long) this.a.get(this.b + 2)) & 255) << 16)) | ((((long) this.a.get(this.b + 1)) & 255) << 8)) | (((long) this.a.get(this.b + 0)) & 255);
        this.b += 8;
        return j;
    }

    public long e() {
        long j = (((((((0 | ((((long) this.a.get(this.b + 0)) & 255) << 56)) | ((((long) this.a.get(this.b + 1)) & 255) << 48)) | ((((long) this.a.get(this.b + 2)) & 255) << 40)) | ((((long) this.a.get(this.b + 3)) & 255) << 32)) | ((((long) this.a.get(this.b + 4)) & 255) << 24)) | ((((long) this.a.get(this.b + 5)) & 255) << 16)) | ((((long) this.a.get(this.b + 6)) & 255) << 8)) | (((long) this.a.get(this.b + 7)) & 255);
        this.b += 8;
        return j;
    }

    public float f() {
        return Float.intBitsToFloat(c());
    }

    public float g() {
        byte b = (byte) ((this.a.get(this.b + 2) & 255) | 0);
        byte b2 = (byte) ((this.a.get(this.b + 1) & 255) | 0);
        byte b3 = (byte) ((this.a.get(this.b + 0) & 255) | 0);
        BigInteger bigInteger = new BigInteger(1, new byte[]{b, b2, b3});
        this.b += 3;
        return Float.parseFloat(bigInteger.toString());
    }

    public Double h() {
        return Double.valueOf(Double.longBitsToDouble(d()));
    }
}
