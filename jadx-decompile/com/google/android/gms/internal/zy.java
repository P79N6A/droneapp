package com.google.android.gms.internal;

import android.support.v4.util.SimpleArrayMap;
import com.fimi.soul.entity.User;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.ads.internal.formats.f;
import com.google.android.gms.ads.internal.formats.i;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.zu.a;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@aaa
public class zy implements a<f> {
    private final boolean a;

    public zy(boolean z) {
        this.a = z;
    }

    private <K, V> SimpleArrayMap<K, V> a(SimpleArrayMap<K, Future<V>> simpleArrayMap) {
        SimpleArrayMap<K, V> simpleArrayMap2 = new SimpleArrayMap();
        for (int i = 0; i < simpleArrayMap.size(); i++) {
            simpleArrayMap2.put(simpleArrayMap.keyAt(i), ((Future) simpleArrayMap.valueAt(i)).get());
        }
        return simpleArrayMap2;
    }

    private void a(zu zuVar, JSONObject jSONObject, SimpleArrayMap<String, Future<c>> simpleArrayMap) {
        simpleArrayMap.put(jSONObject.getString(User.FN_NAME), zuVar.a(jSONObject, "image_value", this.a));
    }

    private void a(JSONObject jSONObject, SimpleArrayMap<String, String> simpleArrayMap) {
        simpleArrayMap.put(jSONObject.getString(User.FN_NAME), jSONObject.getString("string_value"));
    }

    public /* synthetic */ i.a a(zu zuVar, JSONObject jSONObject) {
        return b(zuVar, jSONObject);
    }

    public f b(zu zuVar, JSONObject jSONObject) {
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        SimpleArrayMap simpleArrayMap2 = new SimpleArrayMap();
        Future b = zuVar.b(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                a(jSONObject2, simpleArrayMap2);
            } else if ("image".equals(string)) {
                a(zuVar, jSONObject2, simpleArrayMap);
            } else {
                String str = "Unknown custom asset type: ";
                String valueOf = String.valueOf(string);
                b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        return new f(jSONObject.getString("custom_template_id"), a(simpleArrayMap), simpleArrayMap2, (com.google.android.gms.ads.internal.formats.a) b.get());
    }
}
