package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.List;

public class aqr extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        int i = 1;
        d.a(eaVarArr);
        d.b(eaVarArr.length >= 1);
        d.b(eaVarArr[0] instanceof ef);
        ef efVar = (ef) eaVarArr[0];
        int size = ((List) efVar.b()).size();
        efVar.a((eaVarArr.length + size) - 1);
        while (i < eaVarArr.length) {
            efVar.a(size, eaVarArr[i]);
            size++;
            i++;
        }
        return new ec(Double.valueOf((double) size));
    }
}
