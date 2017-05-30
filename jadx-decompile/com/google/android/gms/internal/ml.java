package com.google.android.gms.internal;

import com.google.firebase.database.d;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class ml {
    private static final Pattern a = Pattern.compile("[\\[\\]\\.#$]");
    private static final Pattern b = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    public static Map<ij, lh> a(ij ijVar, Map<String, Object> map) {
        Map treeMap = new TreeMap();
        for (Entry entry : map.entrySet()) {
            ij ijVar2 = new ij((String) entry.getKey());
            Object value = entry.getValue();
            iz.a(ijVar.a(ijVar2), value);
            String e = !ijVar2.h() ? ijVar2.g().e() : "";
            if (e.equals(".sv") || e.equals(".value")) {
                String valueOf = String.valueOf(ijVar2);
                throw new d(new StringBuilder((String.valueOf(valueOf).length() + 40) + String.valueOf(e).length()).append("Path '").append(valueOf).append("' contains disallowed child name: ").append(e).toString());
            } else if (!e.equals(".priority") || ll.a(li.a(value))) {
                a(value);
                treeMap.put(ijVar2, li.a(value));
            } else {
                String valueOf2 = String.valueOf(ijVar2);
                throw new d(new StringBuilder(String.valueOf(valueOf2).length() + 83).append("Path '").append(valueOf2).append("' contains invalid priority (must be a string, double, ServerValue, or null).").toString());
            }
        }
        ij ijVar3 = null;
        for (ij ijVar4 : treeMap.keySet()) {
            boolean z = ijVar3 == null || ijVar3.c(ijVar4) < 0;
            mk.a(z);
            if (ijVar3 == null || !ijVar3.b(ijVar4)) {
                ijVar3 = ijVar4;
            } else {
                valueOf2 = String.valueOf(ijVar3);
                e = String.valueOf(ijVar4);
                throw new d(new StringBuilder((String.valueOf(valueOf2).length() + 42) + String.valueOf(e).length()).append("Path '").append(valueOf2).append("' is an ancestor of '").append(e).append("' in an update.").toString());
            }
        }
        return treeMap;
    }

    public static void a(ij ijVar) {
        if (!b(ijVar)) {
            String str = "Invalid write location: ";
            String valueOf = String.valueOf(ijVar.toString());
            throw new d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    public static void a(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (!map.containsKey(".sv")) {
                for (Entry entry : map.entrySet()) {
                    d((String) entry.getKey());
                    a(entry.getValue());
                }
            }
        } else if (obj instanceof List) {
            for (Object a : (List) obj) {
                a(a);
            }
        }
    }

    public static void a(String str) {
        if (!e(str)) {
            throw new d(new StringBuilder(String.valueOf(str).length() + 101).append("Invalid Firebase Database path: ").append(str).append(". Firebase Database paths must not contain '.', '#', '$', '[', or ']'").toString());
        }
    }

    public static void b(String str) {
        if (str.startsWith(".info")) {
            a(str.substring(5));
        } else if (str.startsWith("/.info")) {
            a(str.substring(6));
        } else {
            a(str);
        }
    }

    private static boolean b(ij ijVar) {
        kv d = ijVar.d();
        return d == null || !d.e().startsWith(".");
    }

    public static void c(String str) {
        if (str != null && !g(str)) {
            throw new d(new StringBuilder(String.valueOf(str).length() + 68).append("Invalid key: ").append(str).append(". Keys must not contain '/', '.', '#', '$', '[', or ']'").toString());
        }
    }

    public static void d(String str) {
        if (!f(str)) {
            throw new d(new StringBuilder(String.valueOf(str).length() + 68).append("Invalid key: ").append(str).append(". Keys must not contain '/', '.', '#', '$', '[', or ']'").toString());
        }
    }

    private static boolean e(String str) {
        return !a.matcher(str).find();
    }

    private static boolean f(String str) {
        return str != null && str.length() > 0 && (str.equals(".value") || str.equals(".priority") || !(str.startsWith(".") || b.matcher(str).find()));
    }

    private static boolean g(String str) {
        return str.equals(".info") || !b.matcher(str).find();
    }
}
