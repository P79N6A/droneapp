package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class c {
    private final Map<String, String> a;
    private final List<Command> b;
    private final long c;
    private final long d;
    private final int e;
    private final boolean f;
    private final String g;

    public c(s sVar, Map<String, String> map, long j, boolean z) {
        this(sVar, map, j, z, 0, 0, null);
    }

    public c(s sVar, Map<String, String> map, long j, boolean z, long j2, int i) {
        this(sVar, map, j, z, j2, i, null);
    }

    public c(s sVar, Map<String, String> map, long j, boolean z, long j2, int i, List<Command> list) {
        d.a((Object) sVar);
        d.a((Object) map);
        this.d = j;
        this.f = z;
        this.c = j2;
        this.e = i;
        this.b = list != null ? list : Collections.emptyList();
        this.g = a((List) list);
        Map hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            String a;
            if (a(entry.getKey())) {
                a = a(sVar, entry.getKey());
                if (a != null) {
                    hashMap.put(a, b(sVar, entry.getValue()));
                }
            }
        }
        for (Entry entry2 : map.entrySet()) {
            if (!a(entry2.getKey())) {
                a = a(sVar, entry2.getKey());
                if (a != null) {
                    hashMap.put(a, b(sVar, entry2.getValue()));
                }
            }
        }
        if (!TextUtils.isEmpty(this.g)) {
            p.a(hashMap, "_v", this.g);
            if (this.g.equals("ma4.0.0") || this.g.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.a = Collections.unmodifiableMap(hashMap);
    }

    public static c a(s sVar, c cVar, Map<String, String> map) {
        return new c(sVar, map, cVar.d(), cVar.f(), cVar.c(), cVar.a(), cVar.e());
    }

    private static String a(s sVar, Object obj) {
        if (obj == null) {
            return null;
        }
        Object obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            sVar.c("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        return TextUtils.isEmpty(obj2) ? null : obj2;
    }

    private String a(String str, String str2) {
        d.a(str);
        d.b(!str.startsWith("&"), "Short param name required");
        String str3 = (String) this.a.get(str);
        return str3 != null ? str3 : str2;
    }

    private static String a(List<Command> list) {
        CharSequence b;
        if (list != null) {
            for (Command command : list) {
                if ("appendVersion".equals(command.a())) {
                    b = command.b();
                    break;
                }
            }
        }
        b = null;
        return TextUtils.isEmpty(b) ? null : b;
    }

    private static boolean a(Object obj) {
        return obj == null ? false : obj.toString().startsWith("&");
    }

    private static String b(s sVar, Object obj) {
        String obj2 = obj == null ? "" : obj.toString();
        int length = obj2.length();
        if (length <= 8192) {
            return obj2;
        }
        obj2 = obj2.substring(0, 8192);
        sVar.c("Hit param value is too long and will be trimmed", Integer.valueOf(length), obj2);
        return obj2;
    }

    public int a() {
        return this.e;
    }

    public Map<String, String> b() {
        return this.a;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.d;
    }

    public List<Command> e() {
        return this.b;
    }

    public boolean f() {
        return this.f;
    }

    public long g() {
        return p.b(a("_s", "0"));
    }

    public String h() {
        return a("_m", "");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ht=").append(this.d);
        if (this.c != 0) {
            stringBuffer.append(", dbId=").append(this.c);
        }
        if (this.e != 0) {
            stringBuffer.append(", appUID=").append(this.e);
        }
        List<String> arrayList = new ArrayList(this.a.keySet());
        Collections.sort(arrayList);
        for (String str : arrayList) {
            stringBuffer.append(", ");
            stringBuffer.append(str);
            stringBuffer.append("=");
            stringBuffer.append((String) this.a.get(str));
        }
        return stringBuffer.toString();
    }
}
