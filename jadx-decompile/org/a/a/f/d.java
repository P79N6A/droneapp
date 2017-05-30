package org.a.a.f;

import java.util.concurrent.TimeUnit;
import org.apache.http.HttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;

public interface d {
    a a(HttpRoute httpRoute, Object obj);

    void a();

    void a(long j, TimeUnit timeUnit);

    void a(HttpClientConnection httpClientConnection, Object obj, long j, TimeUnit timeUnit);

    void a(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i, HttpContext httpContext);

    void a(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext);

    void b();

    void b(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext);
}
