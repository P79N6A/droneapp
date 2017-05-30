package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.a.a.c.c.h;
import org.a.a.c.c.l;

public class cz extends aqg {
    private static final Set<String> b = new HashSet(Arrays.asList(new String[]{"GET", h.a, "POST", l.a}));
    private final aoz a;

    public cz(aoz com_google_android_gms_internal_aoz) {
        this.a = com_google_android_gms_internal_aoz;
    }

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        Map map;
        String str = null;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 1);
        d.b(eaVarArr[0] instanceof eh);
        ea b = eaVarArr[0].b("url");
        d.b(b instanceof ej);
        String str2 = (String) ((ej) b).b();
        b = eaVarArr[0].b("method");
        if (b == ee.e) {
            b = new ej("GET");
        }
        d.b(b instanceof ej);
        String str3 = (String) ((ej) b).b();
        d.b(b.contains(str3));
        b = eaVarArr[0].b("uniqueId");
        boolean z = b == ee.e || b == ee.d || (b instanceof ej);
        d.b(z);
        String str4 = (b == ee.e || b == ee.d) ? null : (String) ((ej) b).b();
        b = eaVarArr[0].b("headers");
        boolean z2 = b == ee.e || (b instanceof eh);
        d.b(z2);
        Map hashMap = new HashMap();
        if (b == ee.e) {
            map = null;
        } else {
            for (Entry entry : ((Map) ((eh) b).b()).entrySet()) {
                String str5 = (String) entry.getKey();
                b = (ea) entry.getValue();
                if (b instanceof ej) {
                    hashMap.put(str5, (String) ((ej) b).b());
                } else {
                    aph.b(String.format("Ignore the non-string value of header key %s.", new Object[]{str5}));
                }
            }
            map = hashMap;
        }
        b = eaVarArr[0].b("body");
        boolean z3 = b == ee.e || (b instanceof ej);
        d.b(z3);
        if (b != ee.e) {
            str = (String) ((ej) b).b();
        }
        if ((str3.equals("GET") || str3.equals(h.a)) && str != null) {
            aph.b(String.format("Body of %s hit will be ignored: %s.", new Object[]{str3, str}));
        }
        this.a.a(str2, str3, str4, map, str);
        aph.d(String.format("QueueRequest: url = %s, method = %s, uniqueId = %s, headers = %s, body = %s", new Object[]{str2, str3, str4, map, str}));
        return ee.e;
    }
}
