package com.google.android.gms.internal;

import com.google.android.gms.internal.hr.a;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

enum ii implements il {
    INSTANCE;

    public hr a(ic icVar, hn hnVar, hp hpVar, a aVar) {
        return new hs(icVar.i(), hpVar, aVar);
    }

    public hy a(ScheduledExecutorService scheduledExecutorService) {
        throw new RuntimeException("Authentication is not implemented yet");
    }

    public ig a(ic icVar) {
        return new ix(Executors.defaultThreadFactory(), iw.a);
    }

    public jp a(ic icVar, String str) {
        return null;
    }

    public kt a(ic icVar, kt.a aVar, List<String> list) {
        return new kr(aVar, list);
    }

    public ip b(ic icVar) {
        final ks a = icVar.a("RunLoop");
        return new me(this) {
            final /* synthetic */ ii b;

            public void a(Throwable th) {
                a.a(me.b(th), th);
            }
        };
    }

    public String c(ic icVar) {
        String property = System.getProperty("java.vm.name", "Unknown JVM");
        String property2 = System.getProperty("java.specification.version", "Unknown");
        return new StringBuilder((String.valueOf(property2).length() + 1) + String.valueOf(property).length()).append(property2).append("/").append(property).toString();
    }
}
