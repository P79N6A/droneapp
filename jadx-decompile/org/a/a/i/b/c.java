package org.a.a.i.b;

import java.util.HashMap;
import org.a.a.c.a;
import org.a.a.f.i;
import org.a.a.f.j;
import org.a.a.i.c.k;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScheme;

@org.a.a.a.c
public class c implements a {
    private final HashMap<HttpHost, AuthScheme> a;
    private final i b;

    public c() {
        this(null);
    }

    public c(i iVar) {
        this.a = new HashMap();
        if (iVar == null) {
            iVar = k.a;
        }
        this.b = iVar;
    }

    public AuthScheme a(HttpHost httpHost) {
        org.a.a.o.a.a((Object) httpHost, "HTTP host");
        return (AuthScheme) this.a.get(c(httpHost));
    }

    public void a() {
        this.a.clear();
    }

    public void a(HttpHost httpHost, AuthScheme authScheme) {
        org.a.a.o.a.a((Object) httpHost, "HTTP host");
        this.a.put(c(httpHost), authScheme);
    }

    public void b(HttpHost httpHost) {
        org.a.a.o.a.a((Object) httpHost, "HTTP host");
        this.a.remove(c(httpHost));
    }

    protected HttpHost c(HttpHost httpHost) {
        if (httpHost.getPort() > 0) {
            return httpHost;
        }
        try {
            return new HttpHost(httpHost.getHostName(), this.b.a(httpHost), httpHost.getSchemeName());
        } catch (j e) {
            return httpHost;
        }
    }

    public String toString() {
        return this.a.toString();
    }
}
