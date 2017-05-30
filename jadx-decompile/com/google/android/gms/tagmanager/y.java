package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

class y extends t {
    private static final String a = eg.HASH.toString();
    private static final String b = fh.ARG0.toString();
    private static final String c = fh.ALGORITHM.toString();
    private static final String d = fh.INPUT_FORMAT.toString();

    public y() {
        super(a, b);
    }

    private byte[] a(String str, byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(bArr);
        return instance.digest();
    }

    public a a(Map<String, a> map) {
        a aVar = (a) map.get(b);
        if (aVar == null || aVar == cw.g()) {
            return cw.g();
        }
        byte[] bytes;
        String a = cw.a(aVar);
        aVar = (a) map.get(c);
        String a2 = aVar == null ? "MD5" : cw.a(aVar);
        aVar = (a) map.get(d);
        Object a3 = aVar == null ? "text" : cw.a(aVar);
        if ("text".equals(a3)) {
            bytes = a.getBytes();
        } else if ("base16".equals(a3)) {
            bytes = dh.a(a);
        } else {
            a2 = "Hash: unknown input format: ";
            String valueOf = String.valueOf(a3);
            aw.a(valueOf.length() != 0 ? a2.concat(valueOf) : new String(a2));
            return cw.g();
        }
        try {
            return cw.f(dh.a(a(a2, bytes)));
        } catch (NoSuchAlgorithmException e) {
            a = "Hash: unknown algorithm: ";
            valueOf = String.valueOf(a2);
            aw.a(valueOf.length() != 0 ? a.concat(valueOf) : new String(a));
            return cw.g();
        }
    }

    public boolean a() {
        return true;
    }
}
