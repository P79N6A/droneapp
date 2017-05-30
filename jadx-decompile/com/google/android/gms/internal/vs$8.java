package com.google.android.gms.internal;

import java.util.Map;

class vs$8 implements vt {
    vs$8() {
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = "Received log message: ";
        String valueOf = String.valueOf((String) map.get("string"));
        abr.c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
