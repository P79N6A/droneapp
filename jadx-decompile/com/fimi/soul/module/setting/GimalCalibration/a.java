package com.fimi.soul.module.setting.GimalCalibration;

import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.module.b.d;
import com.fimi.soul.module.dronemanage.h;
import com.fimi.soul.utils.ao;

public class a implements b, com.fimi.soul.module.dronemanage.h.a {
    public static int a = 100;
    public static final byte b = (byte) 7;
    public static final byte c = (byte) 8;
    public static final int d = 2;
    private static final byte h = (byte) 0;
    h e = null;
    a f;
    com.fimi.soul.drone.a g;
    private final int i = 0;
    private final int j = 1;
    private final int k = 2;
    private final int l = 3;
    private final int m = 4;
    private final int n = 5;
    private boolean o;

    public interface a {
        void a(int i);

        void a(String str);

        void b();

        void b(int i);

        void c();

        void d();
    }

    public a(a aVar, com.fimi.soul.drone.a aVar2) {
        this.f = aVar;
        this.g = aVar2;
    }

    private void b(byte b) {
        String a = a(b);
        if (this.f != null) {
            this.o = false;
            if (a != null) {
                this.f.a(a);
            } else {
                this.f.a(this.g.d.getString(R.string.GC_califail));
            }
        }
    }

    private void h() {
        byte b = this.g.ak().b();
        if (b > (byte) 0) {
            b(b);
            return;
        }
        int d = this.g.ak().d();
        this.f.a(d);
        if (d == a) {
            this.o = false;
            f();
            this.f.c();
        }
    }

    public String a(byte b) {
        for (int i = 0; i < 8; i++) {
            if (ao.a((int) b, i) > 0) {
                switch (i) {
                    case 0:
                        return b((int) R.string.GC_hight_temperature);
                    case 1:
                        return b((int) R.string.GC_low_temperature);
                    case 2:
                        return b((int) R.string.GC_temperature_low_accuracy);
                    case 3:
                        return b((int) R.string.GC_horLine_uneven);
                    case 4:
                        return b((int) R.string.GC_hight_Vibrator);
                    case 5:
                        return b((int) R.string.GC_wrong_angle);
                    default:
                        break;
                }
            }
        }
        return null;
    }

    public void a() {
        c c = c();
        this.g.T().a(c);
        if (this.e == null) {
            this.e = h.a(this);
        }
        this.e.a(this.g, c);
        this.e.b();
        this.o = true;
    }

    public void a(int i) {
    }

    public String b(int i) {
        return this.g.d.getResources().getString(i);
    }

    public void b() {
        if (this.e != null) {
            this.f.b();
            this.e.d();
            this.e.c();
            this.e = null;
        }
    }

    public c c() {
        c cVar = new c();
        cVar.b = 2;
        cVar.c = 122;
        cVar.d.b((byte) 8);
        cVar.d.b((byte) 0);
        return cVar;
    }

    public void d() {
        d.a(this.g).r();
    }

    public void e() {
        this.g.a((b) this);
    }

    public void f() {
        this.g.b((b) this);
    }

    public void g() {
        if (this.f != null) {
            this.f = null;
        }
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        switch (aVar) {
            case GimbalCalibration:
                b();
                h();
                return;
            case CLEANALLOBJ:
                if (this.f != null && this.o) {
                    this.f.a(b((int) R.string.GC_caliFail_discon));
                    return;
                }
                return;
            case Remotecontrol:
                if (this.f != null && !this.o) {
                    this.f.d();
                    return;
                } else if (this.f != null && !aVar2.U() && this.o) {
                    this.f.a(b((int) R.string.GC_caliFail_discon_drone));
                    return;
                } else if (this.f != null && this.o) {
                    if (aVar2.ad().Z()) {
                        this.f.a(b((int) R.string.GC_hight_temperature));
                        return;
                    } else if (aVar2.ad().u()) {
                        this.f.a(b((int) R.string.discongc));
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }
}
