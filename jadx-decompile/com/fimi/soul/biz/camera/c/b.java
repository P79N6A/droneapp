package com.fimi.soul.biz.camera.c;

import com.fimi.soul.biz.camera.c;
import com.fimi.soul.biz.camera.c.a;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.drone.g.f;
import com.fimi.soul.drone.h.g;
import com.fimi.soul.drone.h.i;

public class b extends e {
    private static f h;
    private com.fimi.soul.drone.c.a.a.f a;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private int e = 0;
    private int f = 0;
    private f g;

    public b(c cVar) {
        super(cVar);
        h = new f(1000, new Runnable(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.e = this.a.e + 1;
                if (this.a.e > 10) {
                    this.a.d = false;
                    b.h.e();
                }
            }
        });
        o();
    }

    private void a(a aVar) {
        if (a().l() != null) {
            a().l().a(aVar, a().f());
        }
    }

    private void a(com.fimi.soul.drone.a aVar) {
        g gVar = (g) aVar.c;
        a f = a().f();
        switch (gVar.f()) {
            case VideoRecording:
                a().a(a.Recoding);
                break;
            case PhotoShoting:
                a().a(a.ContinueCapturing);
                break;
            case NormalReady:
                a().a(a.Normal);
                break;
        }
        a(f);
    }

    private void o() {
        this.g = new f(1000, new Runnable(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.f = this.a.f + 1;
                if (this.a.f > 2) {
                    if (!d.a().k()) {
                        this.a.i();
                    }
                    this.a.f = 0;
                }
            }
        });
    }

    public void a(e.a aVar) {
        if (this.a != null) {
            this.a.a(aVar);
        }
    }

    public boolean b() {
        return this.d;
    }

    public void c() {
        if (this.a != null) {
            this.b = true;
            this.a.f();
        }
    }

    public void d() {
        h();
    }

    public void e() {
        if (this.a != null) {
            this.c = true;
            this.a.i();
        }
    }

    public void f() {
        if (this.a != null) {
            this.c = true;
            this.a.b();
        }
    }

    public void g() {
        if (this.a != null) {
            this.c = true;
            this.a.d();
        }
    }

    public void h() {
        if (this.a != null) {
            this.c = true;
            this.a.h();
        }
    }

    public void i() {
        if (this.a != null) {
            this.c = true;
            this.a.a();
        }
    }

    public void j() {
        if (this.a != null) {
            this.c = true;
            this.a.c();
        }
    }

    public void k() {
        if (this.a != null) {
            this.b = true;
            this.a.g();
        }
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        if (aVar2.U() && aVar2.T().a()) {
            if (this.g == null) {
                o();
                this.g.c();
            }
            if (this.a == null && aVar2 != null) {
                this.a = com.fimi.soul.drone.c.a.a.f.a(aVar2);
                this.a.a();
            }
            if (aVar == com.fimi.soul.drone.d.a.OnRecivedCloudCameraCommandInfo && aVar2.c != null) {
                int a = aVar2.c.a();
                if (a == 50) {
                    this.f = 0;
                    switch (((g) aVar2.c).f()) {
                        case VideoRecording:
                            this.d = true;
                            this.e = 0;
                            if (h == null) {
                                h = new f(1000, new Runnable(this) {
                                    final /* synthetic */ b a;

                                    {
                                        this.a = r1;
                                    }

                                    public void run() {
                                        this.a.e = this.a.e + 1;
                                        if (this.a.e > 10) {
                                            this.a.d = false;
                                            b.h.e();
                                        }
                                    }
                                });
                            }
                            h.d();
                            return;
                        default:
                            return;
                    }
                } else if (a == 49) {
                    i iVar = (i) aVar2.c;
                    if (iVar.e() == i.a.StartRecord) {
                        this.d = true;
                        this.e = 0;
                        if (h != null) {
                            h.d();
                            return;
                        }
                        return;
                    } else if (iVar.e() == i.a.StopRecrod) {
                        this.d = false;
                        if (h != null) {
                            h.e();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            return;
        }
        if (h != null) {
            h.e();
        }
        this.d = false;
        if (this.g != null) {
            this.g.f();
            this.g = null;
        }
    }
}
