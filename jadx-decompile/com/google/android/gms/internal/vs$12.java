package com.google.android.gms.internal;

import com.tencent.tauth.AuthActivity;
import java.util.Map;

class vs$12 implements vt {
    vs$12() {
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = (String) map.get(AuthActivity.ACTION_KEY);
        if ("pause".equals(str)) {
            com_google_android_gms_internal_acy.C();
        } else if ("resume".equals(str)) {
            com_google_android_gms_internal_acy.D();
        }
    }
}
