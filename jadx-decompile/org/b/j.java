package org.b;

import org.b.b.b;

public abstract class j<T, U> extends o<T> {
    private static final b a = new b("featureValueOf", 1, 0);
    private final k<? super U> b;
    private final String c;
    private final String d;

    public j(k<? super U> kVar, String str, String str2) {
        super(a);
        this.b = kVar;
        this.c = str;
        this.d = str2;
    }

    public final void a(g gVar) {
        gVar.a(this.c).a(" ").a(this.b);
    }

    protected abstract U b(T t);

    protected boolean b(T t, g gVar) {
        Object b = b(t);
        if (this.b.a(b)) {
            return true;
        }
        gVar.a(this.d).a(" ");
        this.b.a(b, gVar);
        return false;
    }
}
