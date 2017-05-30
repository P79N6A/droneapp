package org.a.a.i.g;

import org.a.a.a.c;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;

@c
public class m extends b<HttpResponse> {
    public m(SessionOutputBuffer sessionOutputBuffer) {
        super(sessionOutputBuffer, null);
    }

    public m(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter) {
        super(sessionOutputBuffer, lineFormatter);
    }

    protected void a(HttpMessage httpMessage) {
        this.c.formatStatusLine(this.b, ((HttpResponse) httpMessage).getStatusLine());
        this.a.writeLine(this.b);
    }
}
