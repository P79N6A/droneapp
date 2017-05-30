package org.a.a.i;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.a.a.a.c;
import org.a.a.i.e.b;
import org.a.a.i.g.d;
import org.a.a.i.g.e;
import org.a.a.i.g.f;
import org.a.a.i.g.o;
import org.a.a.i.g.p;
import org.a.a.i.g.q;
import org.a.a.i.g.r;
import org.apache.http.Header;
import org.apache.http.HttpConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntity;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpMessage;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.HttpConnectionMetricsImpl;
import org.apache.http.impl.io.HttpTransportMetricsImpl;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;

@c
public class a implements HttpConnection, HttpInetConnection {
    private final q a;
    private final r b;
    private final HttpConnectionMetricsImpl c;
    private final ContentLengthStrategy d;
    private final ContentLengthStrategy e;
    private volatile boolean f;
    private volatile Socket g;

    protected a(int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, org.a.a.e.c cVar, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2) {
        org.a.a.o.a.a(i, "Buffer size");
        HttpTransportMetrics httpTransportMetricsImpl = new HttpTransportMetricsImpl();
        HttpTransportMetrics httpTransportMetricsImpl2 = new HttpTransportMetricsImpl();
        this.a = new q(httpTransportMetricsImpl, i, -1, cVar != null ? cVar : org.a.a.e.c.a, charsetDecoder);
        this.b = new r(httpTransportMetricsImpl2, i, i2, charsetEncoder);
        this.c = new HttpConnectionMetricsImpl(httpTransportMetricsImpl, httpTransportMetricsImpl2);
        if (contentLengthStrategy == null) {
            contentLengthStrategy = b.a;
        }
        this.d = contentLengthStrategy;
        if (contentLengthStrategy2 == null) {
            contentLengthStrategy2 = org.a.a.i.e.c.a;
        }
        this.e = contentLengthStrategy2;
    }

    private int b(int i) {
        int soTimeout = this.g.getSoTimeout();
        try {
            this.g.setSoTimeout(i);
            int e = this.a.e();
            return e;
        } finally {
            this.g.setSoTimeout(soTimeout);
        }
    }

    protected InputStream a(long j, SessionInputBuffer sessionInputBuffer) {
        return j == -2 ? new org.a.a.i.g.c(sessionInputBuffer) : j == -1 ? new o(sessionInputBuffer) : new e(sessionInputBuffer, j);
    }

    protected OutputStream a(long j, SessionOutputBuffer sessionOutputBuffer) {
        return j == -2 ? new d(2048, sessionOutputBuffer) : j == -1 ? new p(sessionOutputBuffer) : new f(sessionOutputBuffer, j);
    }

    protected OutputStream a(HttpMessage httpMessage) {
        return a(this.e.determineLength(httpMessage), this.b);
    }

    protected void a(Socket socket) {
        org.a.a.o.a.a((Object) socket, "Socket");
        this.g = socket;
        this.f = true;
        this.a.a(null);
        this.b.a(null);
    }

    protected boolean a(int i) {
        if (this.a.f()) {
            return true;
        }
        b(i);
        return this.a.f();
    }

    protected InputStream b(Socket socket) {
        return socket.getInputStream();
    }

    protected Socket b() {
        return this.g;
    }

    protected HttpEntity b(HttpMessage httpMessage) {
        org.a.a.h.b bVar = new org.a.a.h.b();
        long determineLength = this.d.determineLength(httpMessage);
        InputStream a = a(determineLength, this.a);
        if (determineLength == -2) {
            bVar.a(true);
            bVar.a(-1);
            bVar.a(a);
        } else if (determineLength == -1) {
            bVar.a(false);
            bVar.a(-1);
            bVar.a(a);
        } else {
            bVar.a(false);
            bVar.a(determineLength);
            bVar.a(a);
        }
        Header firstHeader = httpMessage.getFirstHeader("Content-Type");
        if (firstHeader != null) {
            bVar.a(firstHeader);
        }
        firstHeader = httpMessage.getFirstHeader("Content-Encoding");
        if (firstHeader != null) {
            bVar.b(firstHeader);
        }
        return bVar;
    }

    protected OutputStream c(Socket socket) {
        return socket.getOutputStream();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
        r2 = this;
        r0 = r2.f;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = 0;
        r2.f = r0;
        r1 = r2.g;
        r0 = r2.a;	 Catch:{ all -> 0x001e }
        r0.g();	 Catch:{ all -> 0x001e }
        r0 = r2.b;	 Catch:{ all -> 0x001e }
        r0.flush();	 Catch:{ all -> 0x001e }
        r1.shutdownOutput();	 Catch:{ IOException -> 0x0023, UnsupportedOperationException -> 0x0027 }
    L_0x0017:
        r1.shutdownInput();	 Catch:{ IOException -> 0x0025, UnsupportedOperationException -> 0x0027 }
    L_0x001a:
        r1.close();
        goto L_0x0004;
    L_0x001e:
        r0 = move-exception;
        r1.close();
        throw r0;
    L_0x0023:
        r0 = move-exception;
        goto L_0x0017;
    L_0x0025:
        r0 = move-exception;
        goto L_0x001a;
    L_0x0027:
        r0 = move-exception;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.a.a.i.a.close():void");
    }

    protected void d() {
        org.a.a.o.b.a(this.f, "Connection is not open");
        if (!this.a.a()) {
            this.a.a(b(this.g));
        }
        if (!this.b.a()) {
            this.b.a(c(this.g));
        }
    }

    protected SessionInputBuffer e() {
        return this.a;
    }

    protected SessionOutputBuffer f() {
        return this.b;
    }

    protected void g() {
        this.b.flush();
    }

    public InetAddress getLocalAddress() {
        return this.g != null ? this.g.getLocalAddress() : null;
    }

    public int getLocalPort() {
        return this.g != null ? this.g.getLocalPort() : -1;
    }

    public HttpConnectionMetrics getMetrics() {
        return this.c;
    }

    public InetAddress getRemoteAddress() {
        return this.g != null ? this.g.getInetAddress() : null;
    }

    public int getRemotePort() {
        return this.g != null ? this.g.getPort() : -1;
    }

    public int getSocketTimeout() {
        int i = -1;
        if (this.g != null) {
            try {
                i = this.g.getSoTimeout();
            } catch (SocketException e) {
            }
        }
        return i;
    }

    protected void h() {
        this.c.incrementRequestCount();
    }

    protected void i() {
        this.c.incrementResponseCount();
    }

    public boolean isOpen() {
        return this.f;
    }

    public boolean isStale() {
        if (!isOpen()) {
            return true;
        }
        try {
            return b(1) < 0;
        } catch (SocketTimeoutException e) {
            return false;
        } catch (IOException e2) {
            return true;
        }
    }

    public void setSocketTimeout(int i) {
        if (this.g != null) {
            try {
                this.g.setSoTimeout(i);
            } catch (SocketException e) {
            }
        }
    }

    public void shutdown() {
        this.f = false;
        Socket socket = this.g;
        if (socket != null) {
            socket.close();
        }
    }

    public String toString() {
        if (this.g == null) {
            return "[Not bound]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        SocketAddress remoteSocketAddress = this.g.getRemoteSocketAddress();
        SocketAddress localSocketAddress = this.g.getLocalSocketAddress();
        if (!(remoteSocketAddress == null || localSocketAddress == null)) {
            org.a.a.o.e.a(stringBuilder, localSocketAddress);
            stringBuilder.append("<->");
            org.a.a.o.e.a(stringBuilder, remoteSocketAddress);
        }
        return stringBuilder.toString();
    }
}
