package org.a.a.i.d;

import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@b
public class ab extends a {
    public void parse(SetCookie setCookie, String str) {
        a.a((Object) setCookie, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        } else if (str.trim().length() == 0) {
            throw new MalformedCookieException("Blank value for version attribute");
        } else {
            try {
                setCookie.setVersion(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                throw new MalformedCookieException("Invalid version: " + e.getMessage());
            }
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        if (cookie.getVersion() < 0) {
            throw new org.a.a.g.a("Cookie version may not be negative");
        }
    }
}
