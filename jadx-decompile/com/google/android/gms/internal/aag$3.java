package com.google.android.gms.internal;

import java.util.Map;

class aag$3 implements vt {
    final /* synthetic */ aag a;

    aag$3(aag com_google_android_gms_internal_aag) {
        this.a = com_google_android_gms_internal_aag;
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        synchronized (aag.a(this.a)) {
            if (aag.b(this.a).isDone()) {
                return;
            }
            aaj com_google_android_gms_internal_aaj = new aaj(-2, map);
            if (aag.c(this.a).equals(com_google_android_gms_internal_aaj.g())) {
                com_google_android_gms_internal_aaj.h();
                aag.b(this.a).b(com_google_android_gms_internal_aaj);
                return;
            }
        }
    }
}
