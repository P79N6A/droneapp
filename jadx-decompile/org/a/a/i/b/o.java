package org.a.a.i.b;

import java.security.Principal;
import javax.net.ssl.SSLSession;
import org.a.a.a.b;
import org.a.a.b.d;
import org.a.a.c.e.a;
import org.a.a.f.h;
import org.apache.http.HttpConnection;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.protocol.HttpContext;

@b
public class o implements UserTokenHandler {
    public static final o a = new o();

    private static Principal a(d dVar) {
        AuthScheme c = dVar.c();
        if (c != null && c.isComplete() && c.isConnectionBased()) {
            Credentials d = dVar.d();
            if (d != null) {
                return d.getUserPrincipal();
            }
        }
        return null;
    }

    public Object getUserToken(HttpContext httpContext) {
        a a = a.a(httpContext);
        Principal principal = null;
        d k = a.k();
        if (k != null) {
            principal = a(k);
            if (principal == null) {
                principal = a(a.l());
            }
        }
        if (principal == null) {
            HttpConnection p = a.p();
            if (p.isOpen() && (p instanceof h)) {
                SSLSession c = ((h) p).c();
                if (c != null) {
                    return c.getLocalPrincipal();
                }
            }
        }
        return principal;
    }
}
