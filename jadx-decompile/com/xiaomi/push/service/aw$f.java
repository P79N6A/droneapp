package com.xiaomi.push.service;

import com.xiaomi.push.service.av.b;
import java.util.ArrayList;

class aw$f implements Runnable {
    b a;
    final /* synthetic */ aw b;

    private aw$f(aw awVar) {
        this.b = awVar;
    }

    public void run() {
        String str;
        Object obj = 1;
        if (this.a.c.f) {
            this.a.c.a = "push_sdk_channel";
        } else {
            this.a.c.a = aw.c(this.b);
        }
        this.a.a = av.a();
        aw.b e = aw.e(this.b);
        String str2 = null;
        Object obj2 = null;
        if (e == null) {
            str2 = "uploader is null";
            obj2 = 1;
        }
        if (obj2 == null && this.b.b()) {
            str2 = "TinyDataManager need init";
            obj2 = 1;
        }
        if (obj2 == null && this.a.c.a == null) {
            str2 = "request channel is null";
            obj2 = 1;
        }
        if (obj2 != null || e.a(this.a)) {
            obj = obj2;
            str = str2;
        } else {
            str = "uploader refuse upload";
        }
        if (obj != null) {
            com.xiaomi.channel.commonutils.logger.b.c(this.a.toString() + " is added to pending list. Pending Reason is " + str);
            aw.d(this.b).add(this.a);
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.c(this.a.toString() + " is uploaded immediately.");
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.a);
        e.a(arrayList);
    }
}
