package org.a.a.i.c;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;
import org.a.a.a.b;
import org.a.a.f.i;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.protocol.HttpContext;

@b
public class t extends j {
    private final ProxySelector a;

    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        static {
            try {
                a[Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[Type.SOCKS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    public t(ProxySelector proxySelector) {
        this(null, proxySelector);
    }

    public t(i iVar, ProxySelector proxySelector) {
        super(iVar);
        if (proxySelector == null) {
            proxySelector = ProxySelector.getDefault();
        }
        this.a = proxySelector;
    }

    private String a(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.isUnresolved() ? inetSocketAddress.getHostName() : inetSocketAddress.getAddress().getHostAddress();
    }

    private Proxy a(List<Proxy> list) {
        Proxy proxy = null;
        int i = 0;
        while (proxy == null && i < list.size()) {
            Proxy proxy2 = (Proxy) list.get(i);
            switch (AnonymousClass1.a[proxy2.type().ordinal()]) {
                case 1:
                case 2:
                    break;
                default:
                    proxy2 = proxy;
                    break;
            }
            i++;
            proxy = proxy2;
        }
        return proxy == null ? Proxy.NO_PROXY : proxy;
    }

    protected HttpHost a(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        try {
            Proxy a = a(this.a.select(new URI(httpHost.toURI())));
            if (a.type() != Type.HTTP) {
                return null;
            }
            if (a.address() instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) a.address();
                return new HttpHost(a(inetSocketAddress), inetSocketAddress.getPort());
            }
            throw new HttpException("Unable to handle non-Inet proxy address: " + a.address());
        } catch (Throwable e) {
            throw new HttpException("Cannot convert host to URI: " + httpHost, e);
        }
    }
}
