package org.a.a.i.c;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSession;
import org.a.a.a.c;
import org.a.a.f.h;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

@c
class d implements h, HttpContext {
    private volatile c a;

    d(c cVar) {
        this.a = cVar;
    }

    public static c a(HttpClientConnection httpClientConnection) {
        c d = c(httpClientConnection).d();
        if (d != null) {
            return d;
        }
        throw new e();
    }

    public static HttpClientConnection a(c cVar) {
        return new d(cVar);
    }

    public static c b(HttpClientConnection httpClientConnection) {
        return c(httpClientConnection).e();
    }

    private static d c(HttpClientConnection httpClientConnection) {
        if (d.class.isInstance(httpClientConnection)) {
            return (d) d.class.cast(httpClientConnection);
        }
        throw new IllegalStateException("Unexpected connection proxy class: " + httpClientConnection.getClass());
    }

    public String a() {
        return g().a();
    }

    public void a(Socket socket) {
        g().a(socket);
    }

    public Socket b() {
        return g().b();
    }

    public SSLSession c() {
        return g().c();
    }

    public void close() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.c();
        }
    }

    c d() {
        return this.a;
    }

    c e() {
        c cVar = this.a;
        this.a = null;
        return cVar;
    }

    h f() {
        c cVar = this.a;
        return cVar == null ? null : (h) cVar.i();
    }

    public void flush() {
        g().flush();
    }

    h g() {
        h f = f();
        if (f != null) {
            return f;
        }
        throw new e();
    }

    public Object getAttribute(String str) {
        h g = g();
        return g instanceof HttpContext ? ((HttpContext) g).getAttribute(str) : null;
    }

    public InetAddress getLocalAddress() {
        return g().getLocalAddress();
    }

    public int getLocalPort() {
        return g().getLocalPort();
    }

    public HttpConnectionMetrics getMetrics() {
        return g().getMetrics();
    }

    public InetAddress getRemoteAddress() {
        return g().getRemoteAddress();
    }

    public int getRemotePort() {
        return g().getRemotePort();
    }

    public int getSocketTimeout() {
        return g().getSocketTimeout();
    }

    public boolean isOpen() {
        c cVar = this.a;
        return (cVar == null || cVar.e()) ? false : true;
    }

    public boolean isResponseAvailable(int i) {
        return g().isResponseAvailable(i);
    }

    public boolean isStale() {
        HttpClientConnection f = f();
        return f != null ? f.isStale() : true;
    }

    public void receiveResponseEntity(HttpResponse httpResponse) {
        g().receiveResponseEntity(httpResponse);
    }

    public HttpResponse receiveResponseHeader() {
        return g().receiveResponseHeader();
    }

    public Object removeAttribute(String str) {
        h g = g();
        return g instanceof HttpContext ? ((HttpContext) g).removeAttribute(str) : null;
    }

    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        g().sendRequestEntity(httpEntityEnclosingRequest);
    }

    public void sendRequestHeader(HttpRequest httpRequest) {
        g().sendRequestHeader(httpRequest);
    }

    public void setAttribute(String str, Object obj) {
        h g = g();
        if (g instanceof HttpContext) {
            ((HttpContext) g).setAttribute(str, obj);
        }
    }

    public void setSocketTimeout(int i) {
        g().setSocketTimeout(i);
    }

    public void shutdown() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.d();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CPoolProxy{");
        h f = f();
        if (f != null) {
            stringBuilder.append(f);
        } else {
            stringBuilder.append("detached");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
