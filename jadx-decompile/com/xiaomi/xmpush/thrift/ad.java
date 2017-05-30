package com.xiaomi.xmpush.thrift;

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

public class ad implements Serializable, Cloneable, org.a.b.a<ad, a> {
    public static final Map<a, b> d;
    private static final j e = new j("XmPushActionNormalConfig");
    private static final org.a.b.b.b f = new org.a.b.b.b("normalConfigs", (byte) 15, (short) 1);
    private static final org.a.b.b.b g = new org.a.b.b.b("appId", (byte) 10, (short) 4);
    private static final org.a.b.b.b h = new org.a.b.b.b(com.xiaomi.market.sdk.j.W, (byte) 11, (short) 5);
    public List<n> a;
    public long b;
    public String c;
    private BitSet i = new BitSet(1);

    public enum a {
        NORMAL_CONFIGS((short) 1, "normalConfigs"),
        APP_ID((short) 4, "appId"),
        PACKAGE_NAME((short) 5, com.xiaomi.market.sdk.j.W);
        
        private static final Map<String, a> d = null;
        private final short e;
        private final String f;

        static {
            d = new HashMap();
            Iterator it = EnumSet.allOf(a.class).iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                d.put(aVar.a(), aVar);
            }
        }

        private a(short s, String str) {
            this.e = s;
            this.f = str;
        }

        public String a() {
            return this.f;
        }
    }

    static {
        Map enumMap = new EnumMap(a.class);
        enumMap.put(a.NORMAL_CONFIGS, new b("normalConfigs", (byte) 1, new d((byte) 15, new g((byte) 12, n.class))));
        enumMap.put(a.APP_ID, new b("appId", (byte) 2, new c((byte) 10)));
        enumMap.put(a.PACKAGE_NAME, new b(com.xiaomi.market.sdk.j.W, (byte) 2, new c((byte) 11)));
        d = Collections.unmodifiableMap(enumMap);
        b.a(ad.class, d);
    }

    public List<n> a() {
        return this.a;
    }

    public void a(e eVar) {
        eVar.g();
        while (true) {
            org.a.b.b.b i = eVar.i();
            if (i.b == (byte) 0) {
                eVar.h();
                e();
                return;
            }
            switch (i.c) {
                case (short) 1:
                    if (i.b != (byte) 15) {
                        h.a(eVar, i.b);
                        break;
                    }
                    org.a.b.b.c m = eVar.m();
                    this.a = new ArrayList(m.b);
                    for (int i2 = 0; i2 < m.b; i2++) {
                        n nVar = new n();
                        nVar.a(eVar);
                        this.a.add(nVar);
                    }
                    eVar.n();
                    break;
                case (short) 4:
                    if (i.b != (byte) 10) {
                        h.a(eVar, i.b);
                        break;
                    }
                    this.b = eVar.u();
                    a(true);
                    break;
                case (short) 5:
                    if (i.b != (byte) 11) {
                        h.a(eVar, i.b);
                        break;
                    } else {
                        this.c = eVar.w();
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
        this.i.set(0, z);
    }

    public boolean a(ad adVar) {
        if (adVar == null) {
            return false;
        }
        boolean b = b();
        boolean b2 = adVar.b();
        if ((b || b2) && (!b || !b2 || !this.a.equals(adVar.a))) {
            return false;
        }
        b = c();
        b2 = adVar.c();
        if ((b || b2) && (!b || !b2 || this.b != adVar.b)) {
            return false;
        }
        b = d();
        b2 = adVar.d();
        return !(b || b2) || (b && b2 && this.c.equals(adVar.c));
    }

    public int b(ad adVar) {
        if (!getClass().equals(adVar.getClass())) {
            return getClass().getName().compareTo(adVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(b()).compareTo(Boolean.valueOf(adVar.b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (b()) {
            compareTo = org.a.b.b.a(this.a, adVar.a);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(c()).compareTo(Boolean.valueOf(adVar.c()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (c()) {
            compareTo = org.a.b.b.a(this.b, adVar.b);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(d()).compareTo(Boolean.valueOf(adVar.d()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (d()) {
            compareTo = org.a.b.b.a(this.c, adVar.c);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public void b(e eVar) {
        e();
        eVar.a(e);
        if (this.a != null) {
            eVar.a(f);
            eVar.a(new org.a.b.b.c((byte) 12, this.a.size()));
            for (n b : this.a) {
                b.b(eVar);
            }
            eVar.e();
            eVar.b();
        }
        if (c()) {
            eVar.a(g);
            eVar.a(this.b);
            eVar.b();
        }
        if (this.c != null && d()) {
            eVar.a(h);
            eVar.a(this.c);
            eVar.b();
        }
        eVar.c();
        eVar.a();
    }

    public boolean b() {
        return this.a != null;
    }

    public boolean c() {
        return this.i.get(0);
    }

    public /* synthetic */ int compareTo(Object obj) {
        return b((ad) obj);
    }

    public boolean d() {
        return this.c != null;
    }

    public void e() {
        if (this.a == null) {
            throw new f("Required field 'normalConfigs' was not present! Struct: " + toString());
        }
    }

    public boolean equals(Object obj) {
        return (obj != null && (obj instanceof ad)) ? a((ad) obj) : false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("XmPushActionNormalConfig(");
        stringBuilder.append("normalConfigs:");
        if (this.a == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(this.a);
        }
        if (c()) {
            stringBuilder.append(", ");
            stringBuilder.append("appId:");
            stringBuilder.append(this.b);
        }
        if (d()) {
            stringBuilder.append(", ");
            stringBuilder.append("packageName:");
            if (this.c == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.c);
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
