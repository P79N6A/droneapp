package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.hj.a;
import java.net.URLEncoder;

class da {
    private static bn<a> a(bn<a> bnVar) {
        try {
            return new bn(cw.f(a(cw.a((a) bnVar.a()))), bnVar.b());
        } catch (Throwable e) {
            aw.a("Escape URI: unsupported encoding", e);
            return bnVar;
        }
    }

    private static bn<a> a(bn<a> bnVar, int i) {
        if (a((a) bnVar.a())) {
            switch (i) {
                case 12:
                    return a((bn) bnVar);
                default:
                    aw.a("Unsupported Value Escaping: " + i);
                    return bnVar;
            }
        }
        aw.a("Escaping can only be applied to strings.");
        return bnVar;
    }

    static bn<a> a(bn<a> bnVar, int... iArr) {
        bn a;
        for (int a2 : iArr) {
            a = a(a, a2);
        }
        return a;
    }

    static String a(String str) {
        return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }

    private static boolean a(a aVar) {
        return cw.f(aVar) instanceof String;
    }
}
