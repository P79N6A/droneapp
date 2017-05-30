package org.c.e;

public final class f {
    private final c a;
    private final String b;

    public f(c cVar, String str) {
        if (str == null || cVar == null) {
            throw new NullPointerException();
        }
        this.a = cVar;
        this.b = str;
    }

    public String a() {
        return this.b;
    }

    public c b() {
        return this.a;
    }
}
