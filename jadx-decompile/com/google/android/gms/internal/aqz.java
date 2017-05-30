package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class aqz extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.a(eaVarArr);
        d.b(eaVarArr.length >= 3);
        d.b(eaVarArr[0] instanceof ef);
        ef efVar = (ef) eaVarArr[0];
        int c = (int) aqf.c(eaVarArr[1]);
        c = c < 0 ? Math.max(((List) efVar.b()).size() + c, 0) : Math.min(c, ((List) efVar.b()).size());
        int min = c + Math.min(Math.max((int) aqf.c(eaVarArr[2]), 0), ((List) efVar.b()).size() - c);
        List arrayList = new ArrayList(((List) efVar.b()).subList(c, min));
        ((List) efVar.b()).subList(c, min).clear();
        Collection arrayList2 = new ArrayList();
        for (int i = 3; i < eaVarArr.length; i++) {
            arrayList2.add(eaVarArr[i]);
        }
        ((List) efVar.b()).addAll(c, arrayList2);
        return new ef(arrayList);
    }
}
