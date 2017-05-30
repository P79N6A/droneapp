package org.a.a.i.d;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.a.a.c.f.f;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.SetCookie;

public class w implements CookieAttributeHandler {
    private final CookieAttributeHandler a;
    private Set<String> b;
    private Set<String> c;

    public w(CookieAttributeHandler cookieAttributeHandler) {
        this.a = cookieAttributeHandler;
    }

    private boolean a(Cookie cookie) {
        String domain = cookie.getDomain();
        if (domain.startsWith(".")) {
            domain = domain.substring(1);
        }
        domain = f.a(domain);
        if (this.b != null && this.b.contains(domain)) {
            return false;
        }
        if (this.c == null) {
            return false;
        }
        while (!this.c.contains(domain)) {
            if (domain.startsWith("*.")) {
                domain = domain.substring(2);
            }
            int indexOf = domain.indexOf(46);
            if (indexOf != -1) {
                domain = "*" + domain.substring(indexOf);
                if (domain.length() <= 0) {
                }
            }
            return false;
        }
        return true;
    }

    public void a(Collection<String> collection) {
        this.c = new HashSet(collection);
    }

    public void b(Collection<String> collection) {
        this.b = new HashSet(collection);
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        return a(cookie) ? false : this.a.match(cookie, cookieOrigin);
    }

    public void parse(SetCookie setCookie, String str) {
        this.a.parse(setCookie, str);
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        this.a.validate(cookie, cookieOrigin);
    }
}
