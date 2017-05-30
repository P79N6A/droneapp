package org.a.a.i.d;

import java.util.List;
import org.a.a.a.c;
import org.a.a.c.a.b;
import org.a.a.o.a;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie2;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

@c
public class l implements CookieSpec {
    private final String[] a;
    private final boolean b;
    private ah c;
    private aa d;
    private n e;

    public l() {
        this(null, false);
    }

    public l(String[] strArr, boolean z) {
        this.a = strArr == null ? null : (String[]) strArr.clone();
        this.b = z;
    }

    private ah a() {
        if (this.c == null) {
            this.c = new ah(this.a, this.b);
        }
        return this.c;
    }

    private aa b() {
        if (this.d == null) {
            this.d = new aa(this.a, this.b);
        }
        return this.d;
    }

    private n c() {
        if (this.e == null) {
            this.e = new n(this.a);
        }
        return this.e;
    }

    public List<Header> formatCookies(List<Cookie> list) {
        a.a((Object) list, "List of cookies");
        int i = Integer.MAX_VALUE;
        Object obj = 1;
        for (Cookie cookie : list) {
            if (!(cookie instanceof SetCookie2)) {
                obj = null;
            }
            i = cookie.getVersion() < i ? cookie.getVersion() : i;
        }
        return i > 0 ? obj != null ? a().formatCookies(list) : b().formatCookies(list) : c().formatCookies(list);
    }

    public int getVersion() {
        return a().getVersion();
    }

    public Header getVersionHeader() {
        return a().getVersionHeader();
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        a.a((Object) cookieOrigin, "Cookie origin");
        return cookie.getVersion() > 0 ? cookie instanceof SetCookie2 ? a().match(cookie, cookieOrigin) : b().match(cookie, cookieOrigin) : c().match(cookie, cookieOrigin);
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        a.a((Object) header, "Header");
        a.a((Object) cookieOrigin, "Cookie origin");
        HeaderElement[] elements = header.getElements();
        int i = 0;
        int i2 = 0;
        for (HeaderElement headerElement : elements) {
            if (headerElement.getParameterByName("version") != null) {
                i2 = 1;
            }
            if (headerElement.getParameterByName("expires") != null) {
                i = 1;
            }
        }
        if (i == 0 && r0 != 0) {
            return "Set-Cookie2".equals(header.getName()) ? a().a(elements, cookieOrigin) : b().a(elements, cookieOrigin);
        } else {
            CharArrayBuffer buffer;
            ParserCursor parserCursor;
            t tVar = t.a;
            if (header instanceof FormattedHeader) {
                buffer = ((FormattedHeader) header).getBuffer();
                parserCursor = new ParserCursor(((FormattedHeader) header).getValuePos(), buffer.length());
            } else {
                String value = header.getValue();
                if (value == null) {
                    throw new MalformedCookieException("Header value is null");
                }
                buffer = new CharArrayBuffer(value.length());
                buffer.append(value);
                parserCursor = new ParserCursor(0, buffer.length());
            }
            return c().a(new HeaderElement[]{tVar.a(buffer, parserCursor)}, cookieOrigin);
        }
    }

    public String toString() {
        return b.d;
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        a.a((Object) cookieOrigin, "Cookie origin");
        if (cookie.getVersion() <= 0) {
            c().validate(cookie, cookieOrigin);
        } else if (cookie instanceof SetCookie2) {
            a().validate(cookie, cookieOrigin);
        } else {
            b().validate(cookie, cookieOrigin);
        }
    }
}
