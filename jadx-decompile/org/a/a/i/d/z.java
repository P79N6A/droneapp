package org.a.a.i.d;

import java.util.Collection;
import org.a.a.a.b;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@b
public class z implements org.a.a.g.b, CookieSpecFactory {
    private final String[] a;
    private final boolean b;

    public z() {
        this(null, false);
    }

    public z(String[] strArr, boolean z) {
        this.a = strArr;
        this.b = z;
    }

    public CookieSpec a(HttpContext httpContext) {
        return new aa(this.a, this.b);
    }

    public CookieSpec newInstance(HttpParams httpParams) {
        if (httpParams == null) {
            return new aa();
        }
        Collection collection = (Collection) httpParams.getParameter("http.protocol.cookie-datepatterns");
        return new aa(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null, httpParams.getBooleanParameter("http.protocol.single-cookie-header", false));
    }
}
