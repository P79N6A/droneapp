package org.a.a.i;

import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.a.a.i.g.j;
import org.a.a.i.g.l;
import org.a.a.j.b;
import org.a.a.o.a;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageWriter;

@org.a.a.a.c
public class c extends a implements HttpClientConnection {
    private final HttpMessageParser a;
    private final HttpMessageWriter b;

    public c(int i) {
        this(i, i, null, null, null, null, null, null, null);
    }

    public c(int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, org.a.a.e.c cVar, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, org.a.a.j.c<HttpRequest> cVar2, b<HttpResponse> bVar) {
        org.a.a.j.c cVar3;
        b bVar2;
        super(i, i2, charsetDecoder, charsetEncoder, cVar, contentLengthStrategy, contentLengthStrategy2);
        if (cVar2 == null) {
            cVar3 = j.a;
        }
        this.b = cVar3.a(f());
        if (bVar == null) {
            bVar2 = l.a;
        }
        this.a = bVar2.a(e(), cVar);
    }

    public c(int i, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, org.a.a.e.c cVar) {
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

    public boolean isResponseAvailable(int i) {
        d();
        try {
            return a(i);
        } catch (SocketTimeoutException e) {
            return false;
        }
    }

    public void receiveResponseEntity(HttpResponse httpResponse) {
        a.a((Object) httpResponse, "HTTP response");
        d();
        httpResponse.setEntity(b((HttpMessage) httpResponse));
    }

    public HttpResponse receiveResponseHeader() {
        d();
        HttpResponse httpResponse = (HttpResponse) this.a.parse();
        a(httpResponse);
        if (httpResponse.getStatusLine().getStatusCode() >= 200) {
            i();
        }
        return httpResponse;
    }

    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        a.a((Object) httpEntityEnclosingRequest, "HTTP request");
        d();
        HttpEntity entity = httpEntityEnclosingRequest.getEntity();
        if (entity != null) {
            OutputStream a = a((HttpMessage) httpEntityEnclosingRequest);
            entity.writeTo(a);
            a.close();
        }
    }

    public void sendRequestHeader(HttpRequest httpRequest) {
        a.a((Object) httpRequest, "HTTP request");
        d();
        this.b.write(httpRequest);
        a(httpRequest);
        h();
    }
}
