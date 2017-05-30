package org.a.a.f.b;

import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.HttpHost;
import org.apache.http.protocol.HttpContext;

public interface a {
    Socket a(int i, Socket socket, HttpHost httpHost, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpContext httpContext);

    Socket a(HttpContext httpContext);
}
