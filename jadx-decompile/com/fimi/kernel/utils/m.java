package com.fimi.kernel.utils;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel.MapMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class m {
    protected static char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    protected static MessageDigest b;

    static {
        b = null;
        try {
            b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
        }
    }

    public static String a(File file) {
        b.update(new FileInputStream(file).getChannel().map(MapMode.READ_ONLY, 0, file.length()));
        return b(b.digest());
    }

    public static String a(String str) {
        return a(str.getBytes());
    }

    public static String a(byte[] bArr) {
        b.update(bArr);
        return b(b.digest());
    }

    private static String a(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i + i2;
        while (i < i3) {
            a(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    private static void a(byte b, StringBuffer stringBuffer) {
        char c = a[(b & 240) >> 4];
        char c2 = a[b & 15];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }

    public static void a(String[] strArr) {
        System.out.println(b("2011123456").toLowerCase());
    }

    public static boolean a(String str, String str2) {
        return a(str).equals(str2);
    }

    public static final String b(String str) {
        int i = 0;
        char[] cArr = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            byte[] bytes = str.getBytes();
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bytes);
            byte[] digest = instance.digest();
            char[] cArr2 = new char[32];
            int i2 = 0;
            while (i < 16) {
                byte b = digest[i];
                int i3 = i2 + 1;
                cArr2[i2] = cArr[(b >>> 4) & 15];
                i2 = i3 + 1;
                cArr2[i3] = cArr[b & 15];
                i++;
            }
            return new String(cArr2).toUpperCase();
        } catch (Exception e) {
            return null;
        }
    }

    private static String b(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }
}
