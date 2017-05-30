package org.a.a.i.g;

import org.a.a.a.c;
import org.a.a.i.h;
import org.a.a.o.a;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@c
public class g extends a<HttpRequest> {
    private final HttpRequestFactory b;
    private final CharArrayBuffer c;

    public g(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, null, null, org.a.a.e.c.a);
    }

    public g(SessionInputBuffer sessionInputBuffer, org.a.a.e.c cVar) {
        this(sessionInputBuffer, null, null, cVar);
    }

    public g(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpRequestFactory httpRequestFactory, org.a.a.e.c cVar) {
        super(sessionInputBuffer, lineParser, cVar);
        if (httpRequestFactory == null) {
            httpRequestFactory = h.a;
        }
        this.b = httpRequestFactory;
        this.c = new CharArrayBuffer(128);
    }

    @Deprecated
    public g(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpRequestFactory httpRequestFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        this.b = (HttpRequestFactory) a.a(httpRequestFactory, "Request factory");
        this.c = new CharArrayBuffer(128);
    }

    protected HttpRequest a(SessionInputBuffer sessionInputBuffer) {
        this.c.clear();
        if (sessionInputBuffer.readLine(this.c) == -1) {
            throw new ConnectionClosedException("Client closed connection");
        }
        return this.b.newHttpRequest(this.a.parseRequestLine(this.c, new ParserCursor(0, this.c.length())));
    }

    protected /* synthetic */ HttpMessage b(SessionInputBuffer sessionInputBuffer) {
        return a(sessionInputBuffer);
    }
}
