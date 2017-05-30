package com.xiaomi.xmpush.thrift;

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
    public static final Map<a, org.a.b.a.b> c;
    private static final j d = new j("Cellular");
    private static final org.a.b.b.b e = new org.a.b.b.b("id", (byte) 8, (short) 1);
    private static final org.a.b.b.b f = new org.a.b.b.b("signalStrength", (byte) 8, (short) 2);
    public int a;
    public int b;
    private BitSet g = new BitSet(2);

    public enum a {
        ID((short) 1, "id"),
        SIGNAL_STRENGTH((short) 2, "signalStrength");
        
        private static final Map<String, a> c = null;
        private final short d;
        private final String e;

        static {
            c = new HashMap();
            Iterator it = EnumSet.allOf(a.class).iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                c.put(aVar.a(), aVar);
            }
        }

        private a(short s, String str) {
            this.d = s;
            this.e = str;
        }

        public String a() {
            return this.e;
        }
    }

    static {
        Map enumMap = new EnumMap(a.class);
        enumMap.put(a.ID, new org.a.b.a.b("id", (byte) 1, new c((byte) 8)));
        enumMap.put(a.SIGNAL_STRENGTH, new org.a.b.a.b("signalStrength", (byte) 1, new c((byte) 8)));
        c = Collections.unmodifiableMap(enumMap);
        org.a.b.a.b.a(b.class, c);
    }

    public b a(int i) {
        this.a = i;
        a(true);
        return this;
    }

    public void a(e eVar) {
        eVar.g();
        while (true) {
            org.a.b.b.b i = eVar.i();
            if (i.b == (byte) 0) {
                eVar.h();
                if (!a()) {
                    throw new f("Required field 'id' was not found in serialized data! Struct: " + toString());
                } else if (b()) {
                    c();
                    return;
                } else {
                    throw new f("Required field 'signalStrength' was not found in serialized data! Struct: " + toString());
                }
            }
            switch (i.c) {
                case (short) 1:
                    if (i.b != (byte) 8) {
                        h.a(eVar, i.b);
                        break;
                    }
                    this.a = eVar.t();
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
                default:
                    h.a(eVar, i.b);
                    break;
            }
            eVar.j();
        }
    }

    public void a(boolean z) {
        this.g.set(0, z);
    }

    public boolean a() {
        return this.g.get(0);
    }

    public boolean a(b bVar) {
        return bVar != null && this.a == bVar.a && this.b == bVar.b;
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
        return 0;
    }

    public b b(int i) {
        this.b = i;
        b(true);
        return this;
    }

    public void b(e eVar) {
        c();
        eVar.a(d);
        eVar.a(e);
        eVar.a(this.a);
        eVar.b();
        eVar.a(f);
        eVar.a(this.b);
        eVar.b();
        eVar.c();
        eVar.a();
    }

    public void b(boolean z) {
        this.g.set(1, z);
    }

    public boolean b() {
        return this.g.get(1);
    }

    public void c() {
    }

    public /* synthetic */ int compareTo(Object obj) {
        return b((b) obj);
    }

    public boolean equals(Object obj) {
        return (obj != null && (obj instanceof b)) ? a((b) obj) : false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Cellular(");
        stringBuilder.append("id:");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append("signalStrength:");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
