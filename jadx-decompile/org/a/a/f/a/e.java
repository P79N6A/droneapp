package org.a.a.f.a;

import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.params.HttpParams;

@Deprecated
class e implements c {
    private final a a;

    e(a aVar) {
        this.a = aVar;
    }

    public Socket a(Socket socket, String str, int i, HttpParams httpParams) {
        return this.a.a(socket, str, i, true);
    }

    public Socket a(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpParams httpParams) {
        return this.a.a(socket, inetSocketAddress, inetSocketAddress2, httpParams);
    }

    public Socket a(HttpParams httpParams) {
        return this.a.a(httpParams);
    }

    public boolean a(Socket socket) {
        return this.a.a(socket);
    }
}
