package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.List;

public class aqh extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        int i = 1;
        d.a(eaVarArr);
        d.b(eaVarArr.length >= 1);
        d.b(eaVarArr[0] instanceof ef);
        ef efVar = (ef) eaVarArr[0];
        List arrayList = new ArrayList();
        for (ea add : (List) efVar.b()) {
            arrayList.add(add);
        }
        while (i < eaVarArr.length) {
            if (eaVarArr[i] instanceof ef) {
                for (ea add2 : (List) ((ef) eaVarArr[i]).b()) {
                    arrayList.add(add2);
                }
            } else {
                arrayList.add(eaVarArr[i]);
            }
            i++;
        }
        return new ef(arrayList);
    }
}
