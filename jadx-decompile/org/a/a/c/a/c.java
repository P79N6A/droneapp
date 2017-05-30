package org.a.a.c.a;

import java.net.InetAddress;
import java.util.Collection;
import org.apache.http.HttpHost;

public class c implements Cloneable {
    public static final c a = new a().a();
    private final boolean b;
    private final HttpHost c;
    private final InetAddress d;
    private final boolean e;
    private final String f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int j;
    private final boolean k;
    private final Collection<String> l;
    private final Collection<String> m;
    private final int n;
    private final int o;
    private final int p;

    public static class a {
        private boolean a;
        private HttpHost b;
        private InetAddress c;
        private boolean d = true;
        private String e;
        private boolean f = true;
        private boolean g = true;
        private boolean h;
        private int i = 50;
        private boolean j = true;
        private Collection<String> k;
        private Collection<String> l;
        private int m = -1;
        private int n = -1;
        private int o = -1;

        a() {
        }

        public a a(int i) {
            this.i = i;
            return this;
        }

        public a a(String str) {
            this.e = str;
            return this;
        }

        public a a(InetAddress inetAddress) {
            this.c = inetAddress;
            return this;
        }

        public a a(Collection<String> collection) {
            this.k = collection;
            return this;
        }

        public a a(HttpHost httpHost) {
            this.b = httpHost;
            return this;
        }

        public a a(boolean z) {
            this.a = z;
            return this;
        }

        public c a() {
            return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }

        public a b(int i) {
            this.m = i;
            return this;
        }

        public a b(Collection<String> collection) {
            this.l = collection;
            return this;
        }

        public a b(boolean z) {
            this.d = z;
            return this;
        }

        public a c(int i) {
            this.n = i;
            return this;
        }

        public a c(boolean z) {
            this.f = z;
            return this;
        }

        public a d(int i) {
            this.o = i;
            return this;
        }

        public a d(boolean z) {
            this.g = z;
            return this;
        }

        public a e(boolean z) {
            this.h = z;
            return this;
        }

        public a f(boolean z) {
            this.j = z;
            return this;
        }
    }

    c(boolean z, HttpHost httpHost, InetAddress inetAddress, boolean z2, String str, boolean z3, boolean z4, boolean z5, int i, boolean z6, Collection<String> collection, Collection<String> collection2, int i2, int i3, int i4) {
        this.b = z;
        this.c = httpHost;
        this.d = inetAddress;
        this.e = z2;
        this.f = str;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = i;
        this.k = z6;
        this.l = collection;
        this.m = collection2;
        this.n = i2;
        this.o = i3;
        this.p = i4;
    }

    public static a a(c cVar) {
        return new a().a(cVar.a()).a(cVar.b()).a(cVar.c()).b(cVar.d()).a(cVar.e()).c(cVar.f()).d(cVar.g()).e(cVar.h()).a(cVar.i()).f(cVar.j()).a(cVar.k()).b(cVar.l()).b(cVar.m()).c(cVar.n()).d(cVar.o());
    }

    public static a q() {
        return new a();
    }

    public boolean a() {
        return this.b;
    }

    public HttpHost b() {
        return this.c;
    }

    public InetAddress c() {
        return this.d;
    }

    protected /* synthetic */ Object clone() {
        return p();
    }

    public boolean d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public boolean g() {
        return this.h;
    }

    public boolean h() {
        return this.i;
    }

    public int i() {
        return this.j;
    }

    public boolean j() {
        return this.k;
    }

    public Collection<String> k() {
        return this.l;
    }

    public Collection<String> l() {
        return this.m;
    }

    public int m() {
        return this.n;
    }

    public int n() {
        return this.o;
    }

    public int o() {
        return this.p;
    }

    protected c p() {
        return (c) super.clone();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(", expectContinueEnabled=").append(this.b);
        stringBuilder.append(", proxy=").append(this.c);
        stringBuilder.append(", localAddress=").append(this.d);
        stringBuilder.append(", staleConnectionCheckEnabled=").append(this.e);
        stringBuilder.append(", cookieSpec=").append(this.f);
        stringBuilder.append(", redirectsEnabled=").append(this.g);
        stringBuilder.append(", relativeRedirectsAllowed=").append(this.h);
        stringBuilder.append(", maxRedirects=").append(this.j);
        stringBuilder.append(", circularRedirectsAllowed=").append(this.i);
        stringBuilder.append(", authenticationEnabled=").append(this.k);
        stringBuilder.append(", targetPreferredAuthSchemes=").append(this.l);
        stringBuilder.append(", proxyPreferredAuthSchemes=").append(this.m);
        stringBuilder.append(", connectionRequestTimeout=").append(this.n);
        stringBuilder.append(", connectTimeout=").append(this.o);
        stringBuilder.append(", socketTimeout=").append(this.p);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
