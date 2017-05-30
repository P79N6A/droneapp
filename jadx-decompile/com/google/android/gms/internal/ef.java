package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public final class ef extends ea<List<ea<?>>> {
    private static final Map<String, aqe> c;
    private final ArrayList<ea<?>> b;

    static {
        Map hashMap = new HashMap();
        hashMap.put("concat", new aqh());
        hashMap.put("every", new aqi());
        hashMap.put("filter", new aqj());
        hashMap.put("forEach", new aqk());
        hashMap.put("indexOf", new aql());
        hashMap.put("hasOwnProperty", r.a);
        hashMap.put("join", new aqm());
        hashMap.put("lastIndexOf", new aqo());
        hashMap.put("map", new aqp());
        hashMap.put("pop", new aqq());
        hashMap.put("push", new aqr());
        hashMap.put("reduce", new aqs());
        hashMap.put("reduceRight", new aqt());
        hashMap.put("reverse", new aqu());
        hashMap.put("shift", new aqv());
        hashMap.put("slice", new aqw());
        hashMap.put("some", new aqx());
        hashMap.put("sort", new aqy());
        hashMap.put("splice", new aqz());
        hashMap.put("toString", new au());
        hashMap.put("unshift", new ara());
        c = Collections.unmodifiableMap(hashMap);
    }

    public ef(List<ea<?>> list) {
        d.a(list);
        this.b = new ArrayList(list);
    }

    public Iterator<ea<?>> a() {
        final Iterator anonymousClass1 = new Iterator<ea<?>>(this) {
            final /* synthetic */ ef a;
            private int b = 0;

            {
                this.a = r2;
            }

            public ea<?> a() {
                if (this.b >= this.a.b.size()) {
                    throw new NoSuchElementException();
                }
                for (int i = this.b; i < this.a.b.size(); i++) {
                    if (this.a.b.get(i) != null) {
                        this.b = i;
                        int i2 = this.b;
                        this.b = i2 + 1;
                        return new ec(Double.valueOf((double) i2));
                    }
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                for (int i = this.b; i < this.a.b.size(); i++) {
                    if (this.a.b.get(i) != null) {
                        return true;
                    }
                }
                return false;
            }

            public /* synthetic */ Object next() {
                return a();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        final Iterator c = super.c();
        return new Iterator<ea<?>>(this) {
            final /* synthetic */ ef c;

            public ea<?> a() {
                return anonymousClass1.hasNext() ? (ea) anonymousClass1.next() : (ea) c.next();
            }

            public boolean hasNext() {
                return anonymousClass1.hasNext() || c.hasNext();
            }

            public /* synthetic */ Object next() {
                return a();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public void a(int i) {
        d.b(i >= 0, "Invalid array length");
        if (this.b.size() != i) {
            if (this.b.size() < i) {
                this.b.ensureCapacity(i);
                for (int size = this.b.size(); size < i; size++) {
                    this.b.add(null);
                }
                return;
            }
            this.b.subList(i, this.b.size()).clear();
        }
    }

    public void a(int i, ea<?> eaVar) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i >= this.b.size()) {
            a(i + 1);
        }
        this.b.set(i, eaVar);
    }

    public ea<?> b(int i) {
        if (i < 0 || i >= this.b.size()) {
            return ee.e;
        }
        ea<?> eaVar = (ea) this.b.get(i);
        return eaVar == null ? ee.e : eaVar;
    }

    public /* synthetic */ Object b() {
        return d();
    }

    public boolean c(int i) {
        return i >= 0 && i < this.b.size() && this.b.get(i) != null;
    }

    public boolean c(String str) {
        return c.containsKey(str);
    }

    public aqe d(String str) {
        if (c(str)) {
            return (aqe) c.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 51).append("Native Method ").append(str).append(" is not defined for type ListWrapper.").toString());
    }

    public List<ea<?>> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef)) {
            return false;
        }
        List list = (List) ((ef) obj).b();
        if (this.b.size() != list.size()) {
            return false;
        }
        int i = 0;
        boolean z = true;
        while (i < this.b.size()) {
            boolean equals = this.b.get(i) == null ? list.get(i) == null : ((ea) this.b.get(i)).equals(list.get(i));
            if (!equals) {
                return equals;
            }
            i++;
            z = equals;
        }
        return z;
    }

    public String toString() {
        return this.b.toString();
    }
}
