package com.google.android.gms.internal;

import java.util.Comparator;

public abstract class lb implements Comparator<lg> {
    public static lb a(String str) {
        if (str.equals(".value")) {
            return lp.d();
        }
        if (str.equals(".key")) {
            return ld.d();
        }
        if (!str.equals(".priority")) {
            return new lj(new ij(str));
        }
        throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
    }

    public int a(lg lgVar, lg lgVar2, boolean z) {
        return z ? compare(lgVar2, lgVar) : compare(lgVar, lgVar2);
    }

    public lg a() {
        return lg.a();
    }

    public abstract lg a(kv kvVar, lh lhVar);

    public abstract boolean a(lh lhVar);

    public boolean a(lh lhVar, lh lhVar2) {
        return compare(new lg(kv.a(), lhVar), new lg(kv.a(), lhVar2)) != 0;
    }

    public abstract lg b();

    public abstract String c();
}
