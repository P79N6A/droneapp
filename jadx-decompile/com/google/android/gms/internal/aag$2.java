package com.google.android.gms.internal;

import java.util.Map;

class aag$2 implements vt {
    final /* synthetic */ aag a;

    aag$2(aag com_google_android_gms_internal_aag) {
        this.a = com_google_android_gms_internal_aag;
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        synchronized (aag.a(this.a)) {
            if (aag.b(this.a).isDone()) {
                return;
            }
            aaj com_google_android_gms_internal_aaj = new aaj(-2, map);
            if (aag.c(this.a).equals(com_google_android_gms_internal_aaj.g())) {
                String d = com_google_android_gms_internal_aaj.d();
                if (d == null) {
                    abr.d("URL missing in loadAdUrl GMSG.");
                    return;
                }
                if (d.contains("%40mediation_adapters%40")) {
                    String replaceAll = d.replaceAll("%40mediation_adapters%40", abp.a(com_google_android_gms_internal_acy.getContext(), (String) map.get("check_adapters"), aag.d(this.a)));
                    com_google_android_gms_internal_aaj.a(replaceAll);
                    d = "Ad request URL modified to ";
                    replaceAll = String.valueOf(replaceAll);
                    abr.e(replaceAll.length() != 0 ? d.concat(replaceAll) : new String(d));
                }
                aag.b(this.a).b(com_google_android_gms_internal_aaj);
                return;
            }
        }
    }
}
