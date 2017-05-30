package com.xiaomi.channel.commonutils.misc;

import com.xiaomi.channel.commonutils.misc.f.a;

class f$b implements Runnable {
    a c;

    public f$b(a aVar) {
        this.c = aVar;
    }

    void a() {
    }

    void b() {
    }

    public void run() {
        a();
        this.c.run();
        b();
    }
}
