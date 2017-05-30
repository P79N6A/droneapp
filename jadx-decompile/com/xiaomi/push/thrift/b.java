package com.xiaomi.push.thrift;

import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.a.b.a.c;
import org.a.b.b.e;
import org.a.b.b.f;
import org.a.b.b.h;
import org.a.b.b.j;

public class b implements Serializable, Cloneable, org.a.b.a<b, a> {
    public static final Map<a, org.a.b.a.b> k;
    private static final j l = new j("StatsEvent");
    private static final org.a.b.b.b m = new org.a.b.b.b("chid", (byte) 3, (short) 1);
    private static final org.a.b.b.b n = new org.a.b.b.b("type", (byte) 8, (short) 2);
    private static final org.a.b.b.b o = new org.a.b.b.b("value", (byte) 8, (short) 3);
    private static final org.a.b.b.b p = new org.a.b.b.b("connpt", (byte) 11, (short) 4);
    private static final org.a.b.b.b q = new org.a.b.b.b(com.xiaomi.market.sdk.j.HOST, (byte) 11, (short) 5);
    private static final org.a.b.b.b r = new org.a.b.b.b("subvalue", (byte) 8, (short) 6);
    private static final org.a.b.b.b s = new org.a.b.b.b("annotation", (byte) 11, (short) 7);
    private static final org.a.b.b.b t = new org.a.b.b.b("user", (byte) 11, (short) 8);
    private static final org.a.b.b.b u = new org.a.b.b.b(com.fimi.soul.utils.a.b.a.i, (byte) 8, (short) 9);
    private static final org.a.b.b.b v = new org.a.b.b.b("clientIp", (byte) 8, (short) 10);
    public byte a;
    public int b;
    public int c;
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public int i;
    public int j;
    private BitSet w = new BitSet(6);

    public enum a {
        CHID((short) 1, "chid"),
        TYPE((short) 2, "type"),
        VALUE((short) 3, "value"),
        CONNPT((short) 4, "connpt"),
        HOST((short) 5, com.xiaomi.market.sdk.j.HOST),
        SUBVALUE((short) 6, "subvalue"),
        ANNOTATION((short) 7, "annotation"),
        USER((short) 8, "user"),
        TIME((short) 9, com.fimi.soul.utils.a.b.a.i),
        CLIENT_IP((short) 10, "clientIp");
        
        private static final Map<String, a> k = null;
        private final short l;
        private final String m;

        static {
            k = new HashMap();
            Iterator it = EnumSet.allOf(a.class).iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                k.put(aVar.a(), aVar);
            }
        }

        private a(short s, String str) {
            this.l = s;
            this.m = str;
        }

