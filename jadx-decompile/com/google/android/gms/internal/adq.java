package com.google.android.gms.internal;

import com.google.android.gms.analytics.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class adq extends n<adq> {
    private Map<Integer, String> a = new HashMap(4);

    public Map<Integer, String> a() {
        return Collections.unmodifiableMap(this.a);
    }

    public /* synthetic */ void a(n nVar) {
        a((adq) nVar);
    }

    public void a(adq com_google_android_gms_internal_adq) {
        com_google_android_gms_internal_adq.a.putAll(this.a);
    }

    public String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            hashMap.put(new StringBuilder(String.valueOf(valueOf).length() + 9).append("dimension").append(valueOf).toString(), entry.getValue());
        }
        return a(hashMap);
    }
}
