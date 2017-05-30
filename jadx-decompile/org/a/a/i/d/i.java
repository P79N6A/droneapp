package org.a.a.i.d;

import org.a.a.a.b;
import org.a.a.o.a;
import org.a.a.o.f;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.SetCookie;

@b
public class i implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        a.a((Object) cookieOrigin, "Cookie origin");
        String path = cookieOrigin.getPath();
        String path2 = cookie.getPath();
        if (path2 == null) {
            path2 = "/";
        }
        if (path2.length() > 1 && path2.endsWith("/")) {
            path2 = path2.substring(0, path2.length() - 1);
        }
        boolean startsWith = path.startsWith(path2);
        return (!startsWith || path.length() == path2.length() || path2.endsWith("/")) ? startsWith : path.charAt(path2.length()) == '/';
    }

    public void parse(SetCookie setCookie, String str) {
        a.a((Object) setCookie, "Cookie");
        if (f.b(str)) {
            str = "/";
        }
        setCookie.setPath(str);
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        if (!match(cookie, cookieOrigin)) {
            throw new org.a.a.g.a("Illegal path attribute \"" + cookie.getPath() + "\". Path of origin: \"" + cookieOrigin.getPath() + "\"");
        }
    }
}