        public String a() {
            return this.m;
        }
    }

    static {
        Map enumMap = new EnumMap(a.class);
        enumMap.put(a.CHID, new org.a.b.a.b("chid", (byte) 1, new c((byte) 3)));
        enumMap.put(a.TYPE, new org.a.b.a.b("type", (byte) 1, new c((byte) 8)));
        enumMap.put(a.VALUE, new org.a.b.a.b("value", (byte) 1, new c((byte) 8)));
        enumMap.put(a.CONNPT, new org.a.b.a.b("connpt", (byte) 1, new c((byte) 11)));
        enumMap.put(a.HOST, new org.a.b.a.b(com.xiaomi.market.sdk.j.HOST, (byte) 2, new c((byte) 11)));
        enumMap.put(a.SUBVALUE, new org.a.b.a.b("subvalue", (byte) 2, new c((byte) 8)));
        enumMap.put(a.ANNOTATION, new org.a.b.a.b("annotation", (byte) 2, new c((byte) 11)));
        enumMap.put(a.USER, new org.a.b.a.b("user", (byte) 2, new c((byte) 11)));
        enumMap.put(a.TIME, new org.a.b.a.b(com.fimi.soul.utils.a.b.a.i, (byte) 2, new c((byte) 8)));
        enumMap.put(a.CLIENT_IP, new org.a.b.a.b("clientIp", (byte) 2, new c((byte) 8)));
        k = Collections.unmodifiableMap(enumMap);
        org.a.b.a.b.a(b.class, k);
    }

    public b a(byte b) {
        this.a = b;
        a(true);
        return this;
    }

    public b a(int i) {
        this.b = i;
        b(true);
        return this;
    }

    public b a(String str) {
        this.d = str;
        return this;
    }

    public void a(e eVar) {
        eVar.g();
        while (true) {
            org.a.b.b.b i = eVar.i();
            if (i.b == (byte) 0) {
                eVar.h();
                if (!a()) {
                    throw new f("Required field 'chid' was not found in serialized data! Struct: " + toString());
                } else if (!b()) {
                    throw new f("Required field 'type' was not found in serialized data! Struct: " + toString());
                } else if (c()) {
                    k();
                    return;
                } else {
                    throw new f("Required field 'value' was not found in serialized data! Struct: " + toString());
                }
            }
            switch (i.c) {
                case (short) 1:
                    if (i.b != (byte) 3) {
                        h.a(eVar, i.b);
                        break;
                    }
                    this.a = eVar.r();
                    a(true);
                    break;
                case (short) 2:
                    if (i.b != (byte) 8) {
                        h.a(eVar, i.b);
                        break;
                    }
                    this.b = eVar.t();
                    b(true);
                    break;
                case (short) 3:
                    if (i.b != (byte) 8) {
                        h.a(eVar, i.b);
                        break;
                    }
                    this.c = eVar.t();
                    c(true);
                    break;
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
                    if (i.b != (byte) 8) {
                        h.a(eVar, i.b);
                        break;
                    }
                    this.f = eVar.t();
                    d(true);
                    break;
                case (short) 7:
                    if (i.b != (byte) 11) {
                        h.a(eVar, i.b);
                        break;
                    } else {
                        this.g = eVar.w();
                        break;
                    }
                case (short) 8:
                    if (i.b != (byte) 11) {
                        h.a(eVar, i.b);
                        break;
                    } else {
                        this.h = eVar.w();
                        break;
                    }
                case (short) 9:
                    if (i.b != (byte) 8) {
                        h.a(eVar, i.b);
                        break;
                    }
                    this.i = eVar.t();
                    e(true);
                    break;
                case (short) 10:
                    if (i.b != (byte) 8) {
                        h.a(eVar, i.b);
                        break;
                    }
                    this.j = eVar.t();
                    f(true);
                    break;
                default:
                    h.a(eVar, i.b);
                    break;
            }
            eVar.j();
        }
    }

    public void a(boolean z) {
        this.w.set(0, z);
    }

    public boolean a() {
        return this.w.get(0);
    }

    public boolean a(b bVar) {
        if (bVar == null || this.a != bVar.a || this.b != bVar.b || this.c != bVar.c) {
            return false;
        }
        boolean d = d();
        boolean d2 = bVar.d();
        if ((d || d2) && (!d || !d2 || !this.d.equals(bVar.d))) {
            return false;
        }
        d = e();
        d2 = bVar.e();
        if ((d || d2) && (!d || !d2 || !this.e.equals(bVar.e))) {
            return false;
        }
        d = f();
        d2 = bVar.f();
        if ((d || d2) && (!d || !d2 || this.f != bVar.f)) {
            return false;
        }
        d = g();
        d2 = bVar.g();
        if ((d || d2) && (!d || !d2 || !this.g.equals(bVar.g))) {
            return false;
        }
        d = h();
        d2 = bVar.h();
        if ((d || d2) && (!d || !d2 || !this.h.equals(bVar.h))) {
            return false;
        }
        d = i();
        d2 = bVar.i();
        if ((d || d2) && (!d || !d2 || this.i != bVar.i)) {
            return false;
        }
        d = j();
        d2 = bVar.j();
        return !(d || d2) || (d && d2 && this.j == bVar.j);
    }

    public int b(b bVar) {
        if (!getClass().equals(bVar.getClass())) {
            return getClass().getName().compareTo(bVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(bVar.a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (a()) {
            compareTo = org.a.b.b.a(this.a, bVar.a);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(b()).compareTo(Boolean.valueOf(bVar.b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (b()) {
            compareTo = org.a.b.b.a(this.b, bVar.b);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(c()).compareTo(Boolean.valueOf(bVar.c()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (c()) {
            compareTo = org.a.b.b.a(this.c, bVar.c);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(d()).compareTo(Boolean.valueOf(bVar.d()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (d()) {
            compareTo = org.a.b.b.a(this.d, bVar.d);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(e()).compareTo(Boolean.valueOf(bVar.e()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (e()) {
            compareTo = org.a.b.b.a(this.e, bVar.e);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(f()).compareTo(Boolean.valueOf(bVar.f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (f()) {
            compareTo = org.a.b.b.a(this.f, bVar.f);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(g()).compareTo(Boolean.valueOf(bVar.g()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (g()) {
            compareTo = org.a.b.b.a(this.g, bVar.g);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(h()).compareTo(Boolean.valueOf(bVar.h()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (h()) {
            compareTo = org.a.b.b.a(this.h, bVar.h);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(i()).compareTo(Boolean.valueOf(bVar.i()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (i()) {
            compareTo = org.a.b.b.a(this.i, bVar.i);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(j()).compareTo(Boolean.valueOf(bVar.j()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (j()) {
            compareTo = org.a.b.b.a(this.j, bVar.j);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public b b(int i) {
        this.c = i;
        c(true);
        return this;
    }

    public b b(String str) {
        this.e = str;
        return this;
    }

    public void b(e eVar) {
        k();
        eVar.a(l);
        eVar.a(m);
        eVar.a(this.a);
        eVar.b();
        eVar.a(n);
        eVar.a(this.b);
        eVar.b();
        eVar.a(o);
        eVar.a(this.c);
        eVar.b();
        if (this.d != null) {
            eVar.a(p);
            eVar.a(this.d);
            eVar.b();
        }
        if (this.e != null && e()) {
            eVar.a(q);
            eVar.a(this.e);
            eVar.b();
        }
        if (f()) {
            eVar.a(r);
            eVar.a(this.f);
            eVar.b();
        }
        if (this.g != null && g()) {
            eVar.a(s);
            eVar.a(this.g);
            eVar.b();
        }
        if (this.h != null && h()) {
            eVar.a(t);
            eVar.a(this.h);
            eVar.b();
        }
        if (i()) {
            eVar.a(u);
            eVar.a(this.i);
            eVar.b();
        }
        if (j()) {
            eVar.a(v);
            eVar.a(this.j);
            eVar.b();
        }
        eVar.c();
        eVar.a();
    }

    public void b(boolean z) {
        this.w.set(1, z);
    }

    public boolean b() {
        return this.w.get(1);
    }

    public b c(int i) {
        this.f = i;
        d(true);
        return this;
    }

    public b c(String str) {
        this.g = str;
        return this;
    }

    public void c(boolean z) {
        this.w.set(2, z);
    }

    public boolean c() {
        return this.w.get(2);
    }

    public /* synthetic */ int compareTo(Object obj) {
        return b((b) obj);
    }

    public b d(int i) {
        this.i = i;
        e(true);
        return this;
    }

    public b d(String str) {
        this.h = str;
        return this;
    }

    public void d(boolean z) {
        this.w.set(3, z);
    }

    public boolean d() {
        return this.d != null;
    }

    public b e(int i) {
        this.j = i;
        f(true);
        return this;
    }

    public void e(boolean z) {
        this.w.set(4, z);
    }

    public boolean e() {
        return this.e != null;
    }

    public boolean equals(Object obj) {
        return (obj != null && (obj instanceof b)) ? a((b) obj) : false;
    }

    public void f(boolean z) {
        this.w.set(5, z);
    }

    public boolean f() {
        return this.w.get(3);
    }

    public boolean g() {
        return this.g != null;
    }

    public boolean h() {
        return this.h != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.w.get(4);
    }

    public boolean j() {
        return this.w.get(5);
    }

    public void k() {
        if (this.d == null) {
            throw new f("Required field 'connpt' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("StatsEvent(");
        stringBuilder.append("chid:");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append("type:");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append("value:");
        stringBuilder.append(this.c);
        stringBuilder.append(", ");
        stringBuilder.append("connpt:");
        if (this.d == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(this.d);
        }
        if (e()) {
            stringBuilder.append(", ");
            stringBuilder.append("host:");
            if (this.e == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.e);
            }
        }
        if (f()) {
            stringBuilder.append(", ");
            stringBuilder.append("subvalue:");
            stringBuilder.append(this.f);
        }
        if (g()) {
            stringBuilder.append(", ");
            stringBuilder.append("annotation:");
            if (this.g == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.g);
            }
        }
        if (h()) {
            stringBuilder.append(", ");
            stringBuilder.append("user:");
            if (this.h == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.h);
            }
        }
        if (i()) {
            stringBuilder.append(", ");
            stringBuilder.append("time:");
            stringBuilder.append(this.i);
        }
        if (j()) {
            stringBuilder.append(", ");
            stringBuilder.append("clientIp:");
            stringBuilder.append(this.j);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
