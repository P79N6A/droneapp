package org.a.a.c.c;

import java.net.URI;
import org.a.a.a.c;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpParams;

@c
public class n extends AbstractHttpMessage implements HttpUriRequest {
    private final HttpRequest a;
    private final String b;
    private ProtocolVersion c;
    private URI d;

    private n(HttpRequest httpRequest) {
        this.a = httpRequest;
        this.c = this.a.getRequestLine().getProtocolVersion();
        this.b = this.a.getRequestLine().getMethod();
        if (httpRequest instanceof HttpUriRequest) {
            this.d = ((HttpUriRequest) httpRequest).getURI();
        } else {
            this.d = null;
        }
        setHeaders(httpRequest.getAllHeaders());
    }

    public static n a(HttpRequest httpRequest) {
        return httpRequest == null ? null : httpRequest instanceof HttpEntityEnclosingRequest ? new a((HttpEntityEnclosingRequest) httpRequest) : new n(httpRequest);
    }

    public HttpRequest a() {
        return this.a;
    }

    public void a(URI uri) {
        this.d = uri;
    }

    public void a(ProtocolVersion protocolVersion) {
        this.c = protocolVersion;
    }

    public void abort() {
        throw new UnsupportedOperationException();
    }

    public String getMethod() {
        return this.b;
    }

    @Deprecated
    public HttpParams getParams() {
        if (this.params == null) {
            this.params = this.a.getParams().copy();
        }
        return this.params;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.c != null ? this.c : this.a.getProtocolVersion();
    }

    public RequestLine getRequestLine() {
        String toASCIIString = this.d != null ? this.d.toASCIIString() : this.a.getRequestLine().getUri();
        if (toASCIIString == null || toASCIIString.length() == 0) {
            toASCIIString = "/";
        }
        return new BasicRequestLine(this.b, toASCIIString, getProtocolVersion());
    }

    public URI getURI() {
        return this.d;
    }

    public boolean isAborted() {
        return false;
    }

    public String toString() {
        return getRequestLine() + " " + this.headergroup;
    }
}
