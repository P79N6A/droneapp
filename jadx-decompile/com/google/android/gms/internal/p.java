package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class p implements aqe {
    private static app a;

    public p(app com_google_android_gms_internal_app) {
        a = com_google_android_gms_internal_app;
    }

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 1) {
            z = false;
        }
        d.b(z);
        d.b(eaVarArr[0] instanceof ej);
        return a.a((String) ((ej) eaVarArr[0]).b());
    }
}
