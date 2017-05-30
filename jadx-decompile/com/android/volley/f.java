package com.android.volley;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class f {
    private static final char[] a = "0123456789ABCDEF".toCharArray();

    f() {
    }

    public static String a(String str) {
        String str2 = null;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            str2 = a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        return str2;
    }

    private static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            cArr[i * 2] = a[i2 >>> 4];
            cArr[(i * 2) + 1] = a[i2 & 15];
        }
        return new String(cArr);
    }
}
