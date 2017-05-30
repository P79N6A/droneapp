package com.xiaomi.xmpush.thrift;

import com.tencent.open.SocialConstants;
import java.io.Serializable;
import java.util.BitSet;
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

public class x implements Serializable, Cloneable, org.a.b.a<x, a> {
    public static final Map<a, b> l;
    private static final j m = new j("XmPushActionAckNotification");
    private static final org.a.b.b.b n = new org.a.b.b.b(com.mi.live.openlivesdk.a.c, (byte) 11, (short) 1);
    private static final org.a.b.b.b o = new org.a.b.b.b("target", (byte) 12, (short) 2);
    private static final org.a.b.b.b p = new org.a.b.b.b("id", (byte) 11, (short) 3);
    private static final org.a.b.b.b q = new org.a.b.b.b("appId", (byte) 11, (short) 4);
    private static final org.a.b.b.b r = new org.a.b.b.b("type", (byte) 11, (short) 5);
    private static final org.a.b.b.b s = new org.a.b.b.b(SocialConstants.TYPE_REQUEST, (byte) 12, (short) 6);
    private static final org.a.b.b.b t = new org.a.b.b.b("errorCode", (byte) 10, (short) 7);
    private static final org.a.b.b.b u = new org.a.b.b.b("reason", (byte) 11, (short) 8);
    private static final org.a.b.b.b v = new org.a.b.b.b("extra", (byte) 13, (short) 9);
    private static final org.a.b.b.b w = new org.a.b.b.b(com.xiaomi.market.sdk.j.W, (byte) 11, (short) 10);
    private static final org.a.b.b.b x = new org.a.b.b.b("category", (byte) 11, (short) 11);
    public String a;
    public u b;
    public String c;
    public String d;
    public String e;
    public ae f;
    public long g;
    public String h;
    public Map<String, String> i;
    public String j;
    public String k;
    private BitSet y = new BitSet(1);

    public enum a {
        DEBUG((short) 1, com.mi.live.openlivesdk.a.c),
        TARGET((short) 2, "target"),
        ID((short) 3, "id"),
        APP_ID((short) 4, "appId"),
        TYPE((short) 5, "type"),
        REQUEST((short) 6, SocialConstants.TYPE_REQUEST),
        ERROR_CODE((short) 7, "errorCode"),
        REASON((short) 8, "reason"),
        EXTRA((short) 9, "extra"),
        PACKAGE_NAME((short) 10, com.xiaomi.market.sdk.j.W),
        CATEGORY((short) 11, "category");
        
        private static final Map<String, a> l = null;
        private final short m;
        private final String n;

        static {
            l = new HashMap();
            Iterator it = EnumSet.allOf(a.class).iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                l.put(aVar.a(), aVar);
            }
        }

        private a(short s, String str) {
            this.m = s;
            this.n = str;
        }

