package com.tencent.open.utils;

import android.support.v4.view.MotionEventCompat;

public final class ZipShort implements Cloneable {
    private int a;

    public ZipShort(int i) {
        this.a = i;
    }

    public ZipShort(byte[] bArr) {
        this(bArr, 0);
    }

    public ZipShort(byte[] bArr, int i) {
        this.a = (bArr[i + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK;
        this.a += bArr[i] & 255;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof ZipShort) && this.a == ((ZipShort) obj).getValue();
    }

    public byte[] getBytes() {
        return new byte[]{(byte) (this.a & 255), (byte) ((this.a & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8)};
    }

    public int getValue() {
        return this.a;
    }

    public int hashCode() {
        return this.a;
    }
}
