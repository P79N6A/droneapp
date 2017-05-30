package com.google.android.gms.internal;

import com.google.android.gms.analytics.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class adr extends n<adr> {
    private Map<Integer, Double> a = new HashMap(4);

    public Map<Integer, Double> a() {
        return Collections.unmodifiableMap(this.a);
    }

    public /* synthetic */ void a(n nVar) {
        a((adr) nVar);
    }

    public void a(adr com_google_android_gms_internal_adr) {
        com_google_android_gms_internal_adr.a.putAll(this.a);
    }

    public String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            hashMap.put(new StringBuilder(String.valueOf(valueOf).length() + 6).append("metric").append(valueOf).toString(), entry.getValue());
        }
        return a(hashMap);
    }
}
