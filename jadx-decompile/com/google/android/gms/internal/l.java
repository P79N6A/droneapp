package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.HashMap;
import java.util.Map;

public class l extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        int i = 0;
        d.b(eaVarArr != null);
        Map hashMap = new HashMap();
        while (i < eaVarArr.length - 1) {
            String d = aqf.d(eaVarArr[i]);
            ee eeVar = eaVarArr[i + 1];
            if (!(eeVar instanceof ee) || eeVar == ee.d || eeVar == ee.e) {
                hashMap.put(d, eeVar);
                i += 2;
            } else {
                throw new IllegalStateException("Illegal InternalType found in CreateObject.");
            }
        }
        return new eh(hashMap);
    }
}
