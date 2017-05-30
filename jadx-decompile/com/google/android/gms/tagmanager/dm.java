package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.util.h;
import com.google.android.gms.internal.ahn;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.gi.j;

public class dm extends ahn<b> {
    private final com.google.android.gms.common.util.e a;
    private final d b;
    private final Looper c;
    private final bu d;
    private final int e;
    private final Context f;
    private final f g;
    private final String h;
    private final dn l;
    private f m;
    private em n;
    private volatile dl o;
    private volatile boolean p;
    private j q;
    private long r;
    private String s;
    private e t;
    private a u;

    interface e extends k {
        void a(long j, String str);

        void a(av<j> avVar);

        void a(String str);
    }

    interface f extends k {
        com.google.android.gms.internal.en.c a(int i);

        void a();

        void a(com.google.android.gms.internal.el.a aVar);

        void a(av<com.google.android.gms.internal.el.a> avVar);
    }

    class AnonymousClass1 {
    }

    interface a {
        boolean a(a aVar);
    }

    private class b implements av<com.google.android.gms.internal.el.a> {
        final /* synthetic */ dm a;

        private b(dm dmVar) {
            this.a = dmVar;
        }

        public void a() {
        }

        public void a(com.google.android.gms.internal.el.a aVar) {
            j jVar;
            if (aVar.c != null) {
                jVar = aVar.c;
            } else {
                com.google.android.gms.internal.gi.f fVar = aVar.b;
                jVar = new j();
                jVar.b = fVar;
                jVar.a = null;
                jVar.c = fVar.l;
            }
            this.a.a(jVar, aVar.a, true);
        }

