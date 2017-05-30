package com.google.android.gms.internal;

public final class rg {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final float[] c = new float[0];
    public static final double[] d = new double[0];
    public static final boolean[] e = new boolean[0];
    public static final String[] f = new String[0];
    public static final byte[][] g = new byte[0][];
    public static final byte[] h = new byte[0];

    static int a(int i) {
        return i & 7;
    }

    public static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static boolean a(qv qvVar, int i) {
        return qvVar.b(i);
    }

    public static int b(int i) {
        return i >>> 3;
    }

    public static final int b(qv qvVar, int i) {
        int i2 = 1;
        int t = qvVar.t();
        qvVar.b(i);
        while (qvVar.a() == i) {
            qvVar.b(i);
            i2++;
        }
        qvVar.f(t);
        return i2;
    }
}
