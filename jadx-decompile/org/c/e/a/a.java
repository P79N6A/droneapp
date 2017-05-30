package org.c.e.a;

import org.c.e.c;

public abstract class a {
    public static final a a = new 1();

    public static a b(c cVar) {
        return new 2(cVar);
    }

    public abstract String a();

    public a a(a aVar) {
        return (aVar == this || aVar == a) ? this : new 3(this, this, aVar);
    }

    public void a(Object obj) {
        if (obj instanceof b) {
            ((b) obj).a(this);
        }
    }

    public abstract boolean a(c cVar);
}
