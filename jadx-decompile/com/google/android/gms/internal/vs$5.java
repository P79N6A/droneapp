package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.tagmanager.e;
import com.tencent.tauth.AuthActivity;
import java.util.Map;
import org.json.JSONObject;

class vs$5 implements vt {
    vs$5() {
    }

    private void a(acy com_google_android_gms_internal_acy) {
        abr.c("Received support message, responding.");
        boolean z = false;
        d h = com_google_android_gms_internal_acy.h();
        if (h != null) {
            m mVar = h.c;
            if (mVar != null) {
                z = mVar.a(com_google_android_gms_internal_acy.getContext());
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(e.b, "checkSupport");
            jSONObject.put("supports", z);
            com_google_android_gms_internal_acy.b("appStreaming", jSONObject);
        } catch (Throwable th) {
        }
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        if ("checkSupport".equals(map.get(AuthActivity.ACTION_KEY))) {
            a(com_google_android_gms_internal_acy);
            return;
        }
        com.google.android.gms.ads.internal.overlay.d i = com_google_android_gms_internal_acy.i();
        if (i != null) {
            i.a(com_google_android_gms_internal_acy, map);
        }
    }
}
