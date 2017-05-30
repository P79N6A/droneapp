package org.a.a.i.b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;

@b
public class l implements HttpRequestRetryHandler {
    public static final l a = new l();
    private final int b;
    private final boolean c;
    private final Set<Class<? extends IOException>> d;

    public l() {
        this(3, false);
    }

    public l(int i, boolean z) {
        this(i, z, Arrays.asList(new Class[]{InterruptedIOException.class, UnknownHostException.class, ConnectException.class, SSLException.class}));
    }

    protected l(int i, boolean z, Collection<Class<? extends IOException>> collection) {
        this.b = i;
        this.c = z;
        this.d = new HashSet();
        for (Class add : collection) {
            this.d.add(add);
        }
    }

    public boolean a() {
        return this.c;
    }

    protected boolean a(HttpRequest httpRequest) {
        return !(httpRequest instanceof HttpEntityEnclosingRequest);
    }

    public int b() {
        return this.b;
    }

    @Deprecated
    protected boolean b(HttpRequest httpRequest) {
        HttpRequest original = httpRequest instanceof RequestWrapper ? ((RequestWrapper) httpRequest).getOriginal() : httpRequest;
        return (original instanceof HttpUriRequest) && ((HttpUriRequest) original).isAborted();
    }

    public boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
        a.a(iOException, "Exception parameter");
        a.a(httpContext, "HTTP context");
        if (i > this.b) {
            return false;
        }
        if (this.d.contains(iOException.getClass())) {
            return false;
        }
        for (Class isInstance : this.d) {
            if (isInstance.isInstance(iOException)) {
                return false;
            }
        }
        org.a.a.c.e.a a = org.a.a.c.e.a.a(httpContext);
        HttpRequest q = a.q();
        return b(q) ? false : a(q) ? true : !a.r() || this.c;
    }
}
