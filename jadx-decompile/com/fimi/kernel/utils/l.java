package com.fimi.kernel.utils;

import com.fimi.kernel.a.a;
import com.fimi.kernel.a.e;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class l {
    public static char a(int i) {
        switch (i) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            case 9:
                return '9';
            case 10:
                return 'a';
            case 11:
                return 'b';
            case 12:
                return 'c';
            case 13:
                return 'd';
            case 14:
                return 'e';
            case 15:
                return 'f';
            default:
                return org.a.a.f.c.l.c;
        }
    }

    public static double a(double d, double d2) {
        return Math.log(d) / Math.log(d2);
    }

    public static double a(double d, double d2, double d3, double d4) {
        double d5 = d - d3;
        double d6 = d2 - d4;
        return Math.sqrt((d5 * d5) + (d6 * d6));
    }

    public static double a(e eVar, e eVar2) {
        return a(eVar.a, eVar.b, eVar2.a, eVar2.b);
    }

    public static int a(double[] dArr) {
        float f = 0.0f;
        for (double d : dArr) {
            f = (float) (((double) f) + d);
        }
        return (int) (f / ((float) dArr.length));
    }

    public static String a(byte[] bArr, int i) {
        String str = "";
        str = "";
        int i2 = 0;
        while (i2 < i) {
            String toHexString = Integer.toHexString(bArr[i2] & 255);
            i2++;
            str = (toHexString.length() == 1 ? str + "0" + toHexString : str + toHexString) + Constants.ACCEPT_TIME_SEPARATOR_SP;
        }
        return str.toUpperCase();
    }

    public static BigDecimal a(double d, int i) {
        return new BigDecimal(d).setScale(i, 4);
    }

    public static List<e> a(a aVar, a aVar2) {
        List<e> arrayList = new ArrayList();
        double d = (aVar.b * 2.0d) * (aVar.a.a - aVar2.a.a);
        double d2 = (aVar.b * 2.0d) * (aVar.a.b - aVar2.a.b);
        double pow = ((Math.pow(aVar2.b, 2.0d) - Math.pow(aVar.b, 2.0d)) - Math.pow(aVar.a.a - aVar2.a.a, 2.0d)) - Math.pow(aVar.a.b - aVar2.a.b, 2.0d);
        double pow2 = Math.pow(d, 2.0d) + Math.pow(d2, 2.0d);
        d = (d * -2.0d) * pow;
        d2 = Math.pow(d, 2.0d) - ((Math.pow(pow, 2.0d) - Math.pow(d2, 2.0d)) * (4.0d * pow2));
        pow = (Math.sqrt(d2) - d) / (2.0d * pow2);
        d = ((-Math.sqrt(d2)) - d) / (2.0d * pow2);
        d2 = (aVar.b * pow) + aVar.a.a;
        pow = Math.sqrt(Math.pow(aVar.b, 2.0d) - Math.pow(d2 - aVar.a.a, 2.0d)) + aVar.a.b;
        pow2 = (-Math.sqrt(Math.pow(aVar.b, 2.0d) - Math.pow(d2 - aVar.a.a, 2.0d))) + aVar.a.b;
        Set<e> hashSet = new HashSet();
        e eVar = new e(d2, pow);
        if (a(eVar, aVar, aVar2)) {
            hashSet.add(eVar);
        }
        e eVar2 = new e(d2, pow2);
        if (a(eVar2, aVar, aVar2)) {
            hashSet.add(eVar2);
        }
        d = (d * aVar.b) + aVar.a.a;
        pow = (-Math.sqrt(Math.pow(aVar.b, 2.0d) - Math.pow(d - aVar.a.a, 2.0d))) + aVar.a.b;
        e eVar3 = new e(d, Math.sqrt(Math.pow(aVar.b, 2.0d) - Math.pow(d - aVar.a.a, 2.0d)) + aVar.a.b);
        if (a(eVar3, aVar, aVar2)) {
            hashSet.add(eVar3);
        }
        e eVar4 = new e(d, pow);
        if (a(eVar4, aVar, aVar2)) {
            hashSet.add(eVar4);
        }
        for (e add : hashSet) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static boolean a(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        if (d < Math.min(d4, d6) || d > Math.max(d4, d6) || d2 < Math.min(d5, d7) || d2 > Math.max(d5, d7)) {
            return false;
        }
        return d3 <= Math.abs(d - d4) && d3 <= Math.abs(d2 - d7) && d3 <= Math.abs(d - d6) && d3 <= Math.abs(d2 - d7);
    }

    public static boolean a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if ((d4 - d2) / (d3 - d) == (d8 - d6) / (d7 - d5)) {
            return false;
        }
        double d9 = (((d * d4) - (d2 * d3)) - ((((((d * d4) - (d2 * d3)) * (d5 - d7)) - (((d5 * d8) - (d6 * d7)) * (d - d3))) / (((d4 - d2) * (d5 - d7)) - ((d8 - d6) * (d - d3)))) * (d4 - d2))) / (d - d3);
        return true;
    }

    public static boolean a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return (f5 <= f || f5 <= f + f3) ? (f5 >= f || f5 >= f - f7) ? (f6 <= f2 || f6 <= f2 + f4) ? f6 >= f2 || f6 >= f2 - f8 : false : false : false;
    }

    public static boolean a(e eVar, a aVar) {
        return Math.pow(eVar.a - aVar.a.a, 2.0d) + Math.pow(eVar.b - aVar.a.b, 2.0d) <= Math.pow(aVar.b, 2.0d);
    }

    public static boolean a(e eVar, a aVar, a aVar2) {
        return Math.pow(eVar.a - aVar2.a.a, 2.0d) + Math.pow(eVar.b - aVar2.a.b, 2.0d) == Math.pow(aVar2.b, 2.0d) && Math.pow(eVar.a - aVar.a.a, 2.0d) + Math.pow(eVar.b - aVar.a.b, 2.0d) == Math.pow(aVar.b, 2.0d);
    }

    public static boolean a(e eVar, a aVar, a aVar2, float f) {
        return Math.pow(eVar.a - aVar2.a.a, 2.0d) + Math.pow(eVar.b - aVar2.a.b, 2.0d) <= Math.pow(aVar2.b, 2.0d) + ((double) f) && Math.pow(eVar.a - aVar2.a.a, 2.0d) + Math.pow(eVar.b - aVar2.a.b, 2.0d) >= Math.pow(aVar2.b, 2.0d) - ((double) f) && Math.pow(eVar.a - aVar.a.a, 2.0d) + Math.pow(eVar.b - aVar.a.b, 2.0d) <= Math.pow(aVar.b, 2.0d) + ((double) f) && Math.pow(eVar.a - aVar.a.a, 2.0d) + Math.pow(eVar.b - aVar.a.b, 2.0d) >= Math.pow(aVar.b, 2.0d) - ((double) f);
    }

    public static double[] a(int[] iArr) {
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = Double.valueOf(String.valueOf(iArr[i])).doubleValue();
        }
        return dArr;
    }

    public static double[] a(double[][] dArr) {
        double[] dArr2 = new double[(dArr.length * dArr[0].length)];
        for (int i = 0; i < dArr.length; i++) {
            for (int i2 = 0; i2 < dArr[i].length; i2++) {
                dArr2[(dArr.length * i2) + i] = dArr[i][i2];
            }
        }
        return dArr2;
    }

    public static double[][] a(int[][] iArr) {
        int length = iArr.length;
        int length2 = iArr[0].length;
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, new int[]{length, length2});
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i][i2] = Double.valueOf(String.valueOf(iArr[i][i2])).doubleValue();
            }
        }
        return dArr;
    }

    public static int[][] a(int[] iArr, int i, int i2) {
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i2, i});
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i3][i4] = iArr[(i4 * i2) + i3];
            }
        }
        return iArr2;
    }

    public static int b(int[] iArr) {
        float f = 0.0f;
        for (int i : iArr) {
            f += (float) i;
        }
        return (int) (f / ((float) iArr.length));
    }

    public static boolean b(double d, double d2, double d3, double d4, double d5, double d6) {
        return ((d - d3) * (d6 - d4)) - ((d2 - d4) * (d5 - d3)) == 0.0d ? d >= Math.min(d3, d5) && d <= Math.max(d3, d5) && d2 >= Math.min(d4, d6) && d2 <= Math.max(d4, d6) : false;
    }

    public static boolean b(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if ((d4 - d2) / (d3 - d) == (d8 - d6) / (d7 - d5)) {
            return false;
        }
        double d9 = ((((d * d4) - (d2 * d3)) * (d5 - d7)) - (((d5 * d8) - (d6 * d7)) * (d - d3))) / (((d4 - d2) * (d5 - d7)) - ((d8 - d6) * (d - d3)));
        double d10 = (((d * d4) - (d2 * d3)) - ((d4 - d2) * d9)) / (d - d3);
        return d9 >= Math.min(d, d3) && d9 <= Math.max(d, d3) && d10 >= Math.min(d2, d4) && d10 <= Math.max(d2, d4) && d9 >= Math.min(d5, d7) && d9 <= Math.max(d5, d7) && d10 >= Math.min(d6, d8) && d10 <= Math.max(d6, d8);
    }

    public static boolean c(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= Math.min(d3, d5) && d <= Math.max(d3, d5) && d2 >= Math.min(d4, d6) && d2 <= Math.max(d4, d6);
    }

    public static boolean c(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if ((d4 - d2) / (d3 - d) == (d8 - d6) / (d7 - d5)) {
            return false;
        }
        double d9 = ((((d * d4) - (d2 * d3)) * (d5 - d7)) - (((d5 * d8) - (d6 * d7)) * (d - d3))) / (((d4 - d2) * (d5 - d7)) - ((d8 - d6) * (d - d3)));
        double d10 = (((d * d4) - (d2 * d3)) - ((d4 - d2) * d9)) / (d - d3);
        return d9 >= Math.min(d, d3) && d9 <= Math.max(d, d3) && d10 >= Math.min(d2, d4) && d10 <= Math.max(d2, d4);
    }

    public static boolean d(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= Math.min(d5, d7) && d <= Math.max(d5, d7) && d2 >= Math.min(d6, d8) && d2 <= Math.max(d6, d8) && d3 >= Math.min(d5, d7) && d3 <= Math.max(d5, d7) && d4 >= Math.min(d6, d8) && d4 <= Math.max(d6, d8);
    }

    public boolean a(double d, double d2, double d3, double d4, double d5, double d6) {
        return ((d - d3) * (d6 - d4)) - ((d2 - d4) * (d5 - d3)) == 0.0d;
    }
}
