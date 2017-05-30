package org.a.a.i.c;

import com.facebook.common.util.UriUtil;
import org.a.a.a.b;
import org.a.a.f.i;
import org.a.a.f.j;
import org.a.a.o.a;
import org.apache.http.HttpHost;

@b
public class k implements i {
    public static final k a = new k();

    public int a(HttpHost httpHost) {
        a.a((Object) httpHost, "HTTP host");
        int port = httpHost.getPort();
        if (port > 0) {
            return port;
        }
        String schemeName = httpHost.getSchemeName();
        if (schemeName.equalsIgnoreCase(UriUtil.HTTP_SCHEME)) {
            return 80;
        }
        if (schemeName.equalsIgnoreCase(UriUtil.HTTPS_SCHEME)) {
            return 443;
        }
        throw new j(schemeName + " protocol is not supported");
    }
}
