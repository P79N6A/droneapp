package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class w extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 3);
        ea eaVar = eaVarArr[0];
        ea eaVar2 = eaVarArr[1];
        ea<?> eaVar3 = eaVarArr[2];
        d.b(eaVar != ee.d);
        d.b(eaVar != ee.e);
        d.b(!ek.d(eaVar));
        d.b(!ek.d(eaVar2));
        d.b(!ek.d(eaVar3));
        if (ek.c(eaVar)) {
            return eaVar3;
        }
        String d = aqf.d(eaVar2);
        if (eaVar instanceof eh) {
            eh ehVar = (eh) eaVar;
            if (!ehVar.f()) {
                ehVar.a(d, eaVar3);
            }
            return eaVar3;
        }
        if (eaVar instanceof ef) {
            ef efVar = (ef) eaVar;
            if ("length".equals(d)) {
                double b = aqf.b(eaVar3);
                if (Double.isInfinite(b) || b != Math.floor(b)) {
                    z = false;
                }
                d.b(z);
                efVar.a((int) b);
                return eaVar3;
            }
            double b2 = aqf.b(eaVar2);
            if (!Double.isInfinite(b2) && b2 >= 0.0d && d.equals(Integer.toString((int) b2))) {
                efVar.a((int) b2, eaVar3);
                return eaVar3;
            }
        }
        eaVar.a(d, eaVar3);
        return eaVar3;
    }
}
