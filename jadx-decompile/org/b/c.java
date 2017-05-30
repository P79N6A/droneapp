package org.b;

public abstract class c<T> {
    public static final b<Object> a = new b();

    private static final class a<T> extends c<T> {
        private final T b;
        private final g c;

        private a(T t, g gVar) {
            super();
            this.b = t;
            this.c = gVar;
        }

        public <U> c<U> a(c<? super T, U> cVar) {
            return cVar.a(this.b, this.c);
        }

        public boolean a(k<T> kVar, String str) {
            if (kVar.a(this.b)) {
                return true;
            }
            this.c.a(str);
            kVar.a(this.b, this.c);
            return false;
        }
    }

    private static final class b<T> extends c<T> {
        private b() {
            super();
        }

        public <U> c<U> a(c<? super T, U> cVar) {
            return c.a();
        }

        public boolean a(k<T> kVar, String str) {
            return false;
        }
    }

    public interface c<I, O> {
        c<O> a(I i, g gVar);
    }

    private c() {
    }

    public static <T> c<T> a() {
        return a;
    }

    public static <T> c<T> a(T t, g gVar) {
        return new a(t, gVar);
    }

    public abstract <U> c<U> a(c<? super T, U> cVar);

    public final boolean a(k<T> kVar) {
        return a((k) kVar, "");
    }

    public abstract boolean a(k<T> kVar, String str);

    public final <U> c<U> b(c<? super T, U> cVar) {
        return a((c) cVar);
    }
}
