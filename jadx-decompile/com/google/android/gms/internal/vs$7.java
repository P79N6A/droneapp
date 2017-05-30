package com.google.android.gms.internal;

import java.util.Map;
import java.util.concurrent.Future;

class vs$7 implements vt {
    vs$7() {
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = (String) map.get("u");
        if (str == null) {
            abr.d("URL missing from httpTrack GMSG.");
        } else {
            Future future = (Future) new acg(com_google_android_gms_internal_acy.getContext(), com_google_android_gms_internal_acy.o().b, str).e();
        }
    }
}
