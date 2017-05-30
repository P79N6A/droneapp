package org.a.a.n;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.a.a.a.d;
import org.apache.http.protocol.HttpContext;

@d
public class a implements HttpContext {
    private final HttpContext a;
    private final Map<String, Object> b;

    public a() {
        this(null);
    }

    public a(HttpContext httpContext) {
        this.b = new ConcurrentHashMap();
        this.a = httpContext;
    }

    public void a() {
        this.b.clear();
    }

    public Object getAttribute(String str) {
        org.a.a.o.a.a((Object) str, "Id");
        Object obj = this.b.get(str);
        return (obj != null || this.a == null) ? obj : this.a.getAttribute(str);
    }

    public Object removeAttribute(String str) {
        org.a.a.o.a.a((Object) str, "Id");
        return this.b.remove(str);
    }

    public void setAttribute(String str, Object obj) {
        org.a.a.o.a.a((Object) str, "Id");
        if (obj != null) {
            this.b.put(str, obj);
        } else {
            this.b.remove(str);
        }
    }

    public String toString() {
        return this.b.toString();
    }
}
