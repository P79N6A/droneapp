package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ara extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        int i = 1;
        d.a(eaVarArr);
        d.b(eaVarArr.length >= 1);
        d.b(eaVarArr[0] instanceof ef);
        ef efVar = (ef) eaVarArr[0];
        Collection arrayList = new ArrayList();
        while (i < eaVarArr.length) {
            arrayList.add(eaVarArr[i]);
            i++;
        }
        ((List) efVar.b()).addAll(0, arrayList);
        return new ec(Double.valueOf((double) ((List) efVar.b()).size()));
    }
}
