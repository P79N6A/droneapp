package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.af.a;
import java.util.Map;

class l$2 extends a {
    l$2() {
    }

    public void a(String str, Map map) {
        c cVar;
        if (l.b().containsKey(str)) {
            cVar = (c) l.b().get(str);
        } else {
            cVar = (c) l.a(str, c.class);
            l.b().put(str, cVar);
        }
        if (cVar != null) {
            cVar.a(map);
        }
    }

    public String b(String str, Map map) {
        d dVar;
        if (l.c().containsKey(str)) {
            dVar = (d) l.c().get(str);
        } else {
            dVar = (d) l.a(str, d.class);
            l.c().put(str, dVar);
        }
        return dVar != null ? dVar.a(map) : null;
    }
}
