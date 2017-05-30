package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.List;

public class f extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 3);
        d.b(eaVarArr[1] instanceof ej);
        d.b(eaVarArr[2] instanceof ef);
        ea eaVar = eaVarArr[0];
        String str = (String) ((ej) eaVarArr[1]).b();
        List list = (List) ((ef) eaVarArr[2]).b();
        if (eaVar.a(str)) {
            ea b = eaVar.b(str);
            if (b instanceof ed) {
                return ((aqe) ((ed) b).b()).a_(com_google_android_gms_internal_apr, (ea[]) list.toArray(new ea[list.size()]));
            }
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 35).append("Apply TypeError: ").append(str).append(" is not a function").toString());
        } else if (eaVar.c(str)) {
            aqe d = eaVar.d(str);
            list.add(0, eaVar);
            return d.a_(com_google_android_gms_internal_apr, (ea[]) list.toArray(new ea[list.size()]));
        } else {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 40).append("Apply TypeError: object has no ").append(str).append(" property").toString());
        }
    }
}
