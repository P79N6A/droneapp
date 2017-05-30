package com.fimi.soul.module.droneFragment;

import android.os.Message;
import com.fimi.kernel.b;
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.a;
import com.google.android.gms.maps.model.g;
import java.util.concurrent.atomic.AtomicInteger;

public class c extends b {
    public static final int a = 0;
    public static final int b = 1;
    private static AtomicInteger c = new AtomicInteger(0);
    private static AtomicInteger d = new AtomicInteger(1);
    private static g f;
    private static final c h = new c();
    private a e;
    private com.google.android.gms.maps.c g;
    private Runnable i = new Runnable(this) {
        final /* synthetic */ c a;

        {
            this.a = r1;
        }

        public void run() {
            if (c.f != null) {
                this.a.j = true;
                c.c.set(1);
                c.f.a();
                c.f = null;
            }
        }
    };
    private boolean j = true;

    private c() {
    }

    public static void a(int i) {
        d.set(i);
    }

    public static AtomicInteger b() {
        return d;
    }

    public static c c() {
        return h;
    }

    public static AtomicInteger d() {
        return c;
    }

    public static void f() {
        if (f != null) {
            f.a();
            f = null;
        }
    }

    protected void a(Message message) {
    }

    public void a(a aVar) {
        if (!aVar.aj().g().isLightStream()) {
            this.e = aVar;
            this.g = aVar.aa();
            if (aVar.T().a() && aVar.U() && ((aVar.ai().a > 1.0d && aVar.ai().b > 1.0d && c.get() == 0) || d.get() == 0)) {
                if (d.get() == 0) {
                    d.set(1);
                    if (f == null) {
                        f = this.g.a(com.fimi.soul.drone.b.a.a(aVar.ai()).a(com.google.android.gms.maps.model.b.a(com.fimi.soul.drone.b.b.b((int) R.drawable.handpiece_aspect_infor, aVar.d.getResources().getString(R.string.flighthead), "", aVar.d))));
                    }
                    this.g.b(com.google.android.gms.maps.b.a(aVar.ai(), 18.0f));
                    if (f != null && this.j) {
                        this.j = false;
                        a().postDelayed(this.i, 5000);
                    }
                } else if (f != null) {
                    f.a(aVar.ai());
                }
            } else if (f != null) {
                f.a(aVar.ai());
            }
        }
    }

    public void b(int i) {
        c.set(i);
    }

    public void e() {
        this.j = true;
    }
}
