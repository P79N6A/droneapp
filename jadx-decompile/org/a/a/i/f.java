package org.a.a.i;

import java.net.Socket;
import org.a.a.a.b;
import org.a.a.d;
import org.a.a.e.a;
import org.a.a.j.c;
import org.apache.http.HttpConnection;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentLengthStrategy;

@b
public class f implements d<e> {
    public static final f a = new f();
    private final a b;
    private final ContentLengthStrategy c;
    private final ContentLengthStrategy d;
    private final org.a.a.j.b<HttpRequest> e;
    private final c<HttpResponse> f;

    public f() {
        this(null, null, null, null, null);
    }

    public f(a aVar) {
        this(aVar, null, null, null, null);
    }

    public f(a aVar, org.a.a.j.b<HttpRequest> bVar, c<HttpResponse> cVar) {
        this(aVar, null, null, bVar, cVar);
    }

    public f(a aVar, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, org.a.a.j.b<HttpRequest> bVar, c<HttpResponse> cVar) {
        if (aVar == null) {
            aVar = a.a;
        }
        this.b = aVar;
        this.c = contentLengthStrategy;
        this.d = contentLengthStrategy2;
        this.e = bVar;
        this.f = cVar;
    }

    public /* synthetic */ HttpConnection a(Socket socket) {
        return b(socket);
    }

    public e b(Socket socket) {
        e eVar = new e(this.b.a(), this.b.b(), b.a(this.b), b.b(this.b), this.b.f(), this.c, this.d, this.e, this.f);
        eVar.a(socket);
        return eVar;
    }
}
