package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public abstract class cw extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 2) {
            z = false;
        }
        d.b(z);
        try {
            double b = aqf.b(eaVarArr[0]);
            double b2 = aqf.b(eaVarArr[1]);
            return (Double.isNaN(b) || Double.isNaN(b2)) ? new eb(Boolean.valueOf(false)) : new eb(Boolean.valueOf(a(b, b2)));
        } catch (IllegalArgumentException e) {
            return new eb(Boolean.valueOf(false));
        }
    }

    protected abstract boolean a(double d, double d2);
}
