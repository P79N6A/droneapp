package org.a.a.i.f;

import java.util.Locale;
import org.a.a.a.c;
import org.a.a.c.c.b;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.params.HttpParams;

@c
class d implements b {
    private final HttpResponse a;
    private final c b;

    public d(HttpResponse httpResponse, c cVar) {
        this.a = httpResponse;
        this.b = cVar;
        k.a(httpResponse, cVar);
    }

    public void addHeader(String str, String str2) {
        this.a.addHeader(str, str2);
    }

    public void addHeader(Header header) {
        this.a.addHeader(header);
    }

    public void close() {
        if (this.b != null) {
            this.b.abortConnection();
        }
    }

    public boolean containsHeader(String str) {
        return this.a.containsHeader(str);
    }

    public Header[] getAllHeaders() {
        return this.a.getAllHeaders();
    }

    public HttpEntity getEntity() {
        return this.a.getEntity();
    }

    public Header getFirstHeader(String str) {
        return this.a.getFirstHeader(str);
    }

    public Header[] getHeaders(String str) {
        return this.a.getHeaders(str);
    }

    public Header getLastHeader(String str) {
        return this.a.getLastHeader(str);
    }

    public Locale getLocale() {
        return this.a.getLocale();
    }

    @Deprecated
    public HttpParams getParams() {
        return this.a.getParams();
    }

    public ProtocolVersion getProtocolVersion() {
        return this.a.getProtocolVersion();
    }

    public StatusLine getStatusLine() {
        return this.a.getStatusLine();
    }

    public HeaderIterator headerIterator() {
        return this.a.headerIterator();
    }

    public HeaderIterator headerIterator(String str) {
        return this.a.headerIterator(str);
    }

    public void removeHeader(Header header) {
        this.a.removeHeader(header);
    }

    public void removeHeaders(String str) {
        this.a.removeHeaders(str);
    }

    public void setEntity(HttpEntity httpEntity) {
        this.a.setEntity(httpEntity);
    }

    public void setHeader(String str, String str2) {
        this.a.setHeader(str, str2);
    }

    public void setHeader(Header header) {
        this.a.setHeader(header);
    }

    public void setHeaders(Header[] headerArr) {
        this.a.setHeaders(headerArr);
    }

    public void setLocale(Locale locale) {
        this.a.setLocale(locale);
    }

    @Deprecated
    public void setParams(HttpParams httpParams) {
        this.a.setParams(httpParams);
    }

    public void setReasonPhrase(String str) {
        this.a.setReasonPhrase(str);
    }

    public void setStatusCode(int i) {
        this.a.setStatusCode(i);
    }

    public void setStatusLine(ProtocolVersion protocolVersion, int i) {
        this.a.setStatusLine(protocolVersion, i);
    }

    public void setStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        this.a.setStatusLine(protocolVersion, i, str);
    }

    public void setStatusLine(StatusLine statusLine) {
        this.a.setStatusLine(statusLine);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpResponseProxy{");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
