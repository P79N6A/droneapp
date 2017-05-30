package com.google.android.gms.internal;

import com.google.android.gms.analytics.n;
import com.google.android.gms.common.internal.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ads extends n<ads> {
    private final Map<String, Object> a = new HashMap();

    private String a(String str) {
        d.a(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        d.a(str, "Name can not be empty or \"&\"");
        return str;
    }

    public Map<String, Object> a() {
        return Collections.unmodifiableMap(this.a);
    }

    public /* synthetic */ void a(n nVar) {
        a((ads) nVar);
    }

    public void a(ads com_google_android_gms_internal_ads) {
        d.a(com_google_android_gms_internal_ads);
        com_google_android_gms_internal_ads.a.putAll(this.a);
    }

    public void a(String str, String str2) {
        this.a.put(a(str), str2);
    }

    public String toString() {
        return a(this.a);
    }
}
