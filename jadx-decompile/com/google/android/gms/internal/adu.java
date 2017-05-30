package com.google.android.gms.internal;

import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.a.c;
import com.google.android.gms.analytics.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class adu extends n<adu> {
    private final List<a> a = new ArrayList();
    private final List<c> b = new ArrayList();
    private final Map<String, List<a>> c = new HashMap();
    private b d;

    public b a() {
        return this.d;
    }

    public void a(a aVar, String str) {
        if (aVar != null) {
            Object obj;
            if (str == null) {
                obj = "";
            }
            if (!this.c.containsKey(obj)) {
                this.c.put(obj, new ArrayList());
            }
            ((List) this.c.get(obj)).add(aVar);
        }
    }

    public /* synthetic */ void a(n nVar) {
        a((adu) nVar);
    }

    public void a(adu com_google_android_gms_internal_adu) {
        com_google_android_gms_internal_adu.a.addAll(this.a);
        com_google_android_gms_internal_adu.b.addAll(this.b);
        for (Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            for (a a : (List) entry.getValue()) {
                com_google_android_gms_internal_adu.a(a, str);
            }
        }
        if (this.d != null) {
            com_google_android_gms_internal_adu.d = this.d;
        }
    }

    public List<a> b() {
        return Collections.unmodifiableList(this.a);
    }

    public Map<String, List<a>> c() {
        return this.c;
    }

    public List<c> d() {
        return Collections.unmodifiableList(this.b);
    }

    public String toString() {
        Map hashMap = new HashMap();
        if (!this.a.isEmpty()) {
            hashMap.put("products", this.a);
        }
        if (!this.b.isEmpty()) {
            hashMap.put("promotions", this.b);
        }
        if (!this.c.isEmpty()) {
            hashMap.put("impressions", this.c);
        }
        hashMap.put("productAction", this.d);
        return a(hashMap);
    }
}
