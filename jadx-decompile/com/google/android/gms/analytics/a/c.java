package com.google.android.gms.analytics.a;

import com.google.android.gms.analytics.n;
import com.google.android.gms.common.internal.d;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class c {
    public static final String a = "click";
    public static final String b = "view";
    Map<String, String> c = new HashMap();

    public c a(String str) {
        a("id", str);
        return this;
    }

    void a(String str, String str2) {
        d.a((Object) str, (Object) "Name should be non-null");
        this.c.put(str, str2);
    }

    public c b(String str) {
        a("nm", str);
        return this;
    }

    public c c(String str) {
        a("cr", str);
        return this;
    }

    public c d(String str) {
        a("ps", str);
        return this;
    }

    public Map<String, String> e(String str) {
        Map<String, String> hashMap = new HashMap();
        for (Entry entry : this.c.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf((String) entry.getKey());
            hashMap.put(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), (String) entry.getValue());
        }
        return hashMap;
    }

    public String toString() {
        return n.a(this.c);
    }
}
