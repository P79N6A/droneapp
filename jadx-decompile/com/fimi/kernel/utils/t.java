package com.fimi.kernel.utils;

import java.text.DecimalFormat;

public class t {
    private static byte a(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    public static double a(double d) {
        return a(d / 0.3048d, 1);
    }

    public static double a(double d, int i) {
        if (i != 1) {
            return i == 2 ? Double.valueOf(new DecimalFormat("0.00").format(d)).doubleValue() : i == 7 ? Double.valueOf(new DecimalFormat("0.0000000").format(d)).doubleValue() : d;
        } else {
            try {
                return Double.valueOf(new DecimalFormat("0.0").format(d)).doubleValue();
            } catch (Exception e) {
                e.printStackTrace();
                return d;
            }
        }
    }

    public static String a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String toHexString = Integer.toHexString(b & 255);
            if (toHexString.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(toHexString);
        }
        return stringBuilder.toString();
    }

    public static byte[] a(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String toUpperCase = str.toUpperCase();
        int length = toUpperCase.length() / 2;
        char[] toCharArray = toUpperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (a(toCharArray[i2 + 1]) | (a(toCharArray[i2]) << 4));
        }
        return bArr;
    }

    public static double b(double d) {
        return a(2.2369d * d, 1);
    }

    public static String b(double d, int i) {
        return i == 1 ? new DecimalFormat("0.0").format(d) : i == 2 ? new DecimalFormat("0.00").format(d) : i == 7 ? new DecimalFormat("0.0000000").format(d) : d + "";
    }

    public static double c(double d) {
        return a(d / 2.2369d, 1);
    }

    public static double d(double d) {
        return a(0.3048d * d, 1);
    }
}
