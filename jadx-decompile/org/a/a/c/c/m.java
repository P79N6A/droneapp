package org.a.a.c.c;

import java.net.URI;
import org.a.a.a.c;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpProtocolParams;

@c
public abstract class m extends a implements c, HttpUriRequest {
    private ProtocolVersion a;
    private URI b;
    private org.a.a.c.a.c c;

    public void a(URI uri) {
        this.b = uri;
    }

    public void a(org.a.a.c.a.c cVar) {
        this.c = cVar;
    }

    public void a(ProtocolVersion protocolVersion) {
        this.a = protocolVersion;
    }

    public void c() {
    }

    public void d() {
        b();
    }

    public abstract String getMethod();

    public ProtocolVersion getProtocolVersion() {
        return this.a != null ? this.a : HttpProtocolParams.getVersion(getParams());
    }

    public RequestLine getRequestLine() {
        String method = getMethod();
        ProtocolVersion protocolVersion = getProtocolVersion();
        URI uri = getURI();
        String str = null;
        if (uri != null) {
            str = uri.toASCIIString();
        }
        if (str == null || str.length() == 0) {
            str = "/";
        }
        return new BasicRequestLine(method, str, protocolVersion);
    }

    public URI getURI() {
        return this.b;
    }

    public String toString() {
        return getMethod() + " " + getURI() + " " + getProtocolVersion();
    }

    public org.a.a.c.a.c v_() {
        return this.c;
    }
}
