package org.a.b.a;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.a.b.a;

public class b implements Serializable {
    private static Map<Class<? extends a>, Map<?, b>> d = new HashMap();
    public final String a;
    public final byte b;
    public final c c;

    public b(String str, byte b, c cVar) {
        this.a = str;
        this.b = b;
        this.c = cVar;
    }

    public static void a(Class<? extends a> cls, Map<?, b> map) {
        d.put(cls, map);
    }
}
