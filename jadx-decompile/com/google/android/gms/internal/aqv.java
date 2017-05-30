package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.List;

public class aqv extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.a(eaVarArr);
        if (eaVarArr.length != 1) {
            z = false;
        }
        d.b(z);
        d.b(eaVarArr[0] instanceof ef);
        List list = (List) ((ef) eaVarArr[0]).b();
        return !list.isEmpty() ? (ea) list.remove(0) : ee.e;
    }
}
