package org.a.a.i.d;

import com.tencent.mm.sdk.contact.RContact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.a.a.a.c;
import org.a.a.c.f.b;
import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookiePathComparator;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

@c
public class aa extends p {
    private static final CookiePathComparator a = new CookiePathComparator();
    private static final String[] b = new String[]{b.a, b.b, b.c};
    private final String[] c;
    private final boolean d;

    public aa() {
        this(null, false);
    }

    public aa(String[] strArr, boolean z) {
        if (strArr != null) {
            this.c = (String[]) strArr.clone();
        } else {
            this.c = b;
        }
        this.d = z;
        a("version", new ab());
        a("path", new i());
        a("domain", new y());
        a("max-age", new h());
        a("secure", new j());
        a("comment", new e());
        a("expires", new g(this.c));
    }

    private List<Header> a(List<Cookie> list) {
        int i = Integer.MAX_VALUE;
        for (Cookie cookie : list) {
            i = cookie.getVersion() < i ? cookie.getVersion() : i;
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 40);
        charArrayBuffer.append("Cookie");
        charArrayBuffer.append(": ");
        charArrayBuffer.append("$Version=");
        charArrayBuffer.append(Integer.toString(i));
        for (Cookie cookie2 : list) {
            charArrayBuffer.append("; ");
            a(charArrayBuffer, cookie2, i);
        }
        List<Header> arrayList = new ArrayList(1);
        arrayList.add(new BufferedHeader(charArrayBuffer));
        return arrayList;
    }

    private List<Header> b(List<Cookie> list) {
        List<Header> arrayList = new ArrayList(list.size());
        for (Cookie cookie : list) {
            int version = cookie.getVersion();
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(40);
            charArrayBuffer.append("Cookie: ");
            charArrayBuffer.append("$Version=");
            charArrayBuffer.append(Integer.toString(version));
            charArrayBuffer.append("; ");
            a(charArrayBuffer, cookie, version);
            arrayList.add(new BufferedHeader(charArrayBuffer));
        }
        return arrayList;
    }

    protected void a(CharArrayBuffer charArrayBuffer, String str, String str2, int i) {
        charArrayBuffer.append(str);
        charArrayBuffer.append("=");
        if (str2 == null) {
            return;
        }
        if (i > 0) {
            charArrayBuffer.append(l.e);
            charArrayBuffer.append(str2);
            charArrayBuffer.append(l.e);
            return;
        }
        charArrayBuffer.append(str2);
    }

    protected void a(CharArrayBuffer charArrayBuffer, Cookie cookie, int i) {
        a(charArrayBuffer, cookie.getName(), cookie.getValue(), i);
        if (cookie.getPath() != null && (cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute("path")) {
            charArrayBuffer.append("; ");
            a(charArrayBuffer, "$Path", cookie.getPath(), i);
        }
        if (cookie.getDomain() != null && (cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute("domain")) {
            charArrayBuffer.append("; ");
            a(charArrayBuffer, "$Domain", cookie.getDomain(), i);
        }
    }

    public List<Header> formatCookies(List<Cookie> list) {
        List list2;
        a.a((Collection) list, "List of cookies");
        if (list.size() > 1) {
            List arrayList = new ArrayList(list);
            Collections.sort(arrayList, a);
            list2 = arrayList;
        }
        return this.d ? a(list2) : b(list2);
    }

    public int getVersion() {
        return 1;
    }

    public Header getVersionHeader() {
        return null;
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        a.a((Object) header, "Header");
        a.a((Object) cookieOrigin, "Cookie origin");
        if (header.getName().equalsIgnoreCase("Set-Cookie")) {
            return a(header.getElements(), cookieOrigin);
        }
        throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
    }

    public String toString() {
        return "rfc2109";
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        a.a((Object) cookie, "Cookie");
        String name = cookie.getName();
        if (name.indexOf(32) != -1) {
            throw new org.a.a.g.a("Cookie name may not contain blanks");
        } else if (name.startsWith(RContact.FAVOUR_CONTACT_SHOW_HEAD_CHAR)) {
            throw new org.a.a.g.a("Cookie name may not start with $");
        } else {
            super.validate(cookie, cookieOrigin);
        }
    }
}
