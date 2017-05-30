package org.a.a.c.e;

import java.net.URI;
import java.util.List;
import org.a.a.a.c;
import org.a.a.b.d;
import org.a.a.e.b;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.protocol.HttpContext;

@c
public class a extends org.a.a.n.c {
    public static final String a = "http.route";
    public static final String b = "http.protocol.redirect-locations";
    public static final String c = "http.cookiespec-registry";
    public static final String d = "http.cookie-spec";
    public static final String e = "http.cookie-origin";
    public static final String f = "http.cookie-store";
    public static final String g = "http.auth.credentials-provider";
    public static final String h = "http.auth.auth-cache";
    public static final String i = "http.auth.target-scope";
    public static final String j = "http.auth.proxy-scope";
    public static final String k = "http.user-token";
    public static final String l = "http.authscheme-registry";
    public static final String m = "http.request-config";

    public a(HttpContext httpContext) {
        super(httpContext);
    }

    public static a a() {
        return new a(new org.a.a.n.a());
    }

    public static a a(HttpContext httpContext) {
        return httpContext instanceof a ? (a) httpContext : new a(httpContext);
    }

    private <T> b<T> b(String str, Class<T> cls) {
        return (b) a(str, b.class);
    }

    public <T> T a(Class<T> cls) {
        return a(k, cls);
    }

    public void a(Object obj) {
        setAttribute(k, obj);
    }

    public void a(org.a.a.c.a.c cVar) {
        setAttribute(m, cVar);
    }

    public void a(org.a.a.c.a aVar) {
        setAttribute(h, aVar);
    }

    public void a(b<org.a.a.g.b> bVar) {
        setAttribute(c, bVar);
    }

    public void a(CookieStore cookieStore) {
        setAttribute(f, cookieStore);
    }

    public void a(CredentialsProvider credentialsProvider) {
        setAttribute(g, credentialsProvider);
    }

    public RouteInfo b() {
        return (RouteInfo) a(a, HttpRoute.class);
    }

    public void b(b<org.a.a.b.c> bVar) {
        setAttribute(l, bVar);
    }

    public List<URI> c() {
        return (List) a("http.protocol.redirect-locations", List.class);
    }

    public CookieStore d() {
        return (CookieStore) a(f, CookieStore.class);
    }

    public CookieSpec e() {
        return (CookieSpec) a(d, CookieSpec.class);
    }

    public CookieOrigin f() {
        return (CookieOrigin) a(e, CookieOrigin.class);
    }

    public b<org.a.a.g.b> g() {
        return b(c, org.a.a.g.b.class);
    }

    public b<org.a.a.b.c> h() {
        return b(l, org.a.a.b.c.class);
    }

    public CredentialsProvider i() {
        return (CredentialsProvider) a(g, CredentialsProvider.class);
    }

    public org.a.a.c.a j() {
        return (org.a.a.c.a) a(h, org.a.a.c.a.class);
    }

    public d k() {
        return (d) a(i, d.class);
    }

    public d l() {
        return (d) a(j, d.class);
    }

    public Object m() {
        return getAttribute(k);
    }

    public org.a.a.c.a.c n() {
        org.a.a.c.a.c cVar = (org.a.a.c.a.c) a(m, org.a.a.c.a.c.class);
        return cVar != null ? cVar : org.a.a.c.a.c.a;
    }
}
