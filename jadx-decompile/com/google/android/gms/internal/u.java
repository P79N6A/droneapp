package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.List;

public class u implements aqe {
    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        int i = 0;
        d.b(eaVarArr != null);
        List arrayList = new ArrayList(eaVarArr.length);
        int length = eaVarArr.length;
        while (i < length) {
            arrayList.add(eaVarArr[i]);
            i++;
        }
        return new ef(arrayList);
    }
}
