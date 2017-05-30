package com.google.android.gms.internal;

import java.util.Map;

class tf$3 implements vt {
    final /* synthetic */ tf a;

    tf$3(tf tfVar) {
        this.a = tfVar;
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        if (this.a.a(map)) {
            String str = "Received request to untrack: ";
            String valueOf = String.valueOf(this.a.b.d());
            abr.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.a.c();
        }
    }
}
