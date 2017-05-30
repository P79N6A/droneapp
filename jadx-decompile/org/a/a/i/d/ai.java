package org.a.a.i.d;

import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.cookie.SetCookie2;

@b
public class ai implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        return true;
    }

    public void parse(SetCookie setCookie, String str) {
        a.a((Object) setCookie, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        }
        int parseInt;
        try {
            parseInt = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            parseInt = -1;
        }
        if (parseInt < 0) {
            throw new MalformedCookieException("Invalid cookie version.");
        }
        setCookie.setVersion(parseInt);
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        if ((cookie instanceof SetCookie2) && (cookie instanceof ClientCookie) && !((ClientCookie) cookie).containsAttribute("version")) {
            throw new org.a.a.g.a("Violates RFC 2965. Version attribute is required.");
        }
    }
}
