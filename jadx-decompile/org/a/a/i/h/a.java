package org.a.a.i.h;

import com.facebook.common.util.UriUtil;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.a.a.a.b;
import org.a.a.d;
import org.a.a.e.f;
import org.a.a.i.c;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.params.HttpParams;

@b
public class a implements org.a.a.m.b<HttpHost, HttpClientConnection> {
    private final SocketFactory a;
    private final SSLSocketFactory b;
    private final int c;
    private final f d;
    private final d<? extends HttpClientConnection> e;

    public a() {
        this(null, null, 0, f.a, org.a.a.e.a.a);
    }

    public a(int i, f fVar, org.a.a.e.a aVar) {
        this(null, null, i, fVar, aVar);
    }

    public a(SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, int i, f fVar, org.a.a.e.a aVar) {
        this.a = socketFactory;
        this.b = sSLSocketFactory;
        this.c = i;
        if (fVar == null) {
            fVar = f.a;
        }
        this.d = fVar;
        if (aVar == null) {
            aVar = org.a.a.e.a.a;
        }
        this.e = new org.a.a.i.d(aVar);
    }

    @Deprecated
    public a(SSLSocketFactory sSLSocketFactory, HttpParams httpParams) {
        org.a.a.o.a.a(httpParams, "HTTP params");
        this.a = null;
        this.b = sSLSocketFactory;
        this.c = httpParams.getIntParameter("http.connection.timeout", 0);
        this.d = org.a.a.l.a.a(httpParams);
        this.e = new org.a.a.i.d(org.a.a.l.a.c(httpParams));
    }

    public a(f fVar, org.a.a.e.a aVar) {
        this(null, null, 0, fVar, aVar);
    }

    @Deprecated
    public a(HttpParams httpParams) {
        this(null, httpParams);
    }

    @Deprecated
    protected HttpClientConnection a(Socket socket, HttpParams httpParams) {
        HttpClientConnection cVar = new c(httpParams.getIntParameter("http.socket.buffer-size", 8192));
        cVar.a(socket);
        return cVar;
    }

    public HttpClientConnection a(HttpHost httpHost) {
        Socket createSocket;
        String schemeName = httpHost.getSchemeName();
        Socket socket = null;
        if (UriUtil.HTTP_SCHEME.equalsIgnoreCase(schemeName)) {
            socket = this.a != null ? this.a.createSocket() : new Socket();
        }
        if (UriUtil.HTTPS_SCHEME.equalsIgnoreCase(schemeName)) {
            createSocket = (this.b != null ? this.b : SSLSocketFactory.getDefault()).createSocket();
        } else {
            createSocket = socket;
        }
        if (createSocket == null) {
            throw new IOException(schemeName + " scheme is not supported");
        }
        schemeName = httpHost.getHostName();
        int port = httpHost.getPort();
        if (port == -1) {
            if (httpHost.getSchemeName().equalsIgnoreCase(UriUtil.HTTP_SCHEME)) {
                port = 80;
            } else if (httpHost.getSchemeName().equalsIgnoreCase(UriUtil.HTTPS_SCHEME)) {
                port = 443;
            }
        }
        createSocket.setSoTimeout(this.d.a());
        createSocket.connect(new InetSocketAddress(schemeName, port), this.c);
        createSocket.setTcpNoDelay(this.d.e());
        int c = this.d.c();
        if (c >= 0) {
            createSocket.setSoLinger(c > 0, c);
        }
        createSocket.setKeepAlive(this.d.d());
        return (HttpClientConnection) this.e.a(createSocket);
    }
}
