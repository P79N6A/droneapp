package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;

@aaa
public class yj {
    private final acy a;
    private final boolean b;
    private final String c;

    public yj(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        this.a = com_google_android_gms_internal_acy;
        this.c = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.b = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        } else {
            this.b = true;
        }
    }

    public void a() {
        if (this.a == null) {
            b.d("AdWebView is null");
            return;
        }
        int b = "portrait".equalsIgnoreCase(this.c) ? u.g().b() : "landscape".equalsIgnoreCase(this.c) ? u.g().a() : this.b ? -1 : u.g().c();
        this.a.b(b);
    }
}
