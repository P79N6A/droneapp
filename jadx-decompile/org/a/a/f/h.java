package org.a.a.f;

import java.net.Socket;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpInetConnection;

public interface h extends HttpClientConnection, HttpInetConnection {
    String a();

    void a(Socket socket);

    Socket b();

    SSLSession c();
}
