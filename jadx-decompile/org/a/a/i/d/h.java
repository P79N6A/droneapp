package org.a.a.i.d;

import java.util.Date;
import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@b
public class h extends a {
    public void parse(SetCookie setCookie, String str) {
        a.a((Object) setCookie, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for max-age attribute");
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 0) {
                throw new MalformedCookieException("Negative max-age attribute: " + str);
            }
            setCookie.setExpiryDate(new Date(System.currentTimeMillis() + (((long) parseInt) * 1000)));
        } catch (NumberFormatException e) {
            throw new MalformedCookieException("Invalid max-age attribute: " + str);
        }
    }
}
