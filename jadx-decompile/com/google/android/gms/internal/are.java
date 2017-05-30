package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class are extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        boolean z2 = false;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 2);
        ea eaVar = eaVarArr[0];
        ea eaVar2 = eaVarArr[1];
        if ((eaVar instanceof eh) || (eaVar instanceof ef) || (eaVar instanceof ed)) {
            eaVar = new ej(aqf.d(eaVar));
        }
        ea ejVar = ((eaVar2 instanceof eh) || (eaVar2 instanceof ef) || (eaVar2 instanceof ed)) ? new ej(aqf.d(eaVar2)) : eaVar2;
        if (((eaVar instanceof ej) && (ejVar instanceof ej)) || !(Double.isNaN(aqf.b(eaVar)) || Double.isNaN(aqf.b(ejVar)))) {
            if (aqf.b(eaVar, ejVar)) {
                z = false;
            }
            z2 = z;
        }
        return new eb(Boolean.valueOf(z2));
    }
}
