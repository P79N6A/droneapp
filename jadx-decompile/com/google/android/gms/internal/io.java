package com.google.android.gms.internal;

import com.google.firebase.database.g;
import java.util.HashMap;
import java.util.Map;

public class io {
    private static final io a = new io();
    private final Map<ic, Map<String, im>> b = new HashMap();

    class AnonymousClass1 implements Runnable {
        final /* synthetic */ im a;

        AnonymousClass1(im imVar) {
            this.a = imVar;
        }

        public void run() {
            this.a.h();
        }
    }

    class AnonymousClass2 implements Runnable {
        final /* synthetic */ im a;

        AnonymousClass2(im imVar) {
            this.a = imVar;
        }

        public void run() {
            this.a.i();
        }
    }

    public static im a(ic icVar, in inVar, g gVar) {
        return a.b(icVar, inVar, gVar);
    }

    public static void a(ic icVar) {
        a.c(icVar);
    }

    public static void a(im imVar) {
        imVar.a(new AnonymousClass1(imVar));
    }

    private im b(ic icVar, in inVar, g gVar) {
        im imVar;
        icVar.b();
        String str = inVar.a;
        String str2 = inVar.c;
        str2 = new StringBuilder((String.valueOf(str).length() + 9) + String.valueOf(str2).length()).append("https://").append(str).append("/").append(str2).toString();
        synchronized (this.b) {
            if (!this.b.containsKey(icVar)) {
                this.b.put(icVar, new HashMap());
            }
            Map map = (Map) this.b.get(icVar);
            if (map.containsKey(str2)) {
                throw new IllegalStateException("createLocalRepo() called for existing repo.");
            }
            imVar = new im(inVar, icVar, gVar);
            map.put(str2, imVar);
        }
        return imVar;
    }

    public static void b(ic icVar) {
        a.d(icVar);
    }

    public static void b(im imVar) {
        imVar.a(new AnonymousClass2(imVar));
    }

    private void c(final ic icVar) {
        ip m = icVar.m();
        if (m != null) {
            m.a(new Runnable(this) {
                final /* synthetic */ io b;

                public void run() {
                    synchronized (this.b.b) {
                        if (this.b.b.containsKey(icVar)) {
                            Object obj = 1;
                            for (im imVar : ((Map) this.b.b.get(icVar)).values()) {
                                imVar.h();
                                Object obj2 = (obj == null || imVar.f()) ? null : 1;
                                obj = obj2;
                            }
                            if (obj != null) {
                                icVar.d();
                            }
                        }
                    }
                }
            });
        }
    }

    private void d(final ic icVar) {
        ip m = icVar.m();
        if (m != null) {
            m.a(new Runnable(this) {
                final /* synthetic */ io b;

                public void run() {
                    synchronized (this.b.b) {
                        if (this.b.b.containsKey(icVar)) {
                            for (im i : ((Map) this.b.b.get(icVar)).values()) {
                                i.i();
                            }
                        }
                    }
                }
            });
        }
    }
}
