package org.a.a.n;

import org.a.a.o.a;
import org.apache.http.HttpConnection;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

@org.a.a.a.c
public class c implements HttpContext {
    public static final String n = "http.connection";
    public static final String o = "http.request";
    public static final String p = "http.response";
    public static final String q = "http.target_host";
    public static final String r = "http.request_sent";
    private final HttpContext a;

    public c() {
        this.a = new a();
    }

    public c(HttpContext httpContext) {
        this.a = httpContext;
    }

    public static c b(HttpContext httpContext) {
        a.a((Object) httpContext, "HTTP context");
        return httpContext instanceof c ? (c) httpContext : new c(httpContext);
    }

    public static c o() {
        return new c(new a());
    }

    public <T> T a(String str, Class<T> cls) {
        a.a((Object) cls, "Attribute class");
        Object attribute = getAttribute(str);
        return attribute == null ? null : cls.cast(attribute);
    }

    public void a(HttpHost httpHost) {
        setAttribute(q, httpHost);
    }

    public <T extends HttpConnection> T b(Class<T> cls) {
        return (HttpConnection) a(n, cls);
    }

    public Object getAttribute(String str) {
        return this.a.getAttribute(str);
    }

    public HttpConnection p() {
        return (HttpConnection) a(n, HttpConnection.class);
    }

    public HttpRequest q() {
        return (HttpRequest) a(o, HttpRequest.class);
    }

    public boolean r() {
        Boolean bool = (Boolean) a(r, Boolean.class);
        return bool != null && bool.booleanValue();
    }

    public Object removeAttribute(String str) {
        return this.a.removeAttribute(str);
    }

    public HttpResponse s() {
        return (HttpResponse) a(p, HttpResponse.class);
    }

    public void setAttribute(String str, Object obj) {
        this.a.setAttribute(str, obj);
    }

    public HttpHost t() {
        return (HttpHost) a(q, HttpHost.class);
    }
}
