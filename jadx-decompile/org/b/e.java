package org.b;

public abstract class e<T> extends b<T> {
    private final String a;

    public e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Description should be non null!");
        }
        this.a = str;
    }

    public final void a(g gVar) {
        gVar.a(this.a);
    }
}
