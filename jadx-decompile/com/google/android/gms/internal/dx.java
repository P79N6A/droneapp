package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class dx {
    private final List<dw> a;
    private final List<dw> b;
    private final List<dw> c;
    private final List<dw> d;

    public static class a {
        private final List<dw> a = new ArrayList();
        private final List<dw> b = new ArrayList();
        private final List<dw> c = new ArrayList();
        private final List<dw> d = new ArrayList();

        public a a(dw dwVar) {
            this.a.add(dwVar);
            return this;
        }

        public dx a() {
            return new dx(this.a, this.b, this.c, this.d);
        }

        public a b(dw dwVar) {
            this.b.add(dwVar);
            return this;
        }

        public a c(dw dwVar) {
            this.c.add(dwVar);
            return this;
        }

        public a d(dw dwVar) {
            this.d.add(dwVar);
            return this;
        }
    }

    private dx(List<dw> list, List<dw> list2, List<dw> list3, List<dw> list4) {
        this.a = Collections.unmodifiableList(list);
        this.b = Collections.unmodifiableList(list2);
        this.c = Collections.unmodifiableList(list3);
        this.d = Collections.unmodifiableList(list4);
    }

    public List<dw> a() {
        return this.a;
    }

    public List<dw> b() {
        return this.b;
    }

    public List<dw> c() {
        return this.c;
    }

    public List<dw> d() {
        return this.d;
    }

    public String toString() {
        String valueOf = String.valueOf(a());
        String valueOf2 = String.valueOf(b());
        String valueOf3 = String.valueOf(c());
        String valueOf4 = String.valueOf(d());
        return new StringBuilder((((String.valueOf(valueOf).length() + 71) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("Positive predicates: ").append(valueOf).append("  Negative predicates: ").append(valueOf2).append("  Add tags: ").append(valueOf3).append("  Remove tags: ").append(valueOf4).toString();
    }
}
