package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.client.f;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.vj;
import com.google.android.gms.internal.yp;
import com.google.android.gms.internal.zf;

@aaa
public class ac {
    private static final Object a = new Object();
    private static ac b;
    private final a c = new a();
    private final ab d = new ab(new v(), new u(), new j(), new vj(), new f(), new zf(), new yp());

    static {
        a(new ac());
    }

    protected ac() {
    }

    public static a a() {
        return c().c;
    }

    protected static void a(ac acVar) {
        synchronized (a) {
            b = acVar;
        }
    }

    public static ab b() {
        return c().d;
    }

    private static ac c() {
        ac acVar;
        synchronized (a) {
            acVar = b;
        }
        return acVar;
    }
}
