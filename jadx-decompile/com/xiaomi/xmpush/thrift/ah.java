package com.xiaomi.xmpush.thrift;

import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.a.b.a.b;
import org.a.b.a.c;
import org.a.b.a.e;
import org.a.b.a.g;
import org.a.b.b.d;
import org.a.b.b.f;
import org.a.b.b.h;
import org.a.b.b.j;

public class ah implements Serializable, Cloneable, org.a.b.a<ah, a> {
    public static final Map<a, b> g;
    private static final j h = new j("XmPushActionSendFeedback");
    private static final org.a.b.b.b i = new org.a.b.b.b(com.mi.live.openlivesdk.a.c, (byte) 11, (short) 1);
    private static final org.a.b.b.b j = new org.a.b.b.b("target", (byte) 12, (short) 2);
    private static final org.a.b.b.b k = new org.a.b.b.b("id", (byte) 11, (short) 3);
    private static final org.a.b.b.b l = new org.a.b.b.b("appId", (byte) 11, (short) 4);
    private static final org.a.b.b.b m = new org.a.b.b.b("feedbacks", (byte) 13, (short) 5);
    private static final org.a.b.b.b n = new org.a.b.b.b("category", (byte) 11, (short) 6);
    public String a;
    public u b;
    public String c;
    public String d;
    public Map<String, String> e;
    public String f;

    public enum a {
        DEBUG((short) 1, com.mi.live.openlivesdk.a.c),
        TARGET((short) 2, "target"),
        ID((short) 3, "id"),
        APP_ID((short) 4, "appId"),
        FEEDBACKS((short) 5, "feedbacks"),
        CATEGORY((short) 6, "category");
        
        private static final Map<String, a> g = null;
        private final short h;
        private final String i;

        static {
            g = new HashMap();
            Iterator it = EnumSet.allOf(a.class).iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                g.put(aVar.a(), aVar);
            }
        }

        private a(short s, String str) {
            this.h = s;
            this.i = str;
        }

