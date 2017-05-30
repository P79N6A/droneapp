package com.fimi.soul.biz.camera.d;

import com.fimi.soul.biz.camera.b.b;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.entity.X11RespCmd;

public class a implements e<X11RespCmd> {
    private b a;

    public void a(b bVar) {
        if (this.a != null) {
            this.a.a();
        }
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
        if (z && this.a.c()) {
            a(this.a.b());
        }
    }
}
