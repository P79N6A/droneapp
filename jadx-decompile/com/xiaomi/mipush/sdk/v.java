package com.xiaomi.mipush.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class v extends Handler {
    final /* synthetic */ u a;

    v(u uVar, Looper looper) {
        this.a = uVar;
        super(looper);
    }

    public void dispatchMessage(Message message) {
        String str = (String) message.obj;
        int i = message.arg1;
        synchronized (p.class) {
            if (p.a(u.a(this.a)).e(str)) {
                if (p.a(u.a(this.a)).c(str) < 10) {
                    if (1 == i && "disable_syncing".equals(p.a(u.a(this.a)).a())) {
                        u.a(this.a, str, true);
                    } else if (i == 0 && "enable_syncing".equals(p.a(u.a(this.a)).a())) {
                        u.a(this.a, str, false);
                    }
                    p.a(u.a(this.a)).b(str);
                } else {
                    p.a(u.a(this.a)).d(str);
                }
            }
        }
    }
}
