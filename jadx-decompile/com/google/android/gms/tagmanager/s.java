package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gi.c;
import com.google.android.gms.internal.gi.d;
import com.google.android.gms.internal.gi.i;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class s {
    private static Map<String, Object> a(a aVar) {
        Object f = cw.f(aVar);
        if (f instanceof Map) {
            return (Map) f;
        }
        String valueOf = String.valueOf(f);
        aw.b(new StringBuilder(String.valueOf(valueOf).length() + 36).append("value: ").append(valueOf).append(" is not a map value, ignored.").toString());
        return null;
    }

    private static void a(e eVar, d dVar) {
        for (a a : dVar.b) {
            eVar.a(cw.a(a));
        }
    }

    public static void a(e eVar, i iVar) {
        if (iVar.c == null) {
            aw.b("supplemental missing experimentSupplemental");
            return;
        }
        a(eVar, iVar.c);
        b(eVar, iVar.c);
        c(eVar, iVar.c);
    }

    private static void b(e eVar, d dVar) {
        for (a a : dVar.a) {
            Map a2 = a(a);
            if (a2 != null) {
                eVar.a(a2);
            }
        }
    }

    private static void c(e eVar, d dVar) {
        for (c cVar : dVar.c) {
            if (cVar.a == null) {
                aw.b("GaExperimentRandom: No key");
            } else {
                Object c = eVar.c(cVar.a);
                Long valueOf = !(c instanceof Number) ? null : Long.valueOf(((Number) c).longValue());
                long j = cVar.b;
                long j2 = cVar.c;
                if (!cVar.d || valueOf == null || valueOf.longValue() < j || valueOf.longValue() > j2) {
                    if (j <= j2) {
                        c = Long.valueOf(Math.round((Math.random() * ((double) (j2 - j))) + ((double) j)));
                    } else {
                        aw.b("GaExperimentRandom: random range invalid");
                    }
                }
                eVar.a(cVar.a);
                Map b = eVar.b(cVar.a, c);
                if (cVar.e > 0) {
                    if (b.containsKey("gtm")) {
                        Object obj = b.get("gtm");
                        if (obj instanceof Map) {
                            ((Map) obj).put("lifetime", Long.valueOf(cVar.e));
                        } else {
                            aw.b("GaExperimentRandom: gtm not a map");
                        }
                    } else {
                        b.put("gtm", e.a("lifetime", Long.valueOf(cVar.e)));
                    }
                }
                eVar.a(b);
            }
        }
    }
}
