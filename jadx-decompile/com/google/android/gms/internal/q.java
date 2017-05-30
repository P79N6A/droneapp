package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.List;

public class q extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 2);
        ea eaVar = eaVarArr[0];
        ea eaVar2 = eaVarArr[1];
        boolean z2 = (eaVar instanceof ej) || !ek.c(eaVar);
        d.b(z2);
        d.b(!ek.d(eaVar));
        if (ek.d(eaVar2)) {
            z = false;
        }
        d.b(z);
        String d = aqf.d(eaVar2);
        double b;
        if (eaVar instanceof ef) {
            ef efVar = (ef) eaVar;
            if ("length".equals(d)) {
                return new ec(Double.valueOf((double) ((List) efVar.b()).size()));
            }
            b = aqf.b(eaVar2);
            if (b == Math.floor(b) && d.equals(Integer.toString((int) b))) {
                ea<?> b2 = efVar.b((int) b);
                if (b2 != ee.e) {
                    return b2;
                }
            }
        } else if (eaVar instanceof ej) {
            ej ejVar = (ej) eaVar;
            if ("length".equals(d)) {
                return new ec(Double.valueOf((double) ((String) ejVar.b()).length()));
            }
            b = aqf.b(eaVar2);
            return (b == Math.floor(b) && d.equals(Integer.toString((int) b))) ? ejVar.a((int) b) : ee.e;
        }
        return eaVar.b(d);
    }
}
