package org.a.a.c.e;

import android.util.Log;
import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.protocol.HttpContext;

@b
public class i implements HttpResponseInterceptor {
    private static final String a = "HttpClient";

    private static String a(Cookie cookie) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cookie.getName());
        stringBuilder.append("=\"");
        String value = cookie.getValue();
        if (value.length() > 100) {
            value = value.substring(0, 100) + "...";
        }
        stringBuilder.append(value);
        stringBuilder.append("\"");
        stringBuilder.append(", version:");
        stringBuilder.append(Integer.toString(cookie.getVersion()));
        stringBuilder.append(", domain:");
        stringBuilder.append(cookie.getDomain());
        stringBuilder.append(", path:");
        stringBuilder.append(cookie.getPath());
        stringBuilder.append(", expiry:");
        stringBuilder.append(cookie.getExpiryDate());
        return stringBuilder.toString();
    }

    private void a(HeaderIterator headerIterator, CookieSpec cookieSpec, CookieOrigin cookieOrigin, CookieStore cookieStore) {
        while (headerIterator.hasNext()) {
            Header nextHeader = headerIterator.nextHeader();
            try {
                for (Cookie cookie : cookieSpec.parse(nextHeader, cookieOrigin)) {
                    try {
                        cookieSpec.validate(cookie, cookieOrigin);
                        cookieStore.addCookie(cookie);
                        if (Log.isLoggable(a, 3)) {
                            Log.d(a, "Cookie accepted [" + a(cookie) + "]");
                        }
                    } catch (MalformedCookieException e) {
                        if (Log.isLoggable(a, 5)) {
                            Log.w(a, "Cookie rejected [" + a(cookie) + "] " + e.getMessage());
                        }
                    }
                }
            } catch (MalformedCookieException e2) {
                if (Log.isLoggable(a, 5)) {
                    Log.w(a, "Invalid cookie header: \"" + nextHeader + "\". " + e2.getMessage());
                }
            }
        }
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        a.a((Object) httpResponse, "HTTP request");
        a.a((Object) httpContext, "HTTP context");
        a a = a.a(httpContext);
        CookieSpec e = a.e();
        if (e != null) {
            CookieStore d = a.d();
            if (d != null) {
                CookieOrigin f = a.f();
                if (f != null) {
                    a(httpResponse.headerIterator("Set-Cookie"), e, f, d);
                    if (e.getVersion() > 0) {
                        a(httpResponse.headerIterator("Set-Cookie2"), e, f, d);
                    }
                } else if (Log.isLoggable(a, 3)) {
                    Log.d(a, "Cookie origin not specified in HTTP context");
                }
            } else if (Log.isLoggable(a, 3)) {
                Log.d(a, "Cookie store not specified in HTTP context");
            }
        } else if (Log.isLoggable(a, 3)) {
            Log.d(a, "Cookie spec not specified in HTTP context");
        }
    }
}
