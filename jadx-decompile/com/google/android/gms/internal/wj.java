package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.n;
import java.util.Map;
import java.util.concurrent.Future;

@aaa
public class wj implements vt {
    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        wh B = u.B();
        if (!map.containsKey("abort")) {
            String str = (String) map.get("src");
            if (str == null) {
                b.d("Precache video action is missing the src parameter.");
                return;
            }
            int parseInt;
            try {
                parseInt = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException e) {
                parseInt = 0;
            }
            String str2 = map.containsKey("mimetype") ? (String) map.get("mimetype") : "";
            if (B.b(com_google_android_gms_internal_acy)) {
                b.d("Precache task already running.");
                return;
            }
            n.a(com_google_android_gms_internal_acy.h());
            Future future = (Future) new wg(com_google_android_gms_internal_acy, com_google_android_gms_internal_acy.h().a.a(com_google_android_gms_internal_acy, parseInt, str2), str).e();
        } else if (!B.a(com_google_android_gms_internal_acy)) {
            b.d("Precache abort but no preload task running.");
        }
    }
}
