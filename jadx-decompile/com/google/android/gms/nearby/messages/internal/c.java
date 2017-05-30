package com.google.android.gms.nearby.messages.internal;

import java.util.Arrays;

public abstract class c {
    private static final char[] a = "0123456789abcdef".toCharArray();
    private final byte[] b;

    protected c(byte[] bArr) {
        this.b = bArr;
    }

    public static String a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            stringBuilder.append(a[(b >> 4) & 15]).append(a[b & 15]);
        }
        return stringBuilder.toString();
    }

    public static byte[] a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) ((Character.digit(str.charAt(i * 2), 16) << 4) + Character.digit(str.charAt((i * 2) + 1), 16));
        }
        return bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public String b() {
        return a(this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!obj.getClass().isAssignableFrom(getClass())) {
            return false;
        }
        return Arrays.equals(this.b, ((c) obj).b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public String toString() {
        return a(this.b);
    }
}
