package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.List;

public class k extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        List arrayList = new ArrayList();
        for (ee eeVar : eaVarArr) {
            boolean z = !(eeVar instanceof ee) || eeVar == ee.e || eeVar == ee.d;
            d.b(z);
            arrayList.add(eeVar);
        }
        return new ef(arrayList);
    }
}
