package org.b.a;

import org.b.g;
import org.b.i;
import org.b.k;
import org.b.o;

public class e<T> extends o<Iterable<T>> {
    private final k<? super T> a;

    public e(k<? super T> kVar) {
        this.a = kVar;
    }

    @i
    public static <U> k<Iterable<U>> a(k<U> kVar) {
        return new e(kVar);
    }

    public void a(g gVar) {
        gVar.a("every item is ").a(this.a);
    }

    public boolean a(Iterable<T> iterable, g gVar) {
        for (Object next : iterable) {
            if (!this.a.a(next)) {
                gVar.a("an item ");
                this.a.a(next, gVar);
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ boolean b(Object obj, g gVar) {
        return a((Iterable) obj, gVar);
    }
}
