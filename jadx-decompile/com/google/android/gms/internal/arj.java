package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class arj extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 1) {
            z = false;
        }
        d.b(z);
        return new ec(Double.valueOf(aqf.b(eaVarArr[0]) * -1.0d));
    }
}
