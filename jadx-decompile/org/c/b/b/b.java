package org.c.b.b;

import org.b.g;
import org.b.i;
import org.b.k;
import org.b.p;

public class b<T extends Throwable> extends p<T> {
    private final k<? extends Throwable> a;

    public b(k<? extends Throwable> kVar) {
        this.a = kVar;
    }

    @i
    public static <T extends Throwable> k<T> a(k<? extends Throwable> kVar) {
        return new b(kVar);
    }

    protected void a(T t, g gVar) {
        gVar.a("cause ");
        this.a.a(t.getCause(), gVar);
    }

    public void a(g gVar) {
        gVar.a("exception with cause ");
        gVar.a(this.a);
    }

    protected boolean a(T t) {
        return this.a.a(t.getCause());
    }

    protected /* synthetic */ void b(Object obj, g gVar) {
        a((Throwable) obj, gVar);
    }

    protected /* synthetic */ boolean b(Object obj) {
        return a((Throwable) obj);
    }
}
