package org.a.a.i.b;

import com.facebook.common.util.UriUtil;
import java.net.Authenticator;
import java.net.Authenticator.RequestorType;
import java.net.PasswordAuthentication;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.a.a.a.d;
import org.a.a.c.a.a;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.NTCredentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;

@d
public class ag implements CredentialsProvider {
    private static final Map<String, String> a = new ConcurrentHashMap();
    private final e b = new e();

    static {
        a.put(a.a.toUpperCase(Locale.ENGLISH), a.a);
        a.put(a.b.toUpperCase(Locale.ENGLISH), a.b);
        a.put(a.c.toUpperCase(Locale.ENGLISH), a.c);
        a.put(a.d.toUpperCase(Locale.ENGLISH), "SPNEGO");
        a.put(a.e.toUpperCase(Locale.ENGLISH), a.e);
    }

    private static String a(String str) {
        if (str == null) {
            return null;
        }
        String str2 = (String) a.get(str);
        return str2 == null ? str : str2;
    }

    private static PasswordAuthentication a(AuthScope authScope, RequestorType requestorType) {
        String host = authScope.getHost();
        int port = authScope.getPort();
        return Authenticator.requestPasswordAuthentication(host, null, port, port == 443 ? UriUtil.HTTPS_SCHEME : UriUtil.HTTP_SCHEME, null, a(authScope.getScheme()), null, requestorType);
    }

    public void clear() {
        this.b.clear();
    }

    public Credentials getCredentials(AuthScope authScope) {
        org.a.a.o.a.a((Object) authScope, "Auth scope");
        Credentials credentials = this.b.getCredentials(authScope);
        if (credentials != null) {
            return credentials;
        }
        if (authScope.getHost() != null) {
            PasswordAuthentication a = a(authScope, RequestorType.SERVER);
            PasswordAuthentication a2 = a == null ? a(authScope, RequestorType.PROXY) : a;
            if (a2 != null) {
                String property = System.getProperty("http.auth.ntlm.domain");
                return property != null ? new NTCredentials(a2.getUserName(), new String(a2.getPassword()), null, property) : a.c.equalsIgnoreCase(authScope.getScheme()) ? new NTCredentials(a2.getUserName(), new String(a2.getPassword()), null, null) : new UsernamePasswordCredentials(a2.getUserName(), new String(a2.getPassword()));
            }
        }
        return null;
    }

    public void setCredentials(AuthScope authScope, Credentials credentials) {
        this.b.setCredentials(authScope, credentials);
    }
}
