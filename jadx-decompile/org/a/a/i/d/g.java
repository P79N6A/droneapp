package org.a.a.i.d;

import java.util.Date;
import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@b
public class g extends a {
    private final String[] a;

    public g(String[] strArr) {
        a.a((Object) strArr, "Array of date patterns");
        this.a = strArr;
    }

    public void parse(SetCookie setCookie, String str) {
        a.a((Object) setCookie, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for expires attribute");
        }
        Date a = org.a.a.c.f.b.a(str, this.a);
        if (a == null) {
            throw new MalformedCookieException("Unable to parse expires attribute: " + str);
        }
        setCookie.setExpiryDate(a);
    }
}
