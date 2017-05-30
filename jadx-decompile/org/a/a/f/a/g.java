package org.a.a.f.a;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpParams;

@Deprecated
class g implements f {
    private final SocketFactory a;

    g(SocketFactory socketFactory) {
        this.a = socketFactory;
    }

    public Socket a(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpParams httpParams) {
        String hostName = inetSocketAddress.getHostName();
        int port = inetSocketAddress.getPort();
        InetAddress inetAddress = null;
        int i = 0;
        if (inetSocketAddress2 != null) {
            inetAddress = inetSocketAddress2.getAddress();
            i = inetSocketAddress2.getPort();
        }
        return this.a.connectSocket(socket, hostName, port, inetAddress, i, httpParams);
    }

    public Socket a(HttpParams httpParams) {
        return this.a.createSocket();
    }

    public SocketFactory a() {
        return this.a;
    }

    public boolean a(Socket socket) {
        return this.a.isSecure(socket);
    }

    public boolean equals(Object obj) {
        return obj == null ? false : this == obj ? true : obj instanceof g ? this.a.equals(((g) obj).a) : this.a.equals(obj);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
