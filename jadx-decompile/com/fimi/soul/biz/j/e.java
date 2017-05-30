package com.fimi.soul.biz.j;

import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.y;

public class e implements b {
    private a a;
    private com.fimi.kernel.d.b b;
    private boolean c;
    private int d;
    private int e;
    private boolean f;

    public e(a aVar) {
        this.a = aVar;
        aVar.a((b) this);
        this.b = com.fimi.kernel.d.b.b(aVar.d);
    }

    private synchronized void a(y yVar) {
        boolean z = true;
        synchronized (this) {
            if ((yVar.g() & 15) != 1) {
                z = false;
            }
            if (!(this.c || !z || this.a.ac())) {
                switch (this.e) {
                    case 0:
                        a(a((int) R.string.can_takeOff_ATTi));
                        break;
                    case 1:
                        a(a((int) R.string.can_takeOff_GLOBAL));
                        break;
                    case 2:
                        a(a((int) R.string.can_takeOff_Local));
                        break;
                }
            }
            if (!(!this.c || z || this.a.ac())) {
                if (this.a.al().j()) {
                    a(a((int) R.string.can_takeOff_ATTi));
                } else {
                    a(a((int) R.string.self_error_result));
                }
            }
            if (this.c != z) {
                this.c = z;
            }
        }
    }

    private synchronized void c() {
        if (!this.f) {
            this.f = true;
            this.d = this.e;
        }
        if (this.d != this.e) {
            switch (this.e) {
                case 0:
                    a(a((int) R.string.change_contype_ATTi));
                    break;
                case 1:
                    a(a((int) R.string.change_contype_GLOBAL));
                    break;
                case 2:
                    a(a((int) R.string.change_contype_Local));
                    break;
            }
            this.d = this.e;
        }
    }

    public String a(int i) {
        return this.a.d.getResources().getString(i);
    }

    public void a() {
        this.a.b((b) this);
        this.c = false;
    }

    public void a(String str) {
        this.b.a(str);
    }

    public void b() {
        this.a.a((b) this);
    }

    public void onDroneEvent(d.a aVar, a aVar2) {
        switch (aVar) {
            case NEWFRONEMODEL:
                this.e = aVar2.aj().d();
                y r = aVar2.r();
                c();
                a(r);
                return;
            default:
                return;
        }
    }
}
