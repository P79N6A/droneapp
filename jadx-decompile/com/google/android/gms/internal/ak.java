package com.google.android.gms.internal;

import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.d;

public class ak extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        boolean z = eaVarArr.length == 2 || eaVarArr.length == 3;
        d.b(z);
        d.b(eaVarArr[0] instanceof ej);
        String str = (String) ((ej) eaVarArr[0]).b();
        String d = aqf.d(eaVarArr[1]);
        double d2 = MediaQueueItem.b;
        if (eaVarArr.length == 3 && !Double.isNaN(aqf.b(eaVarArr[2]))) {
            d2 = aqf.c(eaVarArr[2]);
        }
        return new ec(Double.valueOf((double) str.lastIndexOf(d, (int) Math.min(Math.max(d2, 0.0d), (double) str.length()))));
    }
}
