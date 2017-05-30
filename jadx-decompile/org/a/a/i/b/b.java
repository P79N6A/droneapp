package org.a.a.i.b;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.a.a.c.a.a;
import org.a.a.c.a.c;
import org.a.a.e;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;

@org.a.a.a.b
abstract class b implements org.a.a.c.b {
    private static final String a = "HttpClient";
    private static final List<String> b = Collections.unmodifiableList(Arrays.asList(new String[]{a.d, a.e, a.c, a.b, a.a}));
    private final int c;
    private final String d;

    b(int i, String str) {
        this.c = i;
        this.d = str;
    }

    abstract Collection<String> a(c cVar);

    public Queue<org.a.a.b.a> a(Map<String, Header> map, HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        org.a.a.o.a.a((Object) map, "Map of auth challenges");
        org.a.a.o.a.a((Object) httpHost, e.z);
        org.a.a.o.a.a((Object) httpResponse, "HTTP response");
        org.a.a.o.a.a((Object) httpContext, "HTTP context");
        org.a.a.c.e.a a = org.a.a.c.e.a.a(httpContext);
        Queue<org.a.a.b.a> linkedList = new LinkedList();
        org.a.a.e.b h = a.h();
        if (h == null) {
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Auth scheme registry not set in the context");
            }
            return linkedList;
        }
        CredentialsProvider i = a.i();
        if (i == null) {
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Credentials provider not set in the context");
            }
            return linkedList;
        }
        Collection a2 = a(a.n());
        if (a2 == null) {
            a2 = b;
        }
        if (Log.isLoggable(a, 3)) {
            Log.d(a, "Authentication schemes in the order of preference: " + r0);
        }
        for (String str : r0) {
            Header header = (Header) map.get(str.toLowerCase(Locale.ENGLISH));
            if (header != null) {
                org.a.a.b.c cVar = (org.a.a.b.c) h.a(str);
                if (cVar != null) {
                    AuthScheme a3 = cVar.a(httpContext);
                    a3.processChallenge(header);
                    Credentials credentials = i.getCredentials(new AuthScope(httpHost.getHostName(), httpHost.getPort(), a3.getRealm(), a3.getSchemeName()));
                    if (credentials != null) {
                        linkedList.add(new org.a.a.b.a(a3, credentials));
                    }
                } else if (Log.isLoggable(a, 5)) {
                    Log.w(a, "Authentication scheme " + str + " not supported");
                }
            } else if (Log.isLoggable(a, 3)) {
                Log.d(a, "Challenge for " + str + " authentication scheme not available");
            }
        }
        return linkedList;
    }

    public void a(HttpHost httpHost, AuthScheme authScheme, HttpContext httpContext) {
        org.a.a.o.a.a((Object) httpHost, e.z);
        org.a.a.o.a.a((Object) authScheme, "Auth scheme");
        org.a.a.o.a.a((Object) httpContext, "HTTP context");
        org.a.a.c.e.a a = org.a.a.c.e.a.a(httpContext);
        if (a(authScheme)) {
            org.a.a.c.a j = a.j();
            if (j == null) {
                j = new c();
                a.a(j);
            }
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Caching '" + authScheme.getSchemeName() + "' auth scheme for " + httpHost);
            }
            j.a(httpHost, authScheme);
        }
    }

    public boolean a(HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        org.a.a.o.a.a((Object) httpResponse, "HTTP response");
        return httpResponse.getStatusLine().getStatusCode() == this.c;
    }

    protected boolean a(AuthScheme authScheme) {
        if (authScheme == null || !authScheme.isComplete()) {
            return false;
        }
        String schemeName = authScheme.getSchemeName();
        return schemeName.equalsIgnoreCase(a.a) || schemeName.equalsIgnoreCase(a.b);
    }

    public Map<String, Header> b(HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        org.a.a.o.a.a((Object) httpResponse, "HTTP response");
        Header[] headers = httpResponse.getHeaders(this.d);
        Map<String, Header> hashMap = new HashMap(headers.length);
        for (Header header : headers) {
            CharArrayBuffer buffer;
            int valuePos;
            if (header instanceof FormattedHeader) {
                buffer = ((FormattedHeader) header).getBuffer();
                valuePos = ((FormattedHeader) header).getValuePos();
            } else {
                String value = header.getValue();
                if (value == null) {
                    throw new MalformedChallengeException("Header value is null");
                }
                CharArrayBuffer charArrayBuffer = new CharArrayBuffer(value.length());
                charArrayBuffer.append(value);
                buffer = charArrayBuffer;
                valuePos = 0;
            }
            while (valuePos < buffer.length() && HTTP.isWhitespace(buffer.charAt(valuePos))) {
                valuePos++;
            }
            int i = valuePos;
            while (i < buffer.length() && !HTTP.isWhitespace(buffer.charAt(i))) {
                i++;
            }
            hashMap.put(buffer.substring(valuePos, i).toLowerCase(Locale.ENGLISH), header);
        }
        return hashMap;
    }

    public void b(HttpHost httpHost, AuthScheme authScheme, HttpContext httpContext) {
        org.a.a.o.a.a((Object) httpHost, e.z);
        org.a.a.o.a.a((Object) httpContext, "HTTP context");
        org.a.a.c.a j = org.a.a.c.e.a.a(httpContext).j();
        if (j != null) {
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Clearing cached auth scheme for " + httpHost);
            }
            j.b(httpHost);
        }
    }
}
