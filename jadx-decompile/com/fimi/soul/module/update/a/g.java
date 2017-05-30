package com.fimi.soul.module.update.a;

import android.content.Context;
import com.fimi.kernel.c;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.biz.update.f;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.i;
import com.fimi.soul.drone.h.u;
import com.fimi.soul.entity.DroneInfoBean;

public class g implements b {
    Context a;
    a b;
    a c = a.a();
    d d = ((d) com.fimi.soul.biz.camera.b.a().d());

    public g(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
        aVar.a((b) this);
        c.c().a(f.j, DroneInfoBean.class);
    }

    private void a(u uVar) {
        int c = uVar.c() & 65535;
        char b = uVar.b();
        int a = uVar.a() & 255;
        byte d = uVar.d();
        long e = uVar.e();
        long f = uVar.f();
        long g = uVar.g();
        long h = uVar.h();
        if (c > 0) {
            this.c.a(new e(a, d, c, String.valueOf(Long.valueOf((long) b)), e, f, g, h));
            this.c.a(a, c);
        }
    }

    private void d() {
        if (this.b.c.a() == 51) {
            i iVar = (i) this.b.c;
            this.d.i().setDvVersion(iVar.d() + "");
            this.d.i().setCameraType(iVar.b());
            if (com.fimi.soul.biz.e.d.a().k()) {
                this.c.a(13, iVar.d());
                this.c.a(new e("", 13, iVar.d()));
                return;
            }
            this.c.a(4, iVar.d());
            this.c.a(new e("", 4, iVar.d()));
        }
    }

    public void a() {
        com.fimi.soul.drone.d.f.k(this.b);
        this.d.u().j();
    }

    public void b() {
        com.fimi.soul.drone.d.f.j(this.b);
        this.d.u().j();
    }

    public void c() {
        this.b.b((b) this);
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, a aVar2) {
        switch (aVar) {
            case FCVERSION2:
                a(aVar2.j());
                return;
            case OnRecivedCloudCameraCommandInfo:
                d();
                return;
            default:
                return;
        }
    }
}
