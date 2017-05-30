package org.b.a;

import java.util.ArrayList;
import org.b.g;
import org.b.i;
import org.b.k;
import org.b.o;

public class c<T> extends o<T> {
    private final k<? super T> a;

    public c(k<? super T> kVar) {
        this.a = kVar;
    }

    @i
    public static <LHS> a<LHS> c(k<? super LHS> kVar) {
        return new a(kVar);
    }

    @i
    public static <LHS> b<LHS> d(k<? super LHS> kVar) {
        return new b(kVar);
    }

    private ArrayList<k<? super T>> e(k<? super T> kVar) {
        ArrayList<k<? super T>> arrayList = new ArrayList();
        arrayList.add(this.a);
        arrayList.add(kVar);
        return arrayList;
    }

    public c<T> a(k<? super T> kVar) {
        return new c(new a(e(kVar)));
    }

    public void a(g gVar) {
        gVar.a(this.a);
    }

    public c<T> b(k<? super T> kVar) {
        return new c(new b(e(kVar)));
    }

    protected boolean b(T t, g gVar) {
        if (this.a.a(t)) {
            return true;
        }
        this.a.a(t, gVar);
        return false;
    }
}
