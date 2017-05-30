package org.b;

public abstract class f<T> extends p<T> {
    private final String a;

    public f(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Description must be non null!");
        }
        this.a = str;
    }

    public final void a(g gVar) {
        gVar.a(this.a);
    }
}
