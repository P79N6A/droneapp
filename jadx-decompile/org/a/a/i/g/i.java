package org.a.a.i.g;

import org.a.a.a.c;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;

@c
public class i extends b<HttpRequest> {
    public i(SessionOutputBuffer sessionOutputBuffer) {
        this(sessionOutputBuffer, null);
    }

    public i(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter) {
        super(sessionOutputBuffer, lineFormatter);
    }

    protected void a(HttpMessage httpMessage) {
        this.c.formatRequestLine(this.b, ((HttpRequest) httpMessage).getRequestLine());
        this.a.writeLine(this.b);
    }
}
