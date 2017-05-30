package org.a.a.l;

import java.nio.charset.Charset;
import org.a.a.e.c;
import org.a.a.e.f;
import org.apache.http.params.HttpParams;

@Deprecated
public final class a {
    private a() {
    }

    public static f a(HttpParams httpParams) {
        return f.g().a(httpParams.getIntParameter("http.socket.timeout", 0)).b(httpParams.getIntParameter("http.socket.linger", -1)).c(httpParams.getBooleanParameter("http.tcp.nodelay", true)).a();
    }

    public static c b(HttpParams httpParams) {
        return c.d().b(httpParams.getIntParameter("http.connection.max-header-count", -1)).a(httpParams.getIntParameter("http.connection.max-line-length", -1)).a();
    }

    public static org.a.a.e.a c(HttpParams httpParams) {
        String str = (String) httpParams.getParameter("http.protocol.element-charset");
        return org.a.a.e.a.h().a(str != null ? Charset.forName(str) : null).a(b(httpParams)).a();
    }
}
