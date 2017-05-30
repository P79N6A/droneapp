package com.google.android.gms.internal;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;

public class ma {
    private final String a;
    private final Map<String, Object> b;

    public ma(String str, Map<String, Object> map) {
        this.a = str;
        this.b = map;
    }

    public static ma a(String str) {
        if (!str.startsWith("gauth|")) {
            return null;
        }
        try {
            Map a = mb.a(str.substring("gauth|".length()));
            return new ma((String) a.get(Constants.EXTRA_KEY_TOKEN), (Map) a.get("auth"));
        } catch (Throwable e) {
            throw new RuntimeException("Failed to parse gauth token", e);
        }
    }

    public String a() {
        return this.a;
    }

    public Map<String, Object> b() {
        return this.b;
    }
}
