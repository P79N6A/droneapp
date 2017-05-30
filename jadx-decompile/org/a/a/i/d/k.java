package org.a.a.i.d;

import java.util.Collection;
import org.a.a.a.b;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@b
public class k implements org.a.a.g.b, CookieSpecFactory {
    private final String[] a;
    private final boolean b;

    public k() {
        this(null, false);
    }

    public k(String[] strArr, boolean z) {
        this.a = strArr;
        this.b = z;
    }

    public CookieSpec a(HttpContext httpContext) {
        return new l(this.a, this.b);
    }

    public CookieSpec newInstance(HttpParams httpParams) {
        if (httpParams == null) {
            return new l();
        }
        Collection collection = (Collection) httpParams.getParameter("http.protocol.cookie-datepatterns");
        return new l(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null, httpParams.getBooleanParameter("http.protocol.single-cookie-header", false));
    }
}
