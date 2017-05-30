package org.a.a.i.g;

import org.a.a.a.b;
import org.a.a.j.c;
import org.apache.http.HttpResponse;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;

@b
public class n implements c<HttpResponse> {
    public static final n a = new n();
    private final LineFormatter b;

    public n() {
        this(null);
    }

    public n(LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = org.a.a.k.c.b;
        }
        this.b = lineFormatter;
    }

    public HttpMessageWriter a(SessionOutputBuffer sessionOutputBuffer) {
        return new m(sessionOutputBuffer, this.b);
    }
}
