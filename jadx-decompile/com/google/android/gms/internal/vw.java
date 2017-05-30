package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;

@aaa
public class vw implements vt {
    private final vx a;

    public vw(vx vxVar) {
        this.a = vxVar;
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        float parseFloat;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        try {
            if (map.get("blurRadius") != null) {
                parseFloat = Float.parseFloat((String) map.get("blurRadius"));
                this.a.b(equals);
                this.a.a(equals2, parseFloat);
            }
        } catch (Throwable e) {
            b.b("Fail to parse float", e);
        }
        parseFloat = 0.0f;
        this.a.b(equals);
        this.a.a(equals2, parseFloat);
    }
}
