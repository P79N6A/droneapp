package com.b.a.a.a.b;

import com.b.a.c.d;
import java.math.BigInteger;
import java.security.MessageDigest;

public class c implements a {
    private static final String a = "MD5";
    private static final int b = 36;

    private byte[] a(byte[] bArr) {
        byte[] bArr2 = null;
        try {
            MessageDigest instance = MessageDigest.getInstance(a);
            instance.update(bArr);
            bArr2 = instance.digest();
        } catch (Throwable e) {
            d.a(e);
        }
        return bArr2;
    }

    public String a(String str) {
        return new BigInteger(a(str.getBytes())).abs().toString(36);
    }
}
