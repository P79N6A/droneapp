package org.a.a.i.a;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.a.a.a.c;
import org.a.a.b;
import org.a.a.b.e;
import org.apache.http.HeaderElement;
import org.apache.http.HttpRequest;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

@c
public abstract class k extends a {
    private final Map<String, String> a;
    private final Charset b;

    public k() {
        this(b.f);
    }

    public k(Charset charset) {
        this.a = new HashMap();
        if (charset == null) {
            charset = b.f;
        }
        this.b = charset;
    }

    @Deprecated
    public k(e eVar) {
        super(eVar);
        this.a = new HashMap();
        this.b = b.f;
    }

    String a(HttpRequest httpRequest) {
        String str = (String) httpRequest.getParams().getParameter("http.auth.credential-charset");
        return str == null ? g().name() : str;
    }

    protected void a(CharArrayBuffer charArrayBuffer, int i, int i2) {
        HeaderElement[] parseElements = org.a.a.k.b.b.parseElements(charArrayBuffer, new ParserCursor(i, charArrayBuffer.length()));
        if (parseElements.length == 0) {
            throw new MalformedChallengeException("Authentication challenge is empty");
        }
        this.a.clear();
        for (HeaderElement headerElement : parseElements) {
            this.a.put(headerElement.getName().toLowerCase(Locale.ENGLISH), headerElement.getValue());
        }
    }

    public Charset g() {
        return this.b;
    }

    public String getParameter(String str) {
        return str == null ? null : (String) this.a.get(str.toLowerCase(Locale.ENGLISH));
    }

    public String getRealm() {
        return getParameter("realm");
    }

    protected Map<String, String> h() {
        return this.a;
    }
}
