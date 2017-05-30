package org.a.a.i.g;

import org.a.a.a.b;
import org.a.a.j.c;
import org.apache.http.HttpRequest;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;

@b
public class j implements c<HttpRequest> {
    public static final j a = new j();
    private final LineFormatter b;

    public j() {
        this(null);
    }

    public j(LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = org.a.a.k.c.b;
        }
        this.b = lineFormatter;
    }

    public HttpMessageWriter a(SessionOutputBuffer sessionOutputBuffer) {
        return new i(sessionOutputBuffer, this.b);
    }
}
