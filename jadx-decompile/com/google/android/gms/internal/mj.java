package com.google.android.gms.internal;

import java.util.Random;

public class mj {
    static final /* synthetic */ boolean a = (!mj.class.desiredAssertionStatus());
    private static final Random b = new Random();
    private static long c = 0;
    private static final int[] d = new int[12];

    public static synchronized String a(long j) {
        String stringBuilder;
        int i = 0;
        synchronized (mj.class) {
            int i2;
            int i3 = j == c ? 1 : 0;
            c = j;
            char[] cArr = new char[8];
            StringBuilder stringBuilder2 = new StringBuilder(20);
            for (i2 = 7; i2 >= 0; i2--) {
                cArr[i2] = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt((int) (j % 64));
                j /= 64;
            }
            if (a || j == 0) {
                stringBuilder2.append(cArr);
                if (i3 == 0) {
                    for (i2 = 0; i2 < 12; i2++) {
                        d[i2] = b.nextInt(64);
                    }
                } else {
                    a();
                }
                while (i < 12) {
                    stringBuilder2.append("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt(d[i]));
                    i++;
                }
                if (a || stringBuilder2.length() == 20) {
                    stringBuilder = stringBuilder2.toString();
                } else {
                    throw new AssertionError();
                }
            }
            throw new AssertionError();
        }
        return stringBuilder;
    }

    private static void a() {
        int i = 11;
        while (i >= 0) {
            if (d[i] != 63) {
                d[i] = d[i] + 1;
                return;
            } else {
                d[i] = 0;
                i--;
            }
        }
    }
}
