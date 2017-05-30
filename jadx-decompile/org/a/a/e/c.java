package org.a.a.e;

public class c implements Cloneable {
    public static final c a = new a().a();
    private final int b;
    private final int c;

    public static class a {
        private int a = -1;
        private int b = -1;

        a() {
        }

        public a a(int i) {
            this.a = i;
            return this;
        }

        public c a() {
            return new c(this.a, this.b);
        }

        public a b(int i) {
            this.b = i;
            return this;
        }
    }

    c(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public static a a(c cVar) {
        org.a.a.o.a.a((Object) cVar, "Message constraints");
        return new a().b(cVar.b()).a(cVar.a());
    }

    public static c a(int i) {
        return new c(org.a.a.o.a.b(i, "Max line length"), -1);
    }

    public static a d() {
        return new a();
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    protected c c() {
        return (c) super.clone();
    }

    protected /* synthetic */ Object clone() {
        return c();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[maxLineLength=").append(this.b).append(", maxHeaderCount=").append(this.c).append("]");
        return stringBuilder.toString();
    }
}
