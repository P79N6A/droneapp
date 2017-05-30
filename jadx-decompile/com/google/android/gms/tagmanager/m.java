package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class m extends t {
    private static final String a = eg.ENCODE.toString();
    private static final String b = fh.ARG0.toString();
    private static final String c = fh.NO_PADDING.toString();
    private static final String d = fh.INPUT_FORMAT.toString();
    private static final String e = fh.OUTPUT_FORMAT.toString();

    public m() {
        super(a, b);
    }

    public a a(Map<String, a> map) {
        a aVar = (a) map.get(b);
        if (aVar == null || aVar == cw.g()) {
            return cw.g();
        }
        String a = cw.a(aVar);
        aVar = (a) map.get(d);
        if (aVar == null) {
            Object obj = "text";
        } else {
            String a2 = cw.a(aVar);
        }
        aVar = (a) map.get(e);
        if (aVar == null) {
            Object obj2 = "base16";
        } else {
            String a3 = cw.a(aVar);
        }
        aVar = (a) map.get(c);
        int i = (aVar == null || !cw.e(aVar).booleanValue()) ? 2 : 3;
        try {
            byte[] bytes;
            String valueOf;
            Object a4;
            if ("text".equals(obj)) {
                bytes = a.getBytes();
            } else if ("base16".equals(obj)) {
                bytes = dh.a(a);
            } else if ("base64".equals(obj)) {
                bytes = Base64.decode(a, i);
            } else if ("base64url".equals(obj)) {
                bytes = Base64.decode(a, i | 8);
            } else {
                a3 = "Encode: unknown input format: ";
                valueOf = String.valueOf(obj);
                aw.a(valueOf.length() != 0 ? a3.concat(valueOf) : new String(a3));
                return cw.g();
            }
            if ("base16".equals(obj2)) {
                a4 = dh.a(bytes);
            } else if ("base64".equals(obj2)) {
                a4 = Base64.encodeToString(bytes, i);
            } else if ("base64url".equals(obj2)) {
                a4 = Base64.encodeToString(bytes, i | 8);
            } else {
                a2 = "Encode: unknown output format: ";
                valueOf = String.valueOf(obj2);
                aw.a(valueOf.length() != 0 ? a2.concat(valueOf) : new String(a2));
                return cw.g();
            }
            return cw.f(a4);
        } catch (IllegalArgumentException e) {
            aw.a("Encode: invalid input:");
            return cw.g();
        }
    }

    public boolean a() {
        return true;
    }
}
