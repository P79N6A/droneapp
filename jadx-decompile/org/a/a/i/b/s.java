package org.a.a.i.b;

import android.net.SSLCertificateSocketFactory;
import com.facebook.common.util.UriUtil;
import java.io.Closeable;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.a.a.a.c;
import org.a.a.c.e;
import org.a.a.e.a;
import org.a.a.e.f;
import org.a.a.f.b.b;
import org.a.a.f.d;
import org.a.a.f.i;
import org.a.a.i.c.r;
import org.a.a.i.c.t;
import org.a.a.i.d.ag;
import org.a.a.i.d.u;
import org.a.a.i.d.z;
import org.a.a.i.f.l;
import org.a.a.i.f.m;
import org.a.a.i.k;
import org.a.a.n.h;
import org.a.a.n.j;
import org.a.a.o.g;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

@c
public class s {
    static final String a;
    private CredentialsProvider A;
    private String B;
    private HttpHost C;
    private Collection<? extends Header> D;
    private f E;
    private a F;
    private org.a.a.c.a.c G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private int O = 0;
    private int P = 0;
    private List<Closeable> Q;
    private HttpRequestExecutor b;
    private X509HostnameVerifier c;
    private b d;
    private SSLContext e;
    private d f;
    private i g;
    private ConnectionReuseStrategy h;
    private ConnectionKeepAliveStrategy i;
    private org.a.a.c.b j;
    private org.a.a.c.b k;
    private UserTokenHandler l;
    private HttpProcessor m;
    private LinkedList<HttpRequestInterceptor> n;
    private LinkedList<HttpRequestInterceptor> o;
    private LinkedList<HttpResponseInterceptor> p;
    private LinkedList<HttpResponseInterceptor> q;
    private HttpRequestRetryHandler r;
    private HttpRoutePlanner s;
    private e t;
    private org.a.a.c.d u;
    private org.a.a.c.c v;
    private org.a.a.c.f w;
    private org.a.a.e.b<org.a.a.b.c> x;
    private org.a.a.e.b<org.a.a.g.b> y;
    private CookieStore z;

    static {
        g a = g.a("org.apache.http.client", s.class.getClassLoader());
        a = "Apache-HttpClient/" + (a != null ? a.c() : g.a) + " (java 1.5)";
    }

    protected s() {
    }

    public static s a() {
        return new s();
    }

    private static String[] b(String str) {
        return org.a.a.o.f.b(str) ? null : str.split(" *, *");
    }

    public final s a(int i) {
        this.O = i;
        return this;
    }

    public final s a(String str) {
        this.B = str;
        return this;
    }

    public final s a(Collection<? extends Header> collection) {
        this.D = collection;
        return this;
    }

    public final s a(SSLContext sSLContext) {
        this.e = sSLContext;
        return this;
    }

    public final s a(org.a.a.c.a.c cVar) {
        this.G = cVar;
        return this;
    }

    public final s a(org.a.a.c.b bVar) {
        this.j = bVar;
        return this;
    }

    public final s a(org.a.a.c.c cVar) {
        this.v = cVar;
        return this;
    }

    public final s a(org.a.a.c.d dVar) {
        this.u = dVar;
        return this;
    }

    public final s a(e eVar) {
        this.t = eVar;
        return this;
    }

    public final s a(org.a.a.c.f fVar) {
        this.w = fVar;
        return this;
    }

    public final s a(a aVar) {
        this.F = aVar;
        return this;
    }

    public final s a(org.a.a.e.b<org.a.a.b.c> bVar) {
        this.x = bVar;
        return this;
    }

    public final s a(f fVar) {
        this.E = fVar;
        return this;
    }

    public final s a(b bVar) {
        this.d = bVar;
        return this;
    }

    public final s a(d dVar) {
        this.f = dVar;
        return this;
    }

    public final s a(i iVar) {
        this.g = iVar;
        return this;
    }

    public final s a(ConnectionReuseStrategy connectionReuseStrategy) {
        this.h = connectionReuseStrategy;
        return this;
    }

    public final s a(HttpHost httpHost) {
        this.C = httpHost;
        return this;
    }

