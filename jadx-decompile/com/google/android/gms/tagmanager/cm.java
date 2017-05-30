package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

class cm extends cl {
    private static final Object a = new Object();
    private static cm n;
    private Context b;
    private ad c;
    private volatile ab d;
    private int e = 1800000;
    private boolean f = true;
    private boolean g = false;
    private boolean h = true;
    private boolean i = true;
    private ae j = new ae(this) {
        final /* synthetic */ cm a;

        {
            this.a = r1;
        }

        public void a(boolean z) {
            this.a.a(z, this.a.h);
        }
    };
    private a k;
    private bb l;
    private boolean m = false;

    public interface a {
        void a();

        void a(long j);

        void b();
    }

    private class b implements a {
        final /* synthetic */ cm a;
        private Handler b;

        private b(cm cmVar) {
            this.a = cmVar;
            this.b = new Handler(this.a.b.getMainLooper(), new Callback(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public boolean handleMessage(Message message) {
                    if (1 == message.what && cm.a.equals(message.obj)) {
                        this.a.a.a();
                        if (!this.a.a.h()) {
                            this.a.a((long) this.a.a.e);
                        }
                    }
                    return true;
                }
            });
        }

        private Message c() {
            return this.b.obtainMessage(1, cm.a);
        }

        public void a() {
            this.b.removeMessages(1, cm.a);
            this.b.sendMessage(c());
        }

        public void a(long j) {
            this.b.removeMessages(1, cm.a);
            this.b.sendMessageDelayed(c(), j);
        }

        public void b() {
            this.b.removeMessages(1, cm.a);
        }
    }

    private cm() {
    }

    public static cm c() {
        if (n == null) {
            n = new cm();
        }
        return n;
    }

    private void f() {
        this.l = new bb(this);
        this.l.a(this.b);
    }

    private void g() {
        this.k = new b();
        if (this.e > 0) {
            this.k.a((long) this.e);
        }
    }

    private boolean h() {
        return this.m || !this.h || this.e <= 0;
    }

    private void i() {
        if (h()) {
            this.k.b();
            aw.e("PowerSaveMode initiated.");
            return;
        }
        this.k.a((long) this.e);
        aw.e("PowerSaveMode terminated.");
    }

    public synchronized void a() {
        if (this.g) {
            this.d.a(new Runnable(this) {
                final /* synthetic */ cm a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.c.a();
                }
            });
        } else {
            aw.e("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.f = true;
        }
    }

    synchronized void a(Context context, ab abVar) {
        if (this.b == null) {
            this.b = context.getApplicationContext();
            if (this.d == null) {
                this.d = abVar;
            }
        }
    }

    public synchronized void a(boolean z) {
        a(this.m, z);
    }

    synchronized void a(boolean z, boolean z2) {
        boolean h = h();
        this.m = z;
        this.h = z2;
        if (h() != h) {
            i();
        }
    }

    public synchronized void b() {
        if (!h()) {
            this.k.a();
        }
    }

    synchronized ad d() {
        if (this.c == null) {
            if (this.b == null) {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
            this.c = new bp(this.j, this.b);
        }
        if (this.k == null) {
            g();
        }
        this.g = true;
        if (this.f) {
            a();
            this.f = false;
        }
        if (this.l == null && this.i) {
            f();
        }
        return this.c;
    }
}
