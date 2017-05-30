package com.fimi.kernel.utils;

import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class r {
    private static final String a = "0123456789ABCDEF";

    public static String a(String str, String str2) {
        try {
            return new String(b(a(str), str2));
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte a : bArr) {
            a(stringBuffer, a);
        }
        return stringBuffer.toString();
    }

    private static void a(StringBuffer stringBuffer, byte b) {
        stringBuffer.append(a.charAt((b >> 4) & 15)).append(a.charAt(b & 15));
    }

    private static byte[] a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = Integer.valueOf(str.substring(i * 2, (i * 2) + 2), 16).byteValue();
        }
        return bArr;
    }

    private static byte[] a(byte[] bArr, String str) {
        try {
            SecureRandom secureRandom = new SecureRandom();
            Key generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str.getBytes("utf-8")));
            Cipher instance = Cipher.getInstance("DES");
            instance.init(1, generateSecret, secureRandom);
            return instance.doFinal(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String b(String str, String str2) {
        try {
            str = a(a(str.getBytes("utf-8"), str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    private static byte[] b(byte[] bArr, String str) {
        SecureRandom secureRandom = new SecureRandom();
        Key generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str.getBytes("utf-8")));
        Cipher instance = Cipher.getInstance("DES");
        instance.init(2, generateSecret, secureRandom);
        return instance.doFinal(bArr);
    }
}
