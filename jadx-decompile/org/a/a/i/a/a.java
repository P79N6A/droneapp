package org.a.a.i.a;

import java.util.Locale;
import org.a.a.a.c;
import org.a.a.b.e;
import org.a.a.b.f;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;

@c
public abstract class a implements f {
    private e a;

    @Deprecated
    public a(e eVar) {
        this.a = eVar;
    }

    public Header a(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        return authenticate(credentials, httpRequest);
    }

    protected abstract void a(CharArrayBuffer charArrayBuffer, int i, int i2);

    public boolean a() {
        return this.a != null && this.a == e.b;
    }

    public e b() {
        return this.a;
    }

    public void processChallenge(Header header) {
        CharArrayBuffer buffer;
        int valuePos;
        org.a.a.o.a.a(header, "Header");
        String name = header.getName();
        if (name.equalsIgnoreCase(org.a.a.e.ac)) {
            this.a = e.a;
        } else if (name.equalsIgnoreCase(org.a.a.e.M)) {
            this.a = e.b;
        } else {
            throw new MalformedChallengeException("Unexpected header name: " + name);
        }
        if (header instanceof FormattedHeader) {
            buffer = ((FormattedHeader) header).getBuffer();
            valuePos = ((FormattedHeader) header).getValuePos();
        } else {
            name = header.getValue();
            if (name == null) {
                throw new MalformedChallengeException("Header value is null");
            }
            buffer = new CharArrayBuffer(name.length());
            buffer.append(name);
            valuePos = 0;
        }
        while (valuePos < buffer.length() && HTTP.isWhitespace(buffer.charAt(valuePos))) {
            valuePos++;
        }
        int i = valuePos;
        while (i < buffer.length() && !HTTP.isWhitespace(buffer.charAt(i))) {
            i++;
        }
        name = buffer.substring(valuePos, i);
        if (name.equalsIgnoreCase(getSchemeName())) {
            a(buffer, i, buffer.length());
            return;
        }
        throw new MalformedChallengeException("Invalid scheme identifier: " + name);
    }

    public String toString() {
        String schemeName = getSchemeName();
        return schemeName != null ? schemeName.toUpperCase(Locale.ENGLISH) : super.toString();
    }
}