    public final s a(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor != null) {
            if (this.n == null) {
                this.n = new LinkedList();
            }
            this.n.addFirst(httpRequestInterceptor);
        }
        return this;
    }

    public final s a(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor != null) {
            if (this.p == null) {
                this.p = new LinkedList();
            }
            this.p.addFirst(httpResponseInterceptor);
        }
        return this;
    }

    public final s a(CookieStore cookieStore) {
        this.z = cookieStore;
        return this;
    }

    public final s a(CredentialsProvider credentialsProvider) {
        this.A = credentialsProvider;
        return this;
    }

    public final s a(HttpRequestRetryHandler httpRequestRetryHandler) {
        this.r = httpRequestRetryHandler;
        return this;
    }

    public final s a(UserTokenHandler userTokenHandler) {
        this.l = userTokenHandler;
        return this;
    }

    public final s a(ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        this.i = connectionKeepAliveStrategy;
        return this;
    }

    public final s a(HttpRoutePlanner httpRoutePlanner) {
        this.s = httpRoutePlanner;
        return this;
    }

    public final s a(X509HostnameVerifier x509HostnameVerifier) {
        this.c = x509HostnameVerifier;
        return this;
    }

    public final s a(HttpProcessor httpProcessor) {
        this.m = httpProcessor;
        return this;
    }

    public final s a(HttpRequestExecutor httpRequestExecutor) {
        this.b = httpRequestExecutor;
        return this;
    }

    protected org.a.a.i.f.b a(org.a.a.i.f.b bVar) {
        return bVar;
    }

    protected void a(Closeable closeable) {
        if (closeable != null) {
            if (this.Q == null) {
                this.Q = new ArrayList();
            }
            this.Q.add(closeable);
        }
    }

    public final s b() {
        this.N = true;
        return this;
    }

    public final s b(int i) {
        this.P = i;
        return this;
    }

    public final s b(org.a.a.c.b bVar) {
        this.k = bVar;
        return this;
    }

    public final s b(org.a.a.e.b<org.a.a.g.b> bVar) {
        this.y = bVar;
        return this;
    }

    public final s b(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor != null) {
            if (this.o == null) {
                this.o = new LinkedList();
            }
            this.o.addLast(httpRequestInterceptor);
        }
        return this;
    }

    public final s b(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor != null) {
            if (this.q == null) {
                this.q = new LinkedList();
            }
            this.q.addLast(httpResponseInterceptor);
        }
        return this;
    }

    protected org.a.a.i.f.b b(org.a.a.i.f.b bVar) {
        return bVar;
    }

    public final s c() {
        this.L = true;
        return this;
    }

    public final s d() {
        this.K = true;
        return this;
    }

    public final s e() {
        this.M = true;
        return this;
    }

    public final s f() {
        this.J = true;
        return this;
    }

    public final s g() {
        this.I = true;
        return this;
    }

    public final s h() {
        this.H = true;
        return this;
    }

    public h i() {
        org.a.a.i.f.b bVar;
        List list = null;
        HttpRequestExecutor httpRequestExecutor = this.b;
        if (httpRequestExecutor == null) {
            httpRequestExecutor = new HttpRequestExecutor();
        }
        d dVar = this.f;
        if (dVar == null) {
            Object obj = this.d;
            if (obj == null) {
                String[] b = this.H ? b(System.getProperty("https.protocols")) : null;
                String[] b2 = this.H ? b(System.getProperty("https.cipherSuites")) : null;
                X509HostnameVerifier x509HostnameVerifier = this.c;
                X509HostnameVerifier x509HostnameVerifier2 = x509HostnameVerifier == null ? org.a.a.f.c.g.e : x509HostnameVerifier;
                if (this.e != null) {
                    obj = new org.a.a.f.c.g(this.e, b, b2, x509HostnameVerifier2);
                } else {
                    org.a.a.f.c.g gVar = this.H ? new org.a.a.f.c.g((SSLSocketFactory) SSLCertificateSocketFactory.getDefault(0), b, b2, x509HostnameVerifier2) : new org.a.a.f.c.g((SSLSocketFactory) SSLCertificateSocketFactory.getDefault(0), x509HostnameVerifier2);
                }
            }
            dVar = new r(org.a.a.e.e.a().a(UriUtil.HTTP_SCHEME, org.a.a.f.b.c.a()).a(UriUtil.HTTPS_SCHEME, obj).b());
            if (this.E != null) {
                dVar.a(this.E);
            }
            if (this.F != null) {
                dVar.a(this.F);
            }
            if (this.H) {
                if ("true".equalsIgnoreCase(System.getProperty("http.keepAlive", "true"))) {
                    int parseInt = Integer.parseInt(System.getProperty("http.maxConnections", "5"));
                    dVar.b(parseInt);
                    dVar.a(parseInt * 2);
                }
            }
            if (this.O > 0) {
                dVar.a(this.O);
            }
            if (this.P > 0) {
                dVar.b(this.P);
            }
        }
        ConnectionReuseStrategy connectionReuseStrategy = this.h;
        if (connectionReuseStrategy == null) {
            if (this.H) {
                connectionReuseStrategy = "true".equalsIgnoreCase(System.getProperty("http.keepAlive", "true")) ? org.a.a.i.g.a : k.a;
            } else {
                connectionReuseStrategy = org.a.a.i.g.a;
            }
        }
        ConnectionKeepAliveStrategy connectionKeepAliveStrategy = this.i;
        if (connectionKeepAliveStrategy == null) {
            connectionKeepAliveStrategy = k.a;
        }
        org.a.a.c.b bVar2 = this.j;
        if (bVar2 == null) {
            bVar2 = ah.a;
        }
        org.a.a.c.b bVar3 = this.k;
        if (bVar3 == null) {
            bVar3 = ab.a;
        }
        UserTokenHandler userTokenHandler = this.l;
        if (userTokenHandler == null) {
            userTokenHandler = !this.N ? o.a : z.a;
        }
        org.a.a.i.f.b a = a(new org.a.a.i.f.e(httpRequestExecutor, dVar, connectionReuseStrategy, connectionKeepAliveStrategy, bVar2, bVar3, userTokenHandler));
        HttpProcessor httpProcessor = this.m;
        if (httpProcessor == null) {
            String str;
            org.a.a.n.d a2;
            Iterator it;
            Iterator it2;
            String str2 = this.B;
            if (str2 == null) {
                if (this.H) {
                    str2 = System.getProperty("http.agent");
                }
                if (str2 == null) {
                    str = a;
                    a2 = org.a.a.n.d.a();
                    if (this.n != null) {
                        it = this.n.iterator();
                        while (it.hasNext()) {
                            a2.a((HttpRequestInterceptor) it.next());
                        }
                    }
                    if (this.p != null) {
                        it = this.p.iterator();
                        while (it.hasNext()) {
                            a2.a((HttpResponseInterceptor) it.next());
                        }
                    }
                    a2.c(new org.a.a.c.e.f(this.D), new h(), new j(), new org.a.a.c.e.e(), new org.a.a.n.k(str), new org.a.a.c.e.g());
                    if (!this.L) {
                        a2.c(new org.a.a.c.e.c());
                    }
                    if (!this.K) {
                        a2.c(new org.a.a.c.e.b());
                    }
                    if (!this.M) {
                        a2.c(new org.a.a.c.e.d());
                    }
                    if (!this.L) {
                        a2.c(new org.a.a.c.e.i());
                    }
                    if (!this.K) {
                        a2.c(new org.a.a.c.e.h());
                    }
                    if (this.o != null) {
                        it2 = this.o.iterator();
                        while (it2.hasNext()) {
                            a2.b((HttpRequestInterceptor) it2.next());
                        }
                    }
                    if (this.q != null) {
                        it2 = this.q.iterator();
                        while (it2.hasNext()) {
                            a2.b((HttpResponseInterceptor) it2.next());
                        }
                    }
                    httpProcessor = a2.b();
                }
            }
            str = str2;
            a2 = org.a.a.n.d.a();
            if (this.n != null) {
                it = this.n.iterator();
                while (it.hasNext()) {
                    a2.a((HttpRequestInterceptor) it.next());
                }
            }
            if (this.p != null) {
                it = this.p.iterator();
                while (it.hasNext()) {
                    a2.a((HttpResponseInterceptor) it.next());
                }
            }
            a2.c(new org.a.a.c.e.f(this.D), new h(), new j(), new org.a.a.c.e.e(), new org.a.a.n.k(str), new org.a.a.c.e.g());
            if (this.L) {
                a2.c(new org.a.a.c.e.c());
            }
            if (this.K) {
                a2.c(new org.a.a.c.e.b());
            }
            if (this.M) {
                a2.c(new org.a.a.c.e.d());
            }
            if (this.L) {
                a2.c(new org.a.a.c.e.i());
            }
            if (this.K) {
                a2.c(new org.a.a.c.e.h());
            }
            if (this.o != null) {
                it2 = this.o.iterator();
                while (it2.hasNext()) {
                    a2.b((HttpRequestInterceptor) it2.next());
                }
            }
            if (this.q != null) {
                it2 = this.q.iterator();
                while (it2.hasNext()) {
                    a2.b((HttpResponseInterceptor) it2.next());
                }
            }
            httpProcessor = a2.b();
        }
        a = b(new org.a.a.i.f.g(a, httpProcessor));
        if (this.J) {
            bVar = a;
        } else {
            HttpRequestRetryHandler httpRequestRetryHandler = this.r;
            if (httpRequestRetryHandler == null) {
                httpRequestRetryHandler = l.a;
            }
            bVar = new l(a, httpRequestRetryHandler);
        }
        HttpRoutePlanner httpRoutePlanner = this.s;
        if (httpRoutePlanner == null) {
            i iVar = this.g;
            if (iVar == null) {
                iVar = org.a.a.i.c.k.a;
            }
            httpRoutePlanner = this.C != null ? new org.a.a.i.c.i(this.C, iVar) : this.H ? new t(iVar, ProxySelector.getDefault()) : new org.a.a.i.c.j(iVar);
        }
        if (!this.I) {
            e eVar = this.t;
            if (eVar == null) {
                eVar = m.b;
            }
            bVar = new org.a.a.i.f.h(bVar, httpRoutePlanner, eVar);
        }
        org.a.a.c.f fVar = this.w;
        if (fVar != null) {
            bVar = new m(bVar, fVar);
        }
        org.a.a.c.c cVar = this.v;
        org.a.a.c.d dVar2 = this.u;
        org.a.a.i.f.b aVar = (cVar == null || dVar2 == null) ? bVar : new org.a.a.i.f.a(bVar, dVar2, cVar);
        org.a.a.e.b bVar4 = this.x;
        if (bVar4 == null) {
            bVar4 = org.a.a.e.e.a().a(org.a.a.c.a.a.a, new org.a.a.i.a.b()).a(org.a.a.c.a.a.b, new org.a.a.i.a.d()).a(org.a.a.c.a.a.c, new org.a.a.i.a.i()).b();
        }
        org.a.a.e.b bVar5 = this.y;
        if (bVar5 == null) {
            bVar5 = org.a.a.e.e.a().a(org.a.a.c.a.b.d, new org.a.a.i.d.k()).a(org.a.a.c.a.b.c, new ag()).a(org.a.a.c.a.b.a, new org.a.a.i.d.m()).a(org.a.a.c.a.b.b, new u()).a(org.a.a.c.a.b.e, new org.a.a.i.d.r()).a("rfc2109", new z()).a("rfc2965", new ag()).b();
        }
        CookieStore cookieStore = this.z;
        if (cookieStore == null) {
            cookieStore = new d();
        }
        CredentialsProvider credentialsProvider = this.A;
        if (credentialsProvider == null) {
            credentialsProvider = this.H ? new ag() : new e();
        }
        org.a.a.c.a.c cVar2 = this.G != null ? this.G : org.a.a.c.a.c.a;
        if (this.Q != null) {
            list = new ArrayList(this.Q);
        }
        return new w(aVar, dVar, httpRoutePlanner, bVar5, bVar4, cookieStore, credentialsProvider, cVar2, list);
    }
}
