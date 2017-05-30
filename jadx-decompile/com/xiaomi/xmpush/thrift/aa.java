package com.xiaomi.xmpush.thrift;

import com.tencent.open.SocialConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.a.b.a.b;
import org.a.b.a.c;
import org.a.b.a.d;
import org.a.b.a.g;
import org.a.b.b.e;
import org.a.b.b.f;
import org.a.b.b.h;
import org.a.b.b.j;

public class aa implements Serializable, Cloneable, org.a.b.a<aa, a> {
    public static final Map<a, b> l;
    private static final j m = new j("XmPushActionCommandResult");
    private static final org.a.b.b.b n = new org.a.b.b.b(com.mi.live.openlivesdk.a.c, (byte) 11, (short) 1);
    private static final org.a.b.b.b o = new org.a.b.b.b("target", (byte) 12, (short) 2);
    private static final org.a.b.b.b p = new org.a.b.b.b("id", (byte) 11, (short) 3);
    private static final org.a.b.b.b q = new org.a.b.b.b("appId", (byte) 11, (short) 4);
    private static final org.a.b.b.b r = new org.a.b.b.b("cmdName", (byte) 11, (short) 5);
    private static final org.a.b.b.b s = new org.a.b.b.b(SocialConstants.TYPE_REQUEST, (byte) 12, (short) 6);
    private static final org.a.b.b.b t = new org.a.b.b.b("errorCode", (byte) 10, (short) 7);
    private static final org.a.b.b.b u = new org.a.b.b.b("reason", (byte) 11, (short) 8);
    private static final org.a.b.b.b v = new org.a.b.b.b(com.xiaomi.market.sdk.j.W, (byte) 11, (short) 9);
    private static final org.a.b.b.b w = new org.a.b.b.b("cmdArgs", (byte) 15, (short) 10);
    private static final org.a.b.b.b x = new org.a.b.b.b("category", (byte) 11, (short) 12);
    public String a;
    public u b;
    public String c;
    public String d;
    public String e;
    public z f;
    public long g;
    public String h;
    public String i;
    public List<String> j;
    public String k;
    private BitSet y = new BitSet(1);

    public enum a {
        DEBUG((short) 1, com.mi.live.openlivesdk.a.c),
        TARGET((short) 2, "target"),
        ID((short) 3, "id"),
        APP_ID((short) 4, "appId"),
        CMD_NAME((short) 5, "cmdName"),
        REQUEST((short) 6, SocialConstants.TYPE_REQUEST),
        ERROR_CODE((short) 7, "errorCode"),
        REASON((short) 8, "reason"),
        PACKAGE_NAME((short) 9, com.xiaomi.market.sdk.j.W),
        CMD_ARGS((short) 10, "cmdArgs"),
        CATEGORY((short) 12, "category");
        
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
        enumMap.put(a.APP_ID, new b("appId", (byte) 1, new c((byte) 11)));
        enumMap.put(a.CMD_NAME, new b("cmdName", (byte) 1, new c((byte) 11)));
        enumMap.put(a.REQUEST, new b(SocialConstants.TYPE_REQUEST, (byte) 2, new g((byte) 12, z.class)));
        enumMap.put(a.ERROR_CODE, new b("errorCode", (byte) 1, new c((byte) 10)));
        enumMap.put(a.REASON, new b("reason", (byte) 2, new c((byte) 11)));
        enumMap.put(a.PACKAGE_NAME, new b(com.xiaomi.market.sdk.j.W, (byte) 2, new c((byte) 11)));
        enumMap.put(a.CMD_ARGS, new b("cmdArgs", (byte) 2, new d((byte) 15, new c((byte) 11))));
        enumMap.put(a.CATEGORY, new b("category", (byte) 2, new c((byte) 11)));
        l = Collections.unmodifiableMap(enumMap);
        b.a(aa.class, l);
    }

