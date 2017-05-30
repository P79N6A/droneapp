package org.b.a;

import java.util.ArrayList;
import org.b.g;
import org.b.i;
import org.b.k;
import org.b.o;

public class h<T> extends o<Iterable<? super T>> {
    private final k<? super T> a;

    public h(k<? super T> kVar) {
        this.a = kVar;
    }

    @i
    public static <T> k<Iterable<? super T>> a(k<? super T> kVar) {
        return new h(kVar);
    }

    @i
    public static <T> k<Iterable<T>> a(T... tArr) {
        Iterable arrayList = new ArrayList(tArr.length);
        for (Object b : tArr) {
            arrayList.add(b(b));
        }
        return a.a(arrayList);
    }

    @i
    public static <T> k<Iterable<T>> a(k<? super T>... kVarArr) {
        Iterable arrayList = new ArrayList(kVarArr.length);
        for (k hVar : kVarArr) {
            arrayList.add(new h(hVar));
        }
        return a.a(arrayList);
    }

    @i
    public static <T> k<Iterable<? super T>> b(T t) {
        return new h(i.b(t));
    }

    public void a(g gVar) {
        gVar.a("a collection containing ").a(this.a);
    }

    protected boolean a(Iterable<? super T> iterable, g gVar) {
        boolean z = false;
        for (Object next : iterable) {
            if (this.a.a(next)) {
                return true;
            }
            if (z) {
                gVar.a(", ");
            }
            this.a.a(next, gVar);
            z = true;
        }
        return false;
    }

    protected /* synthetic */ boolean b(Object obj, g gVar) {
        return a((Iterable) obj, gVar);
    }
}
