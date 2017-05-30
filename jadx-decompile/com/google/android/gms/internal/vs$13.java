package com.google.android.gms.internal;

import java.util.Map;

class vs$13 implements vt {
    vs$13() {
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        if (map.keySet().contains("start")) {
            com_google_android_gms_internal_acy.l().i();
        } else if (map.keySet().contains("stop")) {
            com_google_android_gms_internal_acy.l().j();
        } else if (map.keySet().contains("cancel")) {
            com_google_android_gms_internal_acy.l().k();
        }
    }
}
