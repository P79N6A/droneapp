package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.tencent.mm.sdk.platformtools.Util;

public class g {
    private static Object l = new Object();
    private static g m;
    private volatile long a;
    private volatile long b;
    private volatile boolean c;
    private volatile com.google.android.gms.ads.a.a.a d;
    private volatile long e;
    private volatile long f;
    private final Context g;
    private final e h;
    private final Thread i;
    private final Object j;
    private a k;

    public interface a {
        com.google.android.gms.ads.a.a.a a();
    }

    private g(Context context) {
        this(context, null, h.d());
    }

    public g(Context context, a aVar, e eVar) {
        this.a = 900000;
        this.b = NotificationOptions.b;
        this.c = false;
        this.j = new Object();
        this.k = new a(this) {
            final /* synthetic */ g a;

            {
                this.a = r1;
            }

            public com.google.android.gms.ads.a.a.a a() {
                com.google.android.gms.ads.a.a.a aVar = null;
                try {
                    aVar = com.google.android.gms.ads.a.a.b(this.a.g);
                } catch (Throwable e) {
                    aw.b("IllegalStateException getting Advertising Id Info", e);
                } catch (Throwable e2) {
                    aw.b("GooglePlayServicesRepairableException getting Advertising Id Info", e2);
                } catch (Throwable e22) {
                    aw.b("IOException getting Ad Id Info", e22);
                } catch (Throwable e222) {
                    aw.b("GooglePlayServicesNotAvailableException getting Advertising Id Info", e222);
                } catch (Throwable e2222) {
                    aw.b("Unknown exception. Could not get the Advertising Id Info.", e2222);
                }
                return aVar;
            }
        };
        this.h = eVar;
        if (context != null) {
            this.g = context.getApplicationContext();
        } else {
            this.g = context;
        }
        if (aVar != null) {
            this.k = aVar;
        }
        this.e = this.h.a();
        this.i = new Thread(new Runnable(this) {
            final /* synthetic */ g a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.g();
            }
        });
    }

    public static g a(Context context) {
        if (m == null) {
            synchronized (l) {
                if (m == null) {
                    m = new g(context);
                    m.c();
                }
            }
        }
        return m;
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
        if (this.h.a() - this.e > this.b) {
            synchronized (this.j) {
                this.j.notify();
            }
            this.e = this.h.a();
        }
    }

    private void f() {
        if (this.h.a() - this.f > Util.MILLSECONDS_OF_HOUR) {
            this.d = null;
        }
    }

    private void g() {
        Process.setThreadPriority(10);
        while (!this.c) {
            com.google.android.gms.ads.a.a.a a = this.k.a();
            if (a != null) {
                this.d = a;
                this.f = this.h.a();
                aw.c("Obtained fresh AdvertisingId info from GmsCore.");
            }
            synchronized (this) {
                notifyAll();
            }
            try {
                synchronized (this.j) {
                    this.j.wait(this.a);
                }
            } catch (InterruptedException e) {
                aw.c("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    public String a() {
        if (this.d == null) {
            d();
        } else {
            e();
        }
        f();
        return this.d == null ? null : this.d.a();
    }

    public boolean b() {
        if (this.d == null) {
            d();
        } else {
            e();
        }
        f();
        return this.d == null ? true : this.d.b();
    }

    public void c() {
        this.i.start();
    }
}
