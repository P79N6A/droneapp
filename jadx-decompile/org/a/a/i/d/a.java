package org.a.a.i.d;

import org.a.a.a.b;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;

@b
public abstract class a implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        return true;
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
    }
}
