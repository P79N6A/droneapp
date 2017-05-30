package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.List;

public class ap extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        int i = 1;
        d.b(eaVarArr != null);
        boolean z = eaVarArr.length == 1 || eaVarArr.length == 2;
        d.b(z);
        d.b(eaVarArr[0] instanceof ej);
        List arrayList = new ArrayList();
        if (eaVarArr.length == 1) {
            arrayList.add(eaVarArr[0]);
        } else {
            String str = (String) ((ej) eaVarArr[0]).b();
            String d = aqf.d(eaVarArr[1]);
            boolean equals = d.equals("");
            String[] split = str.split(d, equals ? 0 : -1);
            if (!equals) {
                i = 0;
            }
            while (i < split.length) {
                arrayList.add(new ej(split[i]));
                i++;
            }
        }
        return new ef(arrayList);
    }
}
