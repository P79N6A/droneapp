package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.h.g;
import com.fimi.soul.drone.h.h;
import com.fimi.soul.drone.h.h.d;
import com.fimi.soul.drone.h.h.e;
import com.fimi.soul.module.dronemanage.j;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class f {
    public static final int a = 49;
    public static final int b = 51;
    public static final int c = 50;
    public static final int d = 51;
    private static f e;
    private com.fimi.soul.drone.a f;
    private com.fimi.soul.module.dronemanage.a g;
    private com.fimi.soul.module.dronemanage.a h;
    private com.fimi.soul.module.dronemanage.a i;
    private com.fimi.soul.module.dronemanage.a j;
    private SimpleDateFormat k = new SimpleDateFormat(com.fimi.kernel.utils.f.e);

    public enum a {
        StartRecord,
        TakePhoto,
        StopRecord
    }

    private f() {
    }

    public static synchronized f a(com.fimi.soul.drone.a aVar) {
        f fVar;
        synchronized (f.class) {
            if (e == null) {
                e = new f();
                e.f = aVar;
            }
            fVar = e;
        }
        return fVar;
    }

    private void a(int i, byte[] bArr) {
        a(h.a(i, bArr));
    }

    private void a(c cVar) {
        n().T().a(cVar);
    }

    public static boolean a(b bVar, com.fimi.soul.drone.a aVar) {
        if (bVar.a != 49 && bVar.a != 50 && bVar.a != 51) {
            return false;
        }
        aVar.c = ((g) bVar).b();
        if (bVar.a == 50) {
            aVar.a((g) aVar.c);
        }
        aVar.a(com.fimi.soul.drone.d.a.OnRecivedCloudCameraCommandInfo);
        return true;
    }

    private byte[] a(int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) 0;
        }
        return bArr;
    }

    private com.fimi.soul.drone.a n() {
        return this.f;
    }

    private byte[] o() {
        return new byte[10];
    }

    public void a() {
        c a = h.a(50, new byte[]{(byte) 0});
        if (this.g == null) {
            this.g = new com.fimi.soul.module.dronemanage.a();
        }
        this.g.a(this.f, a);
        this.g.a();
    }

    public void a(com.fimi.soul.biz.camera.e.a aVar) {
        if (aVar == com.fimi.soul.biz.camera.e.a.StartRecord) {
            if (this.i == null) {
                this.i = new com.fimi.soul.module.dronemanage.a();
            }
            this.i.b();
        }
        if (aVar == com.fimi.soul.biz.camera.e.a.StopRecord) {
            if (this.j == null) {
                this.j = new com.fimi.soul.module.dronemanage.a();
            }
            this.j.b();
        }
        if (aVar == com.fimi.soul.biz.camera.e.a.TakePhote) {
            if (this.h == null) {
                this.h = new com.fimi.soul.module.dronemanage.a();
            }
            this.h.b();
        }
    }

    public void a(com.fimi.soul.drone.h.h.a aVar) {
        byte[] a = a(13);
        switch (aVar) {
            case _8M_3264X2448_4vs3:
                a[3] = (byte) -63;
                break;
            case _13M_4128X3096_4vs3:
                a[3] = (byte) -62;
                break;
            case _16M_4068x3456_4vs3:
                a[3] = (byte) -61;
                break;
        }
        a(h.a(50, a));
    }

    public void a(h.c cVar) {
        byte[] a = a(13);
        switch (cVar) {
            case BurstShot:
                a[4] = (byte) -63;
                break;
            case Normal:
                a[4] = (byte) -62;
                break;
            case TimeLapse:
                a[4] = (byte) -61;
                break;
        }
        a(h.a(50, a));
    }

    public void a(d dVar) {
        byte[] a = a(13);
        switch (dVar) {
            case Mid:
                a[0] = (byte) -63;
                break;
            case High:
                a[0] = (byte) -62;
                break;
            case Low:
                a[0] = (byte) -61;
                break;
        }
        a(h.a(50, a));
    }

    public void a(e eVar) {
        byte[] a = a(13);
        switch (eVar) {
            case _1920x1080_60p_16vs9:
                a[2] = (byte) -63;
                break;
            case _1920x1080_30p_16vs9:
                a[2] = (byte) -62;
                break;
            case _1920x1080_48p_16vs9:
                a[2] = (byte) -61;
                break;
            case _1920x1080_24p_16vs9:
                a[2] = (byte) -60;
                break;
            case _1280x960_60p_4vs3:
                a[2] = (byte) -59;
                break;
            case _1280x960_48p_4vs3:
                a[2] = (byte) -58;
                break;
            case _1280x720_60p_16vs9:
                a[2] = (byte) -57;
                break;
            case _1280x720_48p_16vs9:
                a[2] = (byte) -56;
                break;
            case _1280x720_120p_16vs9:
                a[2] = (byte) -55;
                break;
            case _848x480_240p_16vs9:
                a[2] = (byte) -54;
                break;
        }
        a(h.a(50, a));
    }

    public void a(com.fimi.soul.drone.h.h.f fVar) {
        byte[] a = a(13);
        switch (fVar) {
            case Date:
                a[1] = (byte) -63;
                break;
            case Time:
                a[1] = (byte) -62;
                break;
            case DateTime:
                a[1] = (byte) -61;
                break;
        }
        a(h.a(50, a));
    }

    public void a(Date date) {
        byte[] a = a(13);
        byte[] array = ByteBuffer.allocate(4).putInt(Integer.parseInt(this.k.format(date))).array();
        for (int i = 0; i < array.length; i++) {
            a[(a.length - array.length) + i] = array[i];
        }
        a(h.a(50, a));
    }

    public void a(boolean z) {
        byte[] a = a(13);
        if (z) {
            a[6] = (byte) -63;
        } else {
            a[6] = (byte) -62;
        }
        a(h.a(50, new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0}));
    }

    public void b() {
        c a = h.a(49, new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0});
        if (this.i == null) {
            this.i = new com.fimi.soul.module.dronemanage.a();
        }
        this.i.a(this.f, a);
        this.i.a();
    }

    public void b(boolean z) {
        a(h.a(49, new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0}));
    }

    public void c() {
        this.f.T().a(h.a(51, new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0}));
    }

    public void c(boolean z) {
        a(h.a(50, new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0}));
    }

    public void d() {
        c a = h.a(49, new byte[]{(byte) 2, (byte) 0, (byte) 0, (byte) 0});
        if (this.j == null) {
            this.j = new com.fimi.soul.module.dronemanage.a();
        }
        this.j.a(this.f, a);
        this.j.a();
    }

    public void e() {
        a(h.a(49, new byte[]{(byte) 3, (byte) 0, (byte) 0, (byte) 0}));
    }

    public void f() {
        c a = h.a(49, new byte[]{(byte) 4, (byte) 0, (byte) 0, (byte) 0});
        if (this.h == null) {
            this.h = new com.fimi.soul.module.dronemanage.a();
        }
        this.h.a(this.f, a);
        this.h.a();
    }

    public void g() {
        j.a(this.f, h.a(49, new byte[]{(byte) 8, (byte) 0, (byte) 0, (byte) 0}));
        j.a();
    }

    public void h() {
        j.a(this.f, h.a(49, new byte[]{(byte) 9, (byte) 0, (byte) 0, (byte) 0}));
        j.a();
    }

    public void i() {
        j.a(this.f, h.a(49, new byte[]{(byte) 6, (byte) 0, (byte) 0, (byte) 0}));
        j.a();
    }

    public void j() {
        a(h.a(49, new byte[]{(byte) 0, (byte) 1, (byte) 0, (byte) 0}));
    }

    public void k() {
        a(h.a(49, new byte[]{(byte) 0, (byte) 2, (byte) 0, (byte) 0}));
    }

    public void l() {
        a(h.a(49, new byte[]{(byte) 1, (byte) 0, (byte) 1, (byte) 0}));
    }

    public void m() {
        a(h.a(49, new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 1}));
    }
}
