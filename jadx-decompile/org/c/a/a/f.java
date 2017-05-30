package org.c.a.a;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class f extends c {

    private static class a extends org.c.a.a.a.a {
        public a(List<Class<?>> list) {
            this(new HashSet(list));
        }

        public a(Set<Class<?>> set) {
            super(true, set, true, null);
        }

        public String a() {
            return "includes " + super.a();
        }
    }

    protected org.c.e.a.a a(List<Class<?>> list) {
        return new a((List) list);
    }
}
