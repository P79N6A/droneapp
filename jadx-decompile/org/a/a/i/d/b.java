package org.a.a.i.d;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.a.a.a.c;
import org.a.a.o.a;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieSpec;

@c
public abstract class b implements CookieSpec {
    private final Map<String, CookieAttributeHandler> a = new HashMap(10);

    protected Collection<CookieAttributeHandler> a() {
        return this.a.values();
    }

    protected CookieAttributeHandler a(String str) {
        return (CookieAttributeHandler) this.a.get(str);
    }

    public void a(String str, CookieAttributeHandler cookieAttributeHandler) {
        a.a((Object) str, "Attribute name");
        a.a((Object) cookieAttributeHandler, "Attribute handler");
        this.a.put(str, cookieAttributeHandler);
    }

    protected CookieAttributeHandler b(String str) {
        CookieAttributeHandler a = a(str);
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Handler not registered for " + str + " attribute.");
    }
}
