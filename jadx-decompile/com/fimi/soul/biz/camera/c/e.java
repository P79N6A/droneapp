package com.fimi.soul.biz.camera.c;

import com.fimi.soul.biz.camera.c;
import com.fimi.soul.biz.camera.e.a;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.d.b;

public class e extends a implements b {
    public e(c cVar) {
        super(cVar);
    }

    public void a(a aVar) {
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
        super.a(z, x11RespCmd);
        if (z) {
            switch (x11RespCmd.getMsg_id()) {
                case 513:
                    a().a(c.a.Recoding);
                    return;
                case 514:
                case com.fimi.soul.biz.camera.e.N /*770*/:
                    a().a(c.a.Normal);
                    return;
                case com.fimi.soul.biz.camera.e.M /*769*/:
                    if (a().i().isContinueCaptureMode()) {
                        a().a(c.a.ContinueCapturing);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public boolean b() {
        return false;
    }

    public void c() {
        a((int) com.fimi.soul.biz.camera.e.M);
    }

    public void d() {
        a((int) com.fimi.soul.biz.camera.e.N);
    }

    public void e() {
    }

    public void f() {
        a(513);
    }

    public void g() {
        a(514);
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public void m() {
        a(515);
    }

    public void n() {
        a((int) com.fimi.soul.biz.camera.e.L);
    }

    public void onDroneEvent(d.a aVar, com.fimi.soul.drone.a aVar2) {
    }
}
