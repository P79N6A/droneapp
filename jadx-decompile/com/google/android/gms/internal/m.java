package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class m extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length <= 0) {
            z = false;
        }
        d.b(z);
        return eaVarArr[eaVarArr.length - 1];
    }
}
