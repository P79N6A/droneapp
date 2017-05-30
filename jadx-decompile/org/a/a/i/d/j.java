package org.a.a.i.d;

import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.SetCookie;

@b
public class j extends a {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        a.a((Object) cookieOrigin, "Cookie origin");
        return !cookie.isSecure() || cookieOrigin.isSecure();
    }

    public void parse(SetCookie setCookie, String str) {
        a.a((Object) setCookie, "Cookie");
        setCookie.setSecure(true);
    }
}
