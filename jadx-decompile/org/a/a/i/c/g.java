package org.a.a.i.c;

import org.a.a.a.b;
import org.a.a.e.c;
import org.a.a.i.i;
import org.a.a.k.d;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;

@b
public class g implements org.a.a.j.b<HttpResponse> {
    public static final g a = new g();
    private final LineParser b;
    private final HttpResponseFactory c;

    public g() {
        this(null, null);
    }

    public g(HttpResponseFactory httpResponseFactory) {
        this(null, httpResponseFactory);
    }

    public g(LineParser lineParser, HttpResponseFactory httpResponseFactory) {
        if (lineParser == null) {
            lineParser = d.b;
        }
        this.b = lineParser;
        if (httpResponseFactory == null) {
            httpResponseFactory = i.a;
        }
        this.c = httpResponseFactory;
    }

    public HttpMessageParser a(SessionInputBuffer sessionInputBuffer, c cVar) {
        return new f(sessionInputBuffer, this.b, this.c, cVar);
    }
}
