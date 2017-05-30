package org.a.a.i.g;

import org.a.a.a.c;
import org.a.a.o.a;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpMessage;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@c
public abstract class b<T extends HttpMessage> implements HttpMessageWriter {
    protected final SessionOutputBuffer a;
    protected final CharArrayBuffer b;
    protected final LineFormatter c;

    public b(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter) {
        this.a = (SessionOutputBuffer) a.a(sessionOutputBuffer, "Session input buffer");
        if (lineFormatter == null) {
            lineFormatter = org.a.a.k.c.b;
        }
        this.c = lineFormatter;
        this.b = new CharArrayBuffer(128);
    }

    @Deprecated
    public b(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter, HttpParams httpParams) {
        a.a(sessionOutputBuffer, "Session input buffer");
        this.a = sessionOutputBuffer;
        this.b = new CharArrayBuffer(128);
        if (lineFormatter == null) {
            lineFormatter = org.a.a.k.c.b;
        }
        this.c = lineFormatter;
    }

    protected abstract void a(HttpMessage httpMessage);

    public void write(HttpMessage httpMessage) {
        a.a(httpMessage, "HTTP message");
        a(httpMessage);
        HeaderIterator headerIterator = httpMessage.headerIterator();
        while (headerIterator.hasNext()) {
            this.a.writeLine(this.c.formatHeader(this.b, headerIterator.nextHeader()));
        }
        this.b.clear();
        this.a.writeLine(this.b);
    }
}
