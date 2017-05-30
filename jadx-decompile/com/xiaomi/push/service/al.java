package com.xiaomi.push.service;

import com.tencent.mm.sdk.platformtools.Util;
import com.xiaomi.push.service.ak.b;
import com.xiaomi.push.service.ak.c;

class al implements ak$b$a {
    final /* synthetic */ b a;

    al(b bVar) {
        this.a = bVar;
    }

    public void a(c cVar, c cVar2, int i) {
        if (cVar2 == c.b) {
            b.b(this.a).a(b.a(this.a), Util.MILLSECONDS_OF_MINUTE);
        } else {
            b.b(this.a).b(b.a(this.a));
        }
    }
}
