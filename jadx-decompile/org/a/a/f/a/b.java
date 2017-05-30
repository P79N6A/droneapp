package org.a.a.f.a;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;

@Deprecated
class b extends h implements LayeredSocketFactory {
    private final a a;

    b(a aVar) {
        super(aVar);
        this.a = aVar;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.a.a(socket, str, i, z);
    }
}
