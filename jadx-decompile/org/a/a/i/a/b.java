package org.a.a.i.a;

import java.nio.charset.Charset;
import org.a.a.b.c;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@org.a.a.a.b
public class b implements c, AuthSchemeFactory {
    private final Charset a;

    public b() {
        this(null);
    }

    public b(Charset charset) {
        this.a = charset;
    }

    public AuthScheme a(HttpContext httpContext) {
        return new c(this.a);
    }

    public AuthScheme newInstance(HttpParams httpParams) {
        return new c();
    }
}
