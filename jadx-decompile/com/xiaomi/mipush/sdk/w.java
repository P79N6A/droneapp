package com.xiaomi.mipush.sdk;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.channel.commonutils.network.d;
import com.xiaomi.push.service.ao;

class w extends ContentObserver {
    final /* synthetic */ u a;

    w(u uVar, Handler handler) {
        this.a = uVar;
        super(handler);
    }

    public void onChange(boolean z) {
        u.a(this.a, Integer.valueOf(ao.a(u.a(this.a)).b()));
        if (u.b(this.a).intValue() != 0) {
            u.a(this.a).getContentResolver().unregisterContentObserver(this);
            if (d.d(u.a(this.a))) {
                this.a.d();
            }
        }
    }
}
