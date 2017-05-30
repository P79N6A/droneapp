package org.a.a.e;

import org.a.a.a.b;

@b
public class f implements Cloneable {
    public static final f a = new a().a();
    private final int b;
    private final boolean c;
    private final int d;
    private final boolean e;
    private final boolean f;

    public static class a {
        private int a;
        private boolean b;
        private int c = -1;
        private boolean d;
        private boolean e = true;

        a() {
        }

        public a a(int i) {
            this.a = i;
            return this;
        }

        public a a(boolean z) {
            this.b = z;
            return this;
        }

        public f a() {
            return new f(this.a, this.b, this.c, this.d, this.e);
        }

        public a b(int i) {
            this.c = i;
            return this;
        }

        public a b(boolean z) {
            this.d = z;
            return this;
        }

        public a c(boolean z) {
            this.e = z;
            return this;
        }
    }

    f(int i, boolean z, int i2, boolean z2, boolean z3) {
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = z2;
        this.f = z3;
    }

    public static a a(f fVar) {
        org.a.a.o.a.a((Object) fVar, "Socket config");
        return new a().a(fVar.a()).a(fVar.b()).b(fVar.c()).b(fVar.d()).c(fVar.e());
    }

    public static a g() {
        return new a();
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    protected /* synthetic */ Object clone() {
        return f();
    }

    public boolean d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    protected f f() {
        return (f) super.clone();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[soTimeout=").append(this.b).append(", soReuseAddress=").append(this.c).append(", soLinger=").append(this.d).append(", soKeepAlive=").append(this.e).append(", tcpNoDelay=").append(this.f).append("]");
        return stringBuilder.toString();
    }
}
