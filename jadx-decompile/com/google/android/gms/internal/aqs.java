package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.List;

public class aqs extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        ea<?> eaVar;
        int i;
        d.a(eaVarArr);
        boolean z = eaVarArr.length == 2 || eaVarArr.length == 3;
        d.b(z);
        d.b(eaVarArr[0] instanceof ef);
        d.b(eaVarArr[1] instanceof ed);
        ef efVar = (ef) eaVarArr[0];
        ed edVar = (ed) eaVarArr[1];
        int size = ((List) efVar.b()).size();
        if (eaVarArr.length == 3) {
            eaVar = eaVarArr[2];
            i = 0;
        } else {
            d.a(size > 0);
            ea<?> b = efVar.b(0);
            int i2 = 1;
            i = 0;
            while (i < size) {
                if (efVar.c(i)) {
                    b = efVar.b(i);
                    i2 = i + 1;
                    break;
                }
                i++;
            }
            d.a(i < size);
            i = i2;
            eaVar = b;
        }
        int i3 = i;
        while (i3 < size && i3 < ((List) efVar.b()).size()) {
            ea<?> a_ = efVar.c(i3) ? ((aqe) edVar.b()).a_(com_google_android_gms_internal_apr, eaVar, (ea) r2.get(i3), new ec(Double.valueOf((double) i3)), efVar) : eaVar;
            i3++;
            eaVar = a_;
        }
        return eaVar;
    }
}
