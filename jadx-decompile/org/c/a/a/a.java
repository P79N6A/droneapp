package org.c.a.a;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.c.f.a.e;
import org.c.f.a.h;
import org.c.f.g;

public class a extends g {

    public static class a extends org.c.e.a.a {
        private final Set<Class<?>> b;
        private final Set<Class<?>> c;
        private final boolean d;
        private final boolean e;

        protected a(boolean z, Set<Class<?>> set, boolean z2, Set<Class<?>> set2) {
            this.d = z;
            this.e = z2;
            this.b = a((Set) set);
            this.c = a((Set) set2);
        }

        private static Set<Class<?>> a(Set<Class<?>> set) {
            Set hashSet = new HashSet();
            if (set != null) {
                hashSet.addAll(set);
            }
            hashSet.remove(null);
            return hashSet;
        }

        public static a a(Class<?> cls) {
            return a(true, cls);
        }

        public static a a(boolean z, Set<Class<?>> set, boolean z2, Set<Class<?>> set2) {
            return new a(z, set, z2, set2);
        }

        public static a a(boolean z, Class<?>... clsArr) {
            if (!c((Class[]) clsArr)) {
                return a(z, a.b((Class[]) clsArr), true, null);
            }
            throw new NullPointerException("has null category");
        }

        public static a a(Class<?>... clsArr) {
            return a(true, (Class[]) clsArr);
        }

        private boolean a(Set<Class<?>> set, Set<Class<?>> set2) {
            for (Class a : set2) {
                if (a.b(set, a)) {
                    return true;
                }
            }
            return false;
        }

        public static a b(Class<?> cls) {
            return b(true, cls);
        }

        public static a b(boolean z, Class<?>... clsArr) {
            if (!c((Class[]) clsArr)) {
                return a(true, null, z, a.b((Class[]) clsArr));
            }
            throw new NullPointerException("has null category");
        }

        public static a b(Class<?>... clsArr) {
            return b(true, (Class[]) clsArr);
        }

        private boolean b(Set<Class<?>> set, Set<Class<?>> set2) {
            for (Class a : set2) {
                if (!a.b(set, a)) {
                    return false;
                }
            }
            return true;
        }

        private boolean c(org.c.e.c cVar) {
            Set d = d(cVar);
            if (d.isEmpty()) {
                return this.b.isEmpty();
            }
            if (!this.c.isEmpty()) {
                if (this.e) {
                    if (a(d, this.c)) {
                        return false;
                    }
                } else if (b(d, this.c)) {
                    return false;
                }
            }
            return this.b.isEmpty() ? true : this.d ? a(d, this.b) : b(d, this.b);
        }

        private static boolean c(Class<?>... clsArr) {
            if (clsArr == null) {
                return false;
            }
            for (Class<?> cls : clsArr) {
                if (cls == null) {
                    return true;
                }
            }
            return false;
        }

        private static Set<Class<?>> d(org.c.e.c cVar) {
            Object hashSet = new HashSet();
            Collections.addAll(hashSet, f(cVar));
            Collections.addAll(hashSet, f(e(cVar)));
            return hashSet;
        }

        private static org.c.e.c e(org.c.e.c cVar) {
            Class i = cVar.i();
            return i == null ? null : org.c.e.c.a(i);
        }

        private static Class<?>[] f(org.c.e.c cVar) {
            if (cVar == null) {
                return new Class[0];
            }
            b bVar = (b) cVar.b(b.class);
            return bVar == null ? new Class[0] : bVar.a();
        }

        public String a() {
            return toString();
        }

        public boolean a(org.c.e.c cVar) {
            if (c(cVar)) {
                return true;
            }
            Iterator it = cVar.b().iterator();
            while (it.hasNext()) {
                if (a((org.c.e.c) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            StringBuilder append = new StringBuilder("categories ").append(this.b.isEmpty() ? "[all]" : this.b);
            if (!this.c.isEmpty()) {
                append.append(" - ").append(this.c);
            }
            return append.toString();
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        Class<?>[] a() default {};

        boolean b() default true;
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
        Class<?>[] a() default {};

        boolean b() default true;
    }

    public a(Class<?> cls, h hVar) {
        super((Class) cls, hVar);
        try {
            a(a.a(c((Class) cls), b((Class) cls), e(cls), d(cls)));
            a(d());
        } catch (Throwable e) {
            throw new e(e);
        }
    }

    private static void a(org.c.e.c cVar) {
        if (!c(cVar)) {
            b(cVar);
        }
        Iterator it = cVar.b().iterator();
        while (it.hasNext()) {
            a((org.c.e.c) it.next());
        }
    }

    private static Set<Class<?>> b(Class<?> cls) {
        c cVar = (c) cls.getAnnotation(c.class);
        return b(cVar == null ? null : cVar.a());
    }

    private static Set<Class<?>> b(Class<?>... clsArr) {
        Object hashSet = new HashSet();
        if (clsArr != null) {
            Collections.addAll(hashSet, clsArr);
        }
        return hashSet;
    }

    private static void b(org.c.e.c cVar) {
        Iterator it = cVar.b().iterator();
        while (it.hasNext()) {
            org.c.e.c cVar2 = (org.c.e.c) it.next();
            if (cVar2.b(b.class) != null) {
                throw new e("Category annotations on Parameterized classes are not supported on individual methods.");
            }
            b(cVar2);
        }
    }

    private static boolean b(Set<Class<?>> set, Class<?> cls) {
        for (Class isAssignableFrom : set) {
            if (cls.isAssignableFrom(isAssignableFrom)) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(Class<?> cls) {
        c cVar = (c) cls.getAnnotation(c.class);
        return cVar == null || cVar.b();
    }

    private static boolean c(org.c.e.c cVar) {
        Iterator it = cVar.b().iterator();
        while (it.hasNext()) {
            if (((org.c.e.c) it.next()).i() == null) {
                return false;
            }
        }
        return true;
    }

    private static Set<Class<?>> d(Class<?> cls) {
        b bVar = (b) cls.getAnnotation(b.class);
        return b(bVar == null ? null : bVar.a());
    }

    private static boolean e(Class<?> cls) {
        b bVar = (b) cls.getAnnotation(b.class);
        return bVar == null || bVar.b();
    }
}
