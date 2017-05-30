package org.a.a.i.b;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.a.a.a.b;
import org.a.a.c.c.h;
import org.a.a.c.c.i;
import org.a.a.c.c.l;
import org.a.a.c.c.o;
import org.apache.http.HttpRequest;

@b
public class ae extends l {
    private final Map<String, Boolean> b;

    public ae() {
        this(3, false);
    }

    public ae(int i, boolean z) {
        super(i, z);
        this.b = new ConcurrentHashMap();
        this.b.put("GET", Boolean.TRUE);
        this.b.put(h.a, Boolean.TRUE);
        this.b.put(l.a, Boolean.TRUE);
        this.b.put("DELETE", Boolean.TRUE);
        this.b.put(i.a, Boolean.TRUE);
        this.b.put(o.a, Boolean.TRUE);
    }

    protected boolean a(HttpRequest httpRequest) {
        Boolean bool = (Boolean) this.b.get(httpRequest.getRequestLine().getMethod().toUpperCase(Locale.ENGLISH));
        return bool != null && bool.booleanValue();
    }
}
