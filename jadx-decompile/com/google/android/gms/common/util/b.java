package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.c;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;

public final class b {
    public static <T> int a(T[] tArr, T t) {
        int i = 0;
        int length = tArr != null ? tArr.length : 0;
        while (i < length) {
            if (c.a(tArr[i], t)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> ArrayList<T> a() {
        return new ArrayList();
    }

    public static <T> ArrayList<T> a(T[] tArr) {
        ArrayList<T> arrayList = new ArrayList(r1);
        for (Object add : tArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static void a(StringBuilder stringBuilder, double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            stringBuilder.append(Double.toString(dArr[i]));
        }
    }

    public static void a(StringBuilder stringBuilder, float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            stringBuilder.append(Float.toString(fArr[i]));
        }
    }

    public static void a(StringBuilder stringBuilder, int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            stringBuilder.append(Integer.toString(iArr[i]));
        }
    }

    public static void a(StringBuilder stringBuilder, long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            stringBuilder.append(Long.toString(jArr[i]));
        }
    }

    public static <T> void a(StringBuilder stringBuilder, T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            stringBuilder.append(tArr[i].toString());
        }
    }

    public static void a(StringBuilder stringBuilder, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            stringBuilder.append("\"").append(strArr[i]).append("\"");
        }
    }

    public static void a(StringBuilder stringBuilder, boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            stringBuilder.append(Boolean.toString(zArr[i]));
        }
    }

    public static byte[] a(byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int i;
        int i2 = 0;
        for (byte[] length : bArr) {
            i2 += length.length;
        }
        Object copyOf = Arrays.copyOf(bArr[0], i2);
        i2 = bArr[0].length;
        for (i = 1; i < bArr.length; i++) {
            Object obj = bArr[i];
            System.arraycopy(obj, 0, copyOf, i2, obj.length);
            i2 += obj.length;
        }
        return copyOf;
    }

    public static Integer[] a(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    public static <T> boolean b(T[] tArr, T t) {
        return a((Object[]) tArr, (Object) t) >= 0;
    }
}
