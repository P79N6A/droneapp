package com.fimi.soul.biz.camera;

import com.fimi.soul.biz.camera.c.b;
import com.fimi.soul.biz.camera.c.c;
import com.fimi.soul.biz.camera.c.e;
import com.fimi.soul.biz.camera.c.f;
import com.fimi.soul.biz.camera.c.g;
import java.text.SimpleDateFormat;
import java.util.Date;

public class d extends c {
    private c d = new c(this);
    private com.fimi.soul.biz.camera.c.d e = new com.fimi.soul.biz.camera.c.d(this);
    private f f = new f(this);
    private e g = new e(this);
    private g h = new g(this);
    private b i;

    public d(com.fimi.soul.biz.camera.b.c cVar) {
        super(cVar);
        a(this.d);
        a(this.e);
        a(this.f);
        a(this.g);
        a(this.h);
        this.i = new b(this);
        a(this.i);
    }

    public g q() {
        return this.h;
    }

    public c r() {
        return this.d;
    }

    public com.fimi.soul.biz.camera.c.d s() {
        return this.e;
    }

    public f t() {
        return this.f;
    }

    public e u() {
        return b.a().b() ? this.g : this.i;
    }

    public void v() {
        r().a(e.by, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
