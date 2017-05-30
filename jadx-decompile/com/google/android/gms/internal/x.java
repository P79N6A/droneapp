package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.List;

public class x extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        int i = 1;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 3);
        d.b(eaVarArr[1] instanceof ef);
        d.b(eaVarArr[2] instanceof ef);
        ea eaVar = eaVarArr[0];
        List list = (List) ((ef) eaVarArr[1]).b();
        List list2 = (List) ((ef) eaVarArr[2]).b();
        d.b(list2.size() <= list.size() + 1);
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            int i4;
            if (i3 != 0 || aqf.d(eaVar, ek.a(com_google_android_gms_internal_apr, (ea) list.get(i2)))) {
                ea<?> a = ek.a(com_google_android_gms_internal_apr, (ea) list2.get(i2));
                if (!(a instanceof ee)) {
                    i4 = 1;
                    i2++;
                    i3 = i4;
                } else if (a == ee.c || ((ee) a).e()) {
                    return a;
                } else {
                    if (a == ee.b) {
                        return ee.e;
                    }
                }
            }
            i4 = i3;
            i2++;
            i3 = i4;
        }
        if (list.size() >= list2.size()) {
            i = 0;
        }
        if (i != 0) {
            ea<?> a2 = ek.a(com_google_android_gms_internal_apr, (ea) list2.get(list2.size() - 1));
            if ((a2 instanceof ee) && (a2 == ee.c || ((ee) a2).e())) {
                return a2;
            }
        }
        return ee.e;
    }
}
