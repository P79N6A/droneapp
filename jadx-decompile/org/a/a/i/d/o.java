package org.a.a.i.d;

import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@b
public class o extends a {
    public void parse(SetCookie setCookie, String str) {
        a.a((Object) setCookie, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        }
        int i = 0;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
        }
        setCookie.setVersion(i);
    }
}
