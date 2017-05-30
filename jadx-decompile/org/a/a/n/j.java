package org.a.a.n;

import java.net.InetAddress;
import org.a.a.a.b;
import org.a.a.e;
import org.a.a.o.a;
import org.apache.http.HttpConnection;
import org.apache.http.HttpHost;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.protocol.HttpContext;

@b
public class j implements HttpRequestInterceptor {
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        a.a((Object) httpRequest, "HTTP request");
        c b = c.b(httpContext);
        ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
        if ((!httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT") || !protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) && !httpRequest.containsHeader(e.z)) {
            HttpHost httpHost;
            HttpHost t = b.t();
            if (t == null) {
                HttpConnection p = b.p();
                if (p instanceof HttpInetConnection) {
                    InetAddress remoteAddress = ((HttpInetConnection) p).getRemoteAddress();
                    int remotePort = ((HttpInetConnection) p).getRemotePort();
                    if (remoteAddress != null) {
                        httpHost = new HttpHost(remoteAddress.getHostName(), remotePort);
                        if (httpHost == null) {
                            if (!protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                                throw new ProtocolException("Target host missing");
                            }
                            return;
                        }
                    }
                }
                httpHost = t;
                if (httpHost == null) {
                    if (!protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                        throw new ProtocolException("Target host missing");
                    }
                    return;
                }
            }
            httpHost = t;
            httpRequest.addHeader(e.z, httpHost.toHostString());
        }
    }
}