    public void a(e eVar) {
        eVar.g();
        while (true) {
            org.a.b.b.b i = eVar.i();
            if (i.b == (byte) 0) {
                eVar.h();
                if (h()) {
                    o();
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
                    this.f = new z();
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
                    if (i.b != (byte) 11) {
                        h.a(eVar, i.b);
                        break;
                    } else {
                        this.i = eVar.w();
                        break;
                    }
                case (short) 10:
                    if (i.b != (byte) 15) {
                        h.a(eVar, i.b);
                        break;
                    }
                    org.a.b.b.c m = eVar.m();
                    this.j = new ArrayList(m.b);
                    for (int i2 = 0; i2 < m.b; i2++) {
                        this.j.add(eVar.w());
                    }
                    eVar.n();
                    break;
                case (short) 12:
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

    public boolean a(aa aaVar) {
        if (aaVar == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = aaVar.a();
        if ((a || a2) && (!a || !a2 || !this.a.equals(aaVar.a))) {
            return false;
        }
        a = b();
        a2 = aaVar.b();
        if ((a || a2) && (!a || !a2 || !this.b.a(aaVar.b))) {
            return false;
        }
        a = c();
        a2 = aaVar.c();
        if ((a || a2) && (!a || !a2 || !this.c.equals(aaVar.c))) {
            return false;
        }
        a = d();
        a2 = aaVar.d();
        if ((a || a2) && (!a || !a2 || !this.d.equals(aaVar.d))) {
            return false;
        }
        a = f();
        a2 = aaVar.f();
        if ((a || a2) && (!a || !a2 || !this.e.equals(aaVar.e))) {
            return false;
        }
        a = g();
        a2 = aaVar.g();
        if (((a || a2) && (!a || !a2 || !this.f.a(aaVar.f))) || this.g != aaVar.g) {
            return false;
        }
        a = i();
        a2 = aaVar.i();
        if ((a || a2) && (!a || !a2 || !this.h.equals(aaVar.h))) {
            return false;
        }
        a = j();
        a2 = aaVar.j();
        if ((a || a2) && (!a || !a2 || !this.i.equals(aaVar.i))) {
            return false;
        }
        a = l();
        a2 = aaVar.l();
        if ((a || a2) && (!a || !a2 || !this.j.equals(aaVar.j))) {
            return false;
        }
        a = n();
        a2 = aaVar.n();
        return !(a || a2) || (a && a2 && this.k.equals(aaVar.k));
    }

    public int b(aa aaVar) {
        if (!getClass().equals(aaVar.getClass())) {
            return getClass().getName().compareTo(aaVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(aaVar.a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (a()) {
            compareTo = org.a.b.b.a(this.a, aaVar.a);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(b()).compareTo(Boolean.valueOf(aaVar.b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (b()) {
            compareTo = org.a.b.b.a(this.b, aaVar.b);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(c()).compareTo(Boolean.valueOf(aaVar.c()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (c()) {
            compareTo = org.a.b.b.a(this.c, aaVar.c);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(d()).compareTo(Boolean.valueOf(aaVar.d()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (d()) {
            compareTo = org.a.b.b.a(this.d, aaVar.d);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(f()).compareTo(Boolean.valueOf(aaVar.f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (f()) {
            compareTo = org.a.b.b.a(this.e, aaVar.e);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(g()).compareTo(Boolean.valueOf(aaVar.g()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (g()) {
            compareTo = org.a.b.b.a(this.f, aaVar.f);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(h()).compareTo(Boolean.valueOf(aaVar.h()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (h()) {
            compareTo = org.a.b.b.a(this.g, aaVar.g);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(i()).compareTo(Boolean.valueOf(aaVar.i()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (i()) {
            compareTo = org.a.b.b.a(this.h, aaVar.h);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(j()).compareTo(Boolean.valueOf(aaVar.j()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (j()) {
            compareTo = org.a.b.b.a(this.i, aaVar.i);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(l()).compareTo(Boolean.valueOf(aaVar.l()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (l()) {
            compareTo = org.a.b.b.a(this.j, aaVar.j);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(n()).compareTo(Boolean.valueOf(aaVar.n()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (n()) {
            compareTo = org.a.b.b.a(this.k, aaVar.k);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public void b(e eVar) {
        o();
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
        if (this.d != null) {
            eVar.a(q);
            eVar.a(this.d);
            eVar.b();
        }
        if (this.e != null) {
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
            eVar.a(this.i);
            eVar.b();
        }
        if (this.j != null && l()) {
            eVar.a(w);
            eVar.a(new org.a.b.b.c((byte) 11, this.j.size()));
            for (String a : this.j) {
                eVar.a(a);
            }
            eVar.e();
            eVar.b();
        }
        if (this.k != null && n()) {
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

    public boolean c() {
        return this.c != null;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return b((aa) obj);
    }

    public boolean d() {
        return this.d != null;
    }

    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        return (obj != null && (obj instanceof aa)) ? a((aa) obj) : false;
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

    public List<String> k() {
        return this.j;
    }

    public boolean l() {
        return this.j != null;
    }

    public String m() {
        return this.k;
    }

    public boolean n() {
        return this.k != null;
    }

    public void o() {
        if (this.c == null) {
            throw new f("Required field 'id' was not present! Struct: " + toString());
        } else if (this.d == null) {
            throw new f("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.e == null) {
            throw new f("Required field 'cmdName' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        Object obj = null;
        StringBuilder stringBuilder = new StringBuilder("XmPushActionCommandResult(");
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
        stringBuilder.append(", ");
        stringBuilder.append("cmdName:");
        if (this.e == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(this.e);
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
            stringBuilder.append("packageName:");
            if (this.i == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.i);
            }
        }
        if (l()) {
            stringBuilder.append(", ");
            stringBuilder.append("cmdArgs:");
            if (this.j == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.j);
            }
        }
        if (n()) {
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
