package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class arl extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 2);
        if (aqf.c(eaVarArr[1], eaVarArr[0])) {
            z = false;
        }
        return new eb(Boolean.valueOf(z));
    }
}
