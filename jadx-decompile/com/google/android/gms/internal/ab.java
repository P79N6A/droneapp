package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class ab extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 2);
        ea eaVar = eaVarArr[0];
        ea eaVar2 = eaVarArr[1];
        if ((!(eaVar instanceof ee) || eaVar == ee.e || eaVar == ee.d) && (!(eaVar2 instanceof ee) || eaVar2 == ee.e || eaVar2 == ee.d)) {
            if ((eaVar instanceof eh) || (eaVar instanceof ef) || (eaVar instanceof ed)) {
                eaVar = new ej(aqf.d(eaVar));
            }
            ea ejVar = ((eaVar2 instanceof eh) || (eaVar2 instanceof ef) || (eaVar2 instanceof ed)) ? new ej(aqf.d(eaVar2)) : eaVar2;
            if (!(eaVar instanceof ej) && !(ejVar instanceof ej)) {
                return new ec(Double.valueOf(aqf.a(eaVar, ejVar)));
            }
            String valueOf = String.valueOf(aqf.d(eaVar));
            String valueOf2 = String.valueOf(aqf.d(ejVar));
            return new ej(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Add.");
    }
}
