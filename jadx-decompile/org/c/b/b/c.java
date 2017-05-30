package org.c.b.b;

import org.b.g;
import org.b.i;
import org.b.k;
import org.b.p;

public class c<T extends Throwable> extends p<T> {
    private final k<String> a;

    public c(k<String> kVar) {
        this.a = kVar;
    }

    @i
    public static <T extends Throwable> k<T> a(k<String> kVar) {
        return new c(kVar);
    }

    protected void a(T t, g gVar) {
        gVar.a("message ");
        this.a.a(t.getMessage(), gVar);
    }

    public void a(g gVar) {
        gVar.a("exception with message ");
        gVar.a(this.a);
    }

    protected boolean a(T t) {
        return this.a.a(t.getMessage());
    }

    protected /* synthetic */ void b(Object obj, g gVar) {
        a((Throwable) obj, gVar);
    }

    protected /* synthetic */ boolean b(Object obj) {
        return a((Throwable) obj);
    }
}
