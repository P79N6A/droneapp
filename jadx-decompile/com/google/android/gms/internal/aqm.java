package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.d;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;

public class aqm extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.a(eaVarArr);
        boolean z = eaVarArr.length == 1 || eaVarArr.length == 2;
        d.b(z);
        d.b(eaVarArr[0] instanceof ef);
        List<ea> list = (List) ((ef) eaVarArr[0]).b();
        ea eaVar = eaVarArr.length < 2 ? ee.e : eaVarArr[1];
        String d = eaVar == ee.e ? Constants.ACCEPT_TIME_SEPARATOR_SP : aqf.d(eaVar);
        Iterable arrayList = new ArrayList();
        for (ea eaVar2 : list) {
            if (eaVar2 == ee.d || eaVar2 == ee.e) {
                arrayList.add("");
            } else {
                arrayList.add(aqf.d(eaVar2));
            }
        }
        return new ej(ak.a(d).a(arrayList));
    }
}