        public void a(com.google.android.gms.tagmanager.av.a aVar) {
            if (!this.a.p) {
                this.a.a(0);
            }
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.internal.el.a) obj);
        }
    }

    private class c implements av<j> {
        final /* synthetic */ dm a;

        private c(dm dmVar) {
            this.a = dmVar;
        }

        public void a() {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.google.android.gms.internal.gi.j r6) {
            /*
            r5 = this;
            r0 = r5.a;
            r0 = r0.l;
            r0.d();
            r1 = r5.a;
            monitor-enter(r1);
            r0 = r6.b;	 Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x003a;
        L_0x0010:
            r0 = r5.a;	 Catch:{ all -> 0x0077 }
            r0 = r0.q;	 Catch:{ all -> 0x0077 }
            r0 = r0.b;	 Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0030;
        L_0x001a:
            r0 = "Current resource is null; network resource is also null";
            com.google.android.gms.tagmanager.aw.a(r0);	 Catch:{ all -> 0x0077 }
            r0 = r5.a;	 Catch:{ all -> 0x0077 }
            r0 = r0.l;	 Catch:{ all -> 0x0077 }
            r2 = r0.b();	 Catch:{ all -> 0x0077 }
            r0 = r5.a;	 Catch:{ all -> 0x0077 }
            r0.a(r2);	 Catch:{ all -> 0x0077 }
            monitor-exit(r1);	 Catch:{ all -> 0x0077 }
        L_0x002f:
            return;
        L_0x0030:
            r0 = r5.a;	 Catch:{ all -> 0x0077 }
            r0 = r0.q;	 Catch:{ all -> 0x0077 }
            r0 = r0.b;	 Catch:{ all -> 0x0077 }
            r6.b = r0;	 Catch:{ all -> 0x0077 }
        L_0x003a:
            r0 = r5.a;	 Catch:{ all -> 0x0077 }
            r2 = r5.a;	 Catch:{ all -> 0x0077 }
            r2 = r2.a;	 Catch:{ all -> 0x0077 }
            r2 = r2.a();	 Catch:{ all -> 0x0077 }
            r4 = 0;
            r0.a(r6, r2, r4);	 Catch:{ all -> 0x0077 }
            r0 = r5.a;	 Catch:{ all -> 0x0077 }
            r2 = r0.r;	 Catch:{ all -> 0x0077 }
            r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0077 }
            r4 = 58;
            r0.<init>(r4);	 Catch:{ all -> 0x0077 }
            r4 = "setting refresh time to current time: ";
            r0 = r0.append(r4);	 Catch:{ all -> 0x0077 }
            r0 = r0.append(r2);	 Catch:{ all -> 0x0077 }
            r0 = r0.toString();	 Catch:{ all -> 0x0077 }
            com.google.android.gms.tagmanager.aw.e(r0);	 Catch:{ all -> 0x0077 }
            r0 = r5.a;	 Catch:{ all -> 0x0077 }
            r0 = r0.n();	 Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0075;
        L_0x0070:
            r0 = r5.a;	 Catch:{ all -> 0x0077 }
            r0.a(r6);	 Catch:{ all -> 0x0077 }
        L_0x0075:
            monitor-exit(r1);	 Catch:{ all -> 0x0077 }
            goto L_0x002f;
        L_0x0077:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0077 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.dm.c.a(com.google.android.gms.internal.gi$j):void");
        }

        public void a(com.google.android.gms.tagmanager.av.a aVar) {
            if (aVar == com.google.android.gms.tagmanager.av.a.SERVER_UNAVAILABLE_ERROR) {
                this.a.l.c();
            }
            synchronized (this.a) {
                if (!this.a.i()) {
                    if (this.a.o != null) {
                        this.a.b(this.a.o);
                    } else {
                        this.a.b(this.a.a(Status.d));
                    }
                }
            }
            this.a.a(this.a.l.b());
        }

        public /* synthetic */ void a(Object obj) {
            a((j) obj);
        }
    }

    private class d implements com.google.android.gms.tagmanager.dl.a {
        final /* synthetic */ dm a;

        private d(dm dmVar) {
            this.a = dmVar;
        }

        public void a() {
            if (this.a.d.a()) {
                this.a.a(0);
            }
        }

        public void a(String str) {
            this.a.a(str);
        }

        public String b() {
            return this.a.h();
        }
    }

    dm(Context context, f fVar, Looper looper, String str, int i, f fVar2, e eVar, em emVar, com.google.android.gms.common.util.e eVar2, bu buVar, dn dnVar) {
        super(looper == null ? Looper.getMainLooper() : looper);
        this.f = context;
        this.g = fVar;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.c = looper;
        this.h = str;
        this.e = i;
        this.m = fVar2;
        this.t = eVar;
        this.n = emVar;
        this.b = new d();
        this.q = new j();
        this.a = eVar2;
        this.d = buVar;
        this.l = dnVar;
        if (n()) {
            a(bs.a().c());
        }
    }

    public dm(Context context, f fVar, Looper looper, String str, int i, dq dqVar) {
        ce ceVar = new ce(context, str);
        cd cdVar = new cd(context, str, dqVar);
        Context context2 = context;
        f fVar2 = fVar;
        Looper looper2 = looper;
        String str2 = str;
        int i2 = i;
        ce ceVar2 = ceVar;
        cd cdVar2 = cdVar;
        this(context2, fVar2, looper2, str2, i2, ceVar2, cdVar2, new em(context), h.d(), new au(1, 5, 900000, 5000, "refreshing", h.d()), new dn(context, str));
        this.n.a(dqVar.a());
    }

    private synchronized void a(long j) {
        if (this.t == null) {
            aw.b("Refresh requested, but no network load scheduler.");
        } else {
            this.t.a(j, this.q.c);
        }
    }

    private synchronized void a(j jVar) {
        if (this.m != null) {
            com.google.android.gms.internal.el.a aVar = new com.google.android.gms.internal.el.a();
            aVar.a = this.r;
            aVar.b = new com.google.android.gms.internal.gi.f();
            aVar.c = jVar;
            this.m.a(aVar);
        }
    }

    private synchronized void a(j jVar, long j, boolean z) {
        if (z) {
            boolean z2 = this.p;
        }
        if (!(i() && this.o == null)) {
            this.q = jVar;
            this.r = j;
            long a = this.l.a();
            a(Math.max(0, Math.min(a, (this.r + a) - this.a.a())));
            a aVar = new a(this.f, this.g.a(), this.h, j, jVar);
            if (this.o == null) {
                this.o = new dl(this.g, this.c, aVar, this.b);
            } else {
                this.o.a(aVar);
            }
            if (!i() && this.u.a(aVar)) {
                b(this.o);
            }
        }
    }

    private void a(final boolean z) {
        this.m.a(new b());
        this.t.a(new c());
        com.google.android.gms.internal.en.c a = this.m.a(this.e);
        if (a != null) {
            this.o = new dl(this.g, this.c, new a(this.f, this.g.a(), this.h, 0, a), this.b);
        }
        this.u = new a(this) {
            final /* synthetic */ dm b;
            private Long c;

            private long a() {
                if (this.c == null) {
                    this.c = Long.valueOf(this.b.l.a());
                }
                return this.c.longValue();
            }

            public boolean a(a aVar) {
                return z ? aVar.b() + a() >= this.b.a.a() : !aVar.c();
            }
        };
        if (n()) {
            this.t.a(0, "");
        } else {
            this.m.a();
        }
    }

    private boolean n() {
        bs a = bs.a();
        return (a.b() == a.CONTAINER || a.b() == a.CONTAINER_DEBUG) && this.h.equals(a.d());
    }

    protected b a(Status status) {
        if (this.o != null) {
            return this.o;
        }
        if (status == Status.d) {
            aw.a("timer expired: setting result to failure");
        }
        return new dl(status);
    }

    synchronized void a(String str) {
        this.s = str;
        if (this.t != null) {
            this.t.a(str);
        }
    }

    protected /* synthetic */ m b(Status status) {
        return a(status);
    }

    public void b() {
        com.google.android.gms.internal.en.c a = this.m.a(this.e);
        if (a != null) {
            b(new dl(this.g, this.c, new a(this.f, this.g.a(), this.h, 0, a), new com.google.android.gms.tagmanager.dl.a(this) {
                final /* synthetic */ dm a;

                {
                    this.a = r1;
                }

                public void a() {
                    aw.b("Refresh ignored: container loaded as default only.");
                }

                public void a(String str) {
                    this.a.a(str);
                }

                public String b() {
                    return this.a.h();
                }
            }));
        } else {
            String str = "Default was requested, but no default container was found";
            aw.a(str);
            b(a(new Status(10, str, null)));
        }
        this.t = null;
        this.m = null;
    }

    public void c() {
        a(false);
    }

    public void g() {
        a(true);
    }

    synchronized String h() {
        return this.s;
    }
}
