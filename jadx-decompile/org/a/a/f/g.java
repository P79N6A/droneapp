package org.a.a.f;

import javax.net.ssl.SSLSession;
import org.apache.http.HttpInetConnection;
import org.apache.http.conn.routing.HttpRoute;

@Deprecated
public interface g extends HttpInetConnection {
    boolean a();

    HttpRoute b();

    SSLSession c();
}
