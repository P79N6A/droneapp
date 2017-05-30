package com.google.android.gms.internal;

import java.util.Map;

class aag$1 implements vt {
    final /* synthetic */ aag a;

    aag$1(aag com_google_android_gms_internal_aag) {
        this.a = com_google_android_gms_internal_aag;
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        synchronized (aag.a(this.a)) {
            if (aag.b(this.a).isDone()) {
            } else if (aag.c(this.a).equals(map.get("request_id"))) {
                aaj com_google_android_gms_internal_aaj = new aaj(1, map);
                String valueOf = String.valueOf(com_google_android_gms_internal_aaj.e());
                String valueOf2 = String.valueOf(com_google_android_gms_internal_aaj.b());
                abr.d(new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()).append("Invalid ").append(valueOf).append(" request error: ").append(valueOf2).toString());
                aag.b(this.a).b(com_google_android_gms_internal_aaj);
            }
        }
    }
}
