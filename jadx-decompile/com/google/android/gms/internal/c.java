package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class c extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 1) {
            z = false;
        }
        d.b(z);
        return eaVarArr[0];
    }
}
