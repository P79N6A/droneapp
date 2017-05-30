package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.util.f;
import java.util.Map;

@aaa
public class wa implements vt {
    static final Map<String, Integer> a = f.a("resize", Integer.valueOf(1), "playVideo", Integer.valueOf(2), "storePicture", Integer.valueOf(3), "createCalendarEvent", Integer.valueOf(4), "setOrientationProperties", Integer.valueOf(5), "closeResizedAd", Integer.valueOf(6));
    private final e b;
    private final yi c;

    public wa(e eVar, yi yiVar) {
        this.b = eVar;
        this.c = yiVar;
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        int intValue = ((Integer) a.get((String) map.get("a"))).intValue();
        if (intValue == 5 || this.b == null || this.b.b()) {
            switch (intValue) {
                case 1:
                    this.c.a((Map) map);
                    return;
                case 3:
                    new yk(com_google_android_gms_internal_acy, map).a();
                    return;
                case 4:
                    new yh(com_google_android_gms_internal_acy, map).a();
                    return;
                case 5:
                    new yj(com_google_android_gms_internal_acy, map).a();
                    return;
                case 6:
                    this.c.a(true);
                    return;
                default:
                    b.c("Unknown MRAID command called.");
                    return;
            }
        }
        this.b.a(null);
    }
}
