package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.ajw;
import com.google.android.gms.internal.ajx;
import com.google.android.gms.internal.ajy;
import com.google.android.gms.internal.aka;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class e {
    private static final Map<String, com.google.android.gms.drive.metadata.a<?>> a = new HashMap();
    private static final Map<String, a> b = new HashMap();

    public interface a {
        String a();

        void a(DataHolder dataHolder);
    }

    static {
        a(ajw.a);
        a(ajw.G);
        a(ajw.x);
        a(ajw.E);
        a(ajw.H);
        a(ajw.n);
        a(ajw.m);
        a(ajw.o);
        a(ajw.p);
        a(ajw.q);
        a(ajw.k);
        a(ajw.s);
        a(ajw.t);
        a(ajw.u);
        a(ajw.C);
        a(ajw.b);
        a(ajw.z);
        a(ajw.d);
        a(ajw.l);
        a(ajw.e);
        a(ajw.f);
        a(ajw.g);
        a(ajw.h);
        a(ajw.w);
        a(ajw.r);
        a(ajw.y);
        a(ajw.A);
        a(ajw.B);
        a(ajw.D);
        a(ajw.I);
        a(ajw.J);
        a(ajw.j);
        a(ajw.i);
        a(ajw.F);
        a(ajw.v);
        a(ajw.c);
        a(ajw.K);
        a(ajw.L);
        a(ajw.M);
        a(ajw.N);
        a(ajw.O);
        a(ajw.P);
        a(ajw.Q);
        a(ajy.a);
        a(ajy.c);
        a(ajy.d);
        a(ajy.e);
        a(ajy.b);
        a(ajy.f);
        a(aka.a);
        a(aka.b);
        m mVar = ajw.C;
        a(m.a);
        a(ajx.a);
    }

    public static com.google.android.gms.drive.metadata.a<?> a(String str) {
        return (com.google.android.gms.drive.metadata.a) a.get(str);
    }

    public static Collection<com.google.android.gms.drive.metadata.a<?>> a() {
        return Collections.unmodifiableCollection(a.values());
    }

    public static void a(DataHolder dataHolder) {
        for (a a : b.values()) {
            a.a(dataHolder);
        }
    }

    private static void a(com.google.android.gms.drive.metadata.a<?> aVar) {
        if (a.containsKey(aVar.a())) {
            String str = "Duplicate field name registered: ";
            String valueOf = String.valueOf(aVar.a());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        a.put(aVar.a(), aVar);
    }

    private static void a(a aVar) {
        if (b.put(aVar.a(), aVar) != null) {
            String valueOf = String.valueOf(aVar.a());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 46).append("A cleaner for key ").append(valueOf).append(" has already been registered").toString());
        }
    }
}
