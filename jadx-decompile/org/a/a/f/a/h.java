package org.a.a.f.a;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

@Deprecated
class h implements SocketFactory {
    private final f a;

    h(f fVar) {
        this.a = fVar;
    }

    public f a() {
        return this.a;
    }

    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        InetSocketAddress inetSocketAddress = null;
        if (inetAddress != null || i2 > 0) {
            if (i2 <= 0) {
                i2 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i2);
        }
        return this.a.a(socket, new InetSocketAddress(InetAddress.getByName(str), i), inetSocketAddress, httpParams);
    }

    public Socket createSocket() {
        return this.a.a(new BasicHttpParams());
    }

    public boolean equals(Object obj) {
        return obj == null ? false : this == obj ? true : obj instanceof h ? this.a.equals(((h) obj).a) : this.a.equals(obj);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isSecure(Socket socket) {
        return this.a.a(socket);
    }
}
