package org.a.a.c.c;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import org.a.a.a.c;
import org.a.a.e;
import org.a.a.o.a;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;

@c
public class i extends m {
    public static final String a = "OPTIONS";

    public i(String str) {
        a(URI.create(str));
    }

    public i(URI uri) {
        a(uri);
    }

    public Set<String> a(HttpResponse httpResponse) {
        a.a((Object) httpResponse, "HTTP response");
        HeaderIterator headerIterator = httpResponse.headerIterator(e.g);
        Set<String> hashSet = new HashSet();
        while (headerIterator.hasNext()) {
            for (HeaderElement name : headerIterator.nextHeader().getElements()) {
                hashSet.add(name.getName());
            }
        }
        return hashSet;
    }

    public String getMethod() {
        return a;
    }
}
