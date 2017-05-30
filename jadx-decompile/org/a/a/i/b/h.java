package org.a.a.i.b;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URI;
import org.a.a.a.d;
import org.a.a.c.c.b;
import org.a.a.c.f.i;
import org.a.a.o.a;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

@d
public abstract class h implements Closeable, HttpClient {
    private static final String a = "HttpClient";

    private static HttpHost b(HttpUriRequest httpUriRequest) {
        HttpHost httpHost = null;
        URI uri = httpUriRequest.getURI();
        if (uri.isAbsolute()) {
            httpHost = i.b(uri);
            if (httpHost == null) {
                throw new ClientProtocolException("URI does not specify a valid host name: " + uri);
            }
        }
        return httpHost;
    }

    public b a(HttpHost httpHost, HttpRequest httpRequest) {
        return a(httpHost, httpRequest, (HttpContext) null);
    }

    protected abstract b a(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext);

    public b a(HttpUriRequest httpUriRequest) {
        return a(httpUriRequest, (HttpContext) null);
    }

    public b a(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        a.a((Object) httpUriRequest, "HTTP request");
        return a(b(httpUriRequest), httpUriRequest, httpContext);
    }

    public b b(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return a(httpHost, httpRequest, httpContext);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return execute(httpHost, httpRequest, responseHandler, null);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        a.a((Object) responseHandler, "Response handler");
        HttpResponse b = b(httpHost, httpRequest, httpContext);
        try {
            T handleResponse = responseHandler.handleResponse(b);
            org.a.a.o.d.b(b.getEntity());
            return handleResponse;
        } catch (Throwable e) {
            try {
                org.a.a.o.d.b(b.getEntity());
            } catch (Throwable e2) {
                if (Log.isLoggable(a, 5)) {
                    Log.w(a, "Error consuming content after an exception.", e2);
                }
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            } else if (e instanceof IOException) {
                throw ((IOException) e);
            } else {
                throw new UndeclaredThrowableException(e);
            }
        }
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return execute(httpUriRequest, (ResponseHandler) responseHandler, null);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return execute(b(httpUriRequest), httpUriRequest, responseHandler, httpContext);
    }

    public /* synthetic */ HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return a(httpHost, httpRequest);
    }

    public /* synthetic */ HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return b(httpHost, httpRequest, httpContext);
    }

    public /* synthetic */ HttpResponse execute(HttpUriRequest httpUriRequest) {
        return a(httpUriRequest);
    }

    public /* synthetic */ HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return a(httpUriRequest, httpContext);
    }
}
