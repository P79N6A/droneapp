package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.d;
import java.util.Map;

class vs$4 implements vt {
    vs$4() {
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        d i = com_google_android_gms_internal_acy.i();
        if (i != null) {
            i.a();
            return;
        }
        i = com_google_android_gms_internal_acy.j();
        if (i != null) {
            i.a();
        } else {
            abr.d("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
