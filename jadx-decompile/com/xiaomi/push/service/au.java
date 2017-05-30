package com.xiaomi.push.service;

import android.util.Base64;
import com.xiaomi.channel.commonutils.android.j;
import com.xiaomi.channel.commonutils.misc.h.b;
import com.xiaomi.network.HttpUtils;
import com.xiaomi.push.protobuf.a.a;

class au extends b {
    boolean a = false;
    final /* synthetic */ at b;

    au(at atVar) {
        this.b = atVar;
    }

    public void b() {
        try {
            a b = a.b(Base64.decode(HttpUtils.a(j.a(), "http://resolver.msg.xiaomi.net/psc/?t=a", null), 10));
            if (b != null) {
                at.a(this.b, b);
                this.a = true;
                at.a(this.b);
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a("fetch config failure: " + e.getMessage());
        }
    }

    public void c() {
        at.a(this.b, null);
        if (this.a) {
            synchronized (this.b) {
            }
            for (at.a a : (at.a[]) at.b(this.b).toArray(new at.a[at.b(this.b).size()])) {
                a.a(at.c(this.b));
            }
        }
    }
}
