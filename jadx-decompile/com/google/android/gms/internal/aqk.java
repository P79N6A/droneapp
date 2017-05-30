package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.List;

public class aqk extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.a(eaVarArr);
        d.b(eaVarArr.length == 2);
        d.b(eaVarArr[0] instanceof ef);
        d.b(eaVarArr[1] instanceof ed);
        ef efVar = (ef) eaVarArr[0];
        ed edVar = (ed) eaVarArr[1];
        int size = ((List) efVar.b()).size();
        int i = 0;
        while (i < size && i < ((List) efVar.b()).size()) {
            if (efVar.c(i)) {
                ((aqe) edVar.b()).a_(com_google_android_gms_internal_apr, (ea) r2.get(i), new ec(Double.valueOf((double) i)), efVar);
            }
            i++;
        }
        return ee.e;
    }
}
