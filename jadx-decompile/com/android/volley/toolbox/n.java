package com.android.volley.toolbox;

import com.android.volley.j;
import com.android.volley.l;
import com.android.volley.p;
import com.android.volley.p.a;
import com.android.volley.p.b;
import org.json.JSONObject;

public class n extends o<JSONObject> {
    public n(int i, String str, b<JSONObject> bVar, a aVar) {
        super(i, str, null, bVar, aVar);
    }

    public n(int i, String str, String str2, b<JSONObject> bVar, a aVar) {
        super(i, str, str2, bVar, aVar);
    }

    public n(int i, String str, JSONObject jSONObject, b<JSONObject> bVar, a aVar) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), bVar, aVar);
    }

    public n(String str, b<JSONObject> bVar, a aVar) {
        super(0, str, null, bVar, aVar);
    }

    public n(String str, JSONObject jSONObject, b<JSONObject> bVar, a aVar) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, (b) bVar, aVar);
    }

    protected p<JSONObject> a(j jVar) {
        try {
            return p.a(new JSONObject(new String(jVar.b, h.a(jVar.c, "utf-8"))), h.a(jVar));
        } catch (Throwable e) {
            return p.a(new l(e));
        } catch (Throwable e2) {
            return p.a(new l(e2));
        }
    }
}
