package org.a.a.i.d;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import org.a.a.a.c;
import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

@c
public class ah extends aa {
    public ah() {
        this(null, false);
    }

    public ah(String[] strArr, boolean z) {
        super(strArr, z);
        a("domain", new ae());
        a("port", new af());
        a("commenturl", new ac());
        a("discard", new ad());
        a("version", new ai());
    }

    private List<Cookie> b(HeaderElement[] headerElementArr, CookieOrigin cookieOrigin) {
        List<Cookie> arrayList = new ArrayList(headerElementArr.length);
        for (HeaderElement headerElement : headerElementArr) {
            String name = headerElement.getName();
            String value = headerElement.getValue();
            if (name == null || name.length() == 0) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            SetCookie cVar = new c(name, value);
            cVar.setPath(p.a(cookieOrigin));
            cVar.setDomain(p.b(cookieOrigin));
            cVar.setPorts(new int[]{cookieOrigin.getPort()});
            NameValuePair[] parameters = headerElement.getParameters();
            Map hashMap = new HashMap(parameters.length);
            for (int length = parameters.length - 1; length >= 0; length--) {
                NameValuePair nameValuePair = parameters[length];
                hashMap.put(nameValuePair.getName().toLowerCase(Locale.ENGLISH), nameValuePair);
            }
            for (Entry value2 : hashMap.entrySet()) {
                NameValuePair nameValuePair2 = (NameValuePair) value2.getValue();
                value = nameValuePair2.getName().toLowerCase(Locale.ENGLISH);
                cVar.a(value, nameValuePair2.getValue());
                CookieAttributeHandler a = a(value);
                if (a != null) {
                    a.parse(cVar, nameValuePair2.getValue());
                }
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private static CookieOrigin c(CookieOrigin cookieOrigin) {
        Object obj = null;
        String host = cookieOrigin.getHost();
        for (int i = 0; i < host.length(); i++) {
            char charAt = host.charAt(i);
            if (charAt == '.' || charAt == ':') {
                break;
            }
        }
        int i2 = 1;
        return obj != null ? new CookieOrigin(host + ".local", cookieOrigin.getPort(), cookieOrigin.getPath(), cookieOrigin.isSecure()) : cookieOrigin;
    }

    protected List<Cookie> a(HeaderElement[] headerElementArr, CookieOrigin cookieOrigin) {
        return b(headerElementArr, c(cookieOrigin));
    }

    protected void a(CharArrayBuffer charArrayBuffer, Cookie cookie, int i) {
        super.a(charArrayBuffer, cookie, i);
        if (cookie instanceof ClientCookie) {
            String attribute = ((ClientCookie) cookie).getAttribute("port");
            if (attribute != null) {
                charArrayBuffer.append("; $Port");
                charArrayBuffer.append("=\"");
                if (attribute.trim().length() > 0) {
                    int[] ports = cookie.getPorts();
                    if (ports != null) {
                        int length = ports.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            if (i2 > 0) {
                                charArrayBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                            }
                            charArrayBuffer.append(Integer.toString(ports[i2]));
                        }
                    }
                }
                charArrayBuffer.append("\"");
            }
        }
    }

    public int getVersion() {
        return 1;
    }

    public Header getVersionHeader() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(40);
        charArrayBuffer.append("Cookie2");
        charArrayBuffer.append(": ");
        charArrayBuffer.append("$Version=");
        charArrayBuffer.append(Integer.toString(getVersion()));
        return new BufferedHeader(charArrayBuffer);
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        a.a((Object) cookieOrigin, "Cookie origin");
        return super.match(cookie, c(cookieOrigin));
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        a.a((Object) header, "Header");
        a.a((Object) cookieOrigin, "Cookie origin");
        if (header.getName().equalsIgnoreCase("Set-Cookie2")) {
            return b(header.getElements(), c(cookieOrigin));
        }
        throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
    }

    public String toString() {
        return "rfc2965";
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        a.a((Object) cookieOrigin, "Cookie origin");
        super.validate(cookie, c(cookieOrigin));
    }
}
