package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.List;

public class aqw extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.a(eaVarArr);
        boolean z = eaVarArr.length == 2 || eaVarArr.length == 3;
        d.b(z);
        d.b(eaVarArr[0] instanceof ef);
        ef efVar = (ef) eaVarArr[0];
        int c = (int) aqf.c(eaVarArr[1]);
        c = c < 0 ? Math.max(((List) efVar.b()).size() + c, 0) : Math.min(c, ((List) efVar.b()).size());
        int size = ((List) efVar.b()).size();
        if (eaVarArr.length == 3) {
            int c2 = (int) aqf.c(eaVarArr[2]);
            size = c2 < 0 ? Math.max(((List) efVar.b()).size() + c2, 0) : Math.min(c2, ((List) efVar.b()).size());
        }
        return new ef(new ArrayList(((List) efVar.b()).subList(c, Math.max(c, size))));
    }
}
