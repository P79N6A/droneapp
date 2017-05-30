package org.c.b;

import org.b.g;
import org.b.k;
import org.b.m;
import org.b.n;

public class b extends RuntimeException implements m {
    private static final long serialVersionUID = 2;
    private final String a;
    private final boolean b;
    private final Object c;
    private final k<?> d;

    @Deprecated
    public b(Object obj, k<?> kVar) {
        this(null, true, obj, kVar);
    }

    @Deprecated
    public b(String str) {
        this(str, false, null, null);
    }

    @Deprecated
    public b(String str, Object obj, k<?> kVar) {
        this(str, true, obj, kVar);
    }

    @Deprecated
    public b(String str, Throwable th) {
        this(str, false, null, null);
        initCause(th);
    }

    @Deprecated
    public b(String str, boolean z, Object obj, k<?> kVar) {
        this.a = str;
        this.c = obj;
        this.d = kVar;
        this.b = z;
        if (obj instanceof Throwable) {
            initCause((Throwable) obj);
        }
    }

    public void a(g gVar) {
        if (this.a != null) {
            gVar.a(this.a);
        }
        if (this.b) {
            if (this.a != null) {
                gVar.a(": ");
            }
            gVar.a("got: ");
            gVar.a(this.c);
            if (this.d != null) {
                gVar.a(", expected: ");
                gVar.a(this.d);
            }
        }
    }

    public String getMessage() {
        return n.c(this);
    }
}
