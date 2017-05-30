package org.a.a.i;

import org.a.a.a.b;
import org.a.a.c.c.i;
import org.a.a.c.c.l;
import org.a.a.c.c.o;
import org.a.a.o.a;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.RequestLine;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.message.BasicHttpRequest;

@b
public class h implements HttpRequestFactory {
    public static final h a = new h();
    private static final String[] b = new String[]{"GET"};
    private static final String[] c = new String[]{"POST", l.a};
    private static final String[] d = new String[]{org.a.a.c.c.h.a, i.a, "DELETE", o.a, "CONNECT"};

    private static boolean a(String[] strArr, String str) {
        for (String equalsIgnoreCase : strArr) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public HttpRequest newHttpRequest(String str, String str2) {
        if (a(b, str)) {
            return new BasicHttpRequest(str, str2);
        }
        if (a(c, str)) {
            return new BasicHttpEntityEnclosingRequest(str, str2);
        }
        if (a(d, str)) {
            return new BasicHttpRequest(str, str2);
        }
        throw new MethodNotSupportedException(str + " method not supported");
    }

    public HttpRequest newHttpRequest(RequestLine requestLine) {
        a.a((Object) requestLine, "Request line");
        String method = requestLine.getMethod();
        if (a(b, method)) {
            return new BasicHttpRequest(requestLine);
        }
        if (a(c, method)) {
            return new BasicHttpEntityEnclosingRequest(requestLine);
        }
        if (a(d, method)) {
            return new BasicHttpRequest(requestLine);
        }
        throw new MethodNotSupportedException(method + " method not supported");
    }
}
