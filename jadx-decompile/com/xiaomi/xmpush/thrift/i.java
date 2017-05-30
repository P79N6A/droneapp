package com.xiaomi.xmpush.thrift;

import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.a.b.a.b;
import org.a.b.a.c;
import org.a.b.a.g;
import org.a.b.b.e;
import org.a.b.b.f;
import org.a.b.b.h;
import org.a.b.b.j;

public class i implements Serializable, Cloneable, org.a.b.a<i, a> {
    public static final Map<a, b> e;
    private static final j f = new j("GPS");
    private static final org.a.b.b.b g = new org.a.b.b.b(com.google.firebase.a.a.b.p, (byte) 12, (short) 1);
    private static final org.a.b.b.b h = new org.a.b.b.b("provider", (byte) 11, (short) 2);
    private static final org.a.b.b.b i = new org.a.b.b.b("period", (byte) 10, (short) 3);
    private static final org.a.b.b.b j = new org.a.b.b.b("accuracy", (byte) 4, (short) 4);
    public l a;
    public String b;
    public long c;
    public double d;
    private BitSet k = new BitSet(2);

    public enum a {
        LOCATION((short) 1, com.google.firebase.a.a.b.p),
        PROVIDER((short) 2, "provider"),
        PERIOD((short) 3, "period"),
        ACCURACY((short) 4, "accuracy");
        
        private static final Map<String, a> e = null;
        private final short f;
        private final String g;

        static {
            e = new HashMap();
            Iterator it = EnumSet.allOf(a.class).iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                e.put(aVar.a(), aVar);
            }
        }

        private a(short s, String str) {
            this.f = s;
            this.g = str;
        }

        public String a() {
            return this.g;
        }
    }

    static {
        Map enumMap = new EnumMap(a.class);
        enumMap.put(a.LOCATION, new b(com.google.firebase.a.a.b.p, (byte) 1, new g((byte) 12, l.class)));
        enumMap.put(a.PROVIDER, new b("provider", (byte) 2, new c((byte) 11)));
        enumMap.put(a.PERIOD, new b("period", (byte) 2, new c((byte) 10)));
        enumMap.put(a.ACCURACY, new b("accuracy", (byte) 2, new c((byte) 4)));
        e = Collections.unmodifiableMap(enumMap);
        b.a(i.class, e);
    }

    public i a(double d) {
        this.d = d;
        b(true);
        return this;
    }

    public i a(long j) {
        this.c = j;
        a(true);
        return this;
    }

    public i a(l lVar) {
        this.a = lVar;
        return this;
    }

    public i a(String str) {
        this.b = str;
        return this;
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
                    if (i.b != (byte) 12) {
                        h.a(eVar, i.b);
                        break;
                    }
                    this.a = new l();
                    this.a.a(eVar);
                    break;
                case (short) 2:
                    if (i.b != (byte) 11) {
                        h.a(eVar, i.b);
                        break;
                    } else {
                        this.b = eVar.w();
                        break;
                    }
                case (short) 3:
                    if (i.b != (byte) 10) {
                        h.a(eVar, i.b);
                        break;
                    }
                    this.c = eVar.u();
                    a(true);
                    break;
                case (short) 4:
                    if (i.b != (byte) 4) {
                        h.a(eVar, i.b);
                        break;
                    }
                    this.d = eVar.v();
                    b(true);
                    break;
                default:
                    h.a(eVar, i.b);
                    break;
            }
            eVar.j();
        }
    }

    public void a(boolean z) {
        this.k.set(0, z);
    }

    public boolean a() {
        return this.a != null;
    }

    public boolean a(i iVar) {
        if (iVar == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = iVar.a();
        if ((a || a2) && (!a || !a2 || !this.a.a(iVar.a))) {
            return false;
        }
        a = b();
        a2 = iVar.b();
        if ((a || a2) && (!a || !a2 || !this.b.equals(iVar.b))) {
            return false;
        }
        a = c();
        a2 = iVar.c();
        if ((a || a2) && (!a || !a2 || this.c != iVar.c)) {
            return false;
        }
        a = d();
        a2 = iVar.d();
        return !(a || a2) || (a && a2 && this.d == iVar.d);
    }

    public int b(i iVar) {
        if (!getClass().equals(iVar.getClass())) {
            return getClass().getName().compareTo(iVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(iVar.a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (a()) {
            compareTo = org.a.b.b.a(this.a, iVar.a);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(b()).compareTo(Boolean.valueOf(iVar.b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (b()) {
            compareTo = org.a.b.b.a(this.b, iVar.b);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(c()).compareTo(Boolean.valueOf(iVar.c()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (c()) {
            compareTo = org.a.b.b.a(this.c, iVar.c);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iVar.d()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (d()) {
            compareTo = org.a.b.b.a(this.d, iVar.d);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public void b(e eVar) {
        e();
        eVar.a(f);
        if (this.a != null) {
            eVar.a(g);
            this.a.b(eVar);
            eVar.b();
        }
        if (this.b != null && b()) {
            eVar.a(h);
            eVar.a(this.b);
            eVar.b();
        }
        if (c()) {
            eVar.a(i);
            eVar.a(this.c);
            eVar.b();
        }
        if (d()) {
            eVar.a(j);
            eVar.a(this.d);
            eVar.b();
        }
        eVar.c();
        eVar.a();
    }

    public void b(boolean z) {
        this.k.set(1, z);
    }

    public boolean b() {
        return this.b != null;
    }

    public boolean c() {
        return this.k.get(0);
    }

    public /* synthetic */ int compareTo(Object obj) {
        return b((i) obj);
    }

    public boolean d() {
        return this.k.get(1);
    }

    public void e() {
        if (this.a == null) {
            throw new f("Required field 'location' was not present! Struct: " + toString());
        }
    }

    public boolean equals(Object obj) {
        return (obj != null && (obj instanceof i)) ? a((i) obj) : false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GPS(");
        stringBuilder.append("location:");
        if (this.a == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(this.a);
        }
        if (b()) {
            stringBuilder.append(", ");
            stringBuilder.append("provider:");
            if (this.b == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.b);
            }
        }
        if (c()) {
            stringBuilder.append(", ");
            stringBuilder.append("period:");
            stringBuilder.append(this.c);
        }
        if (d()) {
            stringBuilder.append(", ");
            stringBuilder.append("accuracy:");
            stringBuilder.append(this.d);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
