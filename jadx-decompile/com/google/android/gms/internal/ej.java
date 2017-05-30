package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import com.google.firebase.a.a.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class ej extends ea<String> {
    private static final Map<String, aqe> c;
    private final String b;

    static {
        Map hashMap = new HashMap();
        hashMap.put("charAt", new ah());
        hashMap.put("concat", new ai());
        hashMap.put("hasOwnProperty", r.a);
        hashMap.put("indexOf", new aj());
        hashMap.put("lastIndexOf", new ak());
        hashMap.put("match", new al());
        hashMap.put("replace", new am());
        hashMap.put(a.o, new an());
        hashMap.put("slice", new ao());
        hashMap.put("split", new ap());
        hashMap.put("substring", new aq());
        hashMap.put("toLocaleLowerCase", new ar());
        hashMap.put("toLocaleUpperCase", new as());
        hashMap.put("toLowerCase", new at());
        hashMap.put("toUpperCase", new av());
        hashMap.put("toString", new au());
        hashMap.put("trim", new aw());
        c = Collections.unmodifiableMap(hashMap);
    }

    public ej(String str) {
        d.a(str);
        this.b = str;
    }

    public ea<?> a(int i) {
        return (i < 0 || i >= this.b.length()) ? ee.e : new ej(String.valueOf(this.b.charAt(i)));
    }

    public Iterator<ea<?>> a() {
        return new Iterator<ea<?>>(this) {
            final /* synthetic */ ej a;
            private int b = 0;

            {
                this.a = r2;
            }

            public ea<?> a() {
                if (this.b >= this.a.b.length()) {
                    throw new NoSuchElementException();
                }
                int i = this.b;
                this.b = i + 1;
                return new ec(Double.valueOf((double) i));
            }

            public boolean hasNext() {
                return this.b < this.a.b.length();
            }

            public /* synthetic */ Object next() {
                return a();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public /* synthetic */ Object b() {
        return d();
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

    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return this == obj ? true : obj instanceof ej ? this.b.equals((String) ((ej) obj).b()) : false;
    }

    public String toString() {
        return this.b.toString();
    }
}
