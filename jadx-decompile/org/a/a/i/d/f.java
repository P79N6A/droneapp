package org.a.a.i.d;

import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@b
public class f implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        a.a((Object) cookieOrigin, "Cookie origin");
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            return false;
        }
        if (host.equals(domain)) {
            return true;
        }
        if (!domain.startsWith(".")) {
            domain = '.' + domain;
        }
        boolean z = host.endsWith(domain) || host.equals(domain.substring(1));
        return z;
    }

    public void parse(SetCookie setCookie, String str) {
        a.a((Object) setCookie, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for domain attribute");
        } else if (str.trim().length() == 0) {
            throw new MalformedCookieException("Blank value for domain attribute");
        } else {
            setCookie.setDomain(str);
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        a.a((Object) cookieOrigin, "Cookie origin");
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            throw new org.a.a.g.a("Cookie domain may not be null");
        } else if (host.contains(".")) {
            if (!host.endsWith(domain)) {
                if (domain.startsWith(".")) {
                    domain = domain.substring(1, domain.length());
                }
                if (!host.equals(domain)) {
                    throw new org.a.a.g.a("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + host + "\"");
                }
            }
        } else if (!host.equals(domain)) {
            throw new org.a.a.g.a("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + host + "\"");
        }
    }
}
