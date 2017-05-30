package com.fimi.soul.biz.i;

import com.fimi.soul.biz.camera.entity.RelayEntity;
import com.fimi.soul.biz.e.d;

public class a implements com.fimi.soul.biz.e.d.a {
    public static a a = null;
    private static final int b = 100;
    private volatile boolean c;
    private d d = d.a();

    public a() {
        this.d.a((com.fimi.soul.biz.e.d.a) this);
    }

    public static a b() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    public void a() {
        this.d.b();
        this.d.c("5G");
    }

    public void a(RelayEntity relayEntity) {
        if (relayEntity != null && !"5G".equals(relayEntity.getDevice_type())) {
            this.c = true;
        }
    }

    public void a(boolean z) {
        this.c = z;
    }

    public boolean c() {
        return this.c;
    }

    public void d() {
        this.c = false;
    }
}
