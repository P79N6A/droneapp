package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

class apu extends apt {
    private static final Object a = new Object();
    private static apu o;
    private Context b;
    private apc c;
    private volatile apa d;
    private int e = 1800000;
    private boolean f = true;
    private boolean g = false;
    private boolean h = false;
    private boolean i = true;
    private boolean j = true;
    private apd k = new apd(this) {
        final /* synthetic */ apu a;

        {
            this.a = r1;
        }

        public void a(boolean z) {
            this.a.a(z, this.a.i);
        }
    };
    private a l;
    private apj m;
    private boolean n = false;

    public interface a {
        void a();

        void a(long j);

        void b();
    }

    private class b implements a {
        final /* synthetic */ apu a;
        private Handler b;

        private b(apu com_google_android_gms_internal_apu) {
            this.a = com_google_android_gms_internal_apu;
            this.b = new Handler(this.a.b.getMainLooper(), new Callback(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public boolean handleMessage(Message message) {
                    if (1 == message.what && apu.a.equals(message.obj)) {
                        this.a.a.d();
                        if (!this.a.a.h()) {
                            this.a.a((long) this.a.a.e);
                        }
                    }
                    return true;
                }
            });
        }

        private Message c() {
            return this.b.obtainMessage(1, apu.a);
        }

        public void a() {
            this.b.removeMessages(1, apu.a);
            this.b.sendMessage(c());
        }

        public void a(long j) {
            this.b.removeMessages(1, apu.a);
            this.b.sendMessageDelayed(c(), j);
        }

        public void b() {
            this.b.removeMessages(1, apu.a);
        }
    }

    private apu() {
    }

    public static apu b() {
        if (o == null) {
            o = new apu();
        }
        return o;
    }

    private void f() {
        this.m = new apj(this);
        this.m.a(this.b);
    }

    private void g() {
        this.l = new b();
        if (this.e > 0) {
            this.l.a((long) this.e);
        }
    }

    private boolean h() {
        return this.n || !this.i || this.e <= 0;
    }

    private void i() {
        if (h()) {
            this.l.b();
            aph.d("PowerSaveMode initiated.");
            return;
        }
        this.l.a((long) this.e);
        aph.d("PowerSaveMode terminated.");
    }

    public synchronized void a() {
        if (!h()) {
            this.l.a();
        }
    }

    synchronized void a(Context context, apa com_google_android_gms_internal_apa) {
        if (this.b == null) {
            this.b = context.getApplicationContext();
            if (this.d == null) {
                this.d = com_google_android_gms_internal_apa;
            }
        }
    }

    public synchronized void a(boolean z) {
        a(this.n, z);
    }

    synchronized void a(boolean z, boolean z2) {
        boolean h = h();
        this.n = z;
        this.i = z2;
        if (h() != h) {
            i();
        }
    }

    synchronized apc c() {
        if (this.c == null) {
            if (this.b == null) {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
            this.c = new apk(this.k, this.b);
        }
        if (this.l == null) {
            g();
        }
        this.g = true;
        if (this.f) {
            d();
            this.f = false;
        }
        if (this.m == null && this.j) {
            f();
        }
        return this.c;
    }

    public synchronized void d() {
        if (!this.g) {
            aph.d("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.f = true;
        } else if (!this.h) {
            this.h = true;
            this.d.a(new Runnable(this) {
                final /* synthetic */ apu a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.h = false;
                    this.a.c.a();
                }
            });
        }
    }
}
