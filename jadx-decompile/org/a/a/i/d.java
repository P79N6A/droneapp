package org.a.a.i;

import java.net.Socket;
import org.a.a.a.b;
import org.a.a.e.a;
import org.a.a.j.c;
import org.apache.http.HttpConnection;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentLengthStrategy;

@b
public class d implements org.a.a.d<c> {
    public static final d a = new d();
    private final a b;
    private final ContentLengthStrategy c;
    private final ContentLengthStrategy d;
    private final c<HttpRequest> e;
    private final org.a.a.j.b<HttpResponse> f;

    public d() {
        this(null, null, null, null, null);
    }

    public d(a aVar) {
        this(aVar, null, null, null, null);
    }

    public d(a aVar, c<HttpRequest> cVar, org.a.a.j.b<HttpResponse> bVar) {
        this(aVar, null, null, cVar, bVar);
    }

    public d(a aVar, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, c<HttpRequest> cVar, org.a.a.j.b<HttpResponse> bVar) {
        if (aVar == null) {
            aVar = a.a;
        }
        this.b = aVar;
        this.c = contentLengthStrategy;
        this.d = contentLengthStrategy2;
        this.e = cVar;
        this.f = bVar;
    }

    public /* synthetic */ HttpConnection a(Socket socket) {
        return b(socket);
    }

    public c b(Socket socket) {
        c cVar = new c(this.b.a(), this.b.b(), b.a(this.b), b.b(this.b), this.b.f(), this.c, this.d, this.e, this.f);
        cVar.a(socket);
        return cVar;
    }
}
