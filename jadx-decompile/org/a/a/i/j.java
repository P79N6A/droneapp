package org.a.a.i;

import com.google.android.gms.wallet.e;
import java.util.Locale;
import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.ReasonPhraseCatalog;

@b
public class j implements ReasonPhraseCatalog {
    public static final j a = new j();
    private static final String[][] b = new String[][]{null, new String[3], new String[8], new String[8], new String[25], new String[8]};

    static {
        a(200, "OK");
        a(201, "Created");
        a(202, "Accepted");
        a(204, "No Content");
        a(301, "Moved Permanently");
        a(302, "Moved Temporarily");
        a(304, "Not Modified");
        a(400, "Bad Request");
        a(401, "Unauthorized");
        a(403, "Forbidden");
        a(e.j, "Not Found");
        a(500, "Internal Server Error");
        a(it.a.a.e.b, "Not Implemented");
        a(it.a.a.e.c, "Bad Gateway");
        a(it.a.a.e.d, "Service Unavailable");
        a(100, "Continue");
        a(307, "Temporary Redirect");
        a(e.k, "Method Not Allowed");
        a(e.m, "Conflict");
        a(e.p, "Precondition Failed");
        a(e.q, "Request Too Long");
        a(414, "Request-URI Too Long");
        a(415, "Unsupported Media Type");
        a(300, "Multiple Choices");
        a(303, "See Other");
        a(305, "Use Proxy");
        a(e.i, "Payment Required");
        a(e.l, "Not Acceptable");
        a(407, "Proxy Authentication Required");
        a(408, "Request Timeout");
        a(101, "Switching Protocols");
        a(203, "Non Authoritative Information");
        a(205, "Reset Content");
        a(206, "Partial Content");
        a(it.a.a.e.e, "Gateway Timeout");
        a(505, "Http Version Not Supported");
        a(e.n, "Gone");
        a(e.o, "Length Required");
        a(416, "Requested Range Not Satisfiable");
        a(417, "Expectation Failed");
        a(102, "Processing");
        a(207, "Multi-Status");
        a(422, "Unprocessable Entity");
        a(419, "Insufficient Space On Resource");
        a(420, "Method Failure");
        a(423, "Locked");
        a(507, "Insufficient Storage");
        a(424, "Failed Dependency");
    }

    protected j() {
    }

    private static void a(int i, String str) {
        int i2 = i / 100;
        b[i2][i - (i2 * 100)] = str;
    }

    public String getReason(int i, Locale locale) {
        boolean z = i >= 100 && i < 600;
        a.a(z, "Unknown category for status code " + i);
        int i2 = i / 100;
        int i3 = i - (i2 * 100);
        return b[i2].length > i3 ? b[i2][i3] : null;
    }
}
