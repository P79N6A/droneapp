package org.c.b.d.b;

import java.lang.annotation.Annotation;
import java.util.List;
import org.c.d.f;
import org.c.f.a.c;
import org.c.f.a.k;
import org.c.h;
import org.c.l;

public class a {
    public static final a a = a().a(new b(null)).a(new g(null)).a(new f(null)).a(new d(null)).b();
    public static final a b = b().a(new e(null)).a(new f(null)).a(new c(null)).b();
    public static final a c = a().a().a(new b(null)).a(new g(null)).a(new f(null)).a(new i(null)).b();
    public static final a d = b().a().a(new e(null)).a(new f(null)).a(new h(null)).b();
    private final Class<? extends Annotation> e;
    private final boolean f;
    private final List<j> g;

    a(a aVar) {
        this.e = a.a(aVar);
        this.f = a.b(aVar);
        this.g = a.c(aVar);
    }

    private static a a() {
        return new a(h.class, null);
    }

    private void a(c<?> cVar, List<Throwable> list) {
        for (j a : this.g) {
            a.a(cVar, this.e, list);
        }
    }

    private static a b() {
        return new a(l.class, null);
    }

    private static boolean d(c<?> cVar) {
        return f(cVar) || e(cVar);
    }

    private static boolean e(c<?> cVar) {
        return org.c.d.l.class.isAssignableFrom(cVar.e());
    }

    private static boolean f(c<?> cVar) {
        return f.class.isAssignableFrom(cVar.e());
    }

    public void a(k kVar, List<Throwable> list) {
        for (c a : this.f ? kVar.b(this.e) : kVar.c(this.e)) {
            a(a, (List) list);
        }
    }
}
