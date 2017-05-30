package org.a.a.f.a;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.params.HttpParams;

@Deprecated
class d extends g implements c {
    private final LayeredSocketFactory a;

    d(LayeredSocketFactory layeredSocketFactory) {
        super(layeredSocketFactory);
        this.a = layeredSocketFactory;
    }

    public Socket a(Socket socket, String str, int i, HttpParams httpParams) {
        return this.a.createSocket(socket, str, i, true);
    }
}
