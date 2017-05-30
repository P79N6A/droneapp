package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.Iterator;
import java.util.List;

public class n extends aqg {
    public ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.a(eaVarArr);
        d.b(eaVarArr.length == 3);
        d.b(eaVarArr[0] instanceof ej);
        String str = (String) ((ej) eaVarArr[0]).b();
        d.b(com_google_android_gms_internal_apr.a(str));
        ea eaVar = eaVarArr[1];
        d.a(eaVar);
        ea<?> eaVar2 = eaVarArr[2];
        d.b(eaVar2 instanceof ef);
        List list = (List) ((ef) eaVar2).b();
        Iterator a = eaVar.a();
        while (a.hasNext()) {
            com_google_android_gms_internal_apr.b(str, (ea) a.next());
            eaVar = ek.a(com_google_android_gms_internal_apr, list);
            if (eaVar == ee.b) {
                return ee.e;
            }
            if (eaVar.e()) {
                return eaVar;
            }
        }
        return ee.e;
    }
}
