package com.google.android.gms.internal;

import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.io.EOFException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.a.a.e;

class hv {
    private static long a = 0;
    private b b;
    private boolean c = false;
    private boolean d = false;
    private long e = 0;
    private hx f;
    private a g;
    private ScheduledFuture<?> h;
    private ScheduledFuture<?> i;
    private final hn j;
    private final ScheduledExecutorService k;
    private final ks l;

    public interface a {
        void a(Map<String, Object> map);

        void a(boolean z);
    }

    private interface b {
        void a();

        void a(String str);

        void b();
    }

    private class c implements b, lt {
        final /* synthetic */ hv a;
        private ls b;

        private c(hv hvVar, ls lsVar) {
            this.a = hvVar;
            this.b = lsVar;
            this.b.a((lt) this);
        }

        private void e() {
            this.b.e();
            try {
                this.b.g();
            } catch (Throwable e) {
                this.a.l.a("Interrupted while shutting down websocket threads", e);
            }
        }

        public void a() {
            try {
                this.b.d();
            } catch (Throwable e) {
                if (this.a.l.a()) {
                    this.a.l.a("Error connecting", e, new Object[0]);
                }
                e();
            }
        }

        public void a(final lu luVar) {
            this.a.k.execute(new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    if (luVar.getCause() == null || !(luVar.getCause() instanceof EOFException)) {
                        this.b.a.l.a("WebSocket error.", luVar, new Object[0]);
                    } else {
                        this.b.a.l.a("WebSocket reached EOF.", new Object[0]);
                    }
                    this.b.a.g();
                }
            });
        }

        public void a(lw lwVar) {
            final String a = lwVar.a();
            if (this.a.l.a()) {
                ks b = this.a.l;
                String str = "ws message: ";
                String valueOf = String.valueOf(a);
                b.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            }
            this.a.k.execute(new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    this.b.a.c(a);
                }
            });
        }

        public void a(String str) {
            this.b.a(str);
        }

        public void b() {
            this.b.e();
        }

        public void c() {
            this.a.k.execute(new Runnable(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.a.i.cancel(false);
                    this.a.a.c = true;
                    if (this.a.a.l.a()) {
                        this.a.a.l.a("websocket opened", new Object[0]);
                    }
                    this.a.a.d();
                }
            });
        }

        public void d() {
            String str = "closed";
            this.a.k.execute(new Runnable(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.a.l.a()) {
                        this.a.a.l.a("closed", new Object[0]);
                    }
                    this.a.a.g();
                }
            });
        }
    }

    public hv(hn hnVar, hp hpVar, String str, a aVar, String str2) {
        this.j = hnVar;
        this.k = hnVar.c();
        this.g = aVar;
        long j = a;
        a = 1 + j;
        this.l = new ks(hnVar.a(), "WebSocket", "ws_" + j);
        this.b = a(hpVar, str, str2);
    }

    private b a(hp hpVar, String str, String str2) {
        if (str == null) {
            str = hpVar.a();
        }
        URI a = hp.a(str, hpVar.c(), hpVar.b(), str2);
        Map hashMap = new HashMap();
        hashMap.put(e.Y, this.j.f());
        return new c(new ls(a, null, hashMap));
    }

    private void a(int i) {
        this.e = (long) i;
        this.f = new hx();
        if (this.l.a()) {
            this.l.a("HandleNewFrameCount: " + this.e, new Object[0]);
        }
    }

    private void a(String str) {
        Throwable th;
        ks ksVar;
        String str2;
        String valueOf;
        this.f.a(str);
        this.e--;
        if (this.e == 0) {
            try {
                this.f.a();
                Map a = mb.a(this.f.toString());
                this.f = null;
                if (this.l.a()) {
                    ks ksVar2 = this.l;
                    String valueOf2 = String.valueOf(a);
                    ksVar2.a(new StringBuilder(String.valueOf(valueOf2).length() + 36).append("handleIncomingFrame complete frame: ").append(valueOf2).toString(), new Object[0]);
                }
                this.g.a(a);
            } catch (Throwable e) {
                th = e;
                ksVar = this.l;
                str2 = "Error parsing frame: ";
                valueOf = String.valueOf(this.f.toString());
                ksVar.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
                c();
                h();
            } catch (Throwable e2) {
                th = e2;
                ksVar = this.l;
                str2 = "Error parsing frame (cast error): ";
                valueOf = String.valueOf(this.f.toString());
                ksVar.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
                c();
                h();
            }
        }
    }

    private static String[] a(String str, int i) {
        int i2 = 0;
        if (str.length() <= i) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        while (i2 < str.length()) {
            arrayList.add(str.substring(i2, Math.min(i2 + i, str.length())));
            i2 += i;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private String b(String str) {
        if (str.length() <= 6) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt > 0) {
                    a(parseInt);
                }
                return null;
            } catch (NumberFormatException e) {
            }
        }
        a(1);
        return str;
    }

    private void c(String str) {
        if (!this.d) {
            d();
            if (f()) {
                a(str);
                return;
            }
            String b = b(str);
            if (b != null) {
                a(b);
            }
        }
    }

    private void d() {
        if (!this.d) {
            if (this.h != null) {
                this.h.cancel(false);
                if (this.l.a()) {
                    this.l.a("Reset keepAlive. Remaining: " + this.h.getDelay(TimeUnit.MILLISECONDS), new Object[0]);
                }
            } else if (this.l.a()) {
                this.l.a("Reset keepAlive", new Object[0]);
            }
            this.h = this.k.schedule(e(), 45000, TimeUnit.MILLISECONDS);
        }
    }

    private Runnable e() {
        return new Runnable(this) {
            final /* synthetic */ hv a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.b != null) {
                    this.a.b.a("0");
                    this.a.d();
                }
            }
        };
    }

    private boolean f() {
        return this.f != null;
    }

    private void g() {
        if (!this.d) {
            if (this.l.a()) {
                this.l.a("closing itself", new Object[0]);
            }
            h();
        }
        this.b = null;
        if (this.h != null) {
            this.h.cancel(false);
        }
    }

    private void h() {
        this.d = true;
        this.g.a(this.c);
    }

    private void i() {
        if (!this.c && !this.d) {
            if (this.l.a()) {
                this.l.a("timed out on connect", new Object[0]);
            }
            this.b.b();
        }
    }

    public void a() {
        this.b.a();
        this.i = this.k.schedule(new Runnable(this) {
            final /* synthetic */ hv a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.i();
            }
        }, NotificationOptions.b, TimeUnit.MILLISECONDS);
    }

    public void a(Map<String, Object> map) {
        String str;
        d();
        try {
            String[] a = a(mb.a((Map) map), 16384);
            if (a.length > 1) {
                this.b.a(a.length);
            }
            for (String str2 : a) {
                this.b.a(str2);
            }
        } catch (Throwable e) {
            Throwable th = e;
            ks ksVar = this.l;
            str2 = "Failed to serialize message: ";
            String valueOf = String.valueOf(map.toString());
            ksVar.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            h();
        }
    }

    public void b() {
    }

    public void c() {
        if (this.l.a()) {
            this.l.a("websocket is being closed", new Object[0]);
        }
        this.d = true;
        this.b.b();
        if (this.i != null) {
            this.i.cancel(true);
        }
        if (this.h != null) {
            this.h.cancel(true);
        }
    }
}
