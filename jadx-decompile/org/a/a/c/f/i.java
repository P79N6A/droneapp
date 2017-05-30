package org.a.a.c.f;

import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import org.a.a.a.b;
import org.a.a.o.a;
import org.a.a.o.f;
import org.apache.http.HttpHost;

@b
public class i {
    private i() {
    }

    @Deprecated
    public static URI a(String str, String str2, int i, String str3, String str4, String str5) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                stringBuilder.append(str);
                stringBuilder.append("://");
            }
            stringBuilder.append(str2);
            if (i > 0) {
                stringBuilder.append(':');
                stringBuilder.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            stringBuilder.append('/');
        }
        if (str3 != null) {
            stringBuilder.append(str3);
        }
        if (str4 != null) {
            stringBuilder.append('?');
            stringBuilder.append(str4);
        }
        if (str5 != null) {
            stringBuilder.append('#');
            stringBuilder.append(str5);
        }
        return new URI(stringBuilder.toString());
    }

    public static URI a(URI uri) {
        a.a(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        h hVar = new h(uri);
        if (hVar.g() != null) {
            hVar.b(null);
        }
        if (f.a(hVar.j())) {
            hVar.d("/");
        }
        if (hVar.h() != null) {
            hVar.c(hVar.h().toLowerCase(Locale.ENGLISH));
        }
        hVar.g(null);
        return hVar.a();
    }

    public static URI a(URI uri, String str) {
        return a(uri, URI.create(str));
    }

    public static URI a(URI uri, URI uri2) {
        a.a(uri, "Base URI");
        a.a(uri2, "Reference URI");
        String uri3 = uri2.toString();
        if (uri3.startsWith("?")) {
            return b(uri, uri2);
        }
        int i = uri3.length() == 0 ? 1 : 0;
        if (i != 0) {
            uri2 = URI.create("#");
        }
        URI resolve = uri.resolve(uri2);
        if (i != 0) {
            uri3 = resolve.toString();
            resolve = URI.create(uri3.substring(0, uri3.indexOf(35)));
        }
        return c(resolve);
    }

    public static URI a(URI uri, HttpHost httpHost) {
        return a(uri, httpHost, false);
    }

    public static URI a(URI uri, HttpHost httpHost, List<URI> list) {
        h hVar;
        a.a(uri, "Request URI");
        if (list == null || list.isEmpty()) {
            hVar = new h(uri);
        } else {
            h hVar2 = new h((URI) list.get(list.size() - 1));
            String l = hVar2.l();
            int size = list.size() - 1;
            while (l == null && size >= 0) {
                String fragment = ((URI) list.get(size)).getFragment();
                size--;
                l = fragment;
            }
            hVar2.g(l);
            hVar = hVar2;
        }
        if (hVar.l() == null) {
            hVar.g(uri.getFragment());
        }
        if (!(httpHost == null || hVar.d())) {
            hVar.a(httpHost.getSchemeName());
            hVar.c(httpHost.getHostName());
            hVar.a(httpHost.getPort());
        }
        return hVar.a();
    }

    public static URI a(URI uri, HttpHost httpHost, boolean z) {
        a.a(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        h hVar = new h(uri);
        if (httpHost != null) {
            hVar.a(httpHost.getSchemeName());
            hVar.c(httpHost.getHostName());
            hVar.a(httpHost.getPort());
        } else {
            hVar.a(null);
            hVar.c(null);
            hVar.a(-1);
        }
        if (z) {
            hVar.g(null);
        }
        if (f.a(hVar.j())) {
            hVar.d("/");
        }
        return hVar.a();
    }

    private static URI b(URI uri, URI uri2) {
        String uri3 = uri.toString();
        if (uri3.indexOf(63) > -1) {
            uri3 = uri3.substring(0, uri3.indexOf(63));
        }
        return URI.create(uri3 + uri2.toString());
    }

    public static HttpHost b(URI uri) {
        if (uri == null) {
            return null;
        }
        HttpHost httpHost;
        if (uri.isAbsolute()) {
            int port = uri.getPort();
            Object host = uri.getHost();
            if (host == null) {
                String authority = uri.getAuthority();
                if (authority != null) {
                    int indexOf = authority.indexOf(64);
                    String substring = indexOf >= 0 ? authority.length() > indexOf + 1 ? authority.substring(indexOf + 1) : null : authority;
                    if (substring != null) {
                        int indexOf2 = substring.indexOf(58);
                        if (indexOf2 >= 0) {
                            indexOf = indexOf2 + 1;
                            int i = indexOf;
                            int i2 = 0;
                            while (i < substring.length() && Character.isDigit(substring.charAt(i))) {
                                i2++;
                                i++;
                            }
                            if (i2 > 0) {
                                try {
                                    i = Integer.parseInt(substring.substring(indexOf, indexOf + i2));
                                } catch (NumberFormatException e) {
                                    i = port;
                                }
                            } else {
                                i = port;
                            }
                            port = i;
                            host = substring.substring(0, indexOf2);
                        }
                    }
                    authority = substring;
                }
            }
            String scheme = uri.getScheme();
            if (!f.b(host)) {
                httpHost = new HttpHost(host, port, scheme);
                return httpHost;
            }
        }
        httpHost = null;
        return httpHost;
    }

    private static URI c(URI uri) {
        if (uri.isOpaque() || uri.getAuthority() == null) {
            return uri;
        }
        a.a(uri.isAbsolute(), "Base URI must be absolute");
        String path = uri.getPath() == null ? "" : uri.getPath();
        String[] split = path.split("/");
        Stack stack = new Stack();
        for (String str : split) {
            if (!(str.length() == 0 || ".".equals(str))) {
                if (!"..".equals(str)) {
                    stack.push(str);
                } else if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            stringBuilder.append('/').append((String) it.next());
        }
        if (path.lastIndexOf(47) == path.length() - 1) {
            stringBuilder.append('/');
        }
        try {
            URI uri2 = new URI(uri.getScheme().toLowerCase(Locale.ENGLISH), uri.getAuthority().toLowerCase(Locale.ENGLISH), stringBuilder.toString(), null, null);
            if (uri.getQuery() == null && uri.getFragment() == null) {
                return uri2;
            }
            StringBuilder stringBuilder2 = new StringBuilder(uri2.toASCIIString());
            if (uri.getQuery() != null) {
                stringBuilder2.append('?').append(uri.getRawQuery());
            }
            if (uri.getFragment() != null) {
                stringBuilder2.append('#').append(uri.getRawFragment());
            }
            return URI.create(stringBuilder2.toString());
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }
}
