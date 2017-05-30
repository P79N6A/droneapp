package com.google.android.gms.internal;

import java.util.Map;

class vs$10 implements vt {
    vs$10() {
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = (String) map.get("ty");
        String str2 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt((String) map.get("tx"));
            int parseInt2 = Integer.parseInt(str);
            int parseInt3 = Integer.parseInt(str2);
            ro n = com_google_android_gms_internal_acy.n();
            if (n != null) {
                n.a().a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException e) {
            abr.d("Could not parse touch parameters from gmsg.");
        }
    }
}
