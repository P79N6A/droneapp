package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class dz {
    private static final String a = new String("");
    private static final Integer b = Integer.valueOf(0);
    private final int c;
    private final Object d;
    private final List<Integer> e;
    private final boolean f;

    public static class a {
        private final Integer a;
        private final Object b;
        private final List<Integer> c = new ArrayList();
        private boolean d = false;

        public a(int i, Object obj) {
            this.a = Integer.valueOf(i);
            this.b = obj;
        }

        public a a(int i) {
            this.c.add(Integer.valueOf(i));
            return this;
        }

        public a a(boolean z) {
            this.d = z;
            return this;
        }

        public dz a() {
            d.a(this.a);
            d.a(this.b);
            return new dz(this.a, this.b, this.c, this.d);
        }
    }

    private dz(Integer num, Object obj, List<Integer> list, boolean z) {
        this.c = num.intValue();
        this.d = obj;
        this.e = Collections.unmodifiableList(list);
        this.f = z;
    }

    public int a() {
        return this.c;
    }

    public Object b() {
        return this.d;
    }

    public List<Integer> c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof dz) && ((dz) obj).b().equals(this.d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        if (this.d != null) {
            return this.d.toString();
        }
        aph.a("Fail to convert a null object to string");
        return a;
    }
}
