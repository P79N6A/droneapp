package org.a.a.i.d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.a.a.a.c;
import org.a.a.c.a.b;
import org.a.a.o.a;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

@c
public class v extends p {
    protected static final String a = "EEE, dd-MMM-yy HH:mm:ss z";
    private final String[] b;

    public v() {
        this(null);
    }

    public v(String[] strArr) {
        if (strArr != null) {
            this.b = (String[]) strArr.clone();
        } else {
            this.b = new String[]{a};
        }
        a("path", new i());
        a("domain", new s());
        a("max-age", new h());
        a("secure", new j());
        a("comment", new e());
        a("expires", new g(this.b));
    }

    public List<Header> formatCookies(List<Cookie> list) {
        a.a((Collection) list, "List of cookies");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 20);
        charArrayBuffer.append("Cookie");
        charArrayBuffer.append(": ");
        for (int i = 0; i < list.size(); i++) {
            Cookie cookie = (Cookie) list.get(i);
            if (i > 0) {
                charArrayBuffer.append("; ");
            }
            charArrayBuffer.append(cookie.getName());
            String value = cookie.getValue();
            if (value != null) {
                charArrayBuffer.append("=");
                charArrayBuffer.append(value);
            }
        }
        List<Header> arrayList = new ArrayList(1);
        arrayList.add(new BufferedHeader(charArrayBuffer));
        return arrayList;
    }

    public int getVersion() {
        return 0;
    }

    public Header getVersionHeader() {
        return null;
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        a.a((Object) header, "Header");
        a.a((Object) cookieOrigin, "Cookie origin");
        if (header.getName().equalsIgnoreCase("Set-Cookie")) {
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
            return a(new HeaderElement[]{tVar.a(buffer, parserCursor)}, cookieOrigin);
        }
        throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
    }

    public String toString() {
        return b.b;
    }
}
