package com.google.android.gms.internal;

import java.util.Map;

class tf$4 implements vt {
    final /* synthetic */ tf a;

    tf$4(tf tfVar) {
        this.a = tfVar;
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        if (this.a.a(map) && map.containsKey("isVisible")) {
            boolean z = "1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"));
            this.a.a(Boolean.valueOf(z).booleanValue());
        }
    }
}
