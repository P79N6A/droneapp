package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class ck extends aqg {
    private static final ec a = new ec(Double.valueOf(0.0d));
    private static final ec b = new ec(Double.valueOf(2.147483647E9d));

    private boolean a(ea<?> eaVar) {
        return (eaVar instanceof ec) && !Double.isNaN(((Double) ((ec) eaVar).b()).doubleValue());
    }

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        double doubleValue;
        double doubleValue2;
        d.b(eaVarArr != null);
        ea eaVar = eaVarArr.length > 0 ? eaVarArr[0] : a;
        ea eaVar2 = eaVarArr.length > 1 ? eaVarArr[1] : b;
        if (a(eaVar) && a(eaVar2) && aqf.b(eaVar, eaVar2)) {
            doubleValue = ((Double) ((ec) eaVar).b()).doubleValue();
            doubleValue2 = ((Double) ((ec) eaVar2).b()).doubleValue();
        } else {
            doubleValue2 = 2.147483647E9d;
            doubleValue = 0.0d;
        }
        return new ec(Double.valueOf((double) Math.round(((doubleValue2 - doubleValue) * Math.random()) + doubleValue)));
    }
}
