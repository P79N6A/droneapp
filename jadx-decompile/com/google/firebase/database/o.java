package com.google.firebase.database;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class o {
    public static final Map<String, String> a = a("timestamp");

    private static Map<String, String> a(String str) {
        Map hashMap = new HashMap();
        hashMap.put(".sv", str);
        return Collections.unmodifiableMap(hashMap);
    }
}
