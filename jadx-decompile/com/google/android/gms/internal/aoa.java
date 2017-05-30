package com.google.android.gms.internal;

import java.util.Arrays;

public class aoa {
    private static final String a = aoa.class.getSimpleName();
    private static final char[] b = "0123456789abcdef".toCharArray();
    private final byte[] c;

    public aoa(byte[] bArr) {
        this.c = bArr;
    }

    public aoa a(int i) {
        return new aoa(Arrays.copyOfRange(this.c, 0, i));
    }

    public byte[] a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return z;
        }
        if (obj == this) {
            return true;
        }
        try {
            return Arrays.equals(this.c, ((aoa) obj).a());
        } catch (ClassCastException e) {
            return z;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(this.c) + 527;
    }
}
