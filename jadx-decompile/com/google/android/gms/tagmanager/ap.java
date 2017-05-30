package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.en;
import com.google.android.gms.internal.en.c;
import com.google.android.gms.internal.en.d;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

class ap {
    public static c a(String str) {
        a b = b(new JSONObject(str));
        d a = c.a();
        for (int i = 0; i < b.d.length; i++) {
            a.a(en.a.a().a(fh.INSTANCE_NAME.toString(), b.d[i]).a(fh.FUNCTION.toString(), cw.a(dk.d())).a(dk.e(), b.e[i]).a());
        }
        return a.a();
    }

    static Object a(Object obj) {
        if (obj instanceof JSONArray) {
            throw new RuntimeException("JSONArrays are not supported");
        } else if (JSONObject.NULL.equals(obj)) {
            throw new RuntimeException("JSON nulls are not supported");
        } else if (!(obj instanceof JSONObject)) {
            return obj;
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            Map hashMap = new HashMap();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                hashMap.put(str, a(jSONObject.get(str)));
            }
            return hashMap;
        }
    }

    private static a b(Object obj) {
        return cw.f(a(obj));
    }
}
