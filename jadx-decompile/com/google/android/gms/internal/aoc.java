package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;

public class aoc {
    private static final String c = aoc.class.getSimpleName();
    int[] a;
    int b;

    public aoc(DataHolder dataHolder, int i) {
        if (dataHolder != null && dataHolder.e() == 0) {
            Object b = b(dataHolder.f("", i, dataHolder.a(i)));
            if (b != null && b.length >= 3 && b[0] == 1 && b[1] == 1936614772) {
                this.a = new int[b.length];
                System.arraycopy(b, 0, this.a, 0, b.length);
                this.b = this.a[2];
            }
        }
    }

    private static int a(int[] iArr, long j) {
        int i = 3;
        int length = iArr.length - 1;
        while (i <= length) {
            int i2 = ((length - i) / 2) + i;
            long a = a((long) iArr[i2]);
            if (a == j) {
                return i2;
            }
            if (a < j) {
                i = i2 + 1;
            } else {
                length = i2 - 1;
            }
        }
        return -1;
    }

    private static long a(long j) {
        return 4294967295L & j;
    }

    public static int[] b(byte[] bArr) {
        if (bArr == null || bArr.length % 4 != 0) {
            return null;
        }
        int[] iArr = new int[(bArr.length / 4)];
        for (int i = 0; i < bArr.length; i += 4) {
            iArr[i / 4] = (int) (((((((long) bArr[i + 3]) & 255) | ((((long) bArr[i + 2]) & 255) << 8)) | ((((long) bArr[i + 1]) & 255) << 16)) | ((((long) bArr[i]) & 255) << 24)) & 4294967295L);
        }
        return iArr;
    }

    private static long c(byte[] bArr) {
        return ((((((long) bArr[3]) & 255) | ((((long) bArr[2]) & 255) << 8)) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[0]) & 255) << 24)) & 4294967295L;
    }

    public int a() {
        return this.b;
    }

    public boolean a(byte[] bArr) {
        if (this.a == null) {
            return false;
        }
        return a(this.a, c(bArr)) != -1;
    }
}
