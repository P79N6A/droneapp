package com.fimi.soul.drone.droneconnection.connection.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.droneconnection.connection.e;
import com.fimi.soul.drone.droneconnection.connection.f;
import java.util.concurrent.atomic.AtomicReference;

public class a implements com.fimi.soul.drone.droneconnection.connection.f.a {
    private static final String a = a.class.getSimpleName();
    private boolean b;
    private final Handler c = new Handler();
    private final AtomicReference<String> d = new AtomicReference();
    private final e e = new e(this) {
        final /* synthetic */ a a;
        private final Runnable b = new Runnable(this) {
            final /* synthetic */ AnonymousClass1 a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.a.h.e();
            }
        };
        private final Runnable c = new Runnable(this) {
            final /* synthetic */ AnonymousClass1 a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.a.b = false;
                this.a.a.h.f();
                this.a.a.g();
            }
        };
        private final Runnable d = new Runnable(this) {
            final /* synthetic */ AnonymousClass1 a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.a.c.removeCallbacks(this);
                this.a.a.b = false;
                String str = (String) this.a.a.d.get();
                if (str != null) {
                    Log.e("error", str);
                }
            }
        };

        {
            this.a = r2;
        }

        public void a() {
            this.a.c.post(this.b);
        }

        public void a(final b bVar) {
            this.a.c.post(new Runnable(this) {
                final /* synthetic */ AnonymousClass1 b;

                public void run() {
                    this.b.a.b = true;
                    this.b.a.h.a(bVar);
                }
            });
        }

        public void a(String str) {
            this.a.d.set(str);
            this.a.c.post(this.d);
        }

        public void a(final boolean z) {
            this.a.c.post(new Runnable(this) {
                final /* synthetic */ AnonymousClass1 b;

                public void run() {
                    this.b.a.h.a(z);
                }
            });
        }

        public void b() {
            this.a.c.post(this.c);
        }

        public void b(final boolean z) {
            this.a.c.post(new Runnable(this) {
                final /* synthetic */ AnonymousClass1 b;

                public void run() {
                    this.b.a.h.b(z);
                }
            });
        }
    };
    private final ServiceConnection f = new ServiceConnection(this) {
        final /* synthetic */ a a;

        {
            this.a = r1;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.a.i = (com.fimi.soul.drone.droneconnection.connection.service.MiLinkService.a) iBinder;
            this.a.j();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.a.k();
        }
    };
    private final Context g;
    private final f.b h;
    private com.fimi.soul.drone.droneconnection.connection.service.MiLinkService.a i;
    private boolean j;
    private boolean k;

    public a(Context context, f.b bVar) {
        this.g = context;
        this.h = bVar;
    }

    private void h() {
        if (this.j) {
            i();
        } else {
            this.g.bindService(new Intent(this.g, MiLinkService.class), this.f, 1);
        }
    }

    private void i() {
        this.i.b();
        this.i.a(a, this.e);
    }

    private void j() {
        this.j = true;
        i();
    }

    private void k() {
        this.b = false;
        this.j = false;
        this.h.f();
    }

    public void a(c cVar) {
        if (a()) {
            this.i.a(cVar);
        }
    }

    public void a(boolean z) {
        this.i.a(z);
    }

    public void a(byte[] bArr) {
        if (a()) {
            this.i.a(bArr);
        }
    }

    public boolean a() {
        return this.b;
    }

    public void b() {
        if (a()) {
            g();
        } else {
            h();
        }
    }

    public void b(boolean z) {
        this.i.b(z);
    }

    public void c() {
        if (a()) {
            this.h.e();
        } else {
            this.h.f();
        }
    }

    public void d() {
        g();
    }

    public String e() {
        return com.fimi.soul.drone.droneconnection.connection.a.a.a();
    }

    public boolean f() {
        return this.i.d();
    }

    public void g() {
        if (this.j) {
            if (this.i.a() == 2) {
                this.i.c();
            }
            this.i.a(a);
            try {
                this.g.unbindService(this.f);
            } catch (Exception e) {
            }
            k();
        }
    }
}
