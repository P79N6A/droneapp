package com.google.android.gms.internal;

import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.d;

public class ad extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 2);
        double b = aqf.b(eaVarArr[0]);
        double b2 = aqf.b(eaVarArr[1]);
        if (Double.isNaN(b) || Double.isNaN(b2)) {
            return new ec(Double.valueOf(Double.NaN));
        }
        if (Double.isInfinite(b) && Double.isInfinite(b2)) {
            return new ec(Double.valueOf(Double.NaN));
        }
        int i = (((double) Double.compare(b, 0.0d)) < 0.0d ? 1 : 0) ^ (((double) Double.compare(b2, 0.0d)) < 0.0d ? 1 : 0);
        if (Double.isInfinite(b) && !Double.isInfinite(b2)) {
            return new ec(Double.valueOf(i != 0 ? Double.NEGATIVE_INFINITY : MediaQueueItem.b));
        } else if (!Double.isInfinite(b) && Double.isInfinite(b2)) {
            return new ec(Double.valueOf(i != 0 ? -0.0d : 0.0d));
        } else if (b == 0.0d) {
            if (b2 == 0.0d) {
                return new ec(Double.valueOf(Double.NaN));
            }
            return new ec(Double.valueOf(i != 0 ? -0.0d : 0.0d));
        } else if (Double.isInfinite(b) || b == 0.0d || b2 != 0.0d) {
            return new ec(Double.valueOf(b / b2));
        } else {
            return new ec(Double.valueOf(i != 0 ? Double.NEGATIVE_INFINITY : MediaQueueItem.b));
        }
    }
}
