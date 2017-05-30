package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;

public class br implements aqe {
    private e a = new h();

    public void a(e eVar) {
        this.a = (e) d.a(eVar);
    }

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        return new ec(Double.valueOf((double) this.a.a()));
    }
}