        public String a() {
            return this.i;
        }
    }

    static {
        Map enumMap = new EnumMap(a.class);
        enumMap.put(a.DEBUG, new b(com.mi.live.openlivesdk.a.c, (byte) 2, new c((byte) 11)));
        enumMap.put(a.TARGET, new b("target", (byte) 2, new g((byte) 12, u.class)));
        enumMap.put(a.ID, new b("id", (byte) 1, new c((byte) 11)));
        enumMap.put(a.APP_ID, new b("appId", (byte) 1, new c((byte) 11)));
        enumMap.put(a.FEEDBACKS, new b("feedbacks", (byte) 2, new e((byte) 13, new c((byte) 11), new c((byte) 11))));
        enumMap.put(a.CATEGORY, new b("category", (byte) 2, new c((byte) 11)));
        g = Collections.unmodifiableMap(enumMap);
        b.a(ah.class, g);
    }

    public void a(org.a.b.b.e eVar) {
        eVar.g();
        while (true) {
            org.a.b.b.b i = eVar.i();
            if (i.b == (byte) 0) {
                eVar.h();
                g();
                return;
            }
            switch (i.c) {
                case (short) 1:
                    if (i.b != (byte) 11) {
                        h.a(eVar, i.b);
                        break;
                    } else {
                        this.a = eVar.w();
                        break;
                    }
                case (short) 2:
                    if (i.b != (byte) 12) {
                        h.a(eVar, i.b);
                        break;
                    }
                    this.b = new u();
                    this.b.a(eVar);
                    break;
                case (short) 3:
                    if (i.b != (byte) 11) {
                        h.a(eVar, i.b);
                        break;
                    } else {
                        this.c = eVar.w();
                        break;
                    }
                case (short) 4:
                    if (i.b != (byte) 11) {
                        h.a(eVar, i.b);
                        break;
                    } else {
                        this.d = eVar.w();
                        break;
                    }
                case (short) 5:
                    if (i.b != (byte) 13) {
                        h.a(eVar, i.b);
                        break;
                    }
                    d k = eVar.k();
                    this.e = new HashMap(k.c * 2);
                    for (int i2 = 0; i2 < k.c; i2++) {
                        this.e.put(eVar.w(), eVar.w());
                    }
                    eVar.l();
                    break;
                case (short) 6:
                    if (i.b != (byte) 11) {
                        h.a(eVar, i.b);
                        break;
                    } else {
                        this.f = eVar.w();
                        break;
                    }
                default:
                    h.a(eVar, i.b);
                    break;
            }
            eVar.j();
        }
    }

    public boolean a() {
        return this.a != null;
    }

    public boolean a(ah ahVar) {
        if (ahVar == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = ahVar.a();
        if ((a || a2) && (!a || !a2 || !this.a.equals(ahVar.a))) {
            return false;
        }
        a = b();
        a2 = ahVar.b();
        if ((a || a2) && (!a || !a2 || !this.b.a(ahVar.b))) {
            return false;
        }
        a = c();
        a2 = ahVar.c();
        if ((a || a2) && (!a || !a2 || !this.c.equals(ahVar.c))) {
            return false;
        }
        a = d();
        a2 = ahVar.d();
        if ((a || a2) && (!a || !a2 || !this.d.equals(ahVar.d))) {
            return false;
        }
        a = e();
        a2 = ahVar.e();
        if ((a || a2) && (!a || !a2 || !this.e.equals(ahVar.e))) {
            return false;
        }
        a = f();
        a2 = ahVar.f();
        return !(a || a2) || (a && a2 && this.f.equals(ahVar.f));
    }

    public int b(ah ahVar) {
        if (!getClass().equals(ahVar.getClass())) {
            return getClass().getName().compareTo(ahVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(ahVar.a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (a()) {
            compareTo = org.a.b.b.a(this.a, ahVar.a);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ahVar.b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (b()) {
            compareTo = org.a.b.b.a(this.b, ahVar.b);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ahVar.c()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (c()) {
            compareTo = org.a.b.b.a(this.c, ahVar.c);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ahVar.d()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (d()) {
            compareTo = org.a.b.b.a(this.d, ahVar.d);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ahVar.e()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (e()) {
            compareTo = org.a.b.b.a(this.e, ahVar.e);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ahVar.f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (f()) {
            compareTo = org.a.b.b.a(this.f, ahVar.f);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public void b(org.a.b.b.e eVar) {
        g();
        eVar.a(h);
        if (this.a != null && a()) {
            eVar.a(i);
            eVar.a(this.a);
            eVar.b();
        }
        if (this.b != null && b()) {
            eVar.a(j);
            this.b.b(eVar);
            eVar.b();
        }
        if (this.c != null) {
            eVar.a(k);
            eVar.a(this.c);
            eVar.b();
        }
        if (this.d != null) {
            eVar.a(l);
            eVar.a(this.d);
            eVar.b();
        }
        if (this.e != null && e()) {
            eVar.a(m);
            eVar.a(new d((byte) 11, (byte) 11, this.e.size()));
            for (Entry entry : this.e.entrySet()) {
                eVar.a((String) entry.getKey());
                eVar.a((String) entry.getValue());
            }
            eVar.d();
            eVar.b();
        }
        if (this.f != null && f()) {
            eVar.a(n);
            eVar.a(this.f);
            eVar.b();
        }
        eVar.c();
        eVar.a();
    }

    public boolean b() {
        return this.b != null;
    }

    public boolean c() {
        return this.c != null;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return b((ah) obj);
    }

    public boolean d() {
        return this.d != null;
    }

    public boolean e() {
        return this.e != null;
    }

    public boolean equals(Object obj) {
        return (obj != null && (obj instanceof ah)) ? a((ah) obj) : false;
    }

    public boolean f() {
        return this.f != null;
    }

    public void g() {
        if (this.c == null) {
            throw new f("Required field 'id' was not present! Struct: " + toString());
        } else if (this.d == null) {
            throw new f("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        Object obj = null;
        StringBuilder stringBuilder = new StringBuilder("XmPushActionSendFeedback(");
        Object obj2 = 1;
        if (a()) {
            stringBuilder.append("debug:");
            if (this.a == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.a);
            }
            obj2 = null;
        }
        if (b()) {
            if (obj2 == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("target:");
            if (this.b == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.b);
            }
        } else {
            obj = obj2;
        }
        if (obj == null) {
            stringBuilder.append(", ");
        }
        stringBuilder.append("id:");
        if (this.c == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(this.c);
        }
        stringBuilder.append(", ");
        stringBuilder.append("appId:");
        if (this.d == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(this.d);
        }
        if (e()) {
            stringBuilder.append(", ");
            stringBuilder.append("feedbacks:");
            if (this.e == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.e);
            }
        }
        if (f()) {
            stringBuilder.append(", ");
            stringBuilder.append("category:");
            if (this.f == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.f);
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
