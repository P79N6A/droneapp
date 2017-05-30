package org.a.a.i.h;

import java.io.IOException;
import org.a.a.a.d;
import org.a.a.m.e;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;

@d
public class c extends e<HttpHost, HttpClientConnection> {
    public c(String str, HttpHost httpHost, HttpClientConnection httpClientConnection) {
        super(str, httpHost, httpClientConnection);
    }

    public boolean e() {
        return !((HttpClientConnection) i()).isOpen();
    }

    public void f() {
        try {
            ((HttpClientConnection) i()).close();
        } catch (IOException e) {
        }
    }
}
