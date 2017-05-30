package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class bp implements aqe {
    private final ea<?> a;

    public bp(ea<?> eaVar) {
        this.a = (ea) d.a(eaVar);
    }

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        return this.a;
    }
}
