package com.xiaomi.channel.commonutils.misc;

import com.xiaomi.channel.commonutils.misc.f.a;

class g extends f$b {
    final /* synthetic */ String a;
    final /* synthetic */ f b;

    g(f fVar, a aVar, String str) {
        this.b = fVar;
        this.a = str;
        super(aVar);
    }

    void a() {
        super.a();
    }

    void b() {
        f.a(this.b).edit().putLong(this.a, System.currentTimeMillis()).commit();
    }
}
