package org.a.a.i.a;

import android.util.Log;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.a.a.b.a;
import org.a.a.b.d;
import org.a.a.o.b;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.protocol.HttpContext;

public class f {
    private static final String a = "HttpClient";

    private Header a(AuthScheme authScheme, Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        return authScheme instanceof org.a.a.b.f ? ((org.a.a.b.f) authScheme).a(credentials, httpRequest, httpContext) : authScheme.authenticate(credentials, httpRequest);
    }

    private void a(AuthScheme authScheme) {
        b.a((Object) authScheme, "Auth scheme");
    }

    public void a(HttpRequest httpRequest, d dVar, HttpContext httpContext) {
        AuthScheme c = dVar.c();
        Credentials d = dVar.d();
        switch (dVar.b()) {
            case CHALLENGED:
                Queue e = dVar.e();
                if (e == null) {
                    a(c);
                    break;
                }
                while (!e.isEmpty()) {
                    a aVar = (a) e.remove();
                    c = aVar.a();
                    d = aVar.b();
                    dVar.a(c, d);
                    if (Log.isLoggable(a, 3)) {
                        Log.d(a, "Generating response to an authentication challenge using " + c.getSchemeName() + " scheme");
                    }
                    try {
                        httpRequest.addHeader(a(c, d, httpRequest, httpContext));
                        return;
                    } catch (AuthenticationException e2) {
                        if (Log.isLoggable(a, 5)) {
                            Log.w(a, c + " authentication error: " + e2.getMessage());
                        }
                    }
                }
                return;
            case SUCCESS:
                a(c);
                if (c.isConnectionBased()) {
                    return;
                }
                break;
            case FAILURE:
                return;
        }
        if (c != null) {
            try {
                httpRequest.addHeader(a(c, d, httpRequest, httpContext));
            } catch (AuthenticationException e22) {
                if (Log.isLoggable(a, 6)) {
                    Log.e(a, c + " authentication error: " + e22.getMessage());
                }
            }
        }
    }

    public boolean a(HttpHost httpHost, HttpResponse httpResponse, org.a.a.c.b bVar, d dVar, HttpContext httpContext) {
        if (bVar.a(httpHost, httpResponse, httpContext)) {
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Authentication required");
            }
            if (dVar.b() == org.a.a.b.b.SUCCESS) {
                bVar.b(httpHost, dVar.c(), httpContext);
            }
            return true;
        }
        switch (dVar.b()) {
            case CHALLENGED:
            case HANDSHAKE:
                if (Log.isLoggable(a, 3)) {
                    Log.d(a, "Authentication succeeded");
                }
                dVar.a(org.a.a.b.b.SUCCESS);
                bVar.a(httpHost, dVar.c(), httpContext);
                break;
            case SUCCESS:
                break;
            default:
                dVar.a(org.a.a.b.b.UNCHALLENGED);
                break;
        }
        return false;
    }

    public boolean b(HttpHost httpHost, HttpResponse httpResponse, org.a.a.c.b bVar, d dVar, HttpContext httpContext) {
        try {
            if (Log.isLoggable(a, 3)) {
                Log.d(a, httpHost.toHostString() + " requested authentication");
            }
            Map b = bVar.b(httpHost, httpResponse, httpContext);
            if (b.isEmpty()) {
                if (Log.isLoggable(a, 3)) {
                    Log.d(a, "Response contains no authentication challenges");
                }
                return false;
            }
            AuthScheme c = dVar.c();
            switch (dVar.b()) {
                case CHALLENGED:
                case HANDSHAKE:
                    if (c == null) {
                        if (Log.isLoggable(a, 3)) {
                            Log.d(a, "Auth scheme is null");
                        }
                        bVar.b(httpHost, null, httpContext);
                        dVar.a();
                        dVar.a(org.a.a.b.b.FAILURE);
                        return false;
                    }
                    break;
                case SUCCESS:
                    dVar.a();
                    break;
                case FAILURE:
                    return false;
                case UNCHALLENGED:
                    break;
            }
            if (c != null) {
                Header header = (Header) b.get(c.getSchemeName().toLowerCase(Locale.ENGLISH));
                if (header != null) {
                    if (Log.isLoggable(a, 3)) {
                        Log.d(a, "Authorization challenge processed");
                    }
                    c.processChallenge(header);
                    if (c.isComplete()) {
                        if (Log.isLoggable(a, 3)) {
                            Log.d(a, "Authentication failed");
                        }
                        bVar.b(httpHost, dVar.c(), httpContext);
                        dVar.a();
                        dVar.a(org.a.a.b.b.FAILURE);
                        return false;
                    }
                    dVar.a(org.a.a.b.b.HANDSHAKE);
                    return true;
                }
                dVar.a();
            }
            Queue a = bVar.a(b, httpHost, httpResponse, httpContext);
            if (a == null || a.isEmpty()) {
                return false;
            }
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Selected authentication options: " + a);
            }
            dVar.a(org.a.a.b.b.CHALLENGED);
            dVar.a(a);
            return true;
        } catch (MalformedChallengeException e) {
            if (Log.isLoggable(a, 5)) {
                Log.w(a, "Malformed challenge: " + e.getMessage());
            }
            dVar.a();
            return false;
        }
    }
}
