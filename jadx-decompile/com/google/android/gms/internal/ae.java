package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class ae extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 2);
        double b = aqf.b(eaVarArr[0]);
        double b2 = aqf.b(eaVarArr[1]);
        return (Double.isNaN(b) || Double.isNaN(b2)) ? new ec(Double.valueOf(Double.NaN)) : (Double.isInfinite(b) || b2 == 0.0d) ? new ec(Double.valueOf(Double.NaN)) : (Double.isInfinite(b) || !Double.isInfinite(b2)) ? (b != 0.0d || b2 == 0.0d || Double.isInfinite(b2)) ? new ec(Double.valueOf(b % b2)) : new ec(Double.valueOf(b)) : new ec(Double.valueOf(b));
    }
}
