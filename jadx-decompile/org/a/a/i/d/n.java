package org.a.a.i.d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.a.a.a.c;
import org.a.a.c.f.b;
import org.a.a.i.d.m.a;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BasicHeaderElement;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

@c
public class n extends p {
    private static final String[] a = new String[]{b.a, b.b, b.c, "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};
    private final String[] b;

    public n() {
        this(null, a.SECURITYLEVEL_DEFAULT);
    }

    public n(String[] strArr) {
        this(strArr, a.SECURITYLEVEL_DEFAULT);
    }

    public n(String[] strArr, a aVar) {
        if (strArr != null) {
            this.b = (String[]) strArr.clone();
        } else {
            this.b = a;
        }
        switch (aVar) {
            case SECURITYLEVEL_DEFAULT:
                a("path", new i());
                break;
            case SECURITYLEVEL_IE_MEDIUM:
                a("path", new i(this) {
                    final /* synthetic */ n a;

                    {
                        this.a = r1;
                    }

                    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
                    }
                });
                break;
            default:
                throw new RuntimeException("Unknown security level");
        }
        a("domain", new f());
        a("max-age", new h());
        a("secure", new j());
        a("comment", new e());
        a("expires", new g(this.b));
        a("version", new o());
    }

    private static boolean c(String str) {
        return str != null && str.startsWith("\"") && str.endsWith("\"");
    }

    public List<Header> formatCookies(List<Cookie> list) {
        org.a.a.o.a.a((Collection) list, "List of cookies");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 20);
        charArrayBuffer.append("Cookie");
        charArrayBuffer.append(": ");
        for (int i = 0; i < list.size(); i++) {
            Cookie cookie = (Cookie) list.get(i);
            if (i > 0) {
                charArrayBuffer.append("; ");
            }
            String name = cookie.getName();
            String value = cookie.getValue();
            if (cookie.getVersion() <= 0 || c(value)) {
                charArrayBuffer.append(name);
                charArrayBuffer.append("=");
                if (value != null) {
                    charArrayBuffer.append(value);
                }
            } else {
                org.a.a.k.a.b.formatHeaderElement(charArrayBuffer, new BasicHeaderElement(name, value), false);
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
        org.a.a.o.a.a((Object) header, "Header");
        org.a.a.o.a.a((Object) cookieOrigin, "Cookie origin");
        if (header.getName().equalsIgnoreCase("Set-Cookie")) {
            HeaderElement[] headerElementArr;
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
            if (i != 0 || r0 == 0) {
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
                headerElementArr = new HeaderElement[]{tVar.a(buffer, parserCursor)};
            } else {
                headerElementArr = elements;
            }
            return a(headerElementArr, cookieOrigin);
        }
        throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
    }

    public String toString() {
        return org.a.a.c.a.b.a;
    }
}
