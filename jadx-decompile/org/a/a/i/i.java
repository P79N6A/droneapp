package org.a.a.i;

import java.util.Locale;
import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.protocol.HttpContext;

@b
public class i implements HttpResponseFactory {
    public static final i a = new i();
    protected final ReasonPhraseCatalog b;

    public i() {
        this(j.a);
    }

    public i(ReasonPhraseCatalog reasonPhraseCatalog) {
        this.b = (ReasonPhraseCatalog) a.a((Object) reasonPhraseCatalog, "Reason phrase catalog");
    }

    protected Locale a(HttpContext httpContext) {
        return Locale.getDefault();
    }

    public HttpResponse newHttpResponse(ProtocolVersion protocolVersion, int i, HttpContext httpContext) {
        a.a((Object) protocolVersion, "HTTP version");
        Locale a = a(httpContext);
        return new BasicHttpResponse(new BasicStatusLine(protocolVersion, i, this.b.getReason(i, a)), this.b, a);
    }

    public HttpResponse newHttpResponse(StatusLine statusLine, HttpContext httpContext) {
        a.a((Object) statusLine, "Status line");
        return new BasicHttpResponse(statusLine, this.b, a(httpContext));
    }
}
