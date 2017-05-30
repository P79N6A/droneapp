package org.a.a.i.g;

import org.a.a.a.b;
import org.a.a.e.c;
import org.a.a.k.d;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;

@b
public class h implements org.a.a.j.b<HttpRequest> {
    public static final h a = new h();
    private final LineParser b;
    private final HttpRequestFactory c;

    public h() {
        this(null, null);
    }

    public h(LineParser lineParser, HttpRequestFactory httpRequestFactory) {
        if (lineParser == null) {
            lineParser = d.b;
        }
        this.b = lineParser;
        if (httpRequestFactory == null) {
            httpRequestFactory = org.a.a.i.h.a;
        }
        this.c = httpRequestFactory;
    }

    public HttpMessageParser a(SessionInputBuffer sessionInputBuffer, c cVar) {
        return new g(sessionInputBuffer, this.b, this.c, cVar);
    }
}
