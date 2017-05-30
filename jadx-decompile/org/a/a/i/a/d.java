package org.a.a.i.a;

import java.nio.charset.Charset;
import org.a.a.a.b;
import org.a.a.b.c;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@b
public class d implements c, AuthSchemeFactory {
    private final Charset a;

    public d() {
        this(null);
    }

    public d(Charset charset) {
        this.a = charset;
    }

    public AuthScheme a(HttpContext httpContext) {
        return new e(this.a);
    }

    public AuthScheme newInstance(HttpParams httpParams) {
        return new e();
    }
}
