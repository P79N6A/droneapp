package org.a.a.i.d;

import com.xiaomi.mipush.sdk.Constants;
import java.util.StringTokenizer;
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
public class af implements CookieAttributeHandler {
    private static boolean a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    private static int[] a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken().trim());
                if (iArr[i] < 0) {
                    throw new MalformedCookieException("Invalid Port attribute.");
                }
                i++;
            } catch (NumberFormatException e) {
                throw new MalformedCookieException("Invalid Port attribute: " + e.getMessage());
            }
        }
        return iArr;
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        a.a((Object) cookieOrigin, "Cookie origin");
        int port = cookieOrigin.getPort();
        if ((cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute("port")) {
            if (cookie.getPorts() == null) {
                return false;
            }
            if (!a(port, cookie.getPorts())) {
                return false;
            }
        }
        return true;
    }

    public void parse(SetCookie setCookie, String str) {
        a.a((Object) setCookie, "Cookie");
        if (setCookie instanceof SetCookie2) {
            SetCookie2 setCookie2 = (SetCookie2) setCookie;
            if (str != null && str.trim().length() > 0) {
                setCookie2.setPorts(a(str));
            }
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        a.a((Object) cookieOrigin, "Cookie origin");
        int port = cookieOrigin.getPort();
        if ((cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute("port") && !a(port, cookie.getPorts())) {
            throw new org.a.a.g.a("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
        }
    }
}
