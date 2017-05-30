package com.google.android.gms.internal;

import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.d;

public class af extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        int i = 1;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 2);
        double b = aqf.b(eaVarArr[0]);
        double b2 = aqf.b(eaVarArr[1]);
        if (Double.isNaN(b) || Double.isNaN(b2)) {
            return new ec(Double.valueOf(Double.NaN));
        }
        if ((Double.isInfinite(b) && b2 == 0.0d) || (b == 0.0d && Double.isInfinite(b2))) {
            return new ec(Double.valueOf(Double.NaN));
        }
        if (!Double.isInfinite(b) && !Double.isInfinite(b2)) {
            return new ec(Double.valueOf(b * b2));
        }
        int i2 = ((double) Double.compare(b, 0.0d)) < 0.0d ? 1 : 0;
        if (((double) Double.compare(b2, 0.0d)) >= 0.0d) {
            i = 0;
        }
        return new ec(Double.valueOf((i2 ^ i) != 0 ? Double.NEGATIVE_INFINITY : MediaQueueItem.b));
    }
}
