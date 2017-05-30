package com.fimi.soul.biz.camera.a;

import android.os.Message;
import com.fimi.kernel.b.c.a;
import com.fimi.kernel.b.d;
import com.fimi.kernel.b.d.c;
import com.fimi.soul.biz.camera.b.f;
import com.fimi.soul.biz.camera.e;

public class b extends com.fimi.kernel.b implements f {
    private c a = ((c) com.fimi.kernel.c.a(d.Socket));
    private c b;

    public b() {
        com.fimi.kernel.b.d.d f = this.a.f();
        f.a(e.a());
        f.a((int) e.e);
        f.b(10240);
        f.b(true);
        this.b = (c) com.fimi.kernel.c.a(d.Socket);
        f = this.b.f();
        f.a(e.a());
        f.a((int) e.d);
        f.b(10240);
        f.b(true);
    }

    protected void a(Message message) {
    }

    public void a(a aVar) {
        this.b.b(aVar);
    }

    public void a(com.fimi.kernel.b.c.d dVar) {
        this.a.a(dVar);
    }

    public synchronized void a(final byte[] bArr) {
        a(new Runnable(this) {
            final /* synthetic */ b b;

            public void run() {
                try {
                    if (!this.b.a.b()) {
                        this.b.a.d();
                    }
                    this.b.a.a(bArr);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public synchronized void a(byte[] bArr, int i, int i2) {
        if (!this.b.b()) {
            this.b.d();
        }
        this.b.a(bArr, i, i2);
    }

    public void b() {
        this.a.g();
        this.b.g();
    }

    public void b(a aVar) {
        this.b.a(aVar);
    }

    public void b(com.fimi.kernel.b.c.d dVar) {
        this.a.b(dVar);
    }

    public boolean c() {
        return this.a.b();
    }

    public void d() {
        this.a.g();
        this.a.d();
    }

    public void e() {
        this.b.g();
        this.b.d();
    }

    public c f() {
        return this.a;
    }

    public c g() {
        return this.b;
    }
}
