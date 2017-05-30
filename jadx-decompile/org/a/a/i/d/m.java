package org.a.a.i.d;

import java.util.Collection;
import org.a.a.a.b;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@b
public class m implements org.a.a.g.b, CookieSpecFactory {
    private final String[] a;
    private final a b;

    public enum a {
        SECURITYLEVEL_DEFAULT,
        SECURITYLEVEL_IE_MEDIUM
    }

    public m() {
        this(null, a.SECURITYLEVEL_DEFAULT);
    }

    public m(String[] strArr) {
        this(null, a.SECURITYLEVEL_DEFAULT);
    }

    public m(String[] strArr, a aVar) {
        this.a = strArr;
        this.b = aVar;
    }

    public CookieSpec a(HttpContext httpContext) {
        return new n(this.a);
    }

    public CookieSpec newInstance(HttpParams httpParams) {
        if (httpParams == null) {
            return new n(null, this.b);
        }
        Collection collection = (Collection) httpParams.getParameter("http.protocol.cookie-datepatterns");
        return new n(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null, this.b);
    }
}
