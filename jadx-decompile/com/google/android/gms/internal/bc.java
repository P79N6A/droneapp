package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class bc extends aqg {
    private final a a;

    public interface a {
        Object a(String str, Map<String, Object> map);
    }

    public bc(a aVar) {
        this.a = aVar;
    }

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.a(eaVarArr);
        d.b(eaVarArr.length >= 1);
        d.b(eaVarArr[0] instanceof ej);
        String str = (String) ((ej) eaVarArr[0]).b();
        Map hashMap = new HashMap();
        if (eaVarArr.length >= 2 && eaVarArr[1] != ee.e) {
            d.b(eaVarArr[1] instanceof eh);
            for (Entry entry : ((Map) ((eh) eaVarArr[1]).b()).entrySet()) {
                d.a(!(entry.getValue() instanceof ei));
                d.a(!ek.d((ea) entry.getValue()));
                hashMap.put((String) entry.getKey(), ((ea) entry.getValue()).b());
            }
        }
        return ek.a(this.a.a(str, hashMap));
    }
}
