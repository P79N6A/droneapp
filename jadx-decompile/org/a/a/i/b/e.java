package org.a.a.i.b;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.a.a.a.d;
import org.a.a.o.a;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;

@d
public class e implements CredentialsProvider {
    private final ConcurrentHashMap<AuthScope, Credentials> a = new ConcurrentHashMap();

    private static Credentials a(Map<AuthScope, Credentials> map, AuthScope authScope) {
        Credentials credentials = (Credentials) map.get(authScope);
        if (credentials != null) {
            return credentials;
        }
        int i = -1;
        AuthScope authScope2 = null;
        for (AuthScope authScope3 : map.keySet()) {
            AuthScope authScope32;
            int i2;
            int match = authScope.match(authScope32);
            if (match > i) {
                i2 = match;
            } else {
                authScope32 = authScope2;
                i2 = i;
            }
            i = i2;
            authScope2 = authScope32;
        }
        return authScope2 != null ? (Credentials) map.get(authScope2) : credentials;
    }

    public void clear() {
        this.a.clear();
    }

    public Credentials getCredentials(AuthScope authScope) {
        a.a((Object) authScope, "Authentication scope");
        return a(this.a, authScope);
    }

    public void setCredentials(AuthScope authScope, Credentials credentials) {
        a.a((Object) authScope, "Authentication scope");
        this.a.put(authScope, credentials);
    }

    public String toString() {
        return this.a.toString();
    }
}
