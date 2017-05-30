package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class dr extends t {
    private static final String a = eg.FUNCTION_CALL.toString();
    private static final String b = fh.FUNCTION_CALL_NAME.toString();
    private static final String c = fh.ADDITIONAL_PARAMS.toString();
    private final a d;

    public interface a {
        Object a(String str, Map<String, Object> map);
    }

    public dr(a aVar) {
        super(a, b);
        this.d = aVar;
    }

    public com.google.android.gms.internal.hj.a a(Map<String, com.google.android.gms.internal.hj.a> map) {
        String a = cw.a((com.google.android.gms.internal.hj.a) map.get(b));
        Map hashMap = new HashMap();
        com.google.android.gms.internal.hj.a aVar = (com.google.android.gms.internal.hj.a) map.get(c);
        if (aVar != null) {
            Object f = cw.f(aVar);
            if (f instanceof Map) {
                for (Entry entry : ((Map) f).entrySet()) {
                    hashMap.put(entry.getKey().toString(), entry.getValue());
                }
            } else {
                aw.b("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return cw.g();
            }
        }
        try {
            return cw.f(this.d.a(a, hashMap));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            aw.b(new StringBuilder((String.valueOf(a).length() + 34) + String.valueOf(valueOf).length()).append("Custom macro/tag ").append(a).append(" threw exception ").append(valueOf).toString());
            return cw.g();
        }
    }

    public boolean a() {
        return false;
    }
}
