package org.a.a.i.d;

import java.util.Locale;
import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@b
public class y implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        a.a((Object) cookieOrigin, "Cookie origin");
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        return domain == null ? false : host.equals(domain) || (domain.startsWith(".") && host.endsWith(domain));
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
        } else if (!domain.equals(host)) {
            if (domain.indexOf(46) == -1) {
                throw new org.a.a.g.a("Domain attribute \"" + domain + "\" does not match the host \"" + host + "\"");
            } else if (domain.startsWith(".")) {
                int indexOf = domain.indexOf(46, 1);
                if (indexOf < 0 || indexOf == domain.length() - 1) {
                    throw new org.a.a.g.a("Domain attribute \"" + domain + "\" violates RFC 2109: domain must contain an embedded dot");
                }
                host = host.toLowerCase(Locale.ENGLISH);
                if (!host.endsWith(domain)) {
                    throw new org.a.a.g.a("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + host + "\"");
                } else if (host.substring(0, host.length() - domain.length()).indexOf(46) != -1) {
                    throw new org.a.a.g.a("Domain attribute \"" + domain + "\" violates RFC 2109: host minus domain may not contain any dots");
                }
            } else {
                throw new org.a.a.g.a("Domain attribute \"" + domain + "\" violates RFC 2109: domain must start with a dot");
            }
        }
    }
}
