package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.List;

public class aql extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        int c;
        int i;
        int i2 = 0;
        d.a(eaVarArr);
        boolean z = eaVarArr.length > 0 && eaVarArr.length <= 3;
        d.b(z);
        d.b(eaVarArr[0] instanceof ef);
        ef efVar = (ef) eaVarArr[0];
        if (eaVarArr.length < 2) {
            ea eaVar = ee.e;
        } else {
            ea<?> eaVar2 = eaVarArr[1];
        }
        if (eaVarArr.length < 3) {
            ea eaVar3 = ee.e;
        } else {
            ea<?> eaVar4 = eaVarArr[2];
        }
        List list = (List) efVar.b();
        int size = list.size();
        if (eaVar3 != ee.e) {
            c = (int) aqf.c(eaVar3);
            i2 = c < 0 ? Math.max(size - Math.abs(c), 0) : c;
        }
        c = i2;
        while (c < size) {
            if (efVar.c(c) && aqf.d(r3, (ea) list.get(c))) {
                i = c;
                break;
            }
            c++;
        }
        i = -1;
        return new ec(Double.valueOf((double) i));
    }
}
