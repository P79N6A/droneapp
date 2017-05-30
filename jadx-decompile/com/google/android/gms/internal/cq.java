package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class cq extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 2);
        return new eb(Boolean.valueOf(aqf.d(eaVarArr[0]).endsWith(aqf.d(eaVarArr[1]))));
    }
}
