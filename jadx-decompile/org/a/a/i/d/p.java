package org.a.a.i.d;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.a.a.a.c;
import org.a.a.o.a;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@c
public abstract class p extends b {
    protected static String a(CookieOrigin cookieOrigin) {
        String path = cookieOrigin.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf < 0) {
            return path;
        }
        if (lastIndexOf == 0) {
            lastIndexOf = 1;
        }
        return path.substring(0, lastIndexOf);
    }

    protected static String b(CookieOrigin cookieOrigin) {
        return cookieOrigin.getHost();
    }

    protected List<Cookie> a(HeaderElement[] headerElementArr, CookieOrigin cookieOrigin) {
        List<Cookie> arrayList = new ArrayList(headerElementArr.length);
        for (HeaderElement headerElement : headerElementArr) {
            String name = headerElement.getName();
            String value = headerElement.getValue();
            if (name == null || name.length() == 0) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            SetCookie dVar = new d(name, value);
            dVar.setPath(a(cookieOrigin));
            dVar.setDomain(b(cookieOrigin));
            NameValuePair[] parameters = headerElement.getParameters();
            for (int length = parameters.length - 1; length >= 0; length--) {
                NameValuePair nameValuePair = parameters[length];
                String toLowerCase = nameValuePair.getName().toLowerCase(Locale.ENGLISH);
                dVar.a(toLowerCase, nameValuePair.getValue());
                CookieAttributeHandler a = a(toLowerCase);
                if (a != null) {
                    a.parse(dVar, nameValuePair.getValue());
                }
            }
            arrayList.add(dVar);
        }
        return arrayList;
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        a.a((Object) cookieOrigin, "Cookie origin");
        for (CookieAttributeHandler match : a()) {
            if (!match.match(cookie, cookieOrigin)) {
                return false;
            }
        }
        return true;
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        a.a((Object) cookieOrigin, "Cookie origin");
        for (CookieAttributeHandler validate : a()) {
            validate.validate(cookie, cookieOrigin);
        }
    }
}
