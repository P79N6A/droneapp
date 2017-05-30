package org.a.a.i.g;

import org.a.a.a.c;
import org.a.a.i.i;
import org.a.a.o.a;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@c
public class k extends a<HttpResponse> {
    private final HttpResponseFactory b;
    private final CharArrayBuffer c;

    public k(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, null, null, org.a.a.e.c.a);
    }

    public k(SessionInputBuffer sessionInputBuffer, org.a.a.e.c cVar) {
        this(sessionInputBuffer, null, null, cVar);
    }

    public k(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, org.a.a.e.c cVar) {
        super(sessionInputBuffer, lineParser, cVar);
        if (httpResponseFactory == null) {
            httpResponseFactory = i.a;
        }
        this.b = httpResponseFactory;
        this.c = new CharArrayBuffer(128);
    }

    @Deprecated
    public k(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        this.b = (HttpResponseFactory) a.a(httpResponseFactory, "Response factory");
        this.c = new CharArrayBuffer(128);
    }

    protected HttpResponse a(SessionInputBuffer sessionInputBuffer) {
        this.c.clear();
        if (sessionInputBuffer.readLine(this.c) == -1) {
            throw new NoHttpResponseException("The target server failed to respond");
        }
        return this.b.newHttpResponse(this.a.parseStatusLine(this.c, new ParserCursor(0, this.c.length())), null);
    }

    protected /* synthetic */ HttpMessage b(SessionInputBuffer sessionInputBuffer) {
        return a(sessionInputBuffer);
    }
}
