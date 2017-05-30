package org.a.a.c.c;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.a.a.a.c;
import org.a.a.c.b.h;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.HeaderGroup;

@c
public class p {
    private String a;
    private ProtocolVersion b;
    private URI c;
    private HeaderGroup d;
    private HttpEntity e;
    private LinkedList<NameValuePair> f;
    private org.a.a.c.a.c g;

    static class a extends e {
        private final String a;

        a(String str) {
            this.a = str;
        }

        public String getMethod() {
            return this.a;
        }
    }

    static class b extends m {
        private final String a;

        b(String str) {
            this.a = str;
        }

        public String getMethod() {
            return this.a;
        }
    }

    p() {
        this(null);
    }

    p(String str) {
        this.a = str;
    }

    public static p a() {
        return new p("GET");
    }

    public static p a(String str) {
        org.a.a.o.a.b((CharSequence) str, "HTTP method");
        return new p(str);
    }

    public static p a(HttpRequest httpRequest) {
        org.a.a.o.a.a((Object) httpRequest, "HTTP request");
        return new p().b(httpRequest);
    }

    public static p b() {
        return new p(h.a);
    }

    private p b(HttpRequest httpRequest) {
        if (httpRequest != null) {
            this.a = httpRequest.getRequestLine().getMethod();
            this.b = httpRequest.getRequestLine().getProtocolVersion();
            if (httpRequest instanceof HttpUriRequest) {
                this.c = ((HttpUriRequest) httpRequest).getURI();
            } else {
                this.c = URI.create(httpRequest.getRequestLine().getUri());
            }
            if (this.d == null) {
                this.d = new HeaderGroup();
            }
            this.d.clear();
            this.d.setHeaders(httpRequest.getAllHeaders());
            if (httpRequest instanceof HttpEntityEnclosingRequest) {
                this.e = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
            } else {
                this.e = null;
            }
            if (httpRequest instanceof c) {
                this.g = ((c) httpRequest).v_();
            } else {
                this.g = null;
            }
            this.f = null;
        }
        return this;
    }

    public static p c() {
        return new p("POST");
    }

    public static p d() {
        return new p(l.a);
    }

    public static p e() {
        return new p("DELETE");
    }

    public static p f() {
        return new p(o.a);
    }

    public static p g() {
        return new p(i.a);
    }

    public p a(String str, String str2) {
        if (this.d == null) {
            this.d = new HeaderGroup();
        }
        this.d.addHeader(new BasicHeader(str, str2));
        return this;
    }

    public p a(URI uri) {
        this.c = uri;
        return this;
    }

    public p a(org.a.a.c.a.c cVar) {
        this.g = cVar;
        return this;
    }

    public p a(Header header) {
        if (this.d == null) {
            this.d = new HeaderGroup();
        }
        this.d.addHeader(header);
        return this;
    }

    public p a(HttpEntity httpEntity) {
        this.e = httpEntity;
        return this;
    }

    public p a(NameValuePair nameValuePair) {
        org.a.a.o.a.a((Object) nameValuePair, "Name value pair");
        if (this.f == null) {
            this.f = new LinkedList();
        }
        this.f.add(nameValuePair);
        return this;
    }

    public p a(ProtocolVersion protocolVersion) {
        this.b = protocolVersion;
        return this;
    }

    public p a(NameValuePair... nameValuePairArr) {
        for (NameValuePair a : nameValuePairArr) {
            a(a);
        }
        return this;
    }

    public p b(String str) {
        this.c = str != null ? URI.create(str) : null;
        return this;
    }

    public p b(String str, String str2) {
        if (this.d == null) {
            this.d = new HeaderGroup();
        }
        this.d.updateHeader(new BasicHeader(str, str2));
        return this;
    }

    public p b(Header header) {
        if (this.d == null) {
            this.d = new HeaderGroup();
        }
        this.d.removeHeader(header);
        return this;
    }

    public p c(String str, String str2) {
        return a(new BasicNameValuePair(str, str2));
    }

    public p c(Header header) {
        if (this.d == null) {
            this.d = new HeaderGroup();
        }
        this.d.updateHeader(header);
        return this;
    }

    public Header c(String str) {
        return this.d != null ? this.d.getFirstHeader(str) : null;
    }

    public Header d(String str) {
        return this.d != null ? this.d.getLastHeader(str) : null;
    }

    public Header[] e(String str) {
        return this.d != null ? this.d.getHeaders(str) : null;
    }

    public p f(String str) {
        if (!(str == null || this.d == null)) {
            HeaderIterator it = this.d.iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.nextHeader().getName())) {
                    it.remove();
                }
            }
        }
        return this;
    }

    public String h() {
        return this.a;
    }

    public ProtocolVersion i() {
        return this.b;
    }

    public URI j() {
        return this.c;
    }

    public HttpEntity k() {
        return this.e;
    }

    public List<NameValuePair> l() {
        return this.f != null ? new ArrayList(this.f) : new ArrayList();
    }

    public org.a.a.c.a.c m() {
        return this.g;
    }

    public HttpUriRequest n() {
        URI uri;
        HttpUriRequest bVar;
        URI create = this.c != null ? this.c : URI.create("/");
        HttpEntity httpEntity = this.e;
        if (this.f == null || this.f.isEmpty()) {
            uri = create;
        } else if (httpEntity == null && ("POST".equalsIgnoreCase(this.a) || l.a.equalsIgnoreCase(this.a))) {
            httpEntity = new h(this.f, Charset.forName("ISO-8859-1"));
            uri = create;
        } else {
            try {
                uri = new org.a.a.c.f.h(create).b(this.f).a();
            } catch (URISyntaxException e) {
                uri = create;
            }
        }
        if (httpEntity == null) {
            bVar = new b(this.a);
        } else {
            bVar = new a(this.a);
            bVar.setEntity(httpEntity);
        }
        bVar.a(this.b);
        bVar.a(uri);
        if (this.d != null) {
            bVar.setHeaders(this.d.getAllHeaders());
        }
        bVar.a(this.g);
        return bVar;
    }
}
