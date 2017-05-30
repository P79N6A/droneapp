package org.a.a.f.b;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.a.a.a.b;
import org.apache.http.HttpHost;
import org.apache.http.protocol.HttpContext;

@b
public class c implements a {
    public static final c a = new c();

    public static c a() {
        return a;
    }

    public Socket a(int i, Socket socket, HttpHost httpHost, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpContext httpContext) {
        if (socket == null) {
            socket = a(httpContext);
        }
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        try {
            socket.connect(inetSocketAddress, i);
            return socket;
        } catch (IOException e) {
            try {
                socket.close();
            } catch (IOException e2) {
            }
            throw e;
        }
    }

    public Socket a(HttpContext httpContext) {
        return new Socket();
    }
}
