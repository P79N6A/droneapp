package com.google.android.gms.internal;

import com.google.android.gms.internal.gz.a;
import com.google.firebase.database.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class li {
    public static int a(kv kvVar, lh lhVar, kv kvVar2, lh lhVar2) {
        int compareTo = lhVar.compareTo(lhVar2);
        return compareTo != 0 ? compareTo : kvVar.a(kvVar2);
    }

    public static lh a(Object obj) {
        return a(obj, ll.a());
    }

    public static lh a(Object obj, lh lhVar) {
        try {
            Map map;
            Object obj2;
            List list;
            Map hashMap;
            int i;
            String str;
            lh a;
            Map hashMap2;
            if (obj instanceof Map) {
                map = (Map) obj;
                if (map.containsKey(".priority")) {
                    lhVar = ll.a(map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj2 = map.get(".value");
                    if (obj2 == null) {
                        return la.j();
                    }
                    if (obj2 instanceof String) {
                        return new lo((String) obj2, lhVar);
                    }
                    if (obj2 instanceof Long) {
                        return new lf((Long) obj2, lhVar);
                    }
                    if (obj2 instanceof Integer) {
                        return new lf(Long.valueOf((long) ((Integer) obj2).intValue()), lhVar);
                    }
                    if (obj2 instanceof Double) {
                        return new kz((Double) obj2, lhVar);
                    }
                    if (obj2 instanceof Boolean) {
                        return new ku((Boolean) obj2, lhVar);
                    }
                    if (!(obj2 instanceof Map) || (obj2 instanceof List)) {
                        if (obj2 instanceof Map) {
                            list = (List) obj2;
                            hashMap = new HashMap(list.size());
                            for (i = 0; i < list.size(); i++) {
                                str = i;
                                a = a(list.get(i));
                                if (!a.b()) {
                                    hashMap.put(kv.a(str), a);
                                }
                            }
                            map = hashMap;
                        } else {
                            map = (Map) obj2;
                            if (map.containsKey(".sv")) {
                                return new ky(map, lhVar);
                            }
                            hashMap2 = new HashMap(map.size());
                            for (String str2 : map.keySet()) {
                                if (!str2.startsWith(".")) {
                                    a = a(map.get(str2));
                                    if (!a.b()) {
                                        hashMap2.put(kv.a(str2), a);
                                    }
                                }
                            }
                            map = hashMap2;
                        }
                        return map.isEmpty() ? la.j() : new kw(a.a(map, kw.a), lhVar);
                    } else {
                        String str3 = "Failed to parse node with class ";
                        String valueOf = String.valueOf(obj2.getClass().toString());
                        throw new d(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                }
            }
            obj2 = obj;
            if (obj2 == null) {
                return la.j();
            }
            if (obj2 instanceof String) {
                return new lo((String) obj2, lhVar);
            }
            if (obj2 instanceof Long) {
                return new lf((Long) obj2, lhVar);
            }
            if (obj2 instanceof Integer) {
                return new lf(Long.valueOf((long) ((Integer) obj2).intValue()), lhVar);
            }
            if (obj2 instanceof Double) {
                return new kz((Double) obj2, lhVar);
            }
            if (obj2 instanceof Boolean) {
                return new ku((Boolean) obj2, lhVar);
            }
            if (obj2 instanceof Map) {
            }
            if (obj2 instanceof Map) {
                list = (List) obj2;
                hashMap = new HashMap(list.size());
                for (i = 0; i < list.size(); i++) {
                    str = i;
                    a = a(list.get(i));
                    if (!a.b()) {
                        hashMap.put(kv.a(str), a);
                    }
                }
                map = hashMap;
            } else {
                map = (Map) obj2;
                if (map.containsKey(".sv")) {
                    return new ky(map, lhVar);
                }
                hashMap2 = new HashMap(map.size());
                for (String str22 : map.keySet()) {
                    if (!str22.startsWith(".")) {
                        a = a(map.get(str22));
                        if (!a.b()) {
                            hashMap2.put(kv.a(str22), a);
                        }
                    }
                }
                map = hashMap2;
            }
            if (map.isEmpty()) {
            }
        } catch (Throwable e) {
            throw new d("Failed to parse node", e);
        }
    }
}
