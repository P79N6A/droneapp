package com.google.android.gms.appdatasearch;

import java.util.HashMap;
import java.util.Map;

public class h {
    private static final String[] a = new String[]{"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    private static final Map<String, Integer> b = new HashMap(a.length);

    static {
        int i = 0;
        while (i < a.length) {
            b.put(a[i], Integer.valueOf(i));
            i++;
        }
    }

    public static int a() {
        return a.length;
    }

    public static int a(String str) {
        Integer num = (Integer) b.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 44).append("[").append(str).append("] is not a valid global search section name").toString());
    }

    public static String a(int i) {
        return (i < 0 || i >= a.length) ? null : a[i];
    }
}
