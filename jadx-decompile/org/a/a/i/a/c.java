package org.a.a.i.a;

import android.util.Base64;
import java.nio.charset.Charset;
import org.a.a.b;
import org.a.a.b.e;
import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.Credentials;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;

@org.a.a.a.c
public class c extends k {
    private boolean a;

    public c() {
        this(b.f);
    }

    public c(Charset charset) {
        super(charset);
        this.a = false;
    }

    @Deprecated
    public c(e eVar) {
        super(eVar);
    }

    @Deprecated
    public static Header a(Credentials credentials, String str, boolean z) {
        a.a(credentials, "Credentials");
        a.a(str, "charset");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(credentials.getUserPrincipal().getName());
        stringBuilder.append(":");
        stringBuilder.append(credentials.getPassword() == null ? "null" : credentials.getPassword());
        byte[] encode = Base64.encode(EncodingUtils.getBytes(stringBuilder.toString(), str), 2);
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        if (z) {
            charArrayBuffer.append(org.a.a.e.N);
        } else {
            charArrayBuffer.append("Authorization");
        }
        charArrayBuffer.append(": Basic ");
        charArrayBuffer.append(encode, 0, encode.length);
        return new BufferedHeader(charArrayBuffer);
    }

    public Header a(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        a.a(credentials, "Credentials");
        a.a(httpRequest, "HTTP request");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(credentials.getUserPrincipal().getName());
        stringBuilder.append(":");
        stringBuilder.append(credentials.getPassword() == null ? "null" : credentials.getPassword());
        byte[] encode = Base64.encode(EncodingUtils.getBytes(stringBuilder.toString(), a(httpRequest)), 2);
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        if (a()) {
            charArrayBuffer.append(org.a.a.e.N);
        } else {
            charArrayBuffer.append("Authorization");
        }
        charArrayBuffer.append(": Basic ");
        charArrayBuffer.append(encode, 0, encode.length);
        return new BufferedHeader(charArrayBuffer);
    }

    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        return a(credentials, httpRequest, new org.a.a.n.a());
    }

    public String getSchemeName() {
        return "basic";
    }

    public boolean isComplete() {
        return this.a;
    }

    public boolean isConnectionBased() {
        return false;
    }

    public void processChallenge(Header header) {
        super.processChallenge(header);
        this.a = true;
    }
}
