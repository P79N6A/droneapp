package org.a.a.h;

import org.a.a.a.c;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

@c
public abstract class a implements HttpEntity {
    protected static final int a = 4096;
    protected Header b;
    protected Header c;
    protected boolean d;

    protected a() {
    }

    public void a(String str) {
        Header header = null;
        if (str != null) {
            header = new BasicHeader("Content-Type", str);
        }
        a(header);
    }

    public void a(Header header) {
        this.b = header;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void b(String str) {
        Header header = null;
        if (str != null) {
            header = new BasicHeader("Content-Encoding", str);
        }
        b(header);
    }

    public void b(Header header) {
        this.c = header;
    }

    @Deprecated
    public void consumeContent() {
    }

    public Header getContentEncoding() {
        return this.c;
    }

    public Header getContentType() {
        return this.b;
    }

    public boolean isChunked() {
        return this.d;
    }
}
