package org.a.a.i;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.a.a.a.c;
import org.a.a.i.e.a;
import org.a.a.i.g.h;
import org.a.a.i.g.n;
import org.a.a.j.b;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpServerConnection;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageWriter;

@c
public class e extends a implements HttpServerConnection {
    private final HttpMessageParser a;
    private final HttpMessageWriter b;

    public e(int i) {
        this(i, i, null, null, null, null, null, null, null);
    }

    public e(int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, org.a.a.e.c cVar, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, b<HttpRequest> bVar, org.a.a.j.c<HttpResponse> cVar2) {
        super(i, i2, charsetDecoder, charsetEncoder, cVar, contentLengthStrategy != null ? contentLengthStrategy : a.a, contentLengthStrategy2);
        if (bVar == null) {
            bVar = h.a;
        }
        this.a = bVar.a(e(), cVar);
        if (cVar2 == null) {
            cVar2 = n.a;
        }
        this.b = cVar2.a(f());
    }

    public e(int i, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, org.a.a.e.c cVar) {
        this(i, i, charsetDecoder, charsetEncoder, cVar, null, null, null, null);
    }

    public void a(Socket socket) {
        super.a(socket);
    }

    protected void a(HttpRequest httpRequest) {
    }

    protected void a(HttpResponse httpResponse) {
    }

    public void flush() {
        d();
        g();
    }

    public void receiveRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        org.a.a.o.a.a((Object) httpEntityEnclosingRequest, "HTTP request");
        d();
        httpEntityEnclosingRequest.setEntity(b((HttpMessage) httpEntityEnclosingRequest));
    }

    public HttpRequest receiveRequestHeader() {
        d();
        HttpRequest httpRequest = (HttpRequest) this.a.parse();
        a(httpRequest);
        h();
        return httpRequest;
    }

    public void sendResponseEntity(HttpResponse httpResponse) {
        org.a.a.o.a.a((Object) httpResponse, "HTTP response");
        d();
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null) {
            OutputStream a = a((HttpMessage) httpResponse);
            entity.writeTo(a);
            a.close();
        }
    }

    public void sendResponseHeader(HttpResponse httpResponse) {
        org.a.a.o.a.a((Object) httpResponse, "HTTP response");
        d();
        this.b.write(httpResponse);
        a(httpResponse);
        if (httpResponse.getStatusLine().getStatusCode() >= 200) {
            i();
        }
    }
}
