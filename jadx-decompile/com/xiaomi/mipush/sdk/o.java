package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.misc.f.a;
import com.xiaomi.push.service.ah;
import com.xiaomi.push.service.ai;
import com.xiaomi.xmpush.thrift.ae;
import com.xiaomi.xmpush.thrift.aq;
import com.xiaomi.xmpush.thrift.f;
import com.xiaomi.xmpush.thrift.y;

public class o extends a {
    private Context a;

    public o(Context context) {
        this.a = context;
    }

    public int a() {
        return 2;
    }

    public void run() {
        ah a = ah.a(this.a);
        org.a.b.a yVar = new y();
        yVar.a(ai.a(a, f.MISC_CONFIG));
        yVar.b(ai.a(a, f.PLUGIN_CONFIG));
        org.a.b.a aeVar = new ae("-1", false);
        aeVar.c(com.xiaomi.xmpush.thrift.o.DailyCheckClientConfig.N);
        aeVar.a(aq.a(yVar));
        u.a(this.a).a(aeVar, com.xiaomi.xmpush.thrift.a.i, null);
    }
}
