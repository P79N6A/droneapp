package org.a.a.c.e;

import android.util.Log;
import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.protocol.HttpContext;

@b
public class d implements HttpRequestInterceptor {
    private static final String a = "HttpClient";

    private void a(HttpHost httpHost, AuthScheme authScheme, org.a.a.b.d dVar, CredentialsProvider credentialsProvider) {
        String schemeName = authScheme.getSchemeName();
        if (Log.isLoggable(a, 3)) {
            Log.d(a, "Re-using cached '" + schemeName + "' auth scheme for " + httpHost);
        }
        Credentials credentials = credentialsProvider.getCredentials(new AuthScope(httpHost.getHostName(), httpHost.getPort(), AuthScope.ANY_REALM, schemeName));
        if (credentials != null) {
            if ("BASIC".equalsIgnoreCase(authScheme.getSchemeName())) {
                dVar.a(org.a.a.b.b.CHALLENGED);
            } else {
                dVar.a(org.a.a.b.b.SUCCESS);
            }
            dVar.a(authScheme, credentials);
        } else if (Log.isLoggable(a, 3)) {
            Log.d(a, "No credentials for preemptive authentication");
        }
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        a.a((Object) httpRequest, "HTTP request");
        a.a((Object) httpContext, "HTTP context");
        a a = a.a(httpContext);
        org.a.a.c.a j = a.j();
        if (j != null) {
            CredentialsProvider i = a.i();
            if (i != null) {
                RouteInfo b = a.b();
                if (b != null) {
                    HttpHost t = a.t();
                    if (t != null) {
                        HttpHost httpHost = t.getPort() < 0 ? new HttpHost(t.getHostName(), b.getTargetHost().getPort(), t.getSchemeName()) : t;
                        org.a.a.b.d k = a.k();
                        if (k != null && k.b() == org.a.a.b.b.UNCHALLENGED) {
                            AuthScheme a2 = j.a(httpHost);
                            if (a2 != null) {
                                a(httpHost, a2, k, i);
                            }
                        }
                        httpHost = b.getProxyHost();
                        k = a.l();
                        if (httpHost != null && k != null && k.b() == org.a.a.b.b.UNCHALLENGED) {
                            AuthScheme a3 = j.a(httpHost);
                            if (a3 != null) {
                                a(httpHost, a3, k, i);
                            }
                        }
                    } else if (Log.isLoggable(a, 3)) {
                        Log.d(a, "Target host not set in the context");
                    }
                } else if (Log.isLoggable(a, 3)) {
                    Log.d(a, "Route info not set in the context");
                }
            } else if (Log.isLoggable(a, 3)) {
                Log.d(a, "Credentials provider not set in the context");
            }
        } else if (Log.isLoggable(a, 3)) {
            Log.d(a, "Auth cache not set in the context");
        }
    }
}
