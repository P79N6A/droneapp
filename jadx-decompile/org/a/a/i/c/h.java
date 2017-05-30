package org.a.a.i.c;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.a.a.a.c;
import org.a.a.j.b;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.protocol.HttpContext;

@c
public class h extends org.a.a.i.c implements org.a.a.f.h, HttpContext {
    private final String a;
    private final Map<String, Object> b;
    private volatile boolean c;

    public h(String str, int i) {
        this(str, i, i, null, null, null, null, null, null, null);
    }

    public h(String str, int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, org.a.a.e.c cVar, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, org.a.a.j.c<HttpRequest> cVar2, b<HttpResponse> bVar) {
        super(i, i2, charsetDecoder, charsetEncoder, cVar, contentLengthStrategy, contentLengthStrategy2, cVar2, bVar);
        this.a = str;
        this.b = new ConcurrentHashMap();
    }

    public String a() {
        return this.a;
    }

    public void a(Socket socket) {
        if (this.c) {
            socket.close();
            throw new InterruptedIOException("Connection already shutdown");
        } else {
            super.a(socket);
        }
    }

    public Socket b() {
        return super.b();
    }

    public SSLSession c() {
        Socket b = super.b();
        return b instanceof SSLSocket ? ((SSLSocket) b).getSession() : null;
    }

    public Object getAttribute(String str) {
        return this.b.get(str);
    }

    public Object removeAttribute(String str) {
        return this.b.remove(str);
    }

    public void setAttribute(String str, Object obj) {
        this.b.put(str, obj);
    }

    public void shutdown() {
        this.c = true;
        super.shutdown();
    }
}
