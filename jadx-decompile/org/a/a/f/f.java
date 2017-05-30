package org.a.a.f;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.a.a.o.a;
import org.apache.http.HttpHost;

@Deprecated
public class f extends InetSocketAddress {
    private static final long serialVersionUID = -6650701828361907957L;
    private final HttpHost a;

    public f(HttpHost httpHost, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        a.a(httpHost, "HTTP host");
        this.a = httpHost;
    }

    public HttpHost a() {
        return this.a;
    }

    public String toString() {
        return this.a.getHostName() + ":" + getPort();
    }
}
