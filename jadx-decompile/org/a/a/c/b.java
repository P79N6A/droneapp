package org.a.a.c;

import java.util.Map;
import java.util.Queue;
import org.a.a.b.a;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScheme;
import org.apache.http.protocol.HttpContext;

public interface b {
    Queue<a> a(Map<String, Header> map, HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext);

    void a(HttpHost httpHost, AuthScheme authScheme, HttpContext httpContext);

    boolean a(HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext);

    Map<String, Header> b(HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext);

    void b(HttpHost httpHost, AuthScheme authScheme, HttpContext httpContext);
}
