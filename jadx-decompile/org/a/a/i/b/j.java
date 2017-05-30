package org.a.a.i.b;

import it.a.a.e;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import org.a.a.c.d;
import org.apache.http.HttpResponse;

public class j implements d {
    public boolean a(Throwable th) {
        return (th instanceof SocketTimeoutException) || (th instanceof ConnectException);
    }

    public boolean a(HttpResponse httpResponse) {
        return httpResponse.getStatusLine().getStatusCode() == e.d;
    }
}
