package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.List;

public class i extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 1) {
            z = false;
        }
        d.b(z);
        d.b(eaVarArr[0] instanceof ef);
        for (ea a : (List) ((ef) eaVarArr[0]).b()) {
            ea<?> a2 = ek.a(com_google_android_gms_internal_apr, a);
            if ((a2 instanceof ee) && (a2 == ee.b || a2 == ee.c || ((ee) a2).e())) {
                return a2;
            }
        }
        return ee.e;
    }
}
