package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.Future;

class vs$3 implements vt {
    vs$3() {
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = (String) map.get("u");
        if (str == null) {
            abr.d("URL missing from click GMSG.");
            return;
        }
        Uri a;
        Future future;
        Uri parse = Uri.parse(str);
        try {
            ro n = com_google_android_gms_internal_acy.n();
            if (n != null && n.c(parse)) {
                a = n.a(parse, com_google_android_gms_internal_acy.getContext(), com_google_android_gms_internal_acy.b());
                future = (Future) new acg(com_google_android_gms_internal_acy.getContext(), com_google_android_gms_internal_acy.o().b, a.toString()).e();
            }
        } catch (rp e) {
            String str2 = "Unable to append parameter to URL: ";
            str = String.valueOf(str);
            abr.d(str.length() != 0 ? str2.concat(str) : new String(str2));
        }
        a = parse;
        future = (Future) new acg(com_google_android_gms_internal_acy.getContext(), com_google_android_gms_internal_acy.o().b, a.toString()).e();
    }
}
