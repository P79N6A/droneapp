package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.service.av.b;

class aw$e implements Runnable {
    String a;
    final /* synthetic */ aw b;

    private aw$e(aw awVar) {
        this.b = awVar;
    }

    public void run() {
        if (TextUtils.isEmpty(aw.c(this.b))) {
            aw.b(this.b, this.a);
            for (int i = 0; i < aw.d(this.b).size(); i++) {
                b bVar = (b) aw.d(this.b).get(i);
                if (!bVar.c.f && bVar.c.a == null) {
                    bVar.c.a = this.a;
                }
            }
            aw.a(this.b, "Set channel to " + this.a);
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.d("[TinyDataManager]:channel is not null, please do not set repeatly.");
    }
}
