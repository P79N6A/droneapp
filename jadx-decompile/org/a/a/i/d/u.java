package org.a.a.i.d;

import java.util.Collection;
import org.a.a.a.b;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@b
public class u implements org.a.a.g.b, CookieSpecFactory {
    private final String[] a;

    public u() {
        this(null);
    }

    public u(String[] strArr) {
        this.a = strArr;
    }

    public CookieSpec a(HttpContext httpContext) {
        return new v(this.a);
    }

    public CookieSpec newInstance(HttpParams httpParams) {
        if (httpParams == null) {
            return new v();
        }
        Collection collection = (Collection) httpParams.getParameter("http.protocol.cookie-datepatterns");
        return new v(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null);
    }
}
