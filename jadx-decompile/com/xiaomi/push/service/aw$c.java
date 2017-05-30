package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.av.a;

public class aw$c implements Runnable {
    final /* synthetic */ aw a;
    private Context b;

    public aw$c(aw awVar) {
        this.a = awVar;
    }

    public void run() {
        if (aw.a(this.a) != null) {
            b.d("[TinyDataManager]: please do not init TinyDataManager repeatly.");
            return;
        }
        aw.a(this.a, this.b);
        this.a.a(new a(this.b), "SHORT_UPLOADER_FROM_SELF");
        aw.a(this.a, "Init");
    }
}
