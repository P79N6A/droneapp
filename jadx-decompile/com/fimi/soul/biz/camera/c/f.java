package com.fimi.soul.biz.camera.c;

import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.c;
import com.fimi.soul.biz.camera.c.a;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.biz.camera.entity.BaseX11Cmd;
import com.fimi.soul.biz.camera.entity.X11RespCmd;

public class f extends a {
    int a = 0;

    public f(c cVar) {
        super(cVar);
    }

    public void a(boolean z) {
        BaseX11Cmd b = b(e.ae, null, null);
        b.setToken(this.a);
        b.setRval(z ? 0 : -1);
        if (z) {
            b.setToken(this.a);
            a().a(this.a);
        }
        a(b);
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
        super.a(z, x11RespCmd);
        switch (x11RespCmd.getMsg_id()) {
            case 257:
                if (z) {
                    a().a(Integer.parseInt(x11RespCmd.getParam().toString()));
                    this.a = a().e();
                    a().a(a.Normal);
                    a().o();
                    ((d) b.a().d()).r().d();
                    com.fimi.kernel.c.e().c(true);
                    com.fimi.kernel.c.e().d(true);
                    return;
                }
                a().a(-1);
                return;
            case e.ae /*1793*/:
                a(true);
                return;
            default:
                return;
        }
    }

    public void b() {
        BaseX11Cmd b = b(257, null, null);
        b.setToken(0);
        a(b);
    }

    public void c() {
        a(258);
    }
}
