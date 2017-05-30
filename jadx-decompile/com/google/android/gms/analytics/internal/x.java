package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class x {
    private final long a;
    private final String b;
    private final String c;
    private final boolean d;
    private long e;
    private final Map<String, String> f;

    public x(long j, String str, String str2, boolean z, long j2, Map<String, String> map) {
        d.a(str);
        d.a(str2);
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = j2;
        if (map != null) {
            this.f = new HashMap(map);
        } else {
            this.f = Collections.emptyMap();
        }
    }

    public long a() {
        return this.a;
    }

    public void a(long j) {
        this.e = j;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public long e() {
        return this.e;
    }

    public Map<String, String> f() {
        return this.f;
    }
}
