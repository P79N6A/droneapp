package com.android.volley.toolbox;

import com.android.volley.j;
import com.android.volley.l;
import com.android.volley.p;
import com.android.volley.p.a;
import com.android.volley.p.b;
import org.json.JSONArray;
import org.json.JSONObject;

public class m extends o<JSONArray> {
    public m(int i, String str, b<JSONArray> bVar, a aVar) {
        super(i, str, null, bVar, aVar);
    }

    public m(int i, String str, String str2, b<JSONArray> bVar, a aVar) {
        super(i, str, str2, bVar, aVar);
    }

    public m(int i, String str, JSONArray jSONArray, b<JSONArray> bVar, a aVar) {
        super(i, str, jSONArray == null ? null : jSONArray.toString(), bVar, aVar);
    }

    public m(int i, String str, JSONObject jSONObject, b<JSONArray> bVar, a aVar) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), bVar, aVar);
    }

    public m(String str, b<JSONArray> bVar, a aVar) {
        super(0, str, null, bVar, aVar);
    }

    public m(String str, JSONArray jSONArray, b<JSONArray> bVar, a aVar) {
        this(jSONArray == null ? 0 : 1, str, jSONArray, (b) bVar, aVar);
    }

    public m(String str, JSONObject jSONObject, b<JSONArray> bVar, a aVar) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, (b) bVar, aVar);
    }

    protected p<JSONArray> a(j jVar) {
        try {
            return p.a(new JSONArray(new String(jVar.b, h.a(jVar.c, "utf-8"))), h.a(jVar));
        } catch (Throwable e) {
            return p.a(new l(e));
        } catch (Throwable e2) {
            return p.a(new l(e2));
        }
    }
}
