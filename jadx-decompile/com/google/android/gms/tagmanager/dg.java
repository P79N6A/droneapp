package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class dg extends cu {
    static final String a;
    private static final String b = eg.ARBITRARY_PIXEL.toString();
    private static final String c = fh.URL.toString();
    private static final String d = fh.ADDITIONAL_PARAMS.toString();
    private static final String e = fh.UNREPEATABLE.toString();
    private static final Set<String> f = new HashSet();
    private final a g;
    private final Context h;

    public interface a {
        aa a();
    }

    class AnonymousClass1 implements a {
        final /* synthetic */ Context a;

        AnonymousClass1(Context context) {
            this.a = context;
        }

        public aa a() {
            return h.a(this.a);
        }
    }

    static {
        String str = b;
        a = new StringBuilder(String.valueOf(str).length() + 17).append("gtm_").append(str).append("_unrepeatable").toString();
    }

    public dg(Context context) {
        this(context, new AnonymousClass1(context));
    }

    dg(Context context, a aVar) {
        super(b, c);
        this.g = aVar;
        this.h = context;
    }

    private synchronized boolean c(String str) {
        boolean z = true;
        synchronized (this) {
            if (!b(str)) {
                if (a(str)) {
                    f.add(str);
                } else {
                    z = false;
                }
            }
        }
        return z;
    }

    boolean a(String str) {
        return this.h.getSharedPreferences(a, 0).contains(str);
    }

    public void b(Map<String, com.google.android.gms.internal.hj.a> map) {
        String a = map.get(e) != null ? cw.a((com.google.android.gms.internal.hj.a) map.get(e)) : null;
        if (a == null || !c(a)) {
            String valueOf;
            Builder buildUpon = Uri.parse(cw.a((com.google.android.gms.internal.hj.a) map.get(c))).buildUpon();
            com.google.android.gms.internal.hj.a aVar = (com.google.android.gms.internal.hj.a) map.get(d);
            if (aVar != null) {
                Object f = cw.f(aVar);
                if (f instanceof List) {
                    for (Object f2 : (List) f2) {
                        if (f2 instanceof Map) {
                            for (Entry entry : ((Map) f2).entrySet()) {
                                buildUpon.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                            }
                        } else {
                            a = "ArbitraryPixel: additional params contains non-map: not sending partial hit: ";
                            valueOf = String.valueOf(buildUpon.build().toString());
                            aw.a(valueOf.length() != 0 ? a.concat(valueOf) : new String(a));
                            return;
                        }
                    }
                }
                a = "ArbitraryPixel: additional params not a list: not sending partial hit: ";
                valueOf = String.valueOf(buildUpon.build().toString());
                aw.a(valueOf.length() != 0 ? a.concat(valueOf) : new String(a));
                return;
            }
            valueOf = buildUpon.build().toString();
            this.g.a().a(valueOf);
            String str = "ArbitraryPixel: url = ";
            valueOf = String.valueOf(valueOf);
            aw.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            if (a != null) {
                synchronized (dg.class) {
                    f.add(a);
                    cn.a(this.h, a, a, "true");
                }
            }
        }
    }

    boolean b(String str) {
        return f.contains(str);
    }
}
