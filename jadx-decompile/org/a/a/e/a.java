package org.a.a.e;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.a.a.a.b;

@b
public class a implements Cloneable {
    public static final a a = new a().a();
    private final int b;
    private final int c;
    private final Charset d;
    private final CodingErrorAction e;
    private final CodingErrorAction f;
    private final c g;

    public static class a {
        private int a;
        private int b = -1;
        private Charset c;
        private CodingErrorAction d;
        private CodingErrorAction e;
        private c f;

        a() {
        }

        public a a(int i) {
            this.a = i;
            return this;
        }

        public a a(Charset charset) {
            this.c = charset;
            return this;
        }

        public a a(CodingErrorAction codingErrorAction) {
            this.d = codingErrorAction;
            if (codingErrorAction != null && this.c == null) {
                this.c = org.a.a.b.f;
            }
            return this;
        }

        public a a(c cVar) {
            this.f = cVar;
            return this;
        }

        public a a() {
            Charset charset = this.c;
            if (charset == null && !(this.d == null && this.e == null)) {
                charset = org.a.a.b.f;
            }
            int i = this.a > 0 ? this.a : 8192;
            return new a(i, this.b >= 0 ? this.b : i, charset, this.d, this.e, this.f);
        }

        public a b(int i) {
            this.b = i;
            return this;
        }

        public a b(CodingErrorAction codingErrorAction) {
            this.e = codingErrorAction;
            if (codingErrorAction != null && this.c == null) {
                this.c = org.a.a.b.f;
            }
            return this;
        }
    }

    a(int i, int i2, Charset charset, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2, c cVar) {
        this.b = i;
        this.c = i2;
        this.d = charset;
        this.e = codingErrorAction;
        this.f = codingErrorAction2;
        this.g = cVar;
    }

    public static a a(a aVar) {
        org.a.a.o.a.a((Object) aVar, "Connection config");
        return new a().a(aVar.c()).a(aVar.d()).b(aVar.e()).a(aVar.f());
    }

    public static a h() {
        return new a();
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public Charset c() {
        return this.d;
    }

    protected /* synthetic */ Object clone() {
        return g();
    }

    public CodingErrorAction d() {
        return this.e;
    }

    public CodingErrorAction e() {
        return this.f;
    }

    public c f() {
        return this.g;
    }

    protected a g() {
        return (a) super.clone();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[bufferSize=").append(this.b).append(", fragmentSizeHint=").append(this.c).append(", charset=").append(this.d).append(", malformedInputAction=").append(this.e).append(", unmappableInputAction=").append(this.f).append(", messageConstraints=").append(this.g).append("]");
        return stringBuilder.toString();
    }
}
