package com.fimi.soul.biz.c;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.d.b;

public class n implements b, com.fimi.soul.module.b.b.b {
    private a a;
    private p b;
    private f c;
    private l d;

    public n(a aVar) {
        this.a = aVar;
        aVar.a((b) this);
        com.fimi.soul.module.b.b.a().a((com.fimi.soul.module.b.b.b) this);
        this.b = new p(aVar);
        this.c = new f(aVar);
        this.d = new l(aVar);
    }

    public void a() {
        this.a.b((b) this);
    }

    public void a(int i) {
    }

    public void onDroneEvent(d.a aVar, a aVar2) {
        switch (aVar) {
            case RECEIVERWAYPOINTS:
                this.b.a();
                return;
            case UPWAYPOINT:
                aVar2.a(d.a.SHOWOUTTIMEPROBAR);
                this.b.a(d.k().f());
                return;
            case READWAYPOINT:
                this.b.b(1);
                return;
            case RECEIVERPOINTS:
                com.fimi.soul.module.calibcompass.a.a().a("130");
                this.b.a(aVar2.m());
                return;
            case ASSIGNWAYPOINT:
                this.c.a(d.k().f());
                return;
            case READFLYTO:
                this.c.a();
                return;
            case INTERESTWAYPOINT:
                this.d.a(d.k().f());
                return;
            case READPOI:
                this.d.a();
                return;
            default:
                return;
        }
    }
}
