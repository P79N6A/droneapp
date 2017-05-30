package org.a.a.i.c;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.concurrent.atomic.AtomicLong;
import org.a.a.a.b;
import org.a.a.e.a;
import org.a.a.f.e;
import org.a.a.f.h;
import org.a.a.i.g.j;
import org.a.a.j.c;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.conn.routing.HttpRoute;

@b
public class q implements e<HttpRoute, h> {
    public static final q a = new q();
    private static final AtomicLong b = new AtomicLong();
    private final c<HttpRequest> c;
    private final org.a.a.j.b<HttpResponse> d;

    public q() {
        this(null, null);
    }

    public q(org.a.a.j.b<HttpResponse> bVar) {
        this(null, bVar);
    }

    public q(c<HttpRequest> cVar, org.a.a.j.b<HttpResponse> bVar) {
        c cVar2;
        org.a.a.j.b bVar2;
        if (cVar == null) {
            cVar2 = j.a;
        }
        this.c = cVar2;
        if (bVar == null) {
            bVar2 = g.a;
        }
        this.d = bVar2;
    }

    public h a(HttpRoute httpRoute, a aVar) {
        CharsetDecoder newDecoder;
        CharsetEncoder newEncoder;
        if (aVar == null) {
            aVar = a.a;
        }
        Charset c = aVar.c();
        CodingErrorAction d = aVar.d() != null ? aVar.d() : CodingErrorAction.REPORT;
        CodingErrorAction e = aVar.e() != null ? aVar.e() : CodingErrorAction.REPORT;
        if (c != null) {
            newDecoder = c.newDecoder();
            newDecoder.onMalformedInput(d);
            newDecoder.onUnmappableCharacter(e);
            newEncoder = c.newEncoder();
            newEncoder.onMalformedInput(d);
            newEncoder.onUnmappableCharacter(e);
        } else {
            newEncoder = null;
            newDecoder = null;
        }
        return new o("http-outgoing-" + Long.toString(b.getAndIncrement()), aVar.a(), aVar.b(), newDecoder, newEncoder, aVar.f(), null, null, this.c, this.d);
    }
}
