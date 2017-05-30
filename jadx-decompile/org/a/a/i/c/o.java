package org.a.a.i.c;

import android.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.a.a.a.c;
import org.a.a.j.b;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentLengthStrategy;

@c
class o extends h {
    private static final String a = "HttpClient";
    private static final String b = "Headers";
    private final u c;

    public o(String str, int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, org.a.a.e.c cVar, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, org.a.a.j.c<HttpRequest> cVar2, b<HttpResponse> bVar) {
        super(str, i, i2, charsetDecoder, charsetEncoder, cVar, contentLengthStrategy, contentLengthStrategy2, cVar2, bVar);
        this.c = new u(str);
    }

    protected void a(HttpRequest httpRequest) {
        if (httpRequest != null && Log.isLoggable(b, 3)) {
            Log.d(b, a() + " >> " + httpRequest.getRequestLine().toString());
            for (Object obj : httpRequest.getAllHeaders()) {
                Log.d(b, a() + " >> " + obj.toString());
            }
        }
    }

    protected void a(HttpResponse httpResponse) {
        if (httpResponse != null && Log.isLoggable(b, 3)) {
            Log.d(b, a() + " << " + httpResponse.getStatusLine().toString());
            for (Object obj : httpResponse.getAllHeaders()) {
                Log.d(b, a() + " << " + obj.toString());
            }
        }
    }

    protected InputStream b(Socket socket) {
        InputStream b = super.b(socket);
        return this.c.a() ? new n(b, this.c) : b;
    }

    protected OutputStream c(Socket socket) {
        OutputStream c = super.c(socket);
        return this.c.a() ? new p(c, this.c) : c;
    }

    public void close() {
        if (Log.isLoggable(a, 3)) {
            Log.d(a, a() + ": Close connection");
        }
        super.close();
    }

    public void shutdown() {
        if (Log.isLoggable(a, 3)) {
            Log.d(a, a() + ": Shutdown connection");
        }
        super.shutdown();
    }
}
