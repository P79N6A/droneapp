package org.a.a.i.a;

import com.xiaomi.mipush.sdk.Constants;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;
import org.a.a.a.c;
import org.a.a.b;
import org.a.a.k.a;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.impl.auth.UnsupportedDigestAlgorithmException;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;

@c
public class e extends k {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final int c = -1;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private boolean b;
    private String g;
    private long h;
    private String i;
    private String j;
    private String k;

    public e() {
        this(b.f);
    }

    public e(Charset charset) {
        super(charset);
        this.b = false;
    }

    @Deprecated
    public e(org.a.a.b.e eVar) {
        super(eVar);
    }

    static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length * 2)];
        for (int i = 0; i < length; i++) {
            int i2 = bArr[i] & 15;
            cArr[i * 2] = a[(bArr[i] & 240) >> 4];
            cArr[(i * 2) + 1] = a[i2];
        }
        return new String(cArr);
    }

    private static MessageDigest a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception e) {
            throw new UnsupportedDigestAlgorithmException("Unsupported algorithm in HTTP Digest authentication: " + str);
        }
    }

    private Header a(Credentials credentials, HttpRequest httpRequest) {
        int i;
        String parameter = getParameter("uri");
        String parameter2 = getParameter("realm");
        String parameter3 = getParameter("nonce");
        String parameter4 = getParameter("opaque");
        String parameter5 = getParameter("methodname");
        String parameter6 = getParameter("algorithm");
        if (parameter6 == null) {
            parameter6 = "MD5";
        }
        Set hashSet = new HashSet(8);
        int i2 = -1;
        String parameter7 = getParameter("qop");
        if (parameter7 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(parameter7, Constants.ACCEPT_TIME_SEPARATOR_SP);
            while (stringTokenizer.hasMoreTokens()) {
                hashSet.add(stringTokenizer.nextToken().trim().toLowerCase(Locale.ENGLISH));
            }
            if ((httpRequest instanceof HttpEntityEnclosingRequest) && hashSet.contains("auth-int")) {
                i2 = 1;
            } else if (hashSet.contains("auth")) {
                i2 = 2;
            }
            i = i2;
        } else {
            i = 0;
        }
        if (i == -1) {
            throw new AuthenticationException("None of the qop methods is supported: " + parameter7);
        }
        String parameter8 = getParameter("charset");
        if (parameter8 == null) {
            parameter8 = "ISO-8859-1";
        }
        parameter7 = parameter6.equalsIgnoreCase("MD5-sess") ? "MD5" : parameter6;
        try {
            MessageDigest a = a(parameter7);
            String name = credentials.getUserPrincipal().getName();
            parameter7 = credentials.getPassword();
            if (parameter3.equals(this.g)) {
                this.h++;
            } else {
                this.h = 1;
                this.i = null;
                this.g = parameter3;
            }
            Appendable stringBuilder = new StringBuilder(256);
            Formatter formatter = new Formatter(stringBuilder, Locale.US);
            formatter.format("%08x", new Object[]{Long.valueOf(this.h)});
            formatter.close();
            String stringBuilder2 = stringBuilder.toString();
            if (this.i == null) {
                this.i = f();
            }
            this.j = null;
            this.k = null;
            if (parameter6.equalsIgnoreCase("MD5-sess")) {
                stringBuilder.setLength(0);
                stringBuilder.append(name).append(':').append(parameter2).append(':').append(parameter7);
                parameter7 = a(a.digest(EncodingUtils.getBytes(stringBuilder.toString(), parameter8)));
                stringBuilder.setLength(0);
                stringBuilder.append(parameter7).append(':').append(parameter3).append(':').append(this.i);
                this.j = stringBuilder.toString();
            } else {
                stringBuilder.setLength(0);
                stringBuilder.append(name).append(':').append(parameter2).append(':').append(parameter7);
                this.j = stringBuilder.toString();
            }
            String a2 = a(a.digest(EncodingUtils.getBytes(this.j, parameter8)));
            if (i == 2) {
                this.k = parameter5 + ':' + parameter;
            } else if (i == 1) {
                HttpEntity httpEntity = null;
                if (httpRequest instanceof HttpEntityEnclosingRequest) {
                    httpEntity = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
                }
                if (httpEntity == null || httpEntity.isRepeatable()) {
                    OutputStream gVar = new g(a);
                    if (httpEntity != null) {
                        try {
                            httpEntity.writeTo(gVar);
                        } catch (Throwable e) {
                            throw new AuthenticationException("I/O error reading entity content", e);
                        }
                    }
                    gVar.close();
                    this.k = parameter5 + ':' + parameter + ':' + a(gVar.a());
                } else if (hashSet.contains("auth")) {
                    i = 2;
                    this.k = parameter5 + ':' + parameter;
                } else {
                    throw new AuthenticationException("Qop auth-int cannot be used with a non-repeatable entity");
                }
            } else {
                this.k = parameter5 + ':' + parameter;
            }
            parameter7 = a(a.digest(EncodingUtils.getBytes(this.k, parameter8)));
            if (i == 0) {
                stringBuilder.setLength(0);
                stringBuilder.append(a2).append(':').append(parameter3).append(':').append(parameter7);
                parameter8 = stringBuilder.toString();
            } else {
                stringBuilder.setLength(0);
                stringBuilder.append(a2).append(':').append(parameter3).append(':').append(stringBuilder2).append(':').append(this.i).append(':').append(i == 1 ? "auth-int" : "auth").append(':').append(parameter7);
                parameter8 = stringBuilder.toString();
            }
            parameter8 = a(a.digest(EncodingUtils.getAsciiBytes(parameter8)));
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(128);
            if (a()) {
                charArrayBuffer.append(org.a.a.e.N);
            } else {
                charArrayBuffer.append("Authorization");
            }
            charArrayBuffer.append(": Digest ");
            List arrayList = new ArrayList(20);
            arrayList.add(new BasicNameValuePair("username", name));
            arrayList.add(new BasicNameValuePair("realm", parameter2));
            arrayList.add(new BasicNameValuePair("nonce", parameter3));
            arrayList.add(new BasicNameValuePair("uri", parameter));
            arrayList.add(new BasicNameValuePair("response", parameter8));
            if (i != 0) {
                arrayList.add(new BasicNameValuePair("qop", i == 1 ? "auth-int" : "auth"));
                arrayList.add(new BasicNameValuePair("nc", stringBuilder2));
                arrayList.add(new BasicNameValuePair("cnonce", this.i));
            }
            arrayList.add(new BasicNameValuePair("algorithm", parameter6));
            if (parameter4 != null) {
                arrayList.add(new BasicNameValuePair("opaque", parameter4));
            }
            for (i2 = 0; i2 < arrayList.size(); i2++) {
                BasicNameValuePair basicNameValuePair = (BasicNameValuePair) arrayList.get(i2);
                if (i2 > 0) {
                    charArrayBuffer.append(", ");
                }
                String name2 = basicNameValuePair.getName();
                Object obj = ("nc".equals(name2) || "qop".equals(name2) || "algorithm".equals(name2)) ? 1 : null;
                a.b.formatNameValuePair(charArrayBuffer, basicNameValuePair, obj == null);
            }
            return new BufferedHeader(charArrayBuffer);
        } catch (UnsupportedDigestAlgorithmException e2) {
            throw new AuthenticationException("Unsuppported digest algorithm: " + parameter7);
        }
    }

    public static String f() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return a(bArr);
    }

    public Header a(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        org.a.a.o.a.a(credentials, "Credentials");
        org.a.a.o.a.a(httpRequest, "HTTP request");
        if (getParameter("realm") == null) {
            throw new AuthenticationException("missing realm in challenge");
        } else if (getParameter("nonce") == null) {
            throw new AuthenticationException("missing nonce in challenge");
        } else {
            h().put("methodname", httpRequest.getRequestLine().getMethod());
            h().put("uri", httpRequest.getRequestLine().getUri());
            if (getParameter("charset") == null) {
                h().put("charset", a(httpRequest));
            }
            return a(credentials, httpRequest);
        }
    }

    public void a(String str, String str2) {
        h().put(str, str2);
    }

    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        return a(credentials, httpRequest, new org.a.a.n.a());
    }

    String c() {
        return this.i;
    }

    String d() {
        return this.j;
    }

    String e() {
        return this.k;
    }

    public String getSchemeName() {
        return "digest";
    }

    public boolean isComplete() {
        return "true".equalsIgnoreCase(getParameter("stale")) ? false : this.b;
    }

    public boolean isConnectionBased() {
        return false;
    }

    public void processChallenge(Header header) {
        super.processChallenge(header);
        this.b = true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DIGEST [complete=").append(this.b).append(", nonce=").append(this.g).append(", nc=").append(this.h).append("]");
        return stringBuilder.toString();
    }
}
