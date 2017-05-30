package com.google.android.gms.cast.framework;

import com.google.android.gms.c.e;
import com.google.android.gms.cast.internal.m;

public class q {
    private static final m a = new m("DiscoveryManager");
    private final w b;

    q(w wVar) {
        this.b = wVar;
    }

    public e a() {
        try {
            return this.b.c();
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedThis", w.class.getSimpleName());
            return null;
        }
    }
}
