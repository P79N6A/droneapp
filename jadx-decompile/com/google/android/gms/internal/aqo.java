package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.List;

public class aqo extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        int i;
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
        List list = (List) efVar.b();
        int size = list.size();
        int i2 = size - 1;
        if (eaVarArr.length == 3) {
            i2 = (int) aqf.c(eaVarArr[2]);
            i2 = i2 < 0 ? size - Math.abs(i2) : Math.min(i2, size - 1);
        }
        size = i2;
        while (size >= 0) {
            if (efVar.c(size) && aqf.d(r3, (ea) list.get(size))) {
                i = size;
                break;
            }
            size--;
        }
        i = -1;
        return new ec(Double.valueOf((double) i));
    }
}
