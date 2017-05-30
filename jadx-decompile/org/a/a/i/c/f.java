package org.a.a.i.c;

import android.util.Log;
import org.a.a.a.c;
import org.a.a.i.g.a;
import org.a.a.i.i;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@c
public class f extends a<HttpResponse> {
    private static final String b = "HttpClient";
    private final HttpResponseFactory c;
    private final CharArrayBuffer d;

    public f(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, null, null, org.a.a.e.c.a);
    }

    public f(SessionInputBuffer sessionInputBuffer, org.a.a.e.c cVar) {
        this(sessionInputBuffer, null, null, cVar);
    }

    public f(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, org.a.a.e.c cVar) {
        super(sessionInputBuffer, lineParser, cVar);
        if (httpResponseFactory == null) {
            httpResponseFactory = i.a;
        }
        this.c = httpResponseFactory;
        this.d = new CharArrayBuffer(128);
    }

    @Deprecated
    public f(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        org.a.a.o.a.a(httpResponseFactory, "Response factory");
        this.c = httpResponseFactory;
        this.d = new CharArrayBuffer(128);
    }

    protected HttpResponse a(SessionInputBuffer sessionInputBuffer) {
        int i = 0;
        while (true) {
            this.d.clear();
            int readLine = sessionInputBuffer.readLine(this.d);
            if (readLine == -1 && i == 0) {
                throw new NoHttpResponseException("The target server failed to respond");
            }
            ParserCursor parserCursor = new ParserCursor(0, this.d.length());
            if (this.a.hasProtocolVersion(this.d, parserCursor)) {
                return this.c.newHttpResponse(this.a.parseStatusLine(this.d, parserCursor), null);
            } else if (readLine != -1 && !a(this.d, i)) {
                if (Log.isLoggable(b, 3)) {
                    Log.d(b, "Garbage in response: " + this.d.toString());
                }
                i++;
            }
        }
        throw new ProtocolException("The server failed to respond with a valid HTTP response");
    }

    protected boolean a(CharArrayBuffer charArrayBuffer, int i) {
        return false;
    }

    protected /* synthetic */ HttpMessage b(SessionInputBuffer sessionInputBuffer) {
        return a(sessionInputBuffer);
    }
}
