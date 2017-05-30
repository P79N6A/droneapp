package com.google.android.gms.internal;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.tencent.mm.sdk.platformtools.Util;

public class aoo {
    private static Object m = new Object();
    private static aoo n;
    private volatile long a;
    private volatile long b;
    private volatile boolean c;
    private volatile boolean d;
    private volatile com.google.android.gms.ads.a.a.a e;
    private volatile long f;
    private volatile long g;
    private final Context h;
    private final e i;
    private final Thread j;
    private final Object k;
    private a l;

    public interface a {
        com.google.android.gms.ads.a.a.a a();
    }

    private aoo(Context context) {
        this(context, null, h.d());
    }

    public aoo(Context context, a aVar, e eVar) {
        this.a = 900000;
        this.b = NotificationOptions.b;
        this.c = true;
        this.d = false;
        this.k = new Object();
        this.l = new a(this) {
            final /* synthetic */ aoo a;

            {
                this.a = r1;
            }

            public com.google.android.gms.ads.a.a.a a() {
                com.google.android.gms.ads.a.a.a aVar = null;
                try {
                    aVar = com.google.android.gms.ads.a.a.b(this.a.h);
                } catch (Throwable e) {
                    aph.b("IllegalStateException getting Advertising Id Info", e);
                } catch (Throwable e2) {
                    aph.b("GooglePlayServicesRepairableException getting Advertising Id Info", e2);
                } catch (Throwable e22) {
                    aph.b("IOException getting Ad Id Info", e22);
                } catch (Throwable e222) {
                    this.a.c = false;
                    aph.b("GooglePlayServicesNotAvailableException getting Advertising Id Info", e222);
                } catch (Throwable e2222) {
                    aph.b("Unknown exception. Could not get the Advertising Id Info.", e2222);
                }
                return aVar;
            }
        };
        this.i = eVar;
        if (context != null) {
            this.h = context.getApplicationContext();
        } else {
            this.h = context;
        }
        if (aVar != null) {
            this.l = aVar;
        }
        this.f = this.i.a();
        this.j = new Thread(new Runnable(this) {
            final /* synthetic */ aoo a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.g();
            }
        });
    }

    public static aoo a(Context context) {
        if (n == null) {
            synchronized (m) {
                if (n == null) {
                    n = new aoo(context);
                    n.c();
                }
            }
        }
        return n;
    }

    private void d() {
        synchronized (this) {
            try {
                e();
                wait(500);
            } catch (InterruptedException e) {
            }
        }
    }

    private void e() {
        if (this.i.a() - this.f > this.b) {
            synchronized (this.k) {
                this.k.notify();
            }
            this.f = this.i.a();
        }
    }

    private void f() {
        if (this.i.a() - this.g > Util.MILLSECONDS_OF_HOUR) {
            this.e = null;
        }
    }

    private void g() {
        Process.setThreadPriority(10);
        while (!this.d) {
            com.google.android.gms.ads.a.a.a aVar = null;
            if (this.c) {
                aVar = this.l.a();
            }
            if (aVar != null) {
                this.e = aVar;
                this.g = this.i.a();
                aph.c("Obtained fresh AdvertisingId info from GmsCore.");
            }
            synchronized (this) {
                notifyAll();
            }
            try {
                synchronized (this.k) {
                    this.k.wait(this.a);
                }
            } catch (InterruptedException e) {
                aph.c("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    public String a() {
        if (this.e == null) {
            d();
        } else {
            e();
        }
        f();
        return this.e == null ? null : this.e.a();
    }

    public boolean b() {
        if (this.e == null) {
            d();
        } else {
            e();
        }
        f();
        return this.e == null ? true : this.e.b();
    }

    public void c() {
        this.j.start();
    }
}
