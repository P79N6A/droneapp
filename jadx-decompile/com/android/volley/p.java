package com.android.volley;

public class p<T> {
    public final T a;
    public final com.android.volley.b.a b;
    public final u c;
    public boolean d;

    public interface a {
        void a(u uVar);
    }

    public interface b<T> {
        void a(T t);
    }

    private p(u uVar) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = uVar;
    }

    private p(T t, com.android.volley.b.a aVar) {
        this.d = false;
        this.a = t;
        this.b = aVar;
        this.c = null;
    }

    public static <T> p<T> a(u uVar) {
        return new p(uVar);
    }

    public static <T> p<T> a(T t, com.android.volley.b.a aVar) {
        return new p(t, aVar);
    }

    public boolean a() {
        return this.c == null;
    }
}
