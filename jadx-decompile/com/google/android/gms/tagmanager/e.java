package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public class e {
    public static final Object a = new Object();
    public static final String b = "event";
    static final String[] c = "gtm.lifetime".toString().split("\\.");
    private static final Pattern d = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap<b, Integer> e;
    private final Map<String, Object> f;
    private final ReentrantLock g;
    private final LinkedList<Map<String, Object>> h;
    private final c i;
    private final CountDownLatch j;

    interface b {
        void a(Map<String, Object> map);
    }

    interface c {

        public interface a {
            void a(List<a> list);
        }

        void a(a aVar);

        void a(String str);

        void a(List<a> list, long j);
    }

    static final class a {
        public final String a;
        public final Object b;

        a(String str, Object obj) {
            this.a = str;
            this.b = obj;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return Arrays.hashCode(new Integer[]{Integer.valueOf(this.a.hashCode()), Integer.valueOf(this.b.hashCode())});
        }

        public String toString() {
            String str = this.a;
            String valueOf = String.valueOf(this.b.toString());
            return new StringBuilder((String.valueOf(str).length() + 13) + String.valueOf(valueOf).length()).append("Key: ").append(str).append(" value: ").append(valueOf).toString();
        }
    }

    e() {
        this(new c() {
            public void a(a aVar) {
                aVar.a(new ArrayList());
            }

            public void a(String str) {
            }

            public void a(List<a> list, long j) {
            }
        });
    }

    e(c cVar) {
        this.i = cVar;
        this.e = new ConcurrentHashMap();
        this.f = new HashMap();
        this.g = new ReentrantLock();
        this.h = new LinkedList();
        this.j = new CountDownLatch(1);
        a();
    }

    public static Map<String, Object> a(Object... objArr) {
        if (objArr.length % 2 != 0) {
            throw new IllegalArgumentException("expected even number of key-value pairs");
        }
        Map<String, Object> hashMap = new HashMap();
        int i = 0;
        while (i < objArr.length) {
            if (objArr[i] instanceof String) {
                hashMap.put((String) objArr[i], objArr[i + 1]);
                i += 2;
            } else {
                String valueOf = String.valueOf(objArr[i]);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 21).append("key is not a string: ").append(valueOf).toString());
            }
        }
        return hashMap;
    }

    private void a() {
        this.i.a(new a(this) {
            final /* synthetic */ e a;

            {
                this.a = r1;
            }

            public void a(List<a> list) {
                for (a aVar : list) {
                    this.a.b(this.a.b(aVar.a, aVar.b));
                }
                this.a.j.countDown();
            }
        });
    }

    private void a(Map<String, Object> map, String str, Collection<a> collection) {
        for (Entry entry : map.entrySet()) {
            String str2 = str.length() == 0 ? "" : ".";
            String str3 = (String) entry.getKey();
            str3 = new StringBuilder(((String.valueOf(str).length() + 0) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(str2).append(str3).toString();
            if (entry.getValue() instanceof Map) {
                a((Map) entry.getValue(), str3, collection);
            } else if (!str3.equals("gtm.lifetime")) {
                collection.add(new a(str3, entry.getValue()));
            }
        }
    }

    static Long b(String str) {
        String str2;
        String valueOf;
        Matcher matcher = d.matcher(str);
        if (matcher.matches()) {
            long parseLong;
            try {
                parseLong = Long.parseLong(matcher.group(1));
            } catch (NumberFormatException e) {
                str2 = "illegal number in _lifetime value: ";
                valueOf = String.valueOf(str);
                aw.b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                parseLong = 0;
            }
            if (parseLong <= 0) {
                str2 = "non-positive _lifetime: ";
                valueOf = String.valueOf(str);
                aw.c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            }
            valueOf = matcher.group(2);
            if (valueOf.length() == 0) {
                return Long.valueOf(parseLong);
            }
            switch (valueOf.charAt(0)) {
                case 'd':
                    return Long.valueOf((((parseLong * 1000) * 60) * 60) * 24);
                case 'h':
                    return Long.valueOf(((parseLong * 1000) * 60) * 60);
                case 'm':
                    return Long.valueOf((parseLong * 1000) * 60);
                case Opcodes.DREM /*115*/:
                    return Long.valueOf(parseLong * 1000);
                default:
                    str2 = "unknown units in _lifetime: ";
                    valueOf = String.valueOf(str);
                    aw.b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    return null;
            }
        }
        str2 = "unknown _lifetime: ";
        valueOf = String.valueOf(str);
        aw.c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return null;
    }

    public static List<Object> b(Object... objArr) {
        List<Object> arrayList = new ArrayList();
        for (Object add : objArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    private void b() {
        int i = 0;
        while (true) {
            Map map = (Map) this.h.poll();
            if (map != null) {
                g(map);
                int i2 = i + 1;
                if (i2 > 500) {
                    this.h.clear();
                    throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    private void b(Map<String, Object> map) {
        this.g.lock();
        try {
            this.h.offer(map);
            if (this.g.getHoldCount() == 1) {
                b();
            }
            c((Map) map);
        } finally {
            this.g.unlock();
        }
    }

    private void c(Map<String, Object> map) {
        Long d = d(map);
        if (d != null) {
            List f = f(map);
            f.remove("gtm.lifetime");
            this.i.a(f, d.longValue());
        }
    }

    private Long d(Map<String, Object> map) {
        Object e = e(map);
        return e == null ? null : b(e.toString());
    }

    private Object e(Map<String, Object> map) {
        String[] strArr = c;
        int length = strArr.length;
        int i = 0;
        Object obj = map;
        while (i < length) {
            Object obj2 = strArr[i];
            if (!(obj instanceof Map)) {
                return null;
            }
            i++;
            obj = ((Map) obj).get(obj2);
        }
        return obj;
    }

    private List<a> f(Map<String, Object> map) {
        Object arrayList = new ArrayList();
        a(map, "", arrayList);
        return arrayList;
    }

    private void g(Map<String, Object> map) {
        synchronized (this.f) {
            for (String str : map.keySet()) {
                a(b(str, map.get(str)), this.f);
            }
        }
        h(map);
    }

    private void h(Map<String, Object> map) {
        for (b a : this.e.keySet()) {
            a.a(map);
        }
    }

    void a(b bVar) {
        this.e.put(bVar, Integer.valueOf(0));
    }

    void a(String str) {
        a(str, null);
        this.i.a(str);
    }

    public void a(String str, Object obj) {
        a(b(str, obj));
    }

    public void a(String str, Map<String, Object> map) {
        Map hashMap = new HashMap(map);
        hashMap.put(b, str);
        a(hashMap);
    }

    void a(List<Object> list, List<Object> list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                a((List) obj, (List) list2.get(i));
            } else if (obj instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                a((Map) obj, (Map) list2.get(i));
            } else if (obj != a) {
                list2.set(i, obj);
            }
        }
    }

    public void a(Map<String, Object> map) {
        try {
            this.j.await();
        } catch (InterruptedException e) {
            aw.b("DataLayer.push: unexpected InterruptedException");
        }
        b((Map) map);
    }

    void a(Map<String, Object> map, Map<String, Object> map2) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                if (!(map2.get(str) instanceof List)) {
                    map2.put(str, new ArrayList());
                }
                a((List) obj, (List) map2.get(str));
            } else if (obj instanceof Map) {
                if (!(map2.get(str) instanceof Map)) {
                    map2.put(str, new HashMap());
                }
                a((Map) obj, (Map) map2.get(str));
            } else {
                map2.put(str, obj);
            }
        }
    }

    Map<String, Object> b(String str, Object obj) {
        Map hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i = 0;
        Map map = hashMap;
        while (i < split.length - 1) {
            HashMap hashMap2 = new HashMap();
            map.put(split[i], hashMap2);
            i++;
            Object obj2 = hashMap2;
        }
        map.put(split[split.length - 1], obj);
        return hashMap;
    }

    public Object c(String str) {
        synchronized (this.f) {
            Map map = this.f;
            String[] split = str.split("\\.");
            int length = split.length;
            Object obj = map;
            int i = 0;
            while (i < length) {
                Object obj2 = split[i];
                if (obj instanceof Map) {
                    obj2 = ((Map) obj).get(obj2);
                    if (obj2 == null) {
                        return null;
                    }
                    i++;
                    obj = obj2;
                } else {
                    return null;
                }
            }
            return obj;
        }
    }

    public String toString() {
        String stringBuilder;
        synchronized (this.f) {
            StringBuilder stringBuilder2 = new StringBuilder();
            for (Entry entry : this.f.entrySet()) {
                stringBuilder2.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[]{entry.getKey(), entry.getValue()}));
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }
}
