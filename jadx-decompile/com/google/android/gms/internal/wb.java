package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@aaa
public final class wb implements vt {
    private final vv a;
    private final e b;
    private final yi c;

    public wb(vv vvVar, e eVar, yi yiVar) {
        this.a = vvVar;
        this.b = eVar;
        this.c = yiVar;
    }

    private void a(boolean z) {
        if (this.c != null) {
            this.c.a(z);
        }
    }

    private static boolean a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int b(Map<String, String> map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return u.g().b();
            }
            if ("l".equalsIgnoreCase(str)) {
                return u.g().a();
            }
            if ("c".equalsIgnoreCase(str)) {
                return u.g().c();
            }
        }
        return -1;
    }

    private static void b(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        Context context = com_google_android_gms_internal_acy.getContext();
        if (TextUtils.isEmpty((String) map.get("u"))) {
            b.d("Destination url cannot be empty.");
            return;
        }
        try {
            com_google_android_gms_internal_acy.l().a(new AdLauncherIntentInfoParcel(new a(com_google_android_gms_internal_acy).a(context, map)));
        } catch (ActivityNotFoundException e) {
            b.d(e.getMessage());
        }
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = (String) map.get("a");
        if (str == null) {
            b.d("Action missing from an open GMSG.");
        } else if (this.b == null || this.b.b()) {
            acz l = com_google_android_gms_internal_acy.l();
            if ("expand".equalsIgnoreCase(str)) {
                if (com_google_android_gms_internal_acy.p()) {
                    b.d("Cannot expand WebView that is already expanded.");
                    return;
                }
                a(false);
                l.a(a((Map) map), b(map));
            } else if ("webapp".equalsIgnoreCase(str)) {
                str = (String) map.get("u");
                a(false);
                if (str != null) {
                    l.a(a((Map) map), b(map), str);
                } else {
                    l.a(a((Map) map), b(map), (String) map.get("html"), (String) map.get("baseurl"));
                }
            } else if ("in_app_purchase".equalsIgnoreCase(str)) {
                str = (String) map.get("product_id");
                String str2 = (String) map.get("report_urls");
                if (this.a == null) {
                    return;
                }
                if (str2 == null || str2.isEmpty()) {
                    this.a.a(str, new ArrayList());
                } else {
                    this.a.a(str, new ArrayList(Arrays.asList(str2.split(" "))));
                }
            } else if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
                a(true);
                b(com_google_android_gms_internal_acy, map);
            } else {
                a(true);
                str = (String) map.get("u");
                l.a(new AdLauncherIntentInfoParcel((String) map.get("i"), !TextUtils.isEmpty(str) ? u.e().a(com_google_android_gms_internal_acy, str) : str, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
            }
        } else {
            this.b.a((String) map.get("u"));
        }
    }
}
