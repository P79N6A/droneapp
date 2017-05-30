package org.a.a.c.d;

import java.lang.reflect.Field;
import java.net.InetAddress;
import java.util.Map;
import org.a.a.c.a.c;
import org.apache.http.HttpHost;
import org.apache.http.params.HttpParams;

@Deprecated
public final class a {
    private a() {
    }

    public static c a(HttpParams httpParams) {
        if (httpParams == null) {
            return null;
        }
        try {
            Field declaredField = httpParams.getClass().getDeclaredField("parameters");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(httpParams);
            if (map == null || map.isEmpty()) {
                return null;
            }
        } catch (Exception e) {
        }
        return c.q().d(httpParams.getIntParameter("http.socket.timeout", 0)).b(httpParams.getBooleanParameter("http.connection.stalecheck", true)).c(httpParams.getIntParameter("http.connection.timeout", 0)).a(httpParams.getBooleanParameter("http.protocol.expect-continue", false)).a((HttpHost) httpParams.getParameter("http.route.default-proxy")).a((InetAddress) httpParams.getParameter("http.route.local-address")).f(httpParams.getBooleanParameter("http.protocol.handle-authentication", true)).e(httpParams.getBooleanParameter("http.protocol.allow-circular-redirects", false)).a((String) httpParams.getParameter("http.protocol.cookie-policy")).a(httpParams.getIntParameter("http.protocol.max-redirects", 50)).c(httpParams.getBooleanParameter("http.protocol.handle-redirects", true)).d(!httpParams.getBooleanParameter("http.protocol.reject-relative-redirect", false)).a();
    }
}
