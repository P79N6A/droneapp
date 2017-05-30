package org.a.a.i;

import org.a.a.a.b;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

@b
public class k implements ConnectionReuseStrategy {
    public static final k a = new k();

    public boolean keepAlive(HttpResponse httpResponse, HttpContext httpContext) {
        return false;
    }
}