        public String a() {
            return this.n;
        }
    }

    static {
        Map enumMap = new EnumMap(a.class);
        enumMap.put(a.DEBUG, new b(com.mi.live.openlivesdk.a.c, (byte) 2, new c((byte) 11)));
        enumMap.put(a.TARGET, new b("target", (byte) 2, new g((byte) 12, u.class)));
        enumMap.put(a.ID, new b("id", (byte) 1, new c((byte) 11)));
        enumMap.put(a.APP_ID, new b("appId", (byte) 2, new c((byte) 11)));
        enumMap.put(a.TYPE, new b("type", (byte) 2, new c((byte) 11)));
        enumMap.put(a.REQUEST, new b(SocialConstants.TYPE_REQUEST, (byte) 2, new g((byte) 12, ae.class)));
        enumMap.put(a.ERROR_CODE, new b("errorCode", (byte) 1, new c((byte) 10)));
        enumMap.put(a.REASON, new b("reason", (byte) 2, new c((byte) 11)));
        enumMap.put(a.EXTRA, new b("extra", (byte) 2, new e((byte) 13, new c((byte) 11), new c((byte) 11))));
        enumMap.put(a.PACKAGE_NAME, new b(com.xiaomi.market.sdk.j.W, (byte) 2, new c((byte) 11)));
        enumMap.put(a.CATEGORY, new b("category", (byte) 2, new c((byte) 11)));
        l = Collections.unmodifiableMap(enumMap);
        b.a(x.class, l);
    }

    public void a(org.a.b.b.e eVar) {
        eVar.g();
        while (true) {
            org.a.b.b.b i = eVar.i();
            if (i.b == (byte) 0) {
                eVar.h();
                if (h()) {
                    m();
                    return;
                }
                throw new f("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
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
                    if (i.b != (byte) 11) {
                        h.a(eVar, i.b);
                        break;
                    } else {
                        this.e = eVar.w();
                        break;
                    }
                case (short) 6:
                    if (i.b != (byte) 12) {
                        h.a(eVar, i.b);
                        break;
                    }
                    this.f = new ae();
                    this.f.a(eVar);
                    break;
                case (short) 7:
                    if (i.b != (byte) 10) {
                        h.a(eVar, i.b);
                        break;
                    }
                    this.g = eVar.u();
                    a(true);
                    break;
                case (short) 8:
                    if (i.b != (byte) 11) {
                        h.a(eVar, i.b);
                        break;
                    } else {
                        this.h = eVar.w();
                        break;
                    }
                case (short) 9:
                    if (i.b != (byte) 13) {
                        h.a(eVar, i.b);
                        break;
                    }
                    d k = eVar.k();
                    this.i = new HashMap(k.c * 2);
                    for (int i2 = 0; i2 < k.c; i2++) {
                        this.i.put(eVar.w(), eVar.w());
                    }
                    eVar.l();
                    break;
                case (short) 10:
                    if (i.b != (byte) 11) {
                        h.a(eVar, i.b);
                        break;
                    } else {
                        this.j = eVar.w();
                        break;
                    }
                case (short) 11:
                    if (i.b != (byte) 11) {
                        h.a(eVar, i.b);
                        break;
                    } else {
                        this.k = eVar.w();
                        break;
                    }
                default:
                    h.a(eVar, i.b);
                    break;
            }
            eVar.j();
        }
    }

    public void a(boolean z) {
        this.y.set(0, z);
    }

    public boolean a() {
        return this.a != null;
    }

    public boolean a(x xVar) {
        if (xVar == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = xVar.a();
        if ((a || a2) && (!a || !a2 || !this.a.equals(xVar.a))) {
            return false;
        }
        a = b();
        a2 = xVar.b();
        if ((a || a2) && (!a || !a2 || !this.b.a(xVar.b))) {
            return false;
        }
        a = d();
        a2 = xVar.d();
        if ((a || a2) && (!a || !a2 || !this.c.equals(xVar.c))) {
            return false;
        }
        a = e();
        a2 = xVar.e();
        if ((a || a2) && (!a || !a2 || !this.d.equals(xVar.d))) {
            return false;
        }
        a = f();
        a2 = xVar.f();
        if ((a || a2) && (!a || !a2 || !this.e.equals(xVar.e))) {
            return false;
        }
        a = g();
        a2 = xVar.g();
        if (((a || a2) && (!a || !a2 || !this.f.a(xVar.f))) || this.g != xVar.g) {
            return false;
        }
        a = i();
        a2 = xVar.i();
        if ((a || a2) && (!a || !a2 || !this.h.equals(xVar.h))) {
            return false;
        }
        a = j();
        a2 = xVar.j();
        if ((a || a2) && (!a || !a2 || !this.i.equals(xVar.i))) {
            return false;
        }
        a = k();
        a2 = xVar.k();
        if ((a || a2) && (!a || !a2 || !this.j.equals(xVar.j))) {
            return false;
        }
        a = l();
        a2 = xVar.l();
        return !(a || a2) || (a && a2 && this.k.equals(xVar.k));
    }

    public int b(x xVar) {
        if (!getClass().equals(xVar.getClass())) {
            return getClass().getName().compareTo(xVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(xVar.a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (a()) {
            compareTo = org.a.b.b.a(this.a, xVar.a);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(b()).compareTo(Boolean.valueOf(xVar.b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (b()) {
            compareTo = org.a.b.b.a(this.b, xVar.b);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(d()).compareTo(Boolean.valueOf(xVar.d()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (d()) {
            compareTo = org.a.b.b.a(this.c, xVar.c);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(e()).compareTo(Boolean.valueOf(xVar.e()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (e()) {
            compareTo = org.a.b.b.a(this.d, xVar.d);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(f()).compareTo(Boolean.valueOf(xVar.f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (f()) {
            compareTo = org.a.b.b.a(this.e, xVar.e);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(g()).compareTo(Boolean.valueOf(xVar.g()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (g()) {
            compareTo = org.a.b.b.a(this.f, xVar.f);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(h()).compareTo(Boolean.valueOf(xVar.h()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (h()) {
            compareTo = org.a.b.b.a(this.g, xVar.g);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(i()).compareTo(Boolean.valueOf(xVar.i()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (i()) {
            compareTo = org.a.b.b.a(this.h, xVar.h);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(j()).compareTo(Boolean.valueOf(xVar.j()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (j()) {
            compareTo = org.a.b.b.a(this.i, xVar.i);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(k()).compareTo(Boolean.valueOf(xVar.k()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (k()) {
            compareTo = org.a.b.b.a(this.j, xVar.j);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(l()).compareTo(Boolean.valueOf(xVar.l()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (l()) {
            compareTo = org.a.b.b.a(this.k, xVar.k);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public void b(org.a.b.b.e eVar) {
        m();
        eVar.a(m);
        if (this.a != null && a()) {
            eVar.a(n);
            eVar.a(this.a);
            eVar.b();
        }
        if (this.b != null && b()) {
            eVar.a(o);
            this.b.b(eVar);
            eVar.b();
        }
        if (this.c != null) {
            eVar.a(p);
            eVar.a(this.c);
            eVar.b();
        }
        if (this.d != null && e()) {
            eVar.a(q);
            eVar.a(this.d);
            eVar.b();
        }
        if (this.e != null && f()) {
            eVar.a(r);
            eVar.a(this.e);
            eVar.b();
        }
        if (this.f != null && g()) {
            eVar.a(s);
            this.f.b(eVar);
            eVar.b();
        }
        eVar.a(t);
        eVar.a(this.g);
        eVar.b();
        if (this.h != null && i()) {
            eVar.a(u);
            eVar.a(this.h);
            eVar.b();
        }
        if (this.i != null && j()) {
            eVar.a(v);
            eVar.a(new d((byte) 11, (byte) 11, this.i.size()));
            for (Entry entry : this.i.entrySet()) {
                eVar.a((String) entry.getKey());
                eVar.a((String) entry.getValue());
            }
            eVar.d();
            eVar.b();
        }
        if (this.j != null && k()) {
            eVar.a(w);
            eVar.a(this.j);
            eVar.b();
        }
        if (this.k != null && l()) {
            eVar.a(x);
            eVar.a(this.k);
            eVar.b();
        }
        eVar.c();
        eVar.a();
    }

    public boolean b() {
        return this.b != null;
    }

    public String c() {
        return this.c;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return b((x) obj);
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean e() {
        return this.d != null;
    }

    public boolean equals(Object obj) {
        return (obj != null && (obj instanceof x)) ? a((x) obj) : false;
    }

    public boolean f() {
        return this.e != null;
    }

    public boolean g() {
        return this.f != null;
    }

    public boolean h() {
        return this.y.get(0);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.h != null;
    }

    public boolean j() {
        return this.i != null;
    }

    public boolean k() {
        return this.j != null;
    }

    public boolean l() {
        return this.k != null;
    }

    public void m() {
        if (this.c == null) {
            throw new f("Required field 'id' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        Object obj = null;
        StringBuilder stringBuilder = new StringBuilder("XmPushActionAckNotification(");
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
        if (e()) {
            stringBuilder.append(", ");
            stringBuilder.append("appId:");
            if (this.d == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.d);
            }
        }
        if (f()) {
            stringBuilder.append(", ");
            stringBuilder.append("type:");
            if (this.e == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.e);
            }
        }
        if (g()) {
            stringBuilder.append(", ");
            stringBuilder.append("request:");
            if (this.f == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.f);
            }
        }
        stringBuilder.append(", ");
        stringBuilder.append("errorCode:");
        stringBuilder.append(this.g);
        if (i()) {
            stringBuilder.append(", ");
            stringBuilder.append("reason:");
            if (this.h == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.h);
            }
        }
        if (j()) {
            stringBuilder.append(", ");
            stringBuilder.append("extra:");
            if (this.i == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.i);
            }
        }
        if (k()) {
            stringBuilder.append(", ");
            stringBuilder.append("packageName:");
            if (this.j == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.j);
            }
        }
        if (l()) {
            stringBuilder.append(", ");
            stringBuilder.append("category:");
            if (this.k == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.k);
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
