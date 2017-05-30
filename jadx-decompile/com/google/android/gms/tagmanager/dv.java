package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj.a;
import java.util.List;
import java.util.Map;

class dv extends cu {
    private static final String a = eg.DATA_LAYER_WRITE.toString();
    private static final String b = fh.VALUE.toString();
    private static final String c = fh.CLEAR_PERSISTENT_DATA_LAYER_PREFIX.toString();
    private final e d;

    public dv(e eVar) {
        super(a, b);
        this.d = eVar;
    }

    private void a(a aVar) {
        if (aVar != null && aVar != cw.a()) {
            String a = cw.a(aVar);
            if (a != cw.f()) {
                this.d.a(a);
            }
        }
    }

    private void b(a aVar) {
        if (aVar != null && aVar != cw.a()) {
            Object f = cw.f(aVar);
            if (f instanceof List) {
                for (Object f2 : (List) f2) {
                    if (f2 instanceof Map) {
                        this.d.a((Map) f2);
                    }
                }
            }
        }
    }

    public void b(Map<String, a> map) {
        b((a) map.get(b));
        a((a) map.get(c));
    }
}
